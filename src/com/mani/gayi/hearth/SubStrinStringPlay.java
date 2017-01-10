package com.mani.gayi.hearth;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.mani.gayi.utils.ArrayUtils;

public class SubStrinStringPlay {

	public static void main(String[] args) {

		int stringlength = 0;
		int numberOfQueries = 0;
		
		Scanner intialScanner = new Scanner(System.in);
		String firstInput = intialScanner.nextLine();
		String[] data = firstInput.split("\\s+");
		stringlength= Integer.parseInt(data[0]);
		numberOfQueries = Integer.parseInt(data[1]);
		
		
		Scanner stringScanner = new Scanner(System.in);
		String  inputstring = stringScanner.nextLine();

		int[][] queries = new int[numberOfQueries][2];
		for(int index =0;numberOfQueries>index;index++)
		{
			Scanner queryScanner = new Scanner(System.in);
			String queryInput = queryScanner.nextLine();
			String[] querydata = queryInput.split("\\s+");
			queries[index][0]= Integer.parseInt(querydata[0]);
			queries[index][1] = Integer.parseInt(querydata[1]);
		}
		
		
		calculateAndPrint(inputstring,queries);
	}

	private static void calculateAndPrint(String inputstring, int[][] queries) {
		
		
		for(int iterator = 0;queries.length>iterator;iterator++)
		{
			int ldata = queries[iterator][0];
			int rdata = queries[iterator][1];
			
			int result = processString(inputstring.substring(ldata-1,rdata));
			System.out.println(result);
		}
		
		
	}

	private static int processString(String substring) {
		char[] arraydata = substring.toCharArray();
		Arrays.sort(arraydata);
		Map<Character,Integer> map = new HashMap<>();
		for(int index =0;index<arraydata.length;index++)
		{
			if (map.containsKey(arraydata[index])) {
				int value = map.get(arraydata[index]);
				map.put(arraydata[index], value + 1);
			} else {
				map.put(arraydata[index], 1);
			}
		}
		
		int lessvalue = Integer.MAX_VALUE;
		for(int data : map.values())
		{
			if(lessvalue>data)
				lessvalue = data;
		}
		
		int result = 0;
		for(int data : map.values())
		{
			if(data == lessvalue)
				continue;
			if(data >lessvalue)
			{
				result = result+data-lessvalue;
			}
		}
		return result;
		
		
	}

}
