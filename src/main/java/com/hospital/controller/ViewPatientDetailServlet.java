package com.hospital.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hospital.model.Patient1;
import com.hospital.model.PatientDAO;

/**
 * Servlet implementation class ViewPatientDetailServlet
 */
@WebServlet("/ViewPatient")
public class ViewPatientDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewPatientDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
		int Id=Integer.parseInt(request.getParameter("t1"));
		PatientDAO pd=new PatientDAO();
	
		
		
		Patient1 p=pd.viewPatient(Id);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<th>patient id</th>");
		out.println("<th>patient Name</th>");
		out.println("<th>patient Address</th>");
		out.println("<th>patient phone</th>");
		out.println("</tr>");
		out.println("<td>"+p.getPatientid()+"</td>");
		out.println("<td>"+p.getName()+"</td>");
		out.println("<td>"+p.getAddress()+"</td>");
		out.println("<td>"+p.getPhone()+"</td>");
		out.println("</tr>");
		out.println("</table>");
		}
		
		catch(ClassNotFoundException|SQLException e)
		{
			e.printStackTrace();
		}
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
