package com.madhu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringLearning extends Object{

	public static void main(String[] args) {
		
//	//	ArrayList<Integer> [][] alist =new ArrayList<>()[][];
//	//	HashMap<Integer, Integer> map=new HashMap<>();
//		int[] arr= {5,4,6,7,8,10,1,12,-1};//-1,1,4,5,6,7,8,10,11
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=0;j<arr.length;j++)
//			{
//				if((arr[i]+arr[j]==11)&&i!=j){
//					System.out.println("["+arr[i]+","+arr[j]+"]");
//				}
//			}
//		}
//		//System.out.println(map);
//		String str1="tomjerry";
//		String str2="tomjerry";
//		System.out.println(str1==str2);
//		System.out.println(str1.equals(str2));
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//		System.out.println("str1="+str1.getClass());
//		System.out.println(str2.getClass());
		
		temp obj1 =new temp();
		temp obj2 =new temp();
		temp obj3 =new temp();
		temp obj4 =obj1;
		
		StringLearning obj5=new StringLearning();
		obj5.equals(obj5);
		
		obj1.id=10;
		obj1.name="madhu";
		
		obj3.id=10;
		obj3.name="madhu";
		
		obj2.id=20;
		obj2.name="tom";
		
	//	System.out.println(obj1.equals(obj1));
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
		System.out.println(obj1.equals(obj4));
		
		

	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("I am overriding in StringLearning");
        return (this == obj);
    }
	
	

}
