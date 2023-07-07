package com.madhu;

public class RemoveOuterParanthesis {

	public static void main(String[] args) {
		String str="(()())(())";//"((()))(())";
		System.out.println("two variable method "+removeOuterParanthes(str));
		System.out.println("one variable method "+removeOuterParanthesusingonevariable(str));
	}
	public static String removeOuterParanthes(String str) {
		int opencount=0,closecount=0,start=1;
		String resString="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c=='(') 
				opencount++;
			else if(c==')')
				closecount++;
			if(opencount==closecount&&opencount!=0) {
				resString+=str.substring(start,i);
				start=i+2;
				opencount=0;
				closecount=0;
			}
		}
		return resString;
	}
	public static String removeOuterParanthesusingonevariable(String str) {
		int count=0,start=1;
		String resString="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c=='(') 
				count++;
			else if(c==')')
				count--;
			if(count==0) {
				resString+=str.substring(start,i);
				start=i+2;
			}
		}
		return resString;
	}

}
