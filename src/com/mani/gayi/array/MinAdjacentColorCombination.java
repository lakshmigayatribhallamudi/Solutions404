package com.mani.gayi.array;

/**
 * Minimum elements after considering all possible transformations.
 * 
 * Problem:Given an array of three colors. The array elements have a special
 * property. Whenever two elements of different colors become adjacent to each
 * other, they merge into an element of the third color. How many minimum number
 * of elements can be there in array after considering all possible
 * transformations.
 * 
 * Example: 
 * ------- 
 * 1. R R R, 																				Output 3. 
 * 2. R R G B -> R [R G] B -> [R B] B -> [G B] -> R, 										Output 1. 
 * 3. R G R G -> [R G] R G -> [B R] G ->G G, 												Output 2. 
 * 4. R G B B G R ->R [G B] B G R ->R [R B] G R ->[R G] G R -> [B G] R ->R R, 				Output 2. 
 * 5. R R B B G ->R [R B] [B G] -> R [G R] -> [R B] -> G, 									Output 1.
 * 
 * 
 * Possible Patterns 
 * ----------------- 
 * Let n be number of elements in array. 
 * No matter what the input is, we always end up in three types of outputs: 
 * n: When no transformation can take place at all. 
 * 2: When number of elements of each color are all odd or all even. 
 * 1: When number of elements of each color are mix of odd and even
 * 
 * Source : http://www.geeksforgeeks.org/
 */

public class MinAdjacentColorCombination {

	// Returns minium possible elements after considering
	// all possible transformations.
	int findMin(char arr[], int n) {
		// Initialize counts of all colors as 0
		int b_count = 0, g_count = 0, r_count = 0;

		// Count number of elements of different colors
		for (int i = 0; i < n; i++) {
			if (arr[i] == 'B')
				b_count++;
			if (arr[i] == 'G')
				g_count++;
			if (arr[i] == 'R')
				r_count++;
		}

		// Check if elements are of same color
		if (b_count == n || g_count == n || r_count == n)
			return n;

		// If all are odd or even, return 2
		if ((r_count%2!=0 && g_count!=0 && b_count!=0)||(r_count%2==0 && g_count==0 && b_count==0))
			return 2;

		// If none above the cases are true, return 1
		return 1;
	}
	
	public static void main(String[] args) {
		
		char data[] ={'R','G','B'};
		int result = new MinAdjacentColorCombination().findMin(data,3);
		System.out.println("Result is "+result);
	}

}
