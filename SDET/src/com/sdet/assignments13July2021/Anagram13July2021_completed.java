package com.sdet.assignments13July2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

/*
 * P5) Find All Anagrams in a String

Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
 * 
 * Pseudocode:
 * Declare target map for target string "abc"
 * Declare actual map for actual string 
 * Declare List and store the first index of tar map matches with actual map
 * Initiate slow and fast pointers
 * while condition fast < actual string length
 * 		while condition compare fast - slow pointer <= tar map length 
 * 			check if tar map contains s.charAt[fast]
 * 				fast++
 * 				then move slow pointer and decrement the count value until its == 0 and remove it 
 * else 
 * 	then move fast++ 
 * 	slow = fast
 * 
 * 
 * 
 */

public class Anagram13July2021_completed {
	@Test
	public void test1() {
		String s1 = "cbaebabacd"; // ccaeb
		String s2 = "abc";
		List<Integer> res = new ArrayList<>();
		res.add(0);
		res.add(6);
		findAnagrams(s1,s2);
		Assert.assertEquals(findAnagrams(s1,s2),res);
	}
	
	public List<Integer> findAnagrams(String s, String p) {
	Map<Character,Integer> tmap = new HashMap<>();	 
	Map<Character,Integer> cmap = new HashMap<>();	
	for(int i=0;i<p.length();i++) {
		tmap.put(p.charAt(i), 1);
	}
	System.out.println(tmap);
	int slow = 0,fast = 0;
	List<Integer> li = new ArrayList<>();
	while(slow <= s.length()-p.length()) {
		cmap.put(s.charAt(fast), cmap.getOrDefault(s.charAt(fast), 0)+1);
		if(fast-slow+1 == p.length()) {
			if(tmap.equals(cmap)) li.add(slow);
			if(cmap.get(s.charAt(slow))>1) {
				cmap.put(s.charAt(slow), cmap.get(s.charAt(slow))-1);
			}
			else {
				cmap.remove(s.charAt(slow));
			}
			slow++;
		}
		fast++;
	}
	return li;
	}

}
