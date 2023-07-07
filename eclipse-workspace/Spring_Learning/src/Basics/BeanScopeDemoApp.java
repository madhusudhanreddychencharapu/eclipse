package Basics;
 import org.springframework.context.support.ClassPathXmlApplicationContext;
public class BeanScopeDemoApp {

	public static void main(String[] args) {
			//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Basics/beanScope-ApplicationContext.Xml");
		
		
			//retrieve bean from spring container
		Coach theCoach =context.getBean("mycoach",Coach.class);
		
		Coach alphaCoach =context.getBean("mycoach",Coach.class);
		
		boolean result =(theCoach==alphaCoach);
		
		theCoach.setName("MadhuSudhan");
		alphaCoach.setName("sai krishna");
		
		System.out.println(" The name variable in the Trackcoach accesing through \"the coach\" is :"+theCoach.getName());
		
		System.out.println(" The name variable in the Trackcoach accesing through \"alpha coach\" is :"+alphaCoach.getName());
		
		System.out.println("pointing to same object "+result);
		
		System.out.println("\nMemory location of thecoach "+theCoach);
		
		System.out.println("\nMemory location of alphacoach "+alphaCoach);
		
		context.close();
	}

}
