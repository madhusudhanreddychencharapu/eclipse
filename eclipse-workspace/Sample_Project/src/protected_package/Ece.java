package protected_package;

class Ece extends Thread
{
	public static void main(String [] args)
	{
		Cse cs= new Cse();
		cs.print();
		System.out.println(cs);
		System.out.println("The method running is completed");
	}
}
class Cse {
	void print()
	{
		System.out.println(this);
	}
}


