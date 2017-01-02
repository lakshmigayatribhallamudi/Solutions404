
package com.mani.gayi.I;

public class GreatestCommonFactor {

	public static void main(String[] args) {

		System.out.println("GCF calculated : " + calculateGCF(10, 12));
		System.out.println(10%12);
		System.out.println("GCF calculated : " + calculateGCFInRecursive(10, 12));
	}

	/**
	 * Iteration way.
	 */
	public static int calculateGCF(int value1, int value2) {
		// if both the values are same then return the one of the value.
		if (value1 == value2) {
			return value1;
		}

		while (value2 != 0) {
			int r = value1 % value2;
			value1 = value2;
			value2 = r;
		}

		return value1;
	}

	/**
	 * Recursive way. In Euclid's algorithm, we start with two numbers value1
	 * and value2.
	 */
	public static int calculateGCFInRecursive(int value1, int value2) {

		System.out.println("Value 1:"+value1+" value 2 "+value2);
		if (value2 == 0)
			return value1;
		
			
		return calculateGCFInRecursive(value2, value1%value2);
	}

}
