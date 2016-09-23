package com.mani.gayi.string;

public class StringPermutation {

	/**
	 * Permute function takes 3 arguments as input and returns nothing. This
	 * function prints every possible permutation by using huge recursion. ;'
	 */

	public static void permute(char[] str, int start, int end) {
		if (start == end) {
			System.out.println(str);
		}

		for (int i = start; i <= end; i++) {
			swap(str, start, i);
			permute(str, start + 1, end);
			swap(str, start, i);
		}
	}

	public static void swap(char[] str, int i, int j) {
		char tmp = str[i];
		str[i] = str[j];
		str[j] = tmp;
	}

	// This is driver method which test the program.
	public static void main(String[] args) {
		// creating the input string.
		String str = "BOY";
		// finding the length of the input string.
		int n = str.length();
		// calling the funciton by passing the 3 arguments i.e. String ,zero and
		// string length -1.
		permute(str.toCharArray(), 0, n - 1);
	}

}
