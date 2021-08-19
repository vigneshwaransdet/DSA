package com.sdet.classtimetasks17Aug2021;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

/*
 * String = "abbccaadf";
 * target values = [4,2,5,3,7];
 * num target = 5;
 * 
 */

public class UniformString {
	@Test
	public void test1() {
		String s = "abbccaadf";
		int[] tValues = {4,2,5,3,7};
		Assert.assertArrayEquals(toFindUsingSet(s,tValues), new String[] {"true","true","false","true","false"});
	}
	
	@Test
	public void test2() {
		String s = "abcad";
		int[] tValues = {1,2,5,3,7};
		Assert.assertArrayEquals(toFindUsingSet(s,tValues), new String[] {"true","true","false","true","false"});
	}

//	private void toFindUsingMap(String s, int[] tValues) {
//		Map<Character,Integer> map = new HashMap<>();
//		map.put('a', 1);
//		map.put('b', 2);
//		map.put('c', 3);
//		map.put('d', 4);
//		map.put('e', 5);
//		map.put('f', 6);
//		map.put('g', 7);
//		
//		Map<String,Integer> map1 = new HashMap<>();
//		int sum=0;
//		int i,j=0;
//		for (i = 0; i < s.length();) {
//			String temp = "";
//			temp+=s.charAt(i);
//			sum+=map.get(s.charAt(i));
//			map1.put(temp, sum);
//			for (j = i+1; j < s.length() && s.charAt(i)==s.charAt(j); j++) {
//				temp+=s.charAt(j);
//				sum+=map.get(s.charAt(j));
//				map1.put(temp, sum);
//			}
//			i=j;
//			sum=0;
//		}
//		List<Integer> limap1 = new ArrayList<>();
//		for (Map.Entry<String,Integer> res : map1.entrySet()) {
//			limap1.add(res.getValue());
//		}
//		System.out.println(limap1);
//		String[] out = new String[tValues.length];
//		for (int k = 0; k < tValues.length; k++) {
//			if(limap1.contains(tValues[k])) {
//				out[k] = "true";
//			}
//			else {
//				out[k] = "false";
//			}
//		}
//	}
	
	private String[] toFindUsingSet(String s, int[] tValues) {
		Set<Integer> set = new HashSet<>();
		int sum=0;
		int i,j=0;
		for (i = 0; i < s.length();) {
			sum+=s.charAt(i)-96;
			set.add(sum);
			for (j = i+1; j < s.length() && s.charAt(i)==s.charAt(j); j++) {
				sum+=s.charAt(j)-96;
				set.add(sum);
			}
			i=j;
			sum=0;
		}
		System.out.println(set);
		String[] out = new String[tValues.length];
		for (int k = 0; k < tValues.length; k++) {
			if(set.contains(tValues[k])) {
				out[k]="true";
			}
			else {
				out[k]="false";
			}
		}
		return out;
	}
}
