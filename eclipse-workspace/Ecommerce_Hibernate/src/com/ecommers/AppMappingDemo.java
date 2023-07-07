package com.ecommers;
//
//import javax.transaction.HeuristicMixedException;
//import javax.transaction.HeuristicRollbackException;
//import javax.transaction.RollbackException;
//import javax.transaction.SystemException;
//import javax.transaction.Transaction;

import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.transaction.Transaction;

public class AppMappingDemo {

	public static void main(String[] args) {
		
		System.out.println("I am running");
		
		OrderService os=new OrderService();
		CustomerService cs=new CustomerService();
		
		Scanner sc= new Scanner(System.in);
		Customer c=new Customer();
		Address ad=new Address();
		CustomerLogin cl=new CustomerLogin();
		
		
		
		Configuration factory=new Configuration().configure("hibernate1.cfg.xml")
											.addAnnotatedClass(Customer.class)
											.addAnnotatedClass(CustomerLogin.class)
											.addAnnotatedClass(Address.class);
		
		System.out.println("check-1");
		//Create  the session
		SessionFactory sf=factory.buildSessionFactory();
		

		Session session=sf.openSession();
		session.beginTransaction();

	
//			System.out.println("Enter  \n1.Login the Customer\n2.Display the Products"
//					+"\n3.Register the Customer");
//			int i=sc.nextInt();
//			switch(i) {
//				case 3:cs.addCustomerDetails(c,cl,ad);
//						break;
////				case 2: os.productDetails();
////						break;
//				case 1: if(cs.login(session))
//							{
//								System.out.println("Login is Succesful");
//								System.out.println("Enter the \n1:Create the Order \n2.Edit customer Details \n3.Delete the order \n4.Edit the Order Details1 \n5.Logout");
//								int input=sc.nextInt();
//								switch(input){
////									case 1:os.createOrder(st,c,cs);
////											break;
////									case 2:cs.editcustomerdetails(c, st,ad);
////											break;
////									case 3:os.deleteorder(st, ad, cs);
////											break;
////									case 4:os.editorder(st, cs);
////											break;
//									case 5:System.out.println("Successfully logged out...!");
//											System.out.println("----------------------------------------------------");
//											break;
//									default:System.out.println("Dear User you are entered a incorrect input ");
//								}
//							}
//						else {
//							
//								System.out.println("Login is Unsuccesfull");
//								System.out.println("Enter the proper Credentials");
//								System.out.println("--------------------------------------------------");
//							}
//			}		
//	
//	
	
		
		
//		/0cs.addCustomerDetails(c,cl,ad);
		
		session.save(c);
	 	session.save(cl);
		session.save(ad);
		
		String query="from customerlogin where username=''madhusudhan";
		List<CustomerLogin> cuslogin=session.createQuery(query).getResultList();
		ResultSet rs=null;
	
			 String name=cuslogin.get(0).getUsername();
			String pass=cuslogin.get(0).getPassword();
			
			System.out.println("name is" +name+",password is "+pass);
		System.out.println("I am executing the program");
		
	
		session.getTransaction().commit();

	}
}
