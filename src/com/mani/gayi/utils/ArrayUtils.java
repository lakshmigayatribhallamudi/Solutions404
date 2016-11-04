package com.mani.gayi.utils;

public class ArrayUtils {

	public void printBooleanArray(boolean[][] result) {

		for (int rowindex = 0; rowindex < result.length; rowindex++) {
			for (int colindex = 0; colindex < result[rowindex].length; colindex++) {
				System.out.print(" " + result[rowindex][colindex] + " ");
			}
			System.out.println();
		}

	}
	
	public static void printIntegerArray(int[] array)
	{
		for(int index=0;index<array.length;index++)
		{
			System.out.print(array[index]+" : ");
		}
	}

}
