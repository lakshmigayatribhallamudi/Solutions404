package com.mani.gayi.utils;

import java.util.HashSet;
import java.util.Set;

public class Data10000 {
	
	static Set<Integer> integers = new HashSet<Integer>(10000);
	
	
	public static void populateSet()
	{
		for(int index=0;index<10000;index++){
			int value = ArrayUtils.randInt(0, 30000);
			integers.add(value);
			}
	}
	
	
	public static void main(String[] args) {
		
		populateSet();
		CollectionUtil.printSet(integers);
	}
}
