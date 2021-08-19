package com.sdet.assignments22July2021;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class ReturnTargetSubString {
	@Test
	public void test1() {
		String s = "ADOBECODEBANC";
		String t = "ABC";
		toFind(s,t);
	}

	private String toFind(String s, String p) {
//		int slow = 0,fast=1;
//		Map<Character,Integer> tmap = new HashMap<>();
//		Map<Character,Integer> cmap = new HashMap<>();
//		for (int i = 0; i < p.length(); i++) {
//			tmap.put(p.charAt(i), tmap.getOrDefault(p.charAt(i), 0)+1);
//		}
//		int minSubStringLen = Integer.MAX_VALUE;
//		while(slow<p.length()-1) {
//			if(cmap.containsKey(tmap)) {
//				cmap.put(s.charAt(fast), cmap.getOrDefault(s.charAt(fast), 0)+1);
//				
//			}
//			else {
//				
//			}
////			minSubStringLen = Math.min(fast-slow+1, minSubStringLen);
//			fast++;
//		}
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < p.length(); i++) {
			set.add(p.charAt(i));
		}
		int count=0;
		String res = "";
		String res1 = s;
		for (int j = 0; j < s.length(); j++) {
			if(set.contains(s.charAt(j))) {
				res += s.charAt(j);
				count++;
				if(count == p.length() && (res.length()<res1.length())) {
					res1=res;
					count=0;
					res="";
				}
				
			}
			else if(!set.contains(s.charAt(j)) && count>0) {
				res += s.charAt(j);
			}
		}
		System.out.println(res1);
		return res1;
	}
}
