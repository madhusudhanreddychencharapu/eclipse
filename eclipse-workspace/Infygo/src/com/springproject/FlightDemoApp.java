package com.springproject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FlightDemoApp {
	
	public static void main(String[] args)
	{
		//creating the container
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(javaconfig.class);
		
		Flight theflight=context.getBean("flight",Flight.class);
	}
}
