package com.mani.gayi.I;

public class SumPairEqualToTotal {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 7, 12, 54, 78, 99, 103, 333,577,601,1000 };

		Pair p = getPairWhichInSortedOrder(numbers, 1602);

		System.out.println("Pair found value (" + p.getA() + "," + p.getB() + ")");
	}

	/*
	 * If the Array is in sorted order... O(n)
	 */

	public static Pair getPairWhichInSortedOrder(int[] numbers, int result) {
		Pair p = new Pair();
		int startingIndex = 0;
		int endingIndex = numbers.length - 1;

		for (int index = 0; index < numbers.length; index++) {
			if (startingIndex < endingIndex) {
				if (numbers[startingIndex] + numbers[endingIndex] == result) {
					p.setA(numbers[startingIndex]);
					p.setB(numbers[endingIndex]);
					return p;
				} else if (numbers[endingIndex] + numbers[startingIndex] < result) {
					startingIndex++;
				} else if (numbers[endingIndex] + numbers[startingIndex] > result) {
					endingIndex--;
				}
			}
		}

		return p;
	}

	/*
	 * Time Complexity : O (n^2)
	 */
	public static Pair getPair(int[] numbers, int result) {
		Pair p = new Pair();
		for (int index = 0; index < numbers.length; index++) {
			for (int innerIndex = index + 1; innerIndex < numbers.length; innerIndex++) {
				if (index != innerIndex && result == numbers[index] + numbers[innerIndex]) {
					p.setA(numbers[index]);
					
					p.setB(numbers[innerIndex]);
					return p;
				}
			}

		}
		return p;
	}

}

class Pair {
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	int a;
	int b;

}