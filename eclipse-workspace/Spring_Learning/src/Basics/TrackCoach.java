package Basics;

public class TrackCoach implements Coach {
	
	private String name;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Ran a hard 5k";
	}
	public TrackCoach()
	{
		System.out.println("This is the default constructor of TrackCoach class");
	}

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it : "+fortuneService.getFortune();
	}
	
	
	//add an init method
	public void doMyStartupStuff(){
		System.out.println("TrackCoach : inside method doMyStartupStuff");
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("the printing of numbers is completed");
	}
	
	
	//add an destroy method
	
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach : inside method doMyCleanuostuff");
		System.out.println("I excecuted the logic and closed my stuff");
	}

}
