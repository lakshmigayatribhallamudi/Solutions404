package com.mani.gayi.array;

import java.util.HashMap;
import java.util.Scanner;
 
/*
 * Problem 	:	Count Distinct Subsequences
 * Type		: 	Dynamic Programming.
 * Solution : 	
 * 
 * We use the Count array here to store the number of count of distinct sequences.
 * count array index denotes the string length.
 * 
 * The problem of counting distinct subsequences is easy if all characters of input string are distinct. The count is equal to nC0 + nC1 + nC2 + … nCn = 2^n.
 * 
 * We use HashMap to know that our string contains duplicate characters.
 * 
 * 
 * If there is no repetition of characters we simply calculate the 2*[previous possible repetitions]-repetitions where repetitions = 0.
 * If characters are repeated,i.e. the Hash map will not be -1 so in that case we load the repetitions variable from the count array...
 * Source 	: 	http://www.geeksforgeeks.org/count-distinct-subsequences/
 * **/


 public class DistinctSubsequences {
 
	 
	/**
	 * Count Distinct Subsequences
	 * Return integer.
	 * takes a string argument.
	 * */
	private static int findDistinctSubsequences(String str) {
	
		// variable to return the result.
		int result =1;

		// creates a hash map to store the result.
		HashMap<Character , Integer> prevLoc = new HashMap<Character , Integer>();
		for ( int i = 97 ; i < 123 ; i++)	{
			// initialize the map with negative numbers.
			prevLoc.put((char) i, -1);
		}
		
		// array variable which stores the count of the possible distinct subsequences.
		int count[] = new int[str.length() + 1];
		
		// Initialize the starting variable with one value.
		count[0] = 1;
		
		// iterate till the n elements.
		for ( int index = 0 ; index < str.length() ; index++)	{
			
			// variable which stores tells whether the variable is repeated or not. 
			int repetition = 0;
			
			// finding the character at the given array.
			char presentChar = str.charAt(index);
			
			// if the given character is found in the hashmap and associated value is -1 then it is not repeated.
			if (  prevLoc.get(presentChar) == -1)	{
				repetition = 0;
			}
			//  if the given character is already repeated.
			else	{
				// if the given character occurred previously, then finding its location.
				int lastLoc = prevLoc.get(presentChar);
				
				// getting the count of possible number of subsequences till that particular location.
				repetition =  count[lastLoc];
				System.out.println("Repetition : "+repetition+"location index "+lastLoc+" count[lastloc] : "+count[lastLoc]);
			}
			
			// inserting location index with respect to the character.
			prevLoc.put( presentChar , index);
			// counting the characters till the page.
			count[index+1] = 2*count[index] - repetition;
		}
		
		// return the count array last element.
		result = count[str.length()];
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = findDistinctSubsequences("aba");
		System.out.println("Result is "+result);
	}
 
}