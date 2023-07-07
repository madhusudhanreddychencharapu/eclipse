package somepackage;
import java.util.*;
public class Testing {
	public static void main(String []  args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Product Id,Product name,Product_price");
		int p_id=sc.nextInt();
		String p_name=sc.nextLine();
		int p_price =sc.nextInt();
		Product p=new Product();
		p.add(p_id,p_name,p_price);
	}

}
