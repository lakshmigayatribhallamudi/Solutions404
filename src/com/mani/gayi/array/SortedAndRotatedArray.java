package com.mani.gayi.array;

/* Author : Manidhar
 * Problem:
	Search an element in a sorted and rotated array
	An element in a sorted array can be found in O(log n) time via binary search. 
	But suppose we rotate an ascending order sorted array at some pivot unknown to you beforehand. 
	So for instance, 1 2 3 4 5 might become 3 4 5 1 2. 
	Devise a way to find an element in the rotated array in O(log n) time.*/

/* Problem : Search an element in a sorted and rotated array
 * Solution : 
 * Input arr[] = {3, 4, 5, 1, 2}
  Element to Search = 1
  1) Find out pivot point and divide the array in two
      sub-arrays. (pivot = 2) Index of 5
  2) Now call binary search for one of the two sub-arrays.
      (a) If element is greater than 0th element then
             search in left array
      (b) Else Search in right array
          (1 will go in else as 1 < 0th element(3))
  3) If element is found in selected sub-array then return index
     Else return -1.
 */

public class SortedAndRotatedArray {

	// Finding the pivot element in the array...
	public int findPivot(int array[], int low, int high) {
		// given array is lower index is bigger than higher index return -1
		if (low > high)
			return -1;
		// if the lower index is higher index there are no elements left.
		if (low == high)
			return low;
		// find the mid index from the lower and higher index.
		int mid = (low + high) / 2;

		// if mid is less than high index then we can compare element at mid
		// index to the element next to mid index.
		// if the element next to mid index is smaller then return the mid
		// index.
		if (mid < high && array[mid] > array[mid + 1])
			return mid;

		// if mid is greater than low index then we compare element at mid index
		// to the element before the mid index.
		if (low < mid && array[mid] < array[mid - 1])
			return mid - 1;

		// if the element at mid index is smaller than the element at lower
		// index.
		if (array[mid] < array[low]) {
			return findPivot(array, low, mid - 1);
		}

		return findPivot(array, mid + 1, high);

	}

	// Performing a binary search for the given element...
	public boolean isElementPresent(int array[], int low, int high, int keyelement) {
		// if the low is greater than the higher element then return -1
		if (low > high)
			return false;

		// if the lower index and upper index are equal then check whether the
		// key is present at that index.
		// if it is element is present at the index return true
		if (low == high) {
			if (array[low] == keyelement)
				return true;
		}

		// creating a new index mid which is the average of lower and higher
		// index.
		int mid = (low + high)/2;

		// if the element at mid is equal to key element then return true...
		if (array[mid] == keyelement)
			return true;

		// considering the mid index...
		// if the key element is greater than element at mid index.
		if (array[mid] < keyelement) {
			return isElementPresent(array, mid + 1, high, keyelement);
		}
		
		// // if the key element is lesser than element at mid index.
		return isElementPresent(array, low, mid - 1, keyelement);
	}

	// search is based on finding pivot element
	public boolean pivotSearch(int[] array, int keyelement) {
		// first we have to find the index from which it is not sorted.
		int pivotindex = new SortedAndRotatedArray().findPivot(array, 0, array.length);

		// if pivot = -1 there is complete array is in sorted order.
		// so just perform binary search...
		if (pivotindex == -1)
			return isElementPresent(array, 0, array.length, keyelement);

		if (array[pivotindex] == keyelement)
			return true;

		// after finding the pivot index...
		// pivot index seperates 2 sorted arrays...
		// so we will perform a search based on the 2 sorted arrays...
		if (array[0] <= keyelement) {
			return isElementPresent(array, 0, pivotindex - 1, keyelement);
		}
		// if the key element is lesser than the pivot index element then search
		// on right side
		else {
			return isElementPresent(array, pivotindex+1, array.length, keyelement);
		}

	}

	public static void main(String[] args) {

		// creates a array of 8 elements.
		int array[] = { 8, 9, 10, 11, 12, 1, 2, 3, 4, 5, 6 };

		boolean result = new SortedAndRotatedArray().pivotSearch(array, 4);

		System.out.println("result is " + result);
	}

}
