package com.ecommers;

//import com.mysql.cj.xdevapi.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.QueryInfo;
import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;
public class OrderService {
	Scanner sc;
	ResultSet rs;
	static int count;
	
	public int createOrder(Statement stt,Customer c,CustomerService cr) 
	{
		
		this.productDetails(stt);
		
		String query1="select customerId from customer where username="+"'"+cr.username+"'";
		System.out.println(query1);
		ResultSet rs1;
		int cuid=0;
		try {
				rs1 = stt.executeQuery(query1);
				rs1.next();
				cuid=rs1.getInt(1);
		} catch (SQLException e1) {
			
				System.out.println("The exception generated in the while taking customer id ");
		}
		
		System.out.println("Enter the no of products you want to buy");
		int n=sc.nextInt();
		
		
		for(int i=0;i<n;i++) {
				
				
				System.out.println("Enter the Product id");
				int prodid=sc.nextInt();
				int prodprice=0;
		
		
				String getquery="select productprice from product where productid="+prodid;
				
				try {
							rs=stt.executeQuery(getquery);
							while(rs.next()) {
							prodprice=rs.getInt(1);}
				} 
				catch (Exception e) {
							System.out.println("Exception occured while taking the product price");
				}
		
				String queryinfo="insert into orders values(orderId"+","+cuid+","+prodid+","+prodprice+",now()"+")";
	
				
				try {
						int count =stt.executeUpdate(queryinfo);
				} 
				catch (Exception e) {
						System.out.println("Exception generated while updaating into the orders table");
				}
				
		}
		
		String sum="select sum(amount) from orders where customerId="+cuid;
		
		
		try {
					rs=stt.executeQuery(sum);
					while(rs.next()) {
						count=rs.getInt(1);
						}
			}
		catch(Exception e){
					System.out.println("Exception is occured while doinng sum");
			}
		System.out.println("The Total Price of the products That customer Ordered  :"+count);
		
		String query100="select * from address where customerid="+cuid;
		ResultSet rx100;
		try {
			rx100 = stt.executeQuery(query100);
			System.out.println("The Order will be delivered to this address");
			while(rx100.next())
			{
					System.out.println(rx100.getString(2)+"   "+rx100.getString(3)+"   "+rx100.getInt(4));
			}
		} catch (SQLException e) {
			
			System.out.println("The Exception occured while fetching the address");
		}
		
		
		return 0;
	}
	public int editorder(Statement st,CustomerService cs)
	{
		int customerid=cs.customerID(st);
		
		System.out.println("Here the list of products you are  ordered");
		
		String query="select productid from orders where customerid="+customerid;
		ResultSet rs;
		try {
			rs = st.executeQuery(query);
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
			}
		} catch (SQLException e) {
			System.out.println("Here getting an exception while getting the product details ordered");
		}
		
		System.out.println("Enter the no of products you want to modify");
		int n=sc.nextInt();
		
					for(int i=0;i<n;i++)
					{
						System.out.println("Enter the previous product id");
						int preordid=sc.nextInt();
						System.out.println("Enter the new product id");
						int ordid=sc.nextInt();
						String query_del="update orders set orderID="+ordid+" where customerid="+customerid+" and "+"orderid="+preordid;
						
						System.out.println(query_del);
						try {
							int m=st.executeUpdate(query_del);
							System.out.println("The"+ordid+" with the product is modified");
							
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						String querysum="Select sum(amount) from orders where customerid="+customerid;
						ResultSet rm;
						try {
							rm = st.executeQuery(querysum);
							while(rm.next())
							{
								System.out.println("The update price of the all of your orders is :"+rm.getInt(1));
							}
						} catch (SQLException e) {
							System.out.println("The Exception occured in while printing sum of all updated products");
						}
						
		}
		
		
		return 0;
	}
	public boolean deleteorder(Statement st,Address ad,CustomerService cs)
	{
		String query1="select customerId from customer where username="+"'"+cs.username+"'";
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
		String query="Delete from Orders where customerid="+cuid;
		try
		{
			System.out.println("The no of deleted orders are : "+st.executeUpdate(query));
		} 
		catch (SQLException e) {
			System.out.println("The Exception is ocuured while deleting the orders");
		}
		return true;
	}
	{
		sc=new Scanner(System.in);
	}
	public  void productDetails(Statement stt)
	{
				String query="select * from product";
				System.out.println("Here is a list of all the products");
				try {
						rs = (stt.executeQuery(query));
						while(rs.next())
						{
							System.out.println(rs.getInt(1)+" 	"+rs.getString(2)+"		"+rs.getInt(3)+"	 "+rs.getString(4));
						}
					
				} 
				catch (SQLException e) {
						System.out.println("Exception executed while showing list of products");
				}
		
	}
}
