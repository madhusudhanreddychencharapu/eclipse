package com.basics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	//	AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(JavaConfig.class);
		//get the bean from spring container
		

		Coach theCoach =context.getBean("somename",Coach.class);
		
		//call a method on the bean
		
		System.out.println(theCoach.getDailyWorkoutString());
		//close the context
		
		context.close();
	}

}
