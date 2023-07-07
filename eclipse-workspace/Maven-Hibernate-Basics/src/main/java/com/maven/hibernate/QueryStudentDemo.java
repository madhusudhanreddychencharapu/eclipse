package com.maven.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryStudentDemo {
	public static void main(String[] args) {
				SessionFactory factory = new Configuration()
						.configure("NewFile.xml")
						.addAnnotatedClass(Student.class)
				        .buildSessionFactory();
		
		      Session session = factory.getCurrentSession();
		      
		      //staart a transaction
		      session.beginTransaction();
		      
		      //query the students
		      
		      List<Student> theStudents=session.createQuery("from Student").list();
		      
		      //display the students
		      
		      displayStudents(theStudents);
		      
		      
		      //Query the students whose last name ='chencharapu
		      System.out.println("");
		      System.out.println("The students last name with Chencharapu");
		      
		      List<Student> s =session.createQuery("from Student s where s.lastName='chencharapu'").list();
		      
		      //Display the students
		      displayStudents(s);
		      
		      //Query Students: last name='chencharapu' or firstname='praneeth'
		      
		      theStudents=session.createQuery("from Student s where s.lastName='chencharapu' OR  s.firstName='sai'").list();
		      
		      System.out.println("\n\n The students who have last name chencharapu or the first name sai");
		      displayStudents(theStudents);
		      
		      
		      //commit the transaction
		      session.getTransaction().commit();
		      
		      System.out.println("done!");
	}

	private static void displayStudents(List<Student> theStudents) {
		for(Student tempstudent:theStudents)
		  {
			  System.out.println(tempstudent);
		  }
	}
}
