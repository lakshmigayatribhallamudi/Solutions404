package com.mani.gayi.array;

/*  Given an M x N matrix, with a few hurdles arbitrarily placed, 
	calculate the length of longest possible route possible from source to destination within the matrix. 
	We are allowed to move to only adjacent cells which are not hurdles. 
	The route cannot contains any diagonal moves and a location once visited in a particular path cannot be visited again.*/

public class LongestPathWhenHudlesArePresent {

	public static void main(String[] args) {

		// Initialize the array with basic values...
		int mat[][] = { { 1, 1, 1 }, { 1, 0, 1 } };

		int result = getLongestPath(mat, 0, 0, 1, 1);

		System.out.println("Result is " + result);
	}

	public static int getLongestPath(int[][] array, int sourcerow, int sourcecolumn, int destinationrow,
			int destinationcolumn) {

		boolean visited[][] = new boolean[array.length][array[0].length];

		for (int number_row = 0; number_row < array.length; number_row++) {
			for (int number_column = 0; number_column < array[number_row].length; number_column++) {
				visited[number_row][number_column] = false;
			}
		}

		Pair p = getLongestPath(array, visited, sourcerow, sourcecolumn, destinationrow, destinationcolumn);

		if (p.isFound())
			return p.getValue();
		else
			return 0;
	}

	public static Pair getLongestPath(int[][] array, boolean[][] visited, int sourcerow, int sourcecolumn,
			int destinationrow, int destinationcolumn) {
		Pair p = new Pair();

		// if the source coordinates is equal to the destination coordinates
		// then we found the result.
		if (sourcerow == destinationrow && sourcecolumn == destinationcolumn) {
			p.setFound(true);
			p.setValue(0);
			return p;
		}

		// if not a valid cell.
		if (sourcerow < 0 || sourcerow >= array.length || sourcecolumn < 0 || sourcecolumn >= array[0].length
				|| array[sourcerow][sourcecolumn] == 0 || visited[sourcerow][sourcecolumn] == true) {
			p.setFound(false);
			p.setValue(Integer.MAX_VALUE);
			return p;
		}

		// if it doesn't meet any of this condition then mark it as true.
		visited[sourcerow][sourcecolumn] = true;

		// stores the minimum result in the variable such than any unsigned
		// value will be greater than the minimum value.
		int result = Integer.MIN_VALUE;

		// go to the left cell...
		p = getLongestPath(array, visited, sourcerow, sourcecolumn - 1, destinationrow, destinationcolumn);

		// if we found the destination coordinates we found the solution...
		if (p.isFound())
			result = Math.max(result, p.getValue());

		// go to the right cell...
		p = getLongestPath(array, visited, sourcerow, sourcecolumn + 1, destinationrow, destinationcolumn);

		// if we found the destination coordinates we found the solution...
		if (p.isFound())
			result = Math.max(result, p.getValue());

		// go to the up cell...
		p = getLongestPath(array, visited, sourcerow - 1, sourcecolumn, destinationrow, destinationcolumn);

		// if we found the destination coordinates we found the solution...
		if (p.isFound())
			result = Math.max(result, p.getValue());

		// go to the right cell...
		p = getLongestPath(array, visited, sourcerow + 1, sourcecolumn, destinationrow, destinationcolumn);

		// if we found the destination coordinates we found the solution...
		if (p.isFound())
			result = Math.max(result, p.getValue());

		// back track
		visited[sourcerow][sourcecolumn] = false;

		// if the destination can be reached from here
		if (result != Integer.MIN_VALUE) {
			p.setFound(true);
			p.setValue(result + 1);
			return p;
		}

		// if the destination cant be reached

		else {
			p.setFound(false);
			p.setValue(Integer.MAX_VALUE);
			return p;
		}

	}

}

class Pair {
	private boolean found;
	private int value;

	public boolean isFound() {
		return found;
	}

	public void setFound(boolean found) {
		this.found = found;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}