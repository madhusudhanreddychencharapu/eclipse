package com.madhu;

public interface Printable {
	
	int x;
	static int y;
	int add(int a,int b);
	public static void show(int a,int b)
	{
		x=a;
		y=b;
		
		System.out.println("I am running");
	}
}
