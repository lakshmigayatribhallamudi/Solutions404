package com.mani.gayi.search;

import com.mani.gayi.sort.InsertionSort;
import com.mani.gayi.utils.ArrayUtils;

public class BinarySearch {
	
	/**
	 * This is a binary search function which searches for the given element.
	 * if the element is found it will return its index.
	 * if the element is not found it will return a index where the element can be placed.
	 * 
	 * */
	
	
	public static int binarySearch(int[] data, int low, int high, int key) {

		// if low and high are intersecting then we should check the
		// intersection index position in the array with the matching key.

		// if the key is not matching with the array index data then we are
		// returning the position where the element can be placed if it not
		// present in the list.
		if (low == high && data[low] != key) {
			return -low;
		}

		// if the key is present and element is matching then we found the
		// position where the element is present.
		if (low == high && data[low] == key) {
			return low;
		}
		// calculating the mid index.
		int mid = low + (high - low) / 2;

		// if the element at the mid index of the array then we will return the
		// position.
		if (data[mid] == key) {
			return mid;
		}

		// if the data which we are searching is present on the left side repeat
		// the process on left side.
		if (data[mid] > key) {
			return binarySearch(data, low, mid, key);
		}
		// if the data which we are searching is present on the left side repeat
		// the process on right side.
		else if (data[mid] < key) {
			return binarySearch(data, mid + 1, high, key);
		}

		return 0;
	}

	public static void main(String[] args) {
		// test case to test the functionality...
		int arr[] = ArrayUtils.getDataof5();
		arr = InsertionSort.sortInInsertionOrder(arr);
		int resulttestcase1 = binarySearch(arr, 0, 4, 20);
		System.out.println(resulttestcase1);
		ArrayUtils.printIntegerArray(arr);
	}

}
