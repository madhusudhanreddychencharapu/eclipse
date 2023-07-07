/*
	1.import the java.sql.* package
	2.load and register the driver-->
	3.establish the connection
	4.create the statement
	5.execute the query
	6.process the resultset 
	7.close the connection and statement
 */

package com.jdbc.basics;
import java.sql.*;

public class BasicDemoApp {

	public static void main(String[] args)throws Exception {
		String url="jdbc:mysql://localhost:3306/madhusudhan";
		String uname="root";
		String pass="Madhu@1969";
		String query1="insert into customers value(1006,'shiva')";
		String query="select * from customers";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		System.out.println("Database is connected");
		Statement  st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		
		while(rs.next()) {
			
		System.out.println(rs.getInt(1)+" : "+rs.getString(2));
				
		}													
		
		st.close();
		con.close();
	}

}
