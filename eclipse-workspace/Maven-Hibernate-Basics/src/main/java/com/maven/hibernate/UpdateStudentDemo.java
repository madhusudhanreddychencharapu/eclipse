package com.maven.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudentDemo {

	public static void main(String[] args)
	{
				//Create session Factory
				SessionFactory factory = new Configuration()
						.configure("NewFile.xml")
						.addAnnotatedClass(Student.class)
				        .buildSessionFactory();
			//Create Session
		      Session session = factory.getCurrentSession();
		     
		      int studentid=1;
		     
		      //find out the students id:Primary key
		      System.out.println("Saved student.Generated id: "+studentid);
		      
		      //now get a new session
		      
		      	
		      	
		      	session.beginTransaction();
		      
		      //retrieve  student based on id : primary key
		      
		      	Student myStudent=session.get(Student.class,studentid);
		      	
		      
		      	System.out.println("updating the student");
		      	myStudent.setFirstName("Unknown");
		      	myStudent.setEmail("unknown@gmail.com");
		      	
		      	
		      	//Update Email adress of all account to workfusion@gmail.com
		      	session.createQuery("Update Student set email='workfusion@gmail.com'").executeUpdate();
		      	session.getTransaction().commit();
		      
		      factory.close();
		      
		     
	}
}
