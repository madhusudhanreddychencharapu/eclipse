package com.telusko.samsung;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppDemo {

	public static void main(String[] args) {
		
		ApplicationContext factory=new AnnotationConfigApplicationContext(AppDemoConfig.class);

		Samsung s7=factory.getBean(Samsung.class);
	
		s7.config();
	}

}
