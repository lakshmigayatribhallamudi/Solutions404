package com.mani.gayi.array;

public class LargestSumSubArray {
	
	
	public int largestSumSubArray(int[] array)
	{
		int size = array.length;
		
		int startindex=0,endindex=0,currentstartindex=0;
		
		int maxsum =0;
		int currentsum =0;
		
		for(int index = 0;index<size;index++ )
		{
			currentsum = currentsum + array[index];
			
			if(currentsum > maxsum)
			{
				maxsum = currentsum;
				endindex = index;
				startindex = currentstartindex;
			}
			if(currentsum < 0)
			{
				currentstartindex = index;
				currentsum =0;
			}
				
		}
		
		return maxsum;
		
	}
	
	
	public static void main(String[] args) {
		
		int array[] = {1,2,-3,3,4};
		
		int value = new LargestSumSubArray().largestSumSubArray(array);
		
		System.out.println("Value is "+value);
	}

}
