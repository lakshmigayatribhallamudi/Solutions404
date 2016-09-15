package com.mani.gayi.bits;

public class FindElementThatAppearOnceRestAllAppearThrice {

	public static void main(String[] args) {
		int arr[] = { 1,1,1,2};
		System.out.println(findElementThatAppearOnce(arr));
	}

	private static int findElementThatAppearOnce(int arr[]) {
		//Declaring two variables firstTimeOccurence and secondTimeOccurence which 
		//intialize according to the occurrence.
		//Declaring firstTimeOccurence to track the first time occurrence of a digit.
		int firstTimeOccurence = 0;
		//Declaring secondTimeOccurence to track the second time occurrence of a digit
		int secondTimeOccurence = 0;
		//Iterating through all the digits in an array.
		for (int i = 0; i < arr.length; i++) {
			//secondTimeOccurence is intialized 
			secondTimeOccurence = secondTimeOccurence | (firstTimeOccurence & arr[i]);
			firstTimeOccurence = firstTimeOccurence ^ arr[i];
			//neutraliser is used to  reset the variables firstTimeOccurence and secondTimeOccurence
			//when the digit has third occurrence.
			int neutraliser = ~(firstTimeOccurence & secondTimeOccurence);
			//Resetting the value of firstTimeOccurence to '0' if it has third time occurrence.
			firstTimeOccurence = firstTimeOccurence & neutraliser;
			//Resetting the value of secondTimeOccurence to '0' if it has third time occurrence.
			secondTimeOccurence = secondTimeOccurence & neutraliser;
		}
		return firstTimeOccurence;
	}
}
