package com.sdet.assignments17July2021;

import org.junit.Assert;
import org.junit.Test;



/*
 * 
 * Given a string s, find the length of the longest substring without repeating characters.
 
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

 * 1. input -> String 
 * 2. Output -> int
 * 3. constarints -> sliding window using ascii
 * 4. test data set
 * 		P -> "abcabcbb"
 * 		N -> "bbb"
 *      E -> "abcabc" 
 *      		   012345 		
 * Pseduo Code: // abcdde
 * 
 * -init left, right,uniqueCount max -> 0
 * -Declare charCount array with size as -> 128
 * -Traverse through the array using right till the length of the input and increment each time 
 * -check occurence of the char
 * 		-If 0 -> increment charCount
 *  
 * -check occurence more than one,
 * -find the max, use Math.max(max, right-left)
 *  then increment left till charCount decrement
 * 		- uniqueCount--   
 *        	
 */

public class LongestSubstring17July2021 {
	
	@Test
	public void test1() {
		String s = "abcdde";
		int k = 4;
		Assert.assertEquals(findUniqueCharacters(s,k), 4);		
	}
	
	@Test
	public void test2() {
		String s = "eeebabe";
		int k = 3;
		Assert.assertEquals(findUniqueCharacters(s,k), 3);		
	}

	private int findUniqueCharacters(String s,int k) {
		
		int left=0,right=0,uniqueCount=0,max=0;
		int[] charCount = new int[128];
		for (right = 0; right < s.length(); right++) {
			if(charCount[s.charAt(right)]++ == 0) {
				uniqueCount++;
			}
			if(uniqueCount>k)
			while(--charCount[s.charAt(left++)]>0) {
				uniqueCount--;
			}
			max = Math.max(max, right-left);
		}
		return max;
	}
	
	

}
