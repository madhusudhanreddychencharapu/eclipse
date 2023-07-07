package Basics;

public class Testing_temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		temp t=new temp();
		temp t1=new temp();
		temp t2=new temp();
		System.out.println(" the no of objects Constructed "+temp.Object_Count);
		System.out.println(" the no of objects Constructed "+t1.Object_Count);
	}

}
class temp
{
	static int Object_Count=0;
	public temp()
	{
		Object_Count++;
	}
	
}
