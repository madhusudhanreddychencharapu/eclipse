package com.madhu.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		
		Vehicle obj=(Vehicle)context.getBean("bike");
		obj.drive();
		
//		Car obj =(Car) context.getBean("car");
//		obj.drive();
		
//		Tyre t1=(Tyre) context.getBean("tyre");
//		
//		Tyre t2=(Tyre) context.getBean("tyre");
//
//		
//		System.out.println("I am t1 object :"+t1);
//		System.out.println("I am t2 object :"+t2);
//		
//		System.out.println(t1.toString());
//		System.out.println(t2.toString());
		
		System.out.println("I am running");
		System.out.println("I am modified");
	}

}