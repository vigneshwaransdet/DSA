package com.sdet.assignments21July2021;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

/*
 * Given a String s = "aabbccddde" , out = "a2b2c2d3e1"
 * 
 * input -> string
 * output -> string
 * 
 * Pseudocode:
 * Declare map
 * Add all the characters into map
 * Declare empty result string
 * Iterate the map 
 * 		concatenate the empty string with key and values
 * 
 * return the updated result string 
 */

public class FindCharacterOccurence {
	@Test
	public void test1() {
		String s1 = "aabbccddde";
		toFindCharacterOccurence(s1);
	}

	private String toFindCharacterOccurence(String s1) {
		Map<Character,Integer> map = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0)+1);
		}
		String res = "";
		for (Map.Entry<Character, Integer> itr : map.entrySet()) {
			res += itr.getKey();
			res += itr.getValue();
		}
		System.out.println(res);
	return s1;
	}
}
