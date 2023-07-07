package somepackage;

public class SyncDemo {
	public static void main(String[] args) throws Exception {
		
	Runnable r1=new Temp1();
	Runnable r2=new Temp2();
	
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	
	t1.start();
	t2.start();
	
	t1.join();
	t2.join();
	
	System.out.println("The Final Count is :"+Data.count);
	System.out.println("Program is running");
	}
}
class Data
{
	public static int count ;
	public synchronized static void increment()
	{
		count++;
	}
	
}
class Temp1 implements Runnable
{
	public void  run() {
		for(int i=0;i<1000;i++) {
			Data.increment();
			}
	}
}
class Temp2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<1000;i++) {
		Data.increment();
		}
	}
}