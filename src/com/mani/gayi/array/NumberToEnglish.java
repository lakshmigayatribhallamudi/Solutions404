package com.mani.gayi.array;

public class NumberToEnglish {

	private static final String[] twoNumbers = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
			"nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };

	private static final String[] tensNames = { "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };

	private static final String[] bigNames = { "thousand", "million", "billion" };

	public static void main(String[] args) {

		int number1 = 88;

		System.out.println("Spell this number " + number1 + " in English : " + process2Numbers(number1));

		int number2 = 135;

		System.out.println("Spell this number " + number2 + " in English : " + process3Numbers(number2));

		int number = 144;

		System.out.println("Spell this number " + number + " in English : " + convertGivenNumberToEnglish(79056789));

		System.out.println("Integer Maximum value is " + Integer.MAX_VALUE);

		System.out.println("456 % 1000 value " + 456 % 1000);

	}

	private static String convertGivenNumberToEnglish(int number) {
		// taking care of negative numbers...
		if (number < 0) {
			return "minus" + convertGivenNumberToEnglish(-number);
		}

		// if the given number is 3 digits...
		if (number < 1000) {
			return process3Numbers(number);
		}

		// result data if the given number is of 4 digits...
		String s = null;

		// taking care of big indexes...
		int bigindex = 0;

		
		// 7,90,56,789
		while (number > 0) {
			if (number % 1000 != 0) {
				String s2 = process3Numbers(number % 1000);

				if (bigindex > 0) {
					s2 = s2 + "," + bigNames[bigindex - 1];
				}
				if (s == null) {
					s = s2;
				} else {
					s = s2 + " , " + s;
				}
			}

			number = number / 1000;
			bigindex++;
		}
		return s;
	}

	// it will process 2 numbers.
	private static String process2Numbers(int number1) {

		// this is the English word that is returned once the given number is
		// converted.
		String number = "";

		// if the given number is less than 19 then access the twoNumbers array
		// and get the number's English word.
		if (number1 < 20) {
			// assignment to the number variable.
			number = twoNumbers[number1];
			return number;
		}

		// if the given number is greater than the 20...

		// load the number with tens array value based the index calculation.
		number = tensNames[number1 / 10 - 2];

		// if the given number mod is equal to zero it means it is tens array.
		if (number1 % 10 == 0) {
			return number;
		}
		// if the number is not equal then it is not rounding tens number
		else {
			return number + twoNumbers[number1 % 10];
		}
	}

	// it will process 3 numbers.
	private static String process3Numbers(int number1) {
		String morethan99 = "";
		String s2 = "";

		// if the given number is bigger than 99
		if (number1 > 99) {
			morethan99 = twoNumbers[number1 / 100] + "hundred";
		}
		// process the 2 numbers if it is a 3 digit term.
		s2 = process2Numbers(number1 % 100);
		if (number1 < 100)
			return s2;

		if (number1 % 10 == 0)
			return morethan99;
		else {
			return morethan99 + s2;
		}

	}

}
