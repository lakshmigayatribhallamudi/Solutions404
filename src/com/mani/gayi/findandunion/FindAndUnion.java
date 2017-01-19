package com.mani.gayi.findandunion;

import com.mani.gayi.utils.ArrayUtils;

public class FindAndUnion {

	
	public static void main(String[] args) {
		
		int arr[] = initializeArray();
		System.out.print("Old Array : ");
		ArrayUtils.printIntegerArray(arr);
		union(arr,4,5);
		System.out.println();
		System.out.print("New Array :union(arr,4,5) ");
		ArrayUtils.printIntegerArray(arr);
		union(arr,2,5);
		System.out.println();
		System.out.print("New Array :union(arr,2,5) ");
		ArrayUtils.printIntegerArray(arr);
		
		System.out.println();
		System.out.println(" 2 and 5 are Connected ? :"+isConnected(arr, 2, 5));
		
		System.out.println();
		System.out.println(" 1 and 5 are Connected ? :"+isConnected(arr, 1, 5));
		
		System.out.println();
		System.out.println(" 8 and 5 are Connected ? :"+isConnected(arr, 8, 5));
	}
	
	public static int[] initializeArray()
	{
		int arr[] = {0,1,2,3,4,5,6,7,8,9};
		return arr;
	}
	
	public static void union(int arr[],int Aelement,int Belement)
	{
		int tempdata = arr[Aelement];
		
		for(int index=0;index<arr.length;index++)
		{
			if(arr[index]==tempdata)
			{
				arr[index]=arr[Belement];
			}
		}
	}
	
	public static boolean isConnected(int arr[],int Aelement,int Belement)
	{
		
		if(arr[Aelement]==arr[Belement])
			return true;
		return false;
	}
	
	
	
}
