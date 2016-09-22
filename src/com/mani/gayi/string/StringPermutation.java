package com.mani.gayi.string;

public class StringPermutation {
	
	public static void main (String[] args) {
	String str = "BOY";
        int n = str.length();
        permute(str.toCharArray(), 0, n-1);
	}
	
	public static void permute(char[] str, int start, int end){
	    if(start==end){
	        System.out.println(str);        
	    }
	    
	    for(int i=start;i<=end;i++){
	        swap(str,start, i);
	        permute(str, start+1, end);
	        swap(str, start, i);
	    }
	}
	
	public static void swap(char[] str, int i, int j){
	    char tmp = str[i];
	    str[i] = str[j];
	    str[j] = tmp;
	}

}


