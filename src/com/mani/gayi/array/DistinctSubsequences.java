package com.mani.gayi.array;

import java.util.HashMap;
import java.util.Scanner;
 
/*
 * Problem 	:	Count Distinct Subsequences
 * Solution : 	If there are not repetition of characters in the given word then no calculate the 2*[previous possible repetitions]-repetitions.
 * 				If characters are repeated,
 * 				Then find the index from where they are repeated. 
 * 				and remove the repetitions at that index from the total repetitions till this index.
 * Source 	: 	http://www.geeksforgeeks.org/count-distinct-subsequences/
 * **/


 public class DistinctSubsequences {
 
	 
	/**
	 * Count Distinct Subsequences
	 * Return interger.
	 * takes a string argument.
	 * */
	private static int findDistinctSubsequences(String str) {
	
		// variable to return the result.
		int result =1;

		// creates a hash map to store the result.
		HashMap<Integer , Integer> prevLoc = new HashMap<Integer , Integer>();
		for ( int i = 0 ; i < 26 ; i++)	{
			// initialize the map with negative numbers.
			prevLoc.put(i, -1);
		}
		
		// array variable which stores the count of the possible distinct subsequences.
		int count[] = new int[str.length() + 1];
		
		// Initialize the starting variable with one value.
		count[0] = 1;
		
		// iterate till the n elements.
		for ( int i = 0 ; i < str.length() ; i++)	{
			
			// variable which stores tells whether the variable is repeated or not. 
			int repetition = 0;
			
			// finding the character at the given array.
			char presentChar = str.charAt(i);
			
			// if the given character is found in the hashmap and associated value is -1 then it is not repeated.
			if (  prevLoc.get(presentChar - 97) == -1)	{
				repetition = 0;
			}
			//  if the given character is already repeated.
			else	{
				// if the given character occurred previously, then finding its location.
				int lastLoc = prevLoc.get(presentChar - 97);
				
				// getting the count of possible number of subsequences till that particular location.
				repetition =  count[lastLoc];
			}
			
			// inserting location index with respect to the character.
			prevLoc.put( presentChar - 97 , i);
			
			// counting the characters till the page.
			count[i+1] = 2*count[i] - repetition;
		}
		
		// return the count array last element.
		result = count[str.length()];
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = findDistinctSubsequences("bujj");
		System.out.println("Result is "+result);
	}
 
}