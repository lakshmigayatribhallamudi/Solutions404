package com.mani.gayi.array;


/**
 * @Author : SkyWalker
 * Problem:
 * -------
 * minimum sum such that one of every three consecutive elements is taken
 * Given an array of n non-negative numbers, 
 * the task is to find the minimum sum of elements (picked from the array) 
 * such that at least one element is picked out of every 3 consecutive elements in the array.
 * 
 * Solution:
 * --------
 * Let sum(i) be the minimum possible sum when arr[i] is part of a solution 
 * sum (not necessarily result) and is last picked element. 
 * Then our result is minimum of sum(n-1), sum(n-2) and sum(n-3) 
 * [We must pick at least one of the last three elements].
 * We can recursively compute sum(i) as sum of arr[i] and minimum(sum(i-1), sum(i-2), sum(i-3)).
 * Since there are overlapping subproblems in recursive structure of problem,
 * we can use Dynamic Programming to solve this problem.
 * 
 * Time Complexity : O(n)
 * Auxiliary Space : O(n)
 */

public class MinimumSum3ConsecutiveElements {

	
	
	
	/**
	 * Utility to find the minimum of three elements.
	 * */
	public static int minimum(int a, int b, int c)
	{
	    return Math.min(Math.min(a, b), c);
	}
	 

	/**
	 * Returns minimum possible sum of elements such
	 * that an element out of every three consecutive
	 * elements is picked.
	 * */
	public static int findMinSum(int arr[], int n)
	{
		/**
		 * Create a DP table to store results of
		 * subproblems. sum[i] is going to store
		 * minimum possible sum when arr[i] is
		 * part of the solution.
		 * */
		int sum[] = new int[n];
	 
		
		if(n>=3)
		{
		    /**
		     * When there are 3 or more elements in the array.
		     * Initialize the first 3 elements in the arr to the sum array.
			 **/
		    sum[0] = arr[0];
		    sum[1] = arr[1];
		    sum[2] = arr[2];
		}
		
	    // Iterate through all other elements
	    for (int i=3; i<n; i++)
	    {
	    	// find the minimum element for next elements by adding the current number.
	      sum[i] = arr[i] +
	              minimum(sum[i-3], sum[i-2], sum[i-1]);
	    }
	    return minimum(sum[n-1], sum[n-2], sum[n-3]);
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 20, 2, 10, 1};
		
		int result = findMinSum(arr, arr.length);
		
		System.out.println("Result is "+result);
		
	}
}
