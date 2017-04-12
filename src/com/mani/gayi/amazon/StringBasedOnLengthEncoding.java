package com.mani.gayi.amazon;

public class StringBasedOnLengthEncoding {
	
	public static void main(String[] args) {
		
		String input = "AAABBCCCCDD";
		
		String result = encodeStringBasedOnLength(input);
		System.out.println("Result :: "+result);
	}

	private static String encodeStringBasedOnLength(String input) {
		
		StringBuffer result = new StringBuffer();
		
		for(int iteration = 0 ; iteration<input.length();iteration++)
		{
			int characterlength = 1;
			while(iteration<input.length()-1 && input.charAt(iteration)==input.charAt(iteration+1)  )
			{
				characterlength++;
				iteration++;
			}
			result = result.append(input.charAt(iteration));
			result = result.append(characterlength);
		}
		
		
		return result.toString();
	}

}
