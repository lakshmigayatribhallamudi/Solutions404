package com.mani.gayi.array;

public class MaximumNoZeroFlipingSubArray {

	public int getMaximumNoZeroFlippingSubArray(int[] array)
	{
		// getting the size of the array...
		int size = array.length;
		
		int orginalzerocounter = 0;
		
		int startindex=0,endindex =0;
		
		// iterating through the n elements...
		for(int index =0;index<size;index++)
		{
			if(array[index]==0)
			{
				orginalzerocounter++;
			}
			else
			{
				
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		
		
	}
	
}
