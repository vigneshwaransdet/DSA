package com.sdet.classtimetasks07Aug2021;

import org.junit.Test;

/*
 * Reverse a String
 * 
 * input - String - word
 * ouput - drow
 * 
 * constraints - use recursive approach
 * 
 * Pseudocode:
 * 
 */

public class ReverseAString {
	@Test
	public void test1() {
		String str = "john";
		toReverseAString(str);
		
	}

	private String toReverseAString(String str) {
		
		if(str.length() == 0) 
				return "";
		
		int firstIndex = 0;
		int lastIndex = str.length()-1;
		return null;
		
		
	}
}
