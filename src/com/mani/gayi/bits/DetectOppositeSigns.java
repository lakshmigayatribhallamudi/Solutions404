package com.mani.gayi.bits;

public class DetectOppositeSigns {

	public static int isOpposite(int x, int y) {
		return ((x ^ y) >> 31);
	}

	public static void main(String[] args) {
		int x = 5;
		int y = -8;

		int res = isOpposite(x, y);
		System.out.println(res);
		if (res == -1) {
			System.out.println("The numbers have opposite sign");
		} else if (res == 0) {
			System.out.println("The numbers doesnot have opposite signs");
		}
	}
}
