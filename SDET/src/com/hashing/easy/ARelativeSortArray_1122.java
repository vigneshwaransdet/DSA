package com.hashing.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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

public class ARelativeSortArray_1122 {
	
	@Test
	public void test1() {
		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
		int[] arr2 = {2,1,4,3,9,6};
//		List<Integer> output = Arrays.asList(2,2,2,1,4,3,3,9,6,7,19);
//		Assert.assertEquals(output, toFindRelativeSortArrayUsingList(arr1,arr2));
//		Assert.assertArrayEquals(new int[] {2,2,2,1,4,3,3,9,6,7,19}, toFindRelativeSortArrayUsingArray(arr1,arr2));
		Assert.assertTrue(Arrays.equals(toFindRelativeSortArrayUsingArray(arr1,arr2), new int[] {2,2,2,1,4,3,3,9,6,7,19}));
//		Assert.assertTrue(Arrays.equals(toFindRelativeSortArrayUsingTreeMap(arr1,arr2), new int[] {2,2,2,1,4,3,3,9,6,7,19}));
	}
	
	@Test
	public void test2() {
		int[] arr1 = {28,6,22,8,44,17};
		int[] arr2 = {22,28,8,6};
//		List<Integer> output = Arrays.asList(2,2,2,1,4,3,3,9,6,7,19);
//		Assert.assertEquals(output, toFindRelativeSortArrayUsingList(arr1,arr2));
//		Assert.assertArrayEquals(new int[] {2,2,2,1,4,3,3,9,6,7,19}, toFindRelativeSortArrayUsingArray(arr1,arr2));
		Assert.assertTrue(Arrays.equals(toFindRelativeSortArrayUsingArray(arr1,arr2), new int[] {22,28,8,6,17,44}));
//		Assert.assertTrue(Arrays.equals(toFindRelativeSortArrayUsingTreeMap(arr1,arr2), new int[] {22,28,8,6,17,44}));
	}
	
	@Test
	public void test3() {
		int[] arr1 = {2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31};
		int[] arr2 = {2,42,38,0,43,21};
//		List<Integer> output = Arrays.asList(2,2,2,1,4,3,3,9,6,7,19);
//		Assert.assertEquals(output, toFindRelativeSortArrayUsingList(arr1,arr2));
//		Assert.assertArrayEquals(new int[] {2,2,2,1,4,3,3,9,6,7,19}, toFindRelativeSortArrayUsingArray(arr1,arr2));
		Assert.assertTrue(Arrays.equals(toFindRelativeSortArrayUsingArray(arr1,arr2), new int[] {2,42,38,0,43,21,5,7,12,12,13,23,24,24,27,29,30,31,33,48}));
//		Assert.assertTrue(Arrays.equals(toFindRelativeSortArrayUsingTreeMap(arr1,arr2), new int[] {22,28,8,6,17,44}));
	}
					
	private List<Integer> toFindRelativeSortArrayUsingList(int[] arr1, int[] arr2) {
		int left=0,right=0;
		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < arr2.length; i++) {
			map.put(i, arr2[i]);
		}
		List<Integer> list = new ArrayList<>();
		while(left<arr2.length) {
			if(arr1[right]==map.get(left)) {
				list.add(arr1[right]);
			}
			
			right++;
			if(right>arr1.length-1) {
				right=0;
				left++;
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			if(!map.containsValue(arr1[i])) {
				list.add(arr1[i]);
			}
		}
		return list;
	}
	
	private int[] toFindRelativeSortArrayUsingArray(int[] arr1, int[] arr2) {
		int left=0,right=0;
		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < arr2.length; i++) {
			map.put(i, arr2[i]);
		}
		List<Integer> list = new ArrayList<>();
		while(left<arr2.length) {
			if(arr1[right]==map.get(left)) {
				list.add(arr1[right]);
			}
			right++;
			if(right>arr1.length-1) {
				right=0;
				left++;
			}
		}
		Arrays.sort(arr1);
		for (int i = 0; i < arr1.length; i++) {
			if(!map.containsValue(arr1[i])) {
				list.add(arr1[i]);
			}
		}
		int[] res = new int[list.size()];
		int index=0;
		for (int out : list) {
			res[index++] = out;
		}
		return res;
	}
	
	private int[] toFindRelativeSortArrayUsingTreeMap(int[] arr1, int[] arr2) {
		int left=0,right=0;
		Map<Integer,Integer> map = new TreeMap<>();
		for (int i = 0; i < arr1.length; i++) {
			map.put(arr1[i],map.getOrDefault(arr1[i], 0)+1);
		}
		int[] res = new int[arr1.length];
		int index = 0;
		for (int i = 0; i < arr2.length; i++) {
			if(map.containsKey(arr2[i])) {//2 2 2
				while(map.get(arr2[i])>0) {
					res[index++] = arr2[i];
					map.put(arr2[i],map.get(arr2[i])-1);
				}
				map.remove(arr2[i]);
			}
		}
		
		if(map.size()>0) {
			for (Map.Entry<Integer, Integer> out : map.entrySet()) {
				for(int i=0;i<out.getValue();i++) {
					res[index++] = out.getKey();
					
				}
			}
		}
		return res;
	}
}
