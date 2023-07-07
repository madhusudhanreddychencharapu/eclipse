package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load spring configuration file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//retrive bean from spring container
		
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach=context.getBean("tennisCoach",Coach.class);
		
		boolean result= (theCoach==alphaCoach);
			
		
		//print out the result of the information
		
		System.out.println("Printing the same Object :"+result);
		
		System.out.println("Address of the Object \"theCoach\":"+theCoach);
		
		System.out.println("Address of the Object \"alphaCoach\":"+alphaCoach);
	}

}
