package com.sdet.assignments19July2021;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
 * Given a sorted array of distinct integers and a target value, 
 * return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
 
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
Example 4:
Input: nums = [1,3,5,6], target = 0
Output: 0
 * 
 * 1. input -> int[] array and target as int
 * 2. output -> int
 * 3. constraints -> Time Complexity -> O(log n)
 * 4. Test Data Set
 * 		Positive -> [1,3,5,6] , target = 5
 * 		Negative -> [1,3,5,6] , target = 2
 * 		Edge -> [1,3,5,6] , target = 7 and [1,3,5,6] , target = 0
 * 
 * Pseudo Code:
 * -init var low and high as 0 and length of the array-1
 * -traverse through the array until low less than or equal to high
 * -if array of mid value is equal to target 
 * 		then return index of mid value
 * else if array of mid value less than target 
 * 		then assign mid+1 to low
 * else assign mid-1 to high
 * once loop ends then return low
 * 
 */

public class ReturnTheIntegerIfTargetFound19July2021 {
	
	@Test
	public void test1() {
		int[] data = {1,3,5,6};
		int k = 5;
		Assert.assertEquals(findTargetIndex(data,k), 2);
	}
	
	@Test
	public void test2() {
		int[] data = {1,3,5,6};
		int k = 2;
		Assert.assertEquals(findTargetIndex(data,k), 1);
	}
	
	@Test
	public void test3() {
		int[] data = {1,3,5,6};
		int k = 7;
		Assert.assertEquals(findTargetIndex(data,k), 4);
	}
	
	@Test
	public void test4() {
		int[] data = {1,3,5,6};
		int k = 0;
		Assert.assertEquals(findTargetIndex(data,k), 0);
	}

	private int findTargetIndex(int[] data, int k) {
		int low = 0,high=data.length-1;
		while(low<=high) {
			int mid = low + (high-low)/2;
			if(data[mid]==k) return mid;
			else if(data[mid]<k) low = mid+1;
			else high = mid-1;
		}
		return low;
	}

}
