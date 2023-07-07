package someotherpackage;

public class Customer {
	
	private int cust_id;
	private String cust_name;
	private int cust_phone ;
	private String cust_password;
	Customer(int c_id,String c_name,int c_phone,String c_password )
	{
		cust_id=c_id;
		cust_name=c_name;
		cust_phone=c_phone;
		cust_password=c_password;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	void registerCustomer(int c_id,String c_name,int c_phone,String c_pass)
	{
		cust_id=c_id;
		cust_name=c_name;
		cust_phone=c_phone;
		cust_password=c_pass;
		
	}.
	boolean Login(int c_id,String c_password)
	{
		if(cust_id==c_id)
		{
		 	return true;
		}
		else 
		{
			return false;
		}
	}

}
