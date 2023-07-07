package hb_O1_one_to_one_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("NewFile.xml")
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Instructor.class)
		        .buildSessionFactory();
				//Create the session
		      Session session = factory.getCurrentSession();
		      
		      //create the Objects
		      Instructor tempInstructor=new Instructor("madhusudhanreddy","chencharapu","msreddy@gmail.com");
		      
		      InstructorDetail tempInstructorDetail=new InstructorDetail("http:luv2code","coding lover");
		      
		      //Associate the Objects
		      
		      tempInstructor.setInstructorDetail(tempInstructorDetail);
		      
		      //Start the Transaction
		      session.beginTransaction();
		      
		      //save the instructor
		      //Note this will also save the details Object
		      System.out.println("Saving Instructor : "+tempInstructor);
		      session.save(tempInstructor);
		      
		      //commit the transaction
		      session.getTransaction().commit();
		      System.out.println("done!");
	}
}
