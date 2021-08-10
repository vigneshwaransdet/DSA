package com.sdet.assignments17July2021;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

/*
 * Given two strings s1 and s2, return true if s2 contains the permutation of s1.

In other words, one of s1's permutations is the substring of s2.

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false
 

Constraints:

1 <= s1.length, s2.length <= 104
s1 and s2 consist of lowercase English letters.
 * 
 * 
 */

public class PermutationInString {

	@Test
	public void test1() {
		String s1 = "ab";
		String s2 = "eidbaooo";
		Assert.assertEquals(toPermutationInString(s1, s2), true);
	}

	@Test
	public void test2() {
		String s1 = "ab";
		String s2 = "eidboaoo";
		Assert.assertEquals(toPermutationInString(s1, s2), false);
	}

	@Test
	public void test3() {
		String s1 = "ab";
		String s2 = "";
		Assert.assertEquals(toPermutationInString(s1, s2), false);
	}

	@Test
	public void test4() {
		String s1 = "abc";
		String s2 = "abcd";
		Assert.assertEquals(toPermutationInString(s1, s2), true);
	}
	
//	private boolean toPermutationInString(String s1, String s2) {
//		int left = 0, right = 0;
//		boolean flag = false;
//		while (left < s1.length() && right < s2.length()) {
//			if (s1.charAt(left) == s2.charAt(right)) {
//				if ((right - 1 > 0 && left + 1 < s1.length() && s1.charAt(left + 1) == s2.charAt(right - 1))
//	|| (right + 1 < s2.length() && left + 1 < s1.length() && s1.charAt(left + 1) == s2.charAt(right + 1))) {
//					left++;
//					flag = true;
//				} 
//				else flag = false;
//			}
//				else if (s1.charAt(left) == s2.charAt(right) && s1.charAt(left + 1) == s2.charAt(right + 1))
//				flag = true;
//			else {
//				flag = false;
//				right++;
//			}
//		}
//		return flag;
//	}
	
//	Example 1:
//
//		Input: s1 = "ab", s2 = "eidboaoo"
//		Output: true
//		Explanation: s2 contains one permutation of s1 ("ba").
	
	private boolean toPermutationInString(String s1, String s2) {
		boolean flag = false;
		Map<Character,Integer> map = new HashMap<>();
		int index = -1;
		int s1Len = s1.length();
		
		for (int i = 0; i < s1.length(); i++) {
			map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0)+1);
		}
		System.out.println(map);
		
		for (int j = 0; j < s2.length(); j++) {
			if(map.containsKey(s2.charAt(j)) && (index == -1 || index+1 == j)) {
				index = j;
				flag = true;
				s1Len--;
				if(s1Len == 0) return flag;
			}
			else flag = false;
		}
		return flag;
	}

}
