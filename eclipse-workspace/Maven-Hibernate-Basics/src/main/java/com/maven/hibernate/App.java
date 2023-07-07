package com.maven.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("NewFile.xml").addAnnotatedClass(Student.class)
		        .buildSessionFactory();
		      Session session = factory.getCurrentSession();
		      
		      
		      //create a student object
		      Student tempStudent =new Student("madhu","sudhan","madhu");
		      Student s1 = new Student("one", "two", "three");
		      Student s2 = new Student("three", "four", "five");
		      
		      //staart a transaction
		      session.beginTransaction();
		      
		      //savve the transaction
		      session.save(tempStudent);
		      session.save(s2);
		      
		      //commit the transaction
		      session.getTransaction().commit();
		      System.out.println("done!");
	}
}
