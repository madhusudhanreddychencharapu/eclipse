package someotherpackage;
import java.util.*;
public class Product {


	private int product_id;
	private String product_name;
	private int product_price;
	HashMap<Integer,String> map1= new HashMap<>();
	HashMap<Integer,Integer> map2=new HashMap<>();
	void add(int p_id,String p_name,int p_price)
	{
		map1.put(p_id,p_name);
		map2.put(p_id,p_price);
	}
	Product()
	{
		
	}
	
	Product(int p_id,String n,int p_price)
	{
		product_id=p_id;
		product_name=n;
		product_price=p_price;
	}
	void displayProdDetails(int product_id)
	{
		if(map1.containsKey(product_id))
		{
			String str=map1.get(product_id);
			System.out.println("the product details are " + str);
			
		}
		if(map2.containsKey(product_id))
		{
			int str=map2.get(pr
					oduct_id);
			System.out.println("the product details are " + str);
		}
		
	}
}
