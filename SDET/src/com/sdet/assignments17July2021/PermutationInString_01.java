package com.sdet.assignments17July2021;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

/*
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false
 * 
 * input -> string
 * ouput -> boolean
 * 
 * pseudocode:
 * Declare tar map and cur map
 * add all the s1 chars to tar map
 * init slow and fast = 0
 * Iterate through the until fast <= s2.len()   
 * 		check f-s+1 == s1.len
 * 			if true
 * 				then check tmap equals cmap return true
 * 				then check cmap value > 1
 * 					if true 
 * 						decrement the cmap value
 * 					else
 * 						remove the current char from cmap
 * 					s++
 * 
 * 		f++
 */

public class PermutationInString_01 {
	@Test
	public void test1() {
		String s1 = "ab";
		String s2 = "eidbaooo";
		Assert.assertTrue(checkInclusion(s1,s2)==true);
	}
	
	@Test
	public void test2() {
		String s1 = "ab";
		String s2 = "eidboaoo";
		Assert.assertTrue(checkInclusion(s1,s2)==false);
	}

	public boolean checkInclusion(String s1, String s2) {
		Map<Character,Integer> tmap = new HashMap<>();
		Map<Character,Integer> cmap = new HashMap<>();
		int slow=0,fast=0;
		for (int i = 0; i < s1.length(); i++) {
			tmap.put(s1.charAt(i), tmap.getOrDefault(s1.charAt(i), 0)+1);
		}
		while(slow <= s2.length()-s1.length()) {
			cmap.put(s2.charAt(fast), cmap.getOrDefault(s2.charAt(fast), 0)+1);
			if(fast-slow+1==s1.length()) {
				if(tmap.equals(cmap)) return true;
				if(cmap.get(s2.charAt(slow))>1) {
					cmap.put(s2.charAt(slow), cmap.get(s2.charAt(slow))-1);
				}
				else {
					cmap.remove(s2.charAt(slow));
				}
				slow++;
					
			}
			fast++;
		}
		return false;
        
    }
}
