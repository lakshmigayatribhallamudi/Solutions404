package com.mani.gayi.findandunion;

import com.mani.gayi.utils.ArrayUtils;

public class AdvancedFindAndUnion {

	public static void main(String[] args) {

		int arr[] = initializeArray();
		System.out.print("Old Array : ");
		ArrayUtils.printIntegerArray(arr);
		advancedUnionV1(arr, 1, 0);
		System.out.println();
		System.out.print("New Array :union(arr,1,0) ");
		ArrayUtils.printIntegerArray(arr);
		
		advancedUnionV1(arr, 0, 2);
		System.out.println();
		System.out.print("New Array :union(arr,0,2) ");
		ArrayUtils.printIntegerArray(arr);

		advancedUnionV1(arr, 3, 4);
		System.out.println();
		System.out.print("New Array :union(arr,3,4) ");
		ArrayUtils.printIntegerArray(arr);
		
		advancedUnionV1(arr, 1, 4);
		System.out.println();
		System.out.print("New Array :union(arr,1,4) ");
		ArrayUtils.printIntegerArray(arr);
		
		System.out.println();
		System.out.println(" 2 and 5 are Connected ? :" + isConnected(arr, 2, 5));

		System.out.println();
		System.out.println(" 1 and 5 are Connected ? :" + isConnected(arr, 1, 5));

		System.out.println();
		System.out.println(" 8 and 5 are Connected ? :" + isConnected(arr, 8, 5));
	}

	private static boolean isConnected(int[] arr, int Aelement, int Belement) {
		if(root(arr,Aelement)==root(arr,Belement))
		return true;
		else
		return false;
	}

	
	// we are joining the Belement to Aelement.
	private static void advancedUnionV1(int[] arr, int Aelement, int Belement) {
		
		int arootelement = root(arr,Aelement);
		int brootelement = root(arr,Belement);
		
		arr[arootelement]=brootelement;
		
	}

	public static int[] initializeArray() {
		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
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
