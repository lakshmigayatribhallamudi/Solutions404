package com.mani.gayi.hackerrank;

/*
 * Given an array with  elements, can you sort this array in ascending order using only one of the following operation
 * Swap two elements.
 * Reverse one sub-segment.
 * 
 * Source:https://www.hackerrank.com/challenges/almost-sorted
 * */


public class PariallySortedArray {
	
	
	public static void main(String[] args) {
		
		int data[] ={1,3,2,4,6};
		sortCompletely(data);
	}
	
	public static void sortCompletely(int[] data)
	{
		boolean first = false;
		int point1 = -1;
		int point2 = -1;
		int lastpointer = data.length-1;
		
		// Once the for loop completes the the 2 points needs to be getting populated...
		
		// iterates till the length of the array.
		for(int index=0;index<data.length;index++)
		{
			// first we are comming from left to right...
			if(!first)
			{
				// we need to find the bigger element on left side which contains smaller element on right side.
				if(data[index]>data[index+1])
				{
					point1 = index;
					first = true;
				}
			}
			else
			{
				// we need to find the smaller element on right side which contains bigger element on right side.
				if(data[lastpointer]<data[lastpointer-1])
				{
					point2 = lastpointer;
				}
				lastpointer--;
			}
			
		}
		
		System.out.println("Point 1 :"+point1);
		System.out.println("Point 2 :"+point2);
		
		
	}

}
