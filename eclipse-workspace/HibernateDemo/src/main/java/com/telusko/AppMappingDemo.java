package com.telusko;
//
//import javax.transaction.HeuristicMixedException;
//import javax.transaction.HeuristicRollbackException;
//import javax.transaction.RollbackException;
//import javax.transaction.SystemException;
//import javax.transaction.Transaction;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.transaction.Transaction;

public class AppMappingDemo {

	public static void main(String[] args) {
		
		System.out.println("I am running");
		
		Laptop laptop = new Laptop();
		laptop.setLid(101);
		laptop.setLname("Dell");
		
		Laptop laptop1 = new Laptop();
		laptop1.setLid(102);
		laptop1.setLname("MacBook");
		
		Student s= new Student();
		s.setName("madhu");
		s.setRollno(1);
		s.setMarks(86);
		
		laptop.getStudent().add(s);
	
		
		Student s1=new Student();
		s1.setName("sai krishna");
		s1.setRollno(2);
		s1.setMarks(90);
		
		laptop.getStudent().add(s1);
		
		laptop1.getStudent().add(s);
		laptop1.getStudent().add(s1);
		
		
		
		Configuration factory=new Configuration().configure("hibernate.cfg.xml")
											.addAnnotatedClass(Student.class)
											.addAnnotatedClass(Laptop.class);
		
		System.out.println("check-1");
		//Create  the session
		SessionFactory sf=factory.buildSessionFactory();
		

		Session session=sf.openSession();
		
		
		
		session.beginTransaction();
		
		
		
		session.save(laptop);
		session.save(laptop1);
		session.save(s);
		session.save(s1);
		
		
		System.out.println("I am executing the program");
		
	
		session.getTransaction().commit();

	}
}
