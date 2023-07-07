package com.madhu;

import java.util.concurrent.ThreadPoolExecutor;

public class DutchNationalProblem{

	public static void main(String[] args) {
		int arr[]= {0,0,2,1,2,0,0,2};
		int res[]=triProblem(arr);
		for(int i:arr)
		System.err.println(i);

	}
	public static int[]	triProblem(int[] arr) {
		
	int lb=0,hb=arr.length-1,mid=0,temp=0;
		/*0 0 2 1 2 0 0 2
		 three pointer approach
		 lb=0,hb=7,mid=0;
		 total three possible cases
		 case 1:arr[mid]==0
		 case 2:arr[mid]==1
		 case 3:arr[mid]==2
		 
		 case 1:arr[mid]==0 then mid++,lb++;
		 
		 case 2:arr[mid]==1 then mid++
		 
		 case 3:arr[mid]==2 then swap[mid,high],high--
		
		*/
		for(int i=0;mid<=hb;i++)
		{
			if(arr[mid]==0)
			{
				temp=arr[lb];
				arr[lb]=arr[mid];
				arr[mid]=temp;
				lb++;
				mid++;
			}
			else if (arr[mid]==1) {
				mid++;
			}
			else {
				temp=arr[mid];
				arr[mid]=arr[hb];
				arr[hb]=temp;
				hb--;
			}
		}
		return arr;
		
	}
	
}
