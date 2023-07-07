package com.madhu;

public  class OuterClass {
	
	public static void heyThere()
	{
		System.out.println("Hey .. There !");
	}
	static class InnerClass{
		public static void whatsUp() {
			System.out.println("whats up from the inner class");
		}
		public static void eat()
		{
			System.out.println("I am ready to eat");
		}
	}

}
