package com.mockinterview09Aug2021;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
 * int[] arr1 = {1,2,3,4};
int[] arr2 = {5,2,6,7};
output = {2};

int[] arr1 = {2,2,2,2};
int[] arr2 = {2,2,2,2};
output = {2,2,2,2};

int[] arr1 = {3,3,3,3};
int[] arr2 = {2,2,2,2};
output = {};

int[] arr1 = {1,3,3,4};
int[] arr2 = {2,2,2,3};
output = {3};
 * 
 * 
 * 
 */

public class IntersectionOfTwoArrays {
	@Test
	public void test1() {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {5,2,6,7};
		Assert.assertArrayEquals(toFindIntersectionOfTwoArrays(arr1,arr2), new int[] {2});
	}
	
	@Test
	public void test2() {
		int[] arr1 = {2,2,2,2};
		int[] arr2 = {2,2,2,2};
		Assert.assertArrayEquals(toFindIntersectionOfTwoArrays(arr1,arr2), new int[] {2,2,2,2});
	}
	
	@Test
	public void test3() {
		int[] arr1 = {3,3,3,3};
		int[] arr2 = {2,2,2,2};
		Assert.assertArrayEquals(toFindIntersectionOfTwoArrays(arr1,arr2), new int[] {});
	}
	
	@Test
	public void test4() {
		int[] arr1 = {1,3,3,4};
		int[] arr2 = {2,2,2,3};
		Assert.assertArrayEquals(toFindIntersectionOfTwoArrays(arr1,arr2), new int[] {3});
	}

	private int[] toFindIntersectionOfTwoArrays(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int slow = 0;
		int fast = 0;
		int arr1Size = arr1.length;
		int arr2Size = arr1.length;
		int[] res;
		if(arr1Size > arr2Size) {
			res = new int[arr2Size];
		}
		else {
			res = new int[arr1Size];
		}
		int index = 0;
		while(slow < arr1.length && fast < arr2.length) {
			if(arr1[slow]<arr2[fast]) slow++; 
			else if(arr1[slow]>arr2[fast]) fast++;
			else {
				res[index++] = arr1[slow];
				slow++;
				fast++;
			}
		}
		System.out.println(Arrays.toString(res));
		return res;
	}
}
