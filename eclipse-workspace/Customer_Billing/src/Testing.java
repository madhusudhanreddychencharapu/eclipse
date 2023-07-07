import java.util.HashMap;
import java.util.Scanner;
public class Testing {
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		Product p= new Product();
		Customer c=new Customer();
		System.out.println("Enter the \n1:Add the Products\n2.Display the Products"
				+ "\n3.Register the Customer"+"\n4.Display the Customer"+"\n5.Login the Customer");
		int i=sc.nextInt();
		switch(i) {
			case 1: System.out.println("Enter the no of products");
					int prod_no=sc.nextInt();
					p.addProducts(prod_no);
					break;
			case 2: p.display();
					break;
			case 3: c.addCustomer();
					c.display();
			case 4: c.Login();
		}
		//System.out.println("I am running ");
	}

}
