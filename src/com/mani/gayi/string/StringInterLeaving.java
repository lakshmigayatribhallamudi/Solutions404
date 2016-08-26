package com.mani.gayi.string;

public class StringInterLeaving {

	public static void main(String[] args) {

		new StringInterLeaving().interLeaveString("ABC","DEF", 0, 0, "");
		
	}

	public void interLeaveString(String input1, String input2, int index1, int index2, String result) {

		if (result.length() == input1.length() + input2.length()) {
			System.out.println("result "+result);
		} else {
			if (index1 < input1.length()) {
				String temp = result + input1.charAt(index1);
				interLeaveString(input1, input2, index1 + 1, index2, temp);
			}
			if (index2 < input2.length()) {
				String temp = result + input2.charAt(index2);
				interLeaveString(input1, input2, index1, index2 + 1, temp);
			}
		}

	}

}
