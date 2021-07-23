package com.sdet.assignments22July2021;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

/*
 * 1.Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

Example 1:

Input: s = "III"
Output: 3

Example 2:

Input: s = "IV"
Output: 4

Example 3:

Input: s = "IX"
Output: 9

Example 4:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

Example 5:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

Example 6:
Input: s = "XL"
Output: 40
 * 
 * 
 * I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
 * 
 */



public class RomanNumerals22July2021 {
	@Test
	public void test1() {
		String s = "III";
		Assert.assertEquals(toFindRomanNumerals(s), 3);
	}
	
	@Test
	public void test2() {
		String s = "LVIII";
		Assert.assertEquals(toFindRomanNumerals(s), 58);
	}
	
	@Test
	public void test3() {
		String s = "MCMXCIV";
		Assert.assertEquals(toFindRomanNumerals(s), 1994);
	}

	private int toFindRomanNumerals(String s) {
		int n=s.length()-1,sum=0;
		Map<Character,Integer> map = new HashMap<>();
		map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
		while(n>=0) {
			if((s.charAt(n)=='V' ||s.charAt(n)=='X') && n!=0 && s.charAt(n-1)=='I') {
				sum+=map.get(s.charAt(n)) - map.get(s.charAt(n-1));
				n-=2;
			}
			
			if((s.charAt(n)=='L' ||s.charAt(n)=='C') && n!=0 && s.charAt(n-1)=='X') {
				sum+=map.get(s.charAt(n)) - map.get(s.charAt(n-1));
				n-=2;
			}
			
			if((s.charAt(n)=='D' ||s.charAt(n)=='M') && n!=0 && s.charAt(n-1)=='C') {
				sum+=map.get(s.charAt(n)) - map.get(s.charAt(n-1));
				n-=2;
			}
			
			else {
				sum+=map.get(s.charAt(n));
				n-=1;
			}
		}
		
		return sum;
	}
	
	
}
