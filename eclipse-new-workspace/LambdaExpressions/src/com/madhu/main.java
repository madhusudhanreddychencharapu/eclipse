package com.madhu;

import java.util.List;

import com.madhu.OuterClass.InnerClass;

public class main {

	public static void main(String[] args) {
		
		/*
		 * List<Singleton> st1 = Singleton.getInstance(); System.out.println(st1);
		 * List<Singleton> st2 = Singleton.getInstance(); System.out.println(st2);
		 * 
		 * // Singleton str3=new Singleton(); // Singleton str4=new Singleton(); //
		 * System.out.println("Str3"+" "+str3+" "+"\nstr4"+" "+str4);
		 * System.out.println("The count of objects"+""+Singleton.count);
		 * 
		 * Printable.show();
		 */
		
		InnerClass.eat();
		OuterClass.InnerClass.eat();
		
		InnerClass.whatsUp();
		
//		OuterClass.InnerClass inner = outer.new InnerClass();
//		inner.eat();
	}

}
