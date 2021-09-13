package com.sdet.classtimetasks13Sep2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.junit.Assert;
import org.junit.Test;

public class GroupAnagrams {
	@Test
	public void test1() {
//		List<String> list = Arrays.asList("eat","tea","tan","ate","nat","bat");
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> expectedResult = Arrays.asList(Arrays.asList("tan","nat"),Arrays.asList("eat","tea","ate"),Arrays.asList("bat"));
		Assert.assertEquals(expectedResult,toGroupAnagrams(strs));
	}
	
	@Test
	public void test2() {
//		List<String> list = Arrays.asList("");
		String[] strs = {""};
		List<List<String>> expectedResult = Arrays.asList(Arrays.asList(""));
		Assert.assertEquals(toGroupAnagrams(strs), expectedResult);
	}
	
	@Test
	public void test3() {
//		List<String> list = Arrays.asList("a");
		String[] strs = {"a"};
		List<List<String>> expectedResult = Arrays.asList(Arrays.asList("a"));
		Assert.assertEquals(toGroupAnagrams(strs), expectedResult);
	}
	
	private List<List<String>> toGroupAnagrams(String[] list) {
		Map<String,List<String>> map = new TreeMap<>();
		for (int i = 0; i < list.length; i++) {
			int[] ascii = new int[26];
			String temp = list[i];
			for (int j = 0; j < temp.length(); j++) {
				ascii[temp.charAt(j)-97]++;
			}
			List<String> listTemp = new ArrayList<>();
			if(map.containsKey(Arrays.toString(ascii))) {
				listTemp.addAll(map.get(Arrays.toString(ascii)));
				listTemp.add(temp);
				map.put(Arrays.toString(ascii), listTemp);
			}
			else {
				listTemp.add(temp);
				map.put(Arrays.toString(ascii), listTemp);
			}
		}
		System.out.println(map);
		return new ArrayList<>(map.values());
	}
}
