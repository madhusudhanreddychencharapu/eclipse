package com.madhu;

import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

public class IslaandCount {

	public static void main(String[] args) {
		int[][] arr= {{0,1},{1,0},{1,1},{1,0}};
		System.out.println(countNoOfIslands(arr));
	}
	public static int countNoOfIslands(int[][] arr) {
		
		int rows=arr.length,cols=arr[0].length,count=0;
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
		      if(row==0) {
		    	  if(col==0) {		    		  
		    		  if(arr[row][col+1]==0&&arr[row+1][col]==0)
							count++;
					}
		    	  else if (col==cols) {
		    		  if(arr[row-1][col]==0&&arr[row+1][col]==0)
							count++;
		    	  }
		    	  else {
		    		  if(arr[row][col-1]==0&&arr[row][col+1]==0&&arr[row+1][col]==0)
							count++;
		    	  }
			//----------------------------------------------------------------
			if(row==rows) {
		    	  if(col==0) {
		    		  if(arr[row-1][col]==0&&arr[row][col+1]==0)
							count++;
					}
		    		  
		    	  }else if (col==cols) {
		    		  if(arr[row][col-1]==0&&arr[row-1][col]==0)
							count++;
		    	  }
//		    	  else {
//		    		  if(arr[row][col-1]==0&&arr[row][col+1]==0&&arr[row-1][col]==0)
//							count++;
//				}
			//------------------------------------------------------------------
			if(col==0) {
		    	  if(row==0) {
		    		  
		    		  if(arr[row+1][col]==0&&arr[row][col+1]==0)
							count++;
		    	  }  
		    	  else if (row==rows) {
		    		  if(arr[row-1][col]==0&&arr[row][col+1]==0)
							count++;
		    	  }
		    	  else {
		    		  if(arr[row-1][col]==0&&arr[row+1][col]==0&&arr[row][col+1]==0)
							count++;
				}
		      }
			//------------------------------------------------------------------
			if(col==cols) {
		    	  if(row==0) {
		    		  
		    		  if(arr[row][col-1]==0&&arr[row+1][col]==0)
							count++;
		    	  }  
		    	  else if (row==rows) {
		    		  if(arr[row][col-1]==0&&arr[row-1][col]==0)
							count++;
		    	  }
		    	  else {
		    		  if(arr[row][col-1]==0&&arr[row-1][col]==0&&arr[row+1][col]==0)
							count++;
				}
		      }
			//-------------------------------------------------------------
		      }
			}
		
			}
		return count;
	}
	
}
