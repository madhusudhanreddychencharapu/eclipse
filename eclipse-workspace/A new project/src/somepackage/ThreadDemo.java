package somepackage;
class Hi implements Runnable{
	public void run()
	{
		for(int i=0;i<5;i++) {
			System.out.println("Hi"+" "+Thread.currentThread().getPriority());
			try{Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
class Hello	 implements Runnable
{
	public void run() {
	//public void show()
	{
		for(int i=0;i<10;i++) {
		System.out.println("Hello");
		try{Thread.sleep(500);}catch(Exception e) {}
		}}
	}
}


public class ThreadDemo {
	public static void main(String[] args) throws Exception
	{
		
	
	Hi obj1=new Hi();
	Hello obj2=new Hello();
	
	Thread t1= new Thread(obj1,"Hi thread");
	Thread t2=new Thread(obj2,"Hello thread");
	
//	t1.setPriority(Thread.MIN_PRIORITY);
//	t2.setPriority(Thread.MAX_PRIORITY);
	
	t1.start();
	t2.start();
	
//	
//	System.out.println(t1.getPriority());
//	System.out.println(t2.getPriority());
//	
	System.out.println("Program is finished");

	//obj1.show();
	//obj2.show();
}
}