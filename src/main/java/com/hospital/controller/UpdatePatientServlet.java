package com.hospital.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hospital.model.PatientDAO;

/**
 * Servlet implementation class UpdatePatientServlet
 */
@WebServlet("/UpdatePatient")
public class UpdatePatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePatientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		try{
			int pid=Integer.parseInt(request.getParameter("ptid"));
		
		String pname=request.getParameter("ptname");
		String paddr=request.getParameter("ptaddr");
		long pphone=Long.parseLong(request.getParameter("phno"));
		PatientDAO pd=new PatientDAO();
		int c=pd.updatePatient(pid, pname,paddr,pphone);
		PrintWriter out=response.getWriter();
		 if(c>0)
		 {
			 out.print("patient updated Succesfully!!!");
			 
		 }
		 else
		 {
			 out.print("patient not exist");
		 }
		}
		catch(SQLException|ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}

}
