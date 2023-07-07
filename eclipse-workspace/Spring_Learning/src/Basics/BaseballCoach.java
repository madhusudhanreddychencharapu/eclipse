package Basics;
//create a constructor for your injections
public class BaseballCoach implements Coach {
	private FortuneService fortuneservice;
	public BaseballCoach(FortuneService fortuneservice) {
		this.fortuneservice=fortuneservice;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return  "I am doing workout daily and i am in Baseball coach class";
	}
	@Override
	public String getDailyFortune() {
		
		return fortuneservice.getFortune();
	}

}
