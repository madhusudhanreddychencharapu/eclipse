package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {
	
	public static void main(String[] args)
	{
		System.out.println("program execution started");
		//create session Factory
		SessionFactory factory =new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		//create session
		System.out.println("check point -1");
		Session session=factory.getCurrentSession();
		
		//use the session object to save Java Object
		System.out.println("check point -2");
		try {
			//create the Student object
			System.out.println("Creating new Student Object..");
			Student tempStudent =new Student("madhu","sudhan","madhu9502324@gmail.com ");
			
			//start a transaction
			session.beginTransaction();
			
			//save the student object
			System.out.println("Saving the student...");
			session.save(tempStudent);
			
			//commit transaction
			session.getTransaction().commit();
			
		} 
		catch (Exception e) {
			
		}
		finally {
			factory.close();
		}
	}

}
