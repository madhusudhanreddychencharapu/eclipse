package protected_package;

public class InterThread_Demo {
	public static void main(String[] args) throws Exception
	{
		 A a=new A();
		 Runnable p=new Producer(a);
		 Runnable c=new Consumer(a);
		 
		 Thread t1 =new Thread(p,"Producer");
		 Thread t2=new Thread(c,"Consumer");
		 
		 
			t1.start();
			t2.start();
			
			t1.join();
			t2.join();
		 System.out.println(a.count);
		 System.out.println("The program is completed");
	}

}
class A
{
	int num;
	boolean valueset = false;
	public void put(int num)
	{
		this.num=num;
	}
	public int get() {
		return num;
	}
	public synchronized void  increment() 
	{
			count++;
	}
}

class Producer implements Runnable
{
	A a;
	public Producer(A a)
	{
		this.a=a;
		
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			System.out.println("put :"+i);
			a.put(i++);
			
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}

class Consumer implements Runnable
{
	A a;
	public Consumer(A a)
	{
		this.a=a;
		
	}
	public void run()
	{
	
		while(true)
		{
			System.out.println("Get :"+a.get());
			try {Thread.sleep(500);}catch(Exception e){}
		}
	}
}