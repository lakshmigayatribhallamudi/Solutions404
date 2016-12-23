package com.mani.gayi.I;

public class StairCase {

	public static void main(String[] args) {

		System.out.println("Number of ways to climb a statir Using Reccursion: " + noOfWaysToClimbStairsUsingDP(6));
		System.out.println("Number of ways to climb a statir Using DP: " + noOfWaysToClimbStairsUsingDP(6));
	}

	/*
	 * This is reccursive approach which consumes a exponential complexity.
	 */
	public static int noOfWaysToClimbStairsInRecurssion(int numberOfStairs) {
		if (numberOfStairs == 1)
			return 1;
		else if (numberOfStairs == 2)
			return 2;
		return noOfWaysToClimbStairsInRecurssion(numberOfStairs - 1)
				+ noOfWaysToClimbStairsInRecurssion(numberOfStairs - 2);
	}

	public static int noOfWaysToClimbStairsUsingDP(int numberOfStrairs) {
		
		if(numberOfStrairs<=2)
		{
			return numberOfStrairs;
		}
		int solutionArray[] = new int[3];
		solutionArray[0] = 1;
		solutionArray[1] = 2;
		int result =0;
		for(int index=2;index<numberOfStrairs;index++)
		{
			result = solutionArray[0]+solutionArray[1];
			solutionArray[0]=solutionArray[1];
			solutionArray[1]=result;
		}
		
		return result;
	}

}
