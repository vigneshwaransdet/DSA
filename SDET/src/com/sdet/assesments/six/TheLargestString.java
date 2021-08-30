package com.sdet.assesments.six;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.junit.Assert;
import org.junit.Test;

/*
 * 
 * 
 * 
 */

public class TheLargestString {
	@Test
	public void test1() {
		String s = "baccc";
		int k = 2;
		Assert.assertEquals(toFindTheLargestString(s,k), "ccbca");
	}

	private String toFindTheLargestString(String s, int k) {
		String res = "";
		Map<Character,Integer> descMap = new TreeMap<>(Collections.reverseOrder());
		for (int i = 0; i < s.length(); i++) {
			descMap.put(s.charAt(i), descMap.getOrDefault(s.charAt(i), 0)+1);
		}
		System.out.println(descMap);
		List<Character> li = new ArrayList<>();
		int index=0;
		for (Map.Entry<Character,Integer> out : descMap.entrySet()) {
			if(out.getValue()>k) {
				res+=out.getKey();
				descMap.put(out.getKey(), descMap.getOrDefault(descMap.get(out.getValue()), 0)-1);
			}
		}
		return null;
	}
}
