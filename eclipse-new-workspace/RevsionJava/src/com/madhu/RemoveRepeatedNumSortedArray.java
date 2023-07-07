package com.madhu;


public class RemoveRepeatedNumSortedArray {
	public static void main(String[] args) {
		int j=0,arr[]={1,2,3,4,5,6,6,7,8,9};// {1,1,2,2,3,3,4,4,5,5,9,9,9,99};	
		/*              0 1 2 3 4 5 6 7
	        Here the length of array is  8
		    Two pointer approach 
		  pointers=i,j;
		  arr[i]==arr[i+1] then no operation
		  else
		  then arr[j]=arr[i] j++  
		  after 1 iteration->1 2 \2 \2 3 3 4 4 i=2,j=2 it skip
		        2 iteration->1 2 2 2 3 3 4 4 i=3,j=2
		  */
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]==arr[i]){
			}else {
				arr[j++]=arr[i];
			}
		}
		arr[j]=arr[arr.length-1];
		for(int i=0;i<=j;i++)
		System.out.println(arr[i]);
	}

}
