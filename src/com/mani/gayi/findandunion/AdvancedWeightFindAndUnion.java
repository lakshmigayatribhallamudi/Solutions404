package com.mani.gayi.findandunion;

import com.mani.gayi.utils.ArrayUtils;

public class AdvancedWeightFindAndUnion {

	public static void main(String[] args) {

		int arr[] = initializeArray();
		int size[] = initializeSizeWithOne(arr.length);
		
		System.out.print("Old Array : ");
		ArrayUtils.printIntegerArray(arr);
		advancedUnionV2(arr, 0, 1,size);
		System.out.println();
		System.out.print("New Array :union(arr,0,1) ");
		ArrayUtils.printIntegerArray(arr);
		
//		advancedUnionV2(arr, 0, 2,size);
//		System.out.println();
//		System.out.print("New Array :union(arr,0,2) ");
//		ArrayUtils.printIntegerArray(arr);
//
//		advancedUnionV2(arr, 3, 4,size);
//		System.out.println();
//		System.out.print("New Array :union(arr,3,4) ");
//		ArrayUtils.printIntegerArray(arr);
//		
//		advancedUnionV2(arr, 1, 4,size);
//		System.out.println();
//		System.out.print("New Array :union(arr,1,4) ");
//		ArrayUtils.printIntegerArray(arr);
//		
		System.out.println();
		System.out.println(" 2 and 5 are Connected ? :" + isConnected(arr, 2, 5));

		System.out.println();
		System.out.println(" 1 and 5 are Connected ? :" + isConnected(arr, 1, 5));

		System.out.println();
		System.out.println(" 8 and 5 are Connected ? :" + isConnected(arr, 3,4));
	}

	private static boolean isConnected(int[] arr, int Aelement, int Belement) {
		if(root(arr,Aelement)==root(arr,Belement))
		return true;
		else
		return false;
	}

	
	// we are joining the elements based on the weight.
	private static void advancedUnionV2(int[] arr, int Aelement, int Belement,int[] size) {
		
		int arootelement = root(arr,Aelement);
		int brootelement = root(arr,Belement);
		if(size[arootelement]>=size[brootelement])
		{
			arr[brootelement]=arootelement;
			size[arootelement]=size[brootelement]+1;
		}
		else
		{
			arr[arootelement]=brootelement;
			size[brootelement]=size[arootelement]+1;
		}
		
	}

	public static int[] initializeArray() {
		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		return arr;
	}
	
	public static int[] initializeSizeWithOne(int len) {
		
		int[] arr = new int[len];
		for(int index=0;index<arr.length;index++)
		{
			arr[index]=1;
		}
		
		return arr;
	}
	
	public static int root(int[] arr,int data)
	{
		if(arr[data]==data)
			return data;
		else
			return root(arr,arr[data]);
	}
	
	
	

}
