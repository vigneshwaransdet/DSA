package com.sdet.assignments19July2021;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
 * 
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
 
Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:
Input: nums = [], target = 0
Output: [-1,-1]
	
 * 1.input -> int[] array and target as int
 * 2.output -> int
 * 3.constraints -> O(log n)
 * 4.test data
 * 		positive -> [1,3,5,6] , t = 5
 * 		negative -> [1,4,5,9] , t = 8 
 * 		Edge -> [2,7,7,8,8,10] , t = 2
 * 
 * 
 * Pseudo Code:
 * init low and high as 0 and array length -1 respectively
 * traverse through the array until low < high
 * if mid value of array == target && low == high 
 * 		then return the index value for both low and high
 * else if  mid value of array == target and low value of array < target
 * 		then increment low index by 1
 * else if mid value of array == target and high value value of array > target 
 * 		then decrement high index by 1
 * else if mid value of array > target 
 * 		then assign mid-1 to high
 * else assign mid+1 to low
 * 
 */		

public class FindElementStartEndIndex19July2021 {
	
	@Test
	public void test1() {
		int[] data = {5,7,7,8,8,10};
		int k = 8;
		Assert.assertTrue(Arrays.equals(findStartAndEndIndex(data,k), new int[] {3,4}));
		
	}
	
	@Test
	public void test2() {
		int[] data = {5,7,7,8,8,10};
		int k = 6;
		Assert.assertTrue(Arrays.equals(findStartAndEndIndex(data,k), new int[] {-1,-1}));
		
	}
	
	@Test
	public void test3() {
		int[] data = {};
		int k = 0;
		Assert.assertTrue(Arrays.equals(findStartAndEndIndex(data,k), new int[] {-1,-1}));
		
	}
	
	@Test
	public void test4() {
		int[] data = {5,8,8,8,8,10};
		int k = 8;
		Assert.assertTrue(Arrays.equals(findStartAndEndIndex(data,k), new int[] {1,4}));
		
	}
	
	@Test
	public void test5() {
		int[] data = {5,8,8,8,8,10};
		int k = 5;
		Assert.assertTrue(Arrays.equals(findStartAndEndIndex(data,k), new int[] {0,0}));
		
	}

	private int[] findStartAndEndIndex(int[] data,int k) {
		int low=0,high=data.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(data[mid]==k && data[low]==data[high]) return new int[] {low,high};
			else if(data[mid]==k && data[low]<k) low++;
			else if(data[mid]==k && data[high]>k) high--;
			else if(data[mid]>k) high = mid-1;
			else low = mid+1;
		}
		return new int[] {-1,-1};
	}

}
