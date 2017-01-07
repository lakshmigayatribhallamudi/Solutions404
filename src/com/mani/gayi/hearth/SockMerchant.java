package com.mani.gayi.hearth;
/*
 * John's clothing store has a pile of  loose socks where each sock  is labeled with an integer, , denoting its color. 
 * He wants to sell as many socks as possible, but his customers will only buy them in matching pairs. Two socks,  and , are a single matching pair if .
 * Given  and the color of each sock, how many pairs of socks can John sell?

Input Format

The first line contains an integer, , denoting the number of socks. 
The second line contains  space-separated integers describing the respective values of .

Constraints

Output Format

Print the total number of matching pairs of socks that John can sell.

Sample Input

9
10 20 20 10 10 30 50 10 20
 * 
 * **/

import java.util.*;

public class SockMerchant {

	public static void main(String[] args) {

		int c[] = { 11, 10 };
		System.out.println(getNoOfPairs(c));
	}

	public static int getNoOfPairs(int[] socks) {
		int result = 0;
		Map<Integer, Integer> sockspairs = new HashMap<>();
		if (socks.length < 1)
			return 0;
		if ((socks.length == 2) && (socks[0] == socks[1])) {
			return 1;
		}
		for (int index = 0; index < socks.length; index++) {
			if (sockspairs.containsKey(socks[index])) {
				int value = sockspairs.get(socks[index]);
				sockspairs.put(socks[index], value + 1);
			} else {
				sockspairs.put(socks[index], 1);
			}
		}

		// once sock pairs are populated in the HashMap.
		for (Integer key : sockspairs.keySet()) {
			// for sock with particular color retrieve the number of socks..
			int numberofpairs = sockspairs.get(key);
			numberofpairs = numberofpairs / 2;
			result = result + numberofpairs;
		}
		return result;

	}
}
