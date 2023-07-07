package com.ecommers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;

public class CustomerService {
	
	Scanner sc;
	String username=null;
	String password=null;
	
	public void addCustomerDetails(Customer cr,CustomerLogin cl,Address ad )
	{
		System.out.println("Enter the customer Name");
		cr.setName(sc.nextLine());
		System.out.println("Enter the phone number");
		cr.setPhn(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter the username want to create");
		cl.setUsername(sc.nextLine());
		System.out.println("Enter the password for Creation");
		cl.setPassword(sc.nextLine());
		
		cl.setCustomer(cr);
		System.out.println("the query for execution is completed");
		
		
			System.out.println("Enter the Street");
			ad.setStreet(sc.nextLine());
			System.out.println("Enter the city");
			ad.setCity(sc.nextLine());
			System.out.println("Enter the pincode");
			ad.setPincode(sc.nextInt());
			System.out.println("The user name is :"+cl.getUsername());
			
			ad.setCustomer(cr);
		
	}
	
	public void editcustomerdetails(Customer cr,Statement st,Address ad)	
	{
				System.out.println("Enter the no :\n1.To edit the name,phonenumber \n2: To edit the Address details");
				int n=sc.nextInt();
				
				switch(n) 
				{
				
					case 1:this.editCustomerDetailsOrg(cr, st);
							break;
					
					case 2:this.editAddressDetails(cr, st, ad);
							break;
				
				}
				
		
	}
	public boolean login(Session session)
	{
		
					String query=null;
					String name=null;
					String pass=null;
					
				
					System.out.println("Enter the username ");
					username=sc.nextLine();
					System.out.println("Enter the password");
					password=sc.nextLine();
					
					query="from customerlogin where username='"+username+"'";
					
					List<CustomerLogin> cuslogin=session.createQuery(query).getResultList();
					ResultSet rs=null;
				
						name=cuslogin.get(0).getUsername();
						pass=cuslogin.get(0).getPassword();
						
						System.out.println("name is" +name+",password is "+pass);
				
						
			
								if(name.equals(username)) {
									if(pass.equals(password))
									{
										System.out.println("Login is successful");
										return true;
									}
								}
								else {
									
									System.out.println("Login is unsuccessful");
									return false;
								}
					 
						
						return false;
	}
	public void editCustomerDetailsOrg(Customer cr,Statement st)
	{
				System.out.println("Enter the customer Name");
				cr.setName(sc.nextLine());
				System.out.println("Enter the phone number");
				cr.setPhn(sc.nextInt());
				System.out.println("Login name is "+username);
				System.out.println("password is :"+password);
				
				System.out.println("The customer name is "+cr.getName());
				
				String query1="select customerId from customer where username="+"'"+username+"'";
				System.out.println(query1);
				ResultSet rs1;
				int cuid=0;
				try {
						rs1 = st.executeQuery(query1);
						rs1.next();
						cuid=rs1.getInt(1);
				} catch (SQLException e1) {
					
						System.out.println("The exception generated in the while taking customer id ");
				}
				
				String query="UPDATE CUSTOMER SET customerId="+cuid+","+"custerName="+"'"+cr.getName()+"'"+","+"phoneNumber="+cr.getPhn()+" where customerId="+cuid;
				System.out.println("The Query is :"+query);
				try {
					int count=st.executeUpdate(query);
				} catch (SQLException e) {
					System.out.println("I am getting an exception");
					e.printStackTrace();
				}
	}
	public void editAddressDetails(Customer cr,Statement st,Address ad)
	{
		
				System.out.println("Enter the Street Name");
				sc.nextLine();
				ad.setStreet(sc.nextLine());
				System.out.println("Enter the city Name");
				ad.setCity(sc.nextLine());
				System.out.println("Enter the Pincode ");
				ad.setPincode(sc.nextInt());
				
				
		//		System.out.println("Login name is "+username);
		//		System.out.println("password is :"+password);
				
				
				String query1="select customerId from customer where username="+"'"+username+"'";
				//System.out.println(query1);
				ResultSet rs1;
				int cuid=0;
				try {
						rs1 = st.executeQuery(query1);
						rs1.next();
						cuid=rs1.getInt(1);
				} catch (SQLException e1) {
					
						System.out.println("The exception generated in the while taking customer id ");
				}
				
				String query="UPDATE ADDRESS SET customerId="+cuid+","+"Street="+"'"+ad.getStreet()+"'"+","+"city="+"'"+ad.getCity()+"'"+","+"pincode="+ad.getPincode()+" where customerId="+cuid;
				//System.out.println("The Query is :"+query);
				try {
					int count=st.executeUpdate(query);
				} catch (SQLException e) {
					System.out.println("I am getting an exception");
					e.printStackTrace();
				}
	}
	public  int customerID(Statement st)
	{
				String query1="select customerId from customer where username="+"'"+this.username+"'";
				System.out.println(query1);
				ResultSet rs1;
				int cuid=0;
				try
				{
						rs1 = st.executeQuery(query1);
						rs1.next();
						cuid=rs1.getInt(1);
				} 
				catch (SQLException e1)
				{
					
						System.out.println("The exception generated in the while taking customer id ");
				}
				return cuid;
	}
	
	{
		 sc=new Scanner(System.in);
	}
	
}
