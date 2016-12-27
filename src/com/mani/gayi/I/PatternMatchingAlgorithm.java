package com.mani.gayi.I;

public class PatternMatchingAlgorithm {
	
	public static void main(String[] args) {
		
		int found = stringPresent("i am seeingamovie","am");
		System.out.println("Found at index....."+found);
		
	}
	
	/**
	 * Methods provides the O(n*m) time complexity
	 * */

	private static int stringPresent(String inputString,String keyword) {
		
		int result =0;
		char[] text=inputString.toCharArray();
		char[] key = keyword.toCharArray();
		
		for(int index=0;index<text.length-key.length;index++)
		{
			result=0;
			for(int keyindex=index,kindex=0;kindex<key.length;keyindex++,kindex++)
			{
				if(text[keyindex]!=key[kindex])
				{
					break;
				}
				else
				{
					result++;
				}
			}
			if(result==key.length)
			{
				return index;
			}
		}
		
		return 0;
	}
	

}
