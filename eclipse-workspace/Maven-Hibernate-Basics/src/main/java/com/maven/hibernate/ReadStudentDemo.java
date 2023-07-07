package com.maven.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo {

	public static void main(String[] args)
	{
		
		SessionFactory factory = new Configuration().configure("NewFile.xml").addAnnotatedClass(Student.class)
		        .buildSessionFactory();
		      Session session = factory.getCurrentSession();
		      
		      
		      //create  student objects
		      Student s1=new Student("parthu","Sarkar","Parthu@gmail.com");
		      		      
		      //start a transaction
		      session.beginTransaction();
		      
		      //save the student object
		      session.save(s1);
		      
		      //commit the transaction
		      session.getTransaction().commit();
		      System.out.println("done!");
		     
		      
		      
		      // MY NEW CODE
		     
		      //find out hhe students id:Primary key
		      System.out.println("Saved student.Generated id: "+s1.getId());
		      
		      //now get a new session
		      
		      	Session session1 =factory.getCurrentSession();
		      	
		      	session1.beginTransaction()
		      
		      //retrieve  student based on id : primary key
		      
		      	Student s2=session1.get(Student.class,s1.getId());
		      	
		      
		      System.out.println(s2.getFirstName()+" "+s2.getLastName()+" "+s2.getEmail());
		      
		      factory.close();
		      
		     
	}
}
