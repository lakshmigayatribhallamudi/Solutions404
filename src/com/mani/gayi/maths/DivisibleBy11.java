package com.mani.gayi.maths;

/**
 * Check if a large number is divisible by 11 or not
 * Given a number, the task is that we divide number by 11. 
 * The input number may be large and it may not be possible to store even if we use long long int.
 * 
 * Solution:
 * Since input number may be very large, we cannot use n % 11 to check if a number is divisible by 11 or not, 
 * especially in languages like C/C++. The idea is based on following fact.
 * A number is divisible by 11 if difference of following two is divisible by 11.
 * 
 * why - '0'  for integers which are looking present in intefers?
 * 
 * Next we discuss how digit symbols can be converted to their numeric equivalents and vice versa. 
 * As we have stated, the character '0' is not the integer, 0, '1' is not 1, etc. 
 * So it becomes necessary to convert digit characters to their numeric equivalent values, and vice versa. 
 * As we have seen, the digit values are contiguous and increasing; the value of '0' is 48, '1' is 49, and so forth. 
 * If we subtract the base value of '0', i.e. 48, from the digit character, 
 * we can convert the digit character to its numeric equivalent; e.g. '0' - '0' is 0; '1' - '0' is 1; and so forth. 
 * Thus, if ch is a digit character, then its numeric equivalent is ch - '0'. 
 * Conversely, suppose n is a positive integer less than 10, (0, 1, 2, ..., 9). Then the corresponding digit character is n + '0'.
 * 
 * source:http://www.geeksforgeeks.org/check-large-number-divisible-11-not/
 * */

public class DivisibleBy11 {
	
	public static void main(String[] args) {
		
		long data = 201020127;
		
		boolean result = isDivisibleBy11(data);
		
		System.out.println("Data divisible by 11 : "+data%11);
		
		System.out.println("Given data : "+data+" is divisible : "+result);
	}

	private static boolean isDivisibleBy11(long data) {

		char[] dataStr = String.valueOf(data).toCharArray();
		
		int evensum = 0;
		
		int oddsum = 0;
		
		for(int index = 0 ;index<dataStr.length;index++)
		{
			if(index%2==0)
			{
				evensum = evensum + dataStr[index]-'0';
			}
			else
			{
				oddsum = oddsum+dataStr[index]-'0';
			}
		}
		
		if((evensum-oddsum)%11==0)
			return true;
		
		return false;
	}

}
