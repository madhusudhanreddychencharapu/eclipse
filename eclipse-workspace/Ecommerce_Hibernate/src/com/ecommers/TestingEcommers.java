package com.ecommers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class TestingEcommers {
	

	public static void main(String[] args) throws Exception{
		
		String url="jdbc:mysql://localhost:3306/ecommers";
		String uname="root";
		String pass="Madhu@1969";

		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		System.out.println("Database is connected");
		Statement  st=con.createStatement();
		
		
		
		OrderService os=new OrderService();
		CustomerService cs=new CustomerService();
		
		Scanner sc= new Scanner(System.in);
		Customer c=new Customer();
		Address ad=new Address();
		
	
		while(true) {
	

				System.out.println("Enter  \n1.Login the Customer\n2.Display the Products"
						+"\n3.Register the Customer");
				int i=sc.nextInt();
				switch(i) {
					case 3:cs.addCustomerDetails(c,st,ad);
							break;
					case 2: os.productDetails(st);
							break;
					case 1: if(cs.login(st))
								{
									System.out.println("Login is Succesful");
									System.out.println("Enter the \n1:Create the Order \n2.Edit customer Details \n3.Delete the order \n4.Edit the Order Details1 \n5.Logout");
									int input=sc.nextInt();
									switch(input){
										case 1:os.createOrder(st,c,cs);
												break;
										case 2:cs.editcustomerdetails(c, st,ad);
												break;
										case 3:os.deleteorder(st, ad, cs);
												break;
										case 4:os.editorder(st, cs);
												break;
										case 5:System.out.println("Successfully logged out...!");
												System.out.println("----------------------------------------------------");
												break;
										default:System.out.println("Dear User you are entered a incorrect input ");
									}
								}
							else {
								
									System.out.println("Login is Unsuccesfull");
									System.out.println("Enter the proper Credentials");
									System.out.println("--------------------------------------------------");
								}
				}		
		
		
		}
		
		
		
		
	
		
		

	}
	/*public static void  addProducts(Product p,Scanner sc,Statement st) throws Exception
	{
		
		System.out.println("Enter the product ID");
		p.setProductId(sc.nextInt());
		System.out.println("Enter the product name");
		sc.nextLine();
		p.setProductName(sc.nextLine());
		System.out.println("Enter the Product Price");
		p.setProductPrice(sc.nextInt());
		System.out.println("Enter the product type");
		sc.nextLine();
		p.setProductType(sc.nextLine());
		
		String query1="insert into product value("+p.getProductId()+","+p.getProductName()+","+p.getProductPrice()+","+p.getProductType()+")";
		int rs=st.executeUpdate(query1);
		
		System.out.println("Program is ended");
	}*/
}
