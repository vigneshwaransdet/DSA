package com.sdet.assignments18July2021;

import org.junit.Test;

import junit.framework.Assert;

/*
 * You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once. Find this single element that appears only once.
Follow up: Your solution should run in O(log n) time and O(1) space.
 
Example 1:
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
Example 2:
Input: nums = [3,3,7,7,10,11,11]
Output: 10
 * 
 * 1. input -> int[] arr
 * 2. output -> int
 * 3. constraints -> Time complexity -> O(log n) and space complexity -> O(1) 
 * 4. test data
 * 		positive -> [1,1,2,3,3,4,4,8,8]
 * 		negative -> []
 * 		Edge -> [1,1,2,2,3,3,4]
 * 
 * 5.Alternate Solutions -> Binary Search Algorithm
 * 
 * Pseudo Code
 * Declare low =0, high= array.length-1
 * check condition low<high
 * Declare mid = (low+high)/2
 * check if mid != mid-1 && mid != mid+1 return arr[mid]
 * check mid == mid-1, then check (mid-1) - low == odd, then move high to mid-1  
 * else low = mid+1
 * 
 */


public class SortedArrayFindUniqueNumber18July2021 {
	
//	@Test
	public void test1() {
		int[] nums = {1,1,2,3,3,4,4,8,8};
		Assert.assertEquals(findUniqueElement(nums), 2);
	}
	
	@Test
	public void test2() {
		int[] nums = {3,3,7,7,10,11,11};
		Assert.assertEquals(findUniqueElement(nums), 10);
	}
	
	@Test
	public void test3() {
		int[] nums = {3};
		Assert.assertEquals(findUniqueElement(nums), 3);
	}
	
	@Test
	public void test4() {
		int[] nums = {};
		Assert.assertEquals(findUniqueElement(nums), 0);
	}
	
	@Test
	public void test5() {
		int[] nums = {1,1,2,2,3,3,4};
		Assert.assertEquals(findUniqueElement(nums), 4);
	}
	
	private int findUniqueElement(int[] nums) {
		if(nums.length==0) return 0;
		int low=0,high=nums.length-1;
		if(high==0) return nums[low];
		if(nums[low]!=nums[low+1]) return nums[low];
		if(nums[high]!=nums[high-1]) return nums[high];
		while(low<=high) {
			int mid = low + (high-low)/2;
			if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];
			else if((mid%2)==0 && nums[mid]==nums[mid+1] || (mid%2)!=0 && nums[mid]==nums[mid-1]) low = mid+1;
			else high = mid-1;
				
		}
		return -1;
	}

}
