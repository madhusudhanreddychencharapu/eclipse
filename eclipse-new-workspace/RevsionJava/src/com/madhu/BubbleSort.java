package com.madhu;

import java.util.Iterator;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {99,65,85,14,95,78};
		int[] arr1=bubbleSort(arr);
		for (int i = 0; i< arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
	public static int[] bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		return arr;
	}

}
