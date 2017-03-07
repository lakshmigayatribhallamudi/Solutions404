package com.mani.gayi.array;


/*
 * Problem			:		Largest Sum Contiguous Sub array
 * Algorithm 		:		Kadane’s Algorithm
 * 
 * About Kadane's Algorithm:
 * ============================================
 * 	Initialize:
 * 	max_so_far = 0
 * 	max_ending_here = 0
 * 	
 * 	Loop for each element of the array
 * (a) max_ending_here = max_ending_here + a[i]
 * (b) if(max_ending_here < 0)
 * 		max_ending_here = 0
 * (c) if(max_so_far < max_ending_here)
 * 		max_so_far = max_ending_here
 * return max_so_far
 * ============================================
 * Source			:		http://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 * **/
public class LargestSumSubArray {
	
	/*
	 * This function takes array as input and returns and integer.
	 * */
	public int largestSumSubArray(int[] array)
	{
		// variable to store the array length.
		int size = array.length;
		
		// variable that stores the max sum in the array.
		int maxsum =0;
		
		// variable that stores max sum till the index.
		int currentsum =0;
		
		// variable which tracks the sub array whose sum is maximum...
		int beginindex = 0,endindex=0;
		
		// a Loop to iterate all the elements in an array.
		for(int index = 0;index<size;index++ )
		{
			// we add the elements to the current sum variable.
			currentsum = currentsum + array[index];
			
			// if the current sum is greater than the max sum.
			if(currentsum > maxsum)
			{
				// update the end index as sum till here is maximum.
				endindex = index;
				
				// then save the current sum in to max sum.
				maxsum = currentsum;
			}
			// if the current sum is less than the zero.
			if(currentsum <= 0)
			{
				beginindex = index+1;
				// then reset to zero.
				currentsum =0;
			}
				
		}
		
		System.out.println("Largest Sub Array ranges from index index starting point : "+beginindex+" ending index:"+endindex);
		
		// finally we return the max sum.
		return maxsum;
		
	}
	
	
	public static void main(String[] args) {
		
		int array[] = {1,2,-3,3,4};
		
		int value = new LargestSumSubArray().largestSumSubArray(array);
		
		System.out.println("Value is "+value);
	}

}
