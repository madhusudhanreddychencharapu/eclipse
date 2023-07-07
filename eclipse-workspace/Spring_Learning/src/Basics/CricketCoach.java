package Basics;

public class CricketCoach implements Coach{
	
	private String email;
	private String team;
	
	//setters and getters for email and team
	
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	private FortuneService fortuneService;
	
	public CricketCoach()
	{
		System.out.println("I am in the Cricket class Constructor");
	}
	
	//Through setters setting the another class constructor
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("I am setting through the setter injection method");
	}

	


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	public void getAttributes()
	{
		System.out.println("The email address is "+ email);
		System.out.println("The team name is "+team);
	}
	

}
