package com.mani.gayi.I;


public class LongestPrefixSuffixArray {
	
	
	public static int[] computeLPS(String pattern)
	{
		
		// used for moving through the pattern.
		int patternindex =1;
		
		// contains the length of the longest prefix suffix pattern.
		int lpsindex =0;

		int patternlength = pattern.length();
		
		int [] lps = new int[patternlength];
		
		// lps for a string with length zero is 0.
		lps[0] = 0;
		
		for(patternindex = 1;patternindex<patternlength;)
		{
			
			if(pattern.charAt(patternindex)==pattern.charAt(lpsindex))
			{
				lpsindex++;
				lps[patternindex]=lpsindex;
				patternindex++;
			}
			else
			{
				if(lpsindex==0)
				{
					// AACAAA (for this kind of cases.)
					lps[patternindex]=0;
					patternindex++;
				}
				else
				{
					lpsindex--;
				}
			}
			
		}
		
		return lps;
	}
	
	public static void main(String[] args) {
		
		
		int[] result = computeLPS("AAAAA");
		System.out.print("[");
		for(int value : result){
			
			System.out.print(""+value+",");
		
		}
		System.out.print("]");
		
		System.out.println("Result is "+result[result.length-1]);
	}

}
