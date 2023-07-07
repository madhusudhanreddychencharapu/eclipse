package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public TennisCoach()
	{
		
	}
	public TennisCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
		System.out.println("Hey I am executing the Tennis Coach ");
	}
	//setter method for the FortuneService
	
	/*public TennisCoach()
	{
		System.out.println("TennisCoach:Default Constructor");
	}*/
	/*
	public void setFortuneService(FortuneService fortuneService)
	{
		this.fortuneService=fortuneService;
		System.out.println("I am injecting the dependencies through the setter");
	}*/
	
	/*
	public void reallyCoolStuff(FortuneService fortuneService)
	{
		this.fortuneService=fortuneService;
		System.out.println("TennisCoach: Inside the reallyCoolStuff()");
		
	}*/
	
	@Override
	public String getDailyWorkoutString() {
		return "Practice the Spring Core";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	

	public void addInitMethod()
	{
		System.out.println("The is Init Method of the Bean");
	}

}
