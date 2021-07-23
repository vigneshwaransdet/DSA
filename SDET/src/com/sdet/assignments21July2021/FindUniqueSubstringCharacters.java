package com.sdet.assignments21July2021;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

/*
 * Question:
 * Write a program to return the shortest substring having all the unique characters of the string
	Input: "abbcafcb" Output: "bcaf"
 * 
 * 
 * 1. Inout -> String
 * 2. Ouput -> String
 * 3. Constraints -> Time Complexity -> O(n)
 * 					 and Space Complexity -> O(1)
 * 
 * 4. Test Data Set
 * 		Positive -> "abbcafcb" 
 * 		Neagtive ->
 * 		Edge -> 
 * 
 * 5. Ask for Hint -> 
 * 
 * 6. Approaches to Solve:
 * 		Brute Force
 * 		Optimized
 * 
 * 7. Pseudo code:
 * -init Current Starting Point st = 0,Current Length currentLen= 0,Max Length maxLen= 0,
 * 		Start Point start = 0 [i.e.starting point for current max length substring] and declare i for iterator
 * -Declare Map
 * -add the first key in index 0 and its value as 0
 * -Traverse through the loop starts from i=1 till less than string length    
 * -if map doesn't contains any key for the first time 
 * 		then add the key to the current index and add its value as current index 
 * -else check current character position is >= st value
 * 		-if greater, then assign i-st value to currentLen
 * 		-check if maxLen < currentLen
 * 			then assign currentLen value to maxLen 
 * 			and assign st value to start
 * 		-to get the current character's key value +1 and re-assign it to st 
 * 		-replace the current character's value with previous charcter's value
 * -once loop ends then check if maxLen < i-st value
 * 		then assign i-st value to maxLen
 * 		and re-assign st value to start
 * -return the substring from start to start+maxLength
 * 		 
 */

public class FindUniqueSubstringCharacters {

	@Test
	public void test1() {
		String data = "abbcafcbd";
		Assert.assertEquals(testMethod(data), "afcbd");
	}

//	@Test
	public void test2() {
		int[] data = {};
//		Assert.assertEquals(testMethod(), );
	}

	private String testMethod(String data) {
		int st = 0, currentLen = 0, maxLen = 0, start = 0, i;
		Map<Character, Integer> map = new HashMap<>();
		map.put(data.charAt(0), 0);
		for (i = 1; i < data.length(); i++) {
			if (!map.containsKey(data.charAt(i))) {
				map.put(data.charAt(i), i);
			} else {
				if (map.get(data.charAt(i)) >= st) {
					currentLen = i - st;
					if (maxLen < currentLen) {
						maxLen = currentLen;
						start = st; 
					}
					st = map.get(data.charAt(i)) + 1;  
				}
				map.replace(data.charAt(i), i); 
			}
		}
		if (maxLen < i - st) {
			maxLen=i-st;
			start=st;
		}
		return data.substring(start, start+maxLen);
	}
}
