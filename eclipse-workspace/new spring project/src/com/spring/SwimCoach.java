package com.spring;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		
		return "Swim 1000 metres as a warm up";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
