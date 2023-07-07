package Basics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
	
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Basics/ApplicationContext.xml");
		//retrive bean from spring container
		Coach theCoach=context.getBean("myCricketCoach",Coach.class);
		
		Coach newCoach=context.getBean("myCricketCoach",Coach.class);
		//call methods on the bean
		
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		
		theCoach.getAttributes();
		//close the context
		context.close();
	}

}
