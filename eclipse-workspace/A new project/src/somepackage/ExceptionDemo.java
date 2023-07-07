package somepackage;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo
{

	public static void main(String[] args) throws InputMismatchException
	{
		Scanner sc=new Scanner(System.in);
		int a=1,b=1,c=0;
		try {
			System.out.println("Enter a two intgers for division");
			a=sc.nextInt();
			b=sc.nextInt();
			c=division(a,b);
	
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println("Bye bye user have a good day....\n visit next time");
		}
	
		
}
	public static int division(int a,int b) {
		int c;
		try {
			c=a/b;
			System.out.println("The division Output is "+c);
			throw new MyException("I am the One who raised the exception Raised");
		}
		catch(ArithmeticException e)
		{
				System.out.println(e);
				System.out.println("I am in catch block");
				System.out.println(" The number Cannot be divided by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
				System.out.println(e);
		}
		System.out.println("I am after the Exception");
		return 0;
	}
}
