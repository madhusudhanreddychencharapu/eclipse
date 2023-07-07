package com.lov2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args)  {
		
		
		String jdbcurl="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";	
		String user="hbstudent";
		String pass="hbstudent";
	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("Connecting to database");
			
			Connection myconn=DriverManager.getConnection(jdbcurl, user, pass);
			
			System.out.println("Connection Successful");
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		

	}

}