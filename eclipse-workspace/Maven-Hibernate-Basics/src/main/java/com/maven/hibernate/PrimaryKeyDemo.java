package com.maven.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {
	public static void main(String[] args)
	{
		
		SessionFactory factory = new Configuration().configure("NewFile.xml").addAnnotatedClass(Student.class)
		        .buildSessionFactory();
		      Session session = factory.getCurrentSession();
		      
		      
		      //create 3 student objects
		      Student s1=new Student("madhusudhanreddy","Chencharapu","madhu@gmail.com");
		      Student s2= new Student("sai", "challagonda", "sai@gmail.com");
		      Student s3= new Student("praneeth", "chencharapu", "praneeth@gmail.com");
		      
		      //start a transaction
		      session.beginTransaction();
		      
		      //savve the student object
		      session.save(s1);
		      session.save(s2);
		      session.save(s3);
		      
		      Student mystudent =session.get(Student.class,s1.getId());
		      
		      System.out.println(mystudent.getFirstName()+" "+mystudent.getLastName()+" "+mystudent.getEmail());
		      //commit the transaction
		      session.getTransaction().commit();
		      System.out.println("done!");
	}

}
