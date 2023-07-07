package Basics;
//Defining the dependency interface and class
public class HappyFortuneSevice implements FortuneService {
	public HappyFortuneSevice()
	{
		System.out.println("default cons called of HappyFortuneService");
	}
	/*public HappyFortuneSevice(int num1,int num2)
	{
		System.out.println("this is in the happy constructor num1"+num1+"num1 :"+num1);
		System.out.println("I am in the happpy fortune service Constructor");
	}*/
	public String getFortune()
	{
		return "This is yours lucky day";
	}
}
