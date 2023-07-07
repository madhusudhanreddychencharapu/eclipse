import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Product {
	int product_id;
	String product_name;
	int product_price;
	HashMap<Integer, Product> hm = new HashMap<>();

	void addProducts ( int n)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the product_id");
			product_id =sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Product name");
			product_name=sc.nextLine();
			System.out.println("Enter the product Price");
			product_price=sc.nextInt();
			Product p= new Product(product_id,product_name,product_price);
			hm.put(product_id,p);
			
		}
	}
	void display()
	{
		for(Map.Entry<Integer, Product> ref :hm.entrySet())
		{
			Integer temp=ref.getKey();
			Product pr =ref.getValue();
			System.out.println(temp+" "+pr.product_id+" "+pr.product_name+" "+pr.product_price);
		}
	}
	Product(int product_id,String product_name,int product_price)
	{
		this.product_id=product_id;
		this.product_name=product_name;
		this.product_price=product_price;
	}
	Product()
	{
		
	}
}
