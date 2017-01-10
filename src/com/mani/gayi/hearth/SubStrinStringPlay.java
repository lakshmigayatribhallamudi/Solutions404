package com.mani.gayi.hearth;

/*
 * Given a first line of input which contains 2 numbers which are seperated by 2 spaces
 * eg: N  Q
 * N is the length of the string.
 * Q is the number of Queries.
 * second line contains a string which should be of N length.
 * 
 * third,fourth these lines depend on the the Q.
 * If the Q is specified with 3 number then there will be 3rd,4th,5th lines will be present
 * 
 * Each line after the second line will be containing 2 numbers as input which are separated by 2 spaces.
 * 
 * these input of 2 number will select the 2 numbers which forms the substring.
 * 
 * then we will calculate the substring to remove the n characters to form a string where the all 
 * characters should be equal times repeated with should be equal to min occuring character in the word.
 * 
 * */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.mani.gayi.utils.ArrayUtils;

public class SubStrinStringPlay {

	public static void main(String[] args) {

		int stringlength = 0;
		int numberOfQueries = 0;

		Scanner intialScanner = new Scanner(System.in);
		String firstInput = intialScanner.nextLine();
		String[] data = firstInput.split("\\s+");
		stringlength = Integer.parseInt(data[0]);
		numberOfQueries = Integer.parseInt(data[1]);

		Scanner stringScanner = new Scanner(System.in);
		String inputstring = stringScanner.nextLine();

		int[][] queries = new int[numberOfQueries][2];
		for (int index = 0; numberOfQueries > index; index++) {
			Scanner queryScanner = new Scanner(System.in);
			String queryInput = queryScanner.nextLine();
			String[] querydata = queryInput.split("\\s+");
			queries[index][0] = Integer.parseInt(querydata[0]);
			queries[index][1] = Integer.parseInt(querydata[1]);
		}

		calculateAndPrint(inputstring, queries);
	}

	private static void calculateAndPrint(String inputstring, int[][] queries) {

		for (int iterator = 0; queries.length > iterator; iterator++) {
			int ldata = queries[iterator][0];
			int rdata = queries[iterator][1];

			int result = processString(inputstring.substring(ldata - 1, rdata));
			System.out.println(result);
		}

	}

	private static int processString(String substring) {
		char[] arraydata = substring.toCharArray();
		Arrays.sort(arraydata);
		Map<Character, Integer> map = new HashMap<>();
		for (int index = 0; index < arraydata.length; index++) {
			if (map.containsKey(arraydata[index])) {
				int value = map.get(arraydata[index]);
				map.put(arraydata[index], value + 1);
			} else {
				map.put(arraydata[index], 1);
			}
		}

		int lessvalue = Integer.MAX_VALUE;
		for (int data : map.values()) {
			if (lessvalue > data)
				lessvalue = data;
		}

		int result = 0;
		for (int data : map.values()) {
			if (data == lessvalue)
				continue;
			if (data > lessvalue) {
				result = result + data - lessvalue;
			}
		}
		return result;

	}

}
