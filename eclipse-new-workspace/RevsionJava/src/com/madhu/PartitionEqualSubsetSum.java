package com.madhu;

import java.util.Arrays;

public class PartitionEqualSubsetSum {

	public static void main(String[] args) {
		int arr[]= {1,2,3};//{1,1}; //{1,5,16,5};
		System.out.println(partitionEqualSubsetSum(arr));
	}
	public static Boolean partitionEqualSubsetSum(int arr[]) {
		Arrays.sort(arr);
		int usum=0,lsum=0,mid;
		mid=arr.length/2;
		if(mid==1){
			if(arr[mid-1]==arr[mid])
				return true;
			else {
				return false;
			}
		}

		for(int x=0;x<arr.length;x++) {
			
			for(int i=0;i<=mid;i++)
			{
				lsum+=arr[i];
			}
			for(int j=arr.length-1;j>mid;j--)
			{
				usum+=arr[j];
			}
			if(lsum<(usum)) {
				mid++;
			}
			else if (lsum==usum) {
				return true;
			}
			else {
				mid--;
			}
			lsum=0;
			usum=0;
			
		}
		
		return false;
	}

}
