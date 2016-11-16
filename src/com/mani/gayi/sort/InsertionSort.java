package com.mani.gayi.sort;

import com.mani.gayi.utils.ArrayUtils;

/*
 * Insertion sort program...
 * */
public class InsertionSort {

	public static void main(String[] args) {

		int array[] = ArrayUtils.getHugeData();
		ArrayUtils.printIntegerArray(array);
		System.out.println();
		sortInInsertionOrder(array);
		ArrayUtils.printIntegerArray(array);
	}

	/*
	 * Here in the insertion sort it does pair wise swapping...  
	 * */
	public static int[] sortInInsertionOrder(int[] arr) {

		for (int index = 1; index < arr.length; index++) {
			int previousIndex = index - 1;
			while (previousIndex > -1 && arr[previousIndex] > arr[previousIndex + 1]) {
				int temp = arr[previousIndex];
				arr[previousIndex] = arr[previousIndex + 1];
				arr[previousIndex + 1] = temp;
				previousIndex--;
			}

		}
		
		return arr;
	}

}
