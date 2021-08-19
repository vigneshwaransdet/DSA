package com.sdet.assignments21July2021;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;


public class FindUniqueSubStringCharacters01 {
	@Test
	public void test1() {
		String str = "abhcdaefghab";
		String pattern = "ade";
		Assert.assertEquals(toFindUsingMap(str,pattern), "dae");
//		Assert.assertEquals(toFindUsingSet(str,pattern), "dae");
	}
	
	@Test
	public void test2() {
		String str = "abhcdaefghabdea";
		String pattern = "ade";
		Assert.assertEquals(toFindUsingMap(str,pattern), "dea");
//		Assert.assertEquals(toFindUsingSet(str,pattern), "dea");
	}
	
	@Test
	public void test3() {
		String str = "abhcdaedfghab";
		String pattern = "ade";
		Assert.assertEquals(toFindUsingMap(str,pattern), "aed");
//		Assert.assertEquals(toFindUsingSet(str,pattern), "aed");
	}
	
	@Test
	public void test4() {
		String str = "abhcdfghab";
		String pattern = "ade";
		Assert.assertEquals(toFindUsingMap(str,pattern), "");
//		Assert.assertEquals(toFindUsingSet(str,pattern), "");
		
	}
	
	@Test
	public void test5() {
		String str = "abhcdfghbba";
		String pattern = "abb";
		Assert.assertEquals(toFindUsingMap(str,pattern), "bba");
//		Assert.assertEquals(toFindUsingSet(str,pattern), "bab");
		
	}

	private String toFindUsingMap(String s, String p) {
		int slow = s.length()-1,fast = s.length()-1;
		Map<Character,Integer> tmap = new HashMap<>();
		Map<Character,Integer> cmap = new LinkedHashMap<>();
		for (int i = 0; i < p.length(); i++) {
			tmap.put(p.charAt(i), tmap.getOrDefault(p.charAt(i), 0)+1);
		}
		String res = "";
		while(slow-(p.length()-1)>=0) {
			cmap.put(s.charAt(fast), cmap.getOrDefault(s.charAt(fast), 0)+1);
			if(slow-fast+1 == p.length()) {
				if(tmap.equals(cmap)) { 
					res += s.substring(fast, slow+1);
					System.out.println(res);
					return res;
				}
				if(cmap.get(s.charAt(fast))>1) cmap.put(s.charAt(fast), cmap.get(s.charAt(slow))-1);
				else cmap.remove(s.charAt(slow));
				slow--;
			}
			fast--;
		}
		return "";
	}
//	abhcdaefghab
//	abhcdfghbab
	private String toFindUsingSet(String str, String p) {
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < p.length(); i++) {
			set.add(p.charAt(i));
		}
		StringBuilder res = new StringBuilder("");
		int count = 0;
		for (int j = str.length() - 1; j >= 0; j--) {
			if (set.contains(str.charAt(j))) {
				res.append(str.charAt(j));
				count++;
				if (count == p.length()) {
					return res.reverse().toString();
				}
			} else {
				count = 0;
				res.setLength(0);
			}
		}
		return "";
	}

}
