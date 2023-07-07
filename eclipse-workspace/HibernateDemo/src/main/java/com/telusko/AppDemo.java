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

public class AppDemo {

	public static void main(String[] args) {
		
		System.out.println("I am running");
		
//		AlienName an=new AlienName();
//		an.setFname("madhusudhan");
//		an.setMname("reddy");
//		an.setLname("chencharapu");
		
		Alien telusko =new Alien();
		telusko.setAid(101);
		telusko.setColour("white");
	//	telusko.setAname(an);
		
		Configuration factory=new Configuration().configure("hibernate.cfg.xml")
											.addAnnotatedClass(Alien.class);
		
		System.out.println("check-1");
		//Create  the session
		SessionFactory sf=factory.buildSessionFactory();
		

		Session session=sf.openSession();
		
		
		
		session.beginTransaction();
		
		
		
		session.save(telusko);
		
		System.out.println("I am executing the program");
		
	
		session.getTransaction().commit();
//		
//		telusko=session.get(Alien.class,101);
//		
//		System.out.println(telusko);
	}
}
