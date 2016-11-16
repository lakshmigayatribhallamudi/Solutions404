package com.mani.gayi.utils;

import java.util.LinkedHashSet;
import java.util.Set;

public class Data10000 {
	
	static Set<Integer> integers = new LinkedHashSet<Integer>();
	
	
	public static void populateSet()
	{
		int index=2000;
		while(index>0){
			int value = ArrayUtils.randInt(1, 2000);
			
			
			boolean val = integers.add(value);
			
			if(val)
			{
				index--;
			}
			}
	}
	
	
	public static void main(String[] args) {
		
		populateSet();
		CollectionUtil.printSet(integers);
	}
}
