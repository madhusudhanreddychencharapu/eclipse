package temp3;

@FunctionalInterface
interface A
{
	public void show();
}
public class AnonymousClass {
	public static void main(String[] args)
	{
		A obj=()->System.out.println("I am in  the anonymous class");
		
		obj.show();

	}

}
