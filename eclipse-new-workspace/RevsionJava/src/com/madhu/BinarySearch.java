package com.madhu;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {1,5,9,10,15,63,72,96,98},num=98,result;
		result=BinarySearch(arr, num);
		System.out.println(result);
		
	}
	public static int BinarySearch(int[] arr, int num) {
		//{1,5,9,10,15,63,72,96,98}
		// 0 1 2  3  4  5  6  7  8
		
		int lb=0,ub=arr.length-1,temp;
		
		for(int i=0;i<arr.length/2;i++) {
			
			System.out.println("I am running");
			temp=(lb+ub)/2;//0+8/2=4
			
			if(arr[temp]>num) {
				ub=temp-1;
			}
			else if (arr[temp]<num) {
				lb=temp+1;
			}
			else {
				return temp;
			}
		}
		return 0;
	}

}

//1st iteration-0+8/2=4,lb=5,ub=8
//2nd iteration=5+8/2=6,lb=7,ub=8
//3rd iteration=7+8/2=7 return temp
