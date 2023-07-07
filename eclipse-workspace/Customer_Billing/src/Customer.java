create table orders(orderID int,customerID int, foreign key(customerID) references customer(customerID),productID int ,foreign key(productID) references product(productId));import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Customer {
	Scanner sc=new Scanner(System.in);
	public Customer(int customer_ID, String customer_name, String address, int phone_number,String password) {
		super();
		this.customer_ID = customer_ID;
		this.customer_name = customer_name;
		this.address = address;
		this.phone_number = phone_number;
		this.password=password;
	}
	Customer(){
		
	}
	int customer_ID;
	String customer_name;
	String address;
	int phone_number;
	String password;
	HashMap<Integer,Customer> hp=new HashMap<>();
	void addCustomer()
	{
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Customer_id");
			customer_ID =sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Customer name");
			customer_name=sc.nextLine();
			System.out.println("Enter the Customer Address");
			address=sc.nextLine();
			System.out.println("Enter the Phone number");
			phone_number=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the password");
			password=sc.nextLine();
			Customer c= new Customer(customer_ID,customer_name,address,phone_number,password);
			hp.put(customer_ID,c);
			
		}
	void display()
	{
		for(Map.Entry<Integer, Customer> ref :hp.entrySet())
		{
			Integer temp=ref.getKey();
			Customer pr =ref.getValue();
			System.out.println(temp+" "+"\nCustomer_ID"+pr.customer_ID+"\nCustomer Name "+pr.customer_name+"\nCustomer_Address "+pr.address+"\nphone_number"+pr.phone_number);
		}
	}
	boolean Login()
	{
		Customer temp_obj;
		String temp_name;
		System.out.println("Enter the customer id and Passeword");
		int cust_id=sc.nextInt();
		sc.nextInt();
		String password=sc.nextLine();
		if(hp.containsKey(cust_id))
		{
			  temp_obj=hp.get(cust_id);
			  temp_name=temp_obj.password;
			  if(temp_name==password)
			  {
				  return true;
			  }
			  else {
				   return false;
				   System.out.println("you have entered a wrong password");
			}
			  
		}else {
				System.out.println("Dear Customer you entered a wrong customer id and password");
		}
	}
	

}
