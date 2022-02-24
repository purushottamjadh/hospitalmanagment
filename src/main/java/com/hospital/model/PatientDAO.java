package com.hospital.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientDAO {
	
	public int addPatient(Patient1 patient1) throws ClassNotFoundException,SQLException
	{
		 int count =0;
		String sql= "insert into patient(patientid,name,address,phone)values(?,?,?,?)";
	
		Connection con=CreateConnection.getConnection();
		PreparedStatement prst=con.prepareStatement(sql);
		prst.setInt(1,patient1.getPatientid());
		prst.setString(2,patient1.getName());
		prst.setString(3, patient1.getAddress());
		prst.setInt(4, patient1.getPhone());
		
		count=prst.executeUpdate();
		
		return count;
	}
	public Patient1 viewPatient(int pid)throws ClassNotFoundException,SQLException
	{
	
		Patient1 p=new Patient1();
		Connection con=CreateConnection.getConnection();
		String sql= "select * from patient where patientid=?";
		PreparedStatement prst=con.prepareStatement(sql);
		prst.setInt(1, pid);
		ResultSet rs=prst.executeQuery();
		while(rs.next())
		{
			p.setPatientid(rs.getInt("patientid"));
			p.setName(rs.getString("name"));
			p.setAddress(rs.getString("address"));
			p.setPhone(rs.getInt("phone"));
		}
		return p;
	}
	public  int updatePatient(int ptid,String ptname,String paddr,long phone)throws ClassNotFoundException,SQLException
	{
		
		Connection con=CreateConnection.getConnection();
		String sql="update patient set name=?,address=?,phone=? where patientid=?";
		
		PreparedStatement prst=con.prepareStatement(sql);
		prst.setInt(4,ptid);
		prst.setString(1, ptname);
		prst.setString(2, paddr);
		prst.setLong(3,phone);
		
		int c=prst.executeUpdate();
	return c;
		
	}
	public int deletePatient(int pid)throws ClassNotFoundException,SQLException
	{
		Patient1 p=new Patient1();
		Connection con=CreateConnection.getConnection();
		String sql= "delete from patient where patientid=?";
		PreparedStatement prst=con.prepareStatement(sql);
		prst.setInt(1, pid);
		int c=prst.executeUpdate();
		return c;
	
	}

}
