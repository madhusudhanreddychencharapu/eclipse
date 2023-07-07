package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.ConcurrentReferenceHashMap;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
	//	AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(JavaConfig.class);
		//get the bean from spring container
		

		Coach theCoach =context.getBean("tennisCoach",Coach.class);
		

		//call a method on the bean
		
		System.out.println(theCoach.getDailyWorkoutString());
		
		// call method to get the dailyFortune
		
		System.out.println(theCoach.getDailyFortune());
		//close the context
		
		context.close();
	}

}
