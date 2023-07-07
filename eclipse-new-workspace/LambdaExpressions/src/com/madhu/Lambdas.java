package com.madhu;

public class Lambdas {
	public static void main(String[] args) {
		
////		Printable p= (a,b)->{
////				return a+b;
//		};
//		System.out.println(p.add(5,6));
	}
	
	
//	public static void printThing(Printable thing)
//	{
//		thing.print();
//	}
    Printable p = new Printable() {
		
		@Override
		public int add(int a, int b) {
			// TODO Auto-generated method stub
			return 0;
		}
	};  
}
