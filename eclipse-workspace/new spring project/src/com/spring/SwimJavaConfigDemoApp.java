package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.ConcurrentReferenceHashMap;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
	//	AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(JavaConfig.class);
		//get the bean from spring container
		

		Coach theCoach =context.getBean("swimCoach",Coach.class);
		

		//call a method on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get the dailyFortune
		
		System.out.println(theCoach.getDailyFortune());
		//close the context
		
		context.close();
	}

}
