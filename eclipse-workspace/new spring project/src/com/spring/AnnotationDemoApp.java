package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.ConcurrentReferenceHashMap;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	//	AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(JavaConfig.class);
		//get the bean from spring container
		

		Coach theCoach =context.getBean("tennisCoach",Coach.class);
		
		Coach myCoach=context.getBean("tennisCoach",Coach.class);
		
		theCoach.setStr("madhu");
		//call a method on the bean
		
		System.out.println(theCoach.getDailyWorkoutString());
		
		// call method to get the dailyFortune
		
		System.out.println(theCoach.getDailyFortune());
		//close the context
		
		context.close();
	}

}
