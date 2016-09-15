package com.mani.gayi.array;

public class MinimumNumberOfJumpsToReachEnd {
	
	
	
	
	public static void main(String[] args) {
		
		int arr[] = {1,4,3,7,1,2,1,1,1,10};
		
		int resultusingrecursion = getMinimumNumberOfJumpsUsingRecursion(arr, 0, arr.length-1);
		System.out.println("Minimum Number of Jumps using recursion "+resultusingrecursion);
		
	}

	private static int getMinimumNumberOfJumpsUsingRecursion(int[] arr,int start,int end) {

		// Base case: when source and destination are same
		// i.e. only one element exits in the array so no jumps are required.
		   if (start == end)
		     return 0;
		 
		   // When nothing is reachable from the given source
		   // if the given array position value is zero then return MAX_VALUE from integer.
		   if (arr[start] == 0)
		     return Integer.MAX_VALUE;
		 
		   // Initialize the minimum value with integer maximum value.
		   int min = Integer.MAX_VALUE;
		   
		   
		   // Traverse through all the points reachable from arr[l]. Recursively
		   // get the minimum number of jumps needed to reach arr[h] from these
		   // reachable points.
		   
		   // iterate till the array value and find the minimum jumps every time for every position in the array till the array value.
		   for (int index = start+1; index <= end && index <= start + arr[start]; index++)
		   {
			   // for the jump made iterating till the value present in the jumped array index.
		       int jumps = getMinimumNumberOfJumpsUsingRecursion(arr, index, end);
		       
		       // if the jump is less than the min jumps till now then 
		       if(jumps != Integer.MAX_VALUE && jumps + 1 < min)
		    	   
		    	   // then save the current jumps as minimum jumps.
		           min = jumps + 1;
		   }
		 
		   return min;
		
	}

}
