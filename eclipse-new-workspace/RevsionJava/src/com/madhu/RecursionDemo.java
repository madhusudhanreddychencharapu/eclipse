package com.madhu;

public class RecursionDemo {
	
	public static int a=0,b=1,c=0;

	public static void main(String[] args) {
		//printDigit(5);
		//System.out.println(factorial(5));
		//System.out.println(a);
		//System.out.println(b);
		//fibanacco(5);
		//fun(3); Tree Recursion
		//funA(20);Indirect Recursion
		//System.out.println(nestedRecursionFun(95));
		System.out.println(power(10,3));
	}
	public static void printDigit(int n) {
		
		if(n==0) {
			return;
		}if(n%2!=0)
		System.out.println(n);
		printDigit(n-1);
		if(n%2==0)
		System.out.println(n);
		return ;		
	}
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		int x= n*factorial(n-1);
		return x; 
	}
	public static void fibanacco(int n) {//
		if(n==1) {
			return;
		}
		 c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		fibanacco(n-1);
		
	}
	public static void fun(int n) {
		if(n>0) {
			System.out.println(n);
			fun(n-1);
			fun(n-1);
		}
	}
	public static void funA(int n) {
		if(n>0) {
			System.out.println(n);
			funB(n-1);
		}
	}
	public static void funB(int n) {
		if(n>0) {
			System.out.println(n);
			funA(n/2);
		}
	}
	public static int nestedRecursionFun(int n) {
		if(n>100) {
			return n-10;
		}
		else {
			return nestedRecursionFun(nestedRecursionFun(n+11));
		}
	}
	public static int power(int m,int n) {
		if(n==0)
			return 1;
		else
			return power(m,n-1)*m;
	}

}
