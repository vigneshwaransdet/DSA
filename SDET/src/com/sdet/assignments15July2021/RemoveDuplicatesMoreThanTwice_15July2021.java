package com.sdet.assignments15July2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

/*
 * 2) Given a sorted array nums, remove the duplicates in-place such that duplicates 
 * appeared at most twice and return the new length.
   Do not allocate extra space for another array; 
   you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:
Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3]
Explanation: Your function should return length = 5, 
with the first five elements of nums being 1, 1, 2, 2 and 3 respectively. 
It doesn't matter what you leave beyond the returned length.

Example 2:
Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3]
Explanation: Your function should return length = 7, 
with the first seven elements of nums being modified to 0, 0, 1, 1, 2, 3 and 3 respectively. 
It doesn't matter what values are set beyond the returned length.
 * 
 * 
 */

public class RemoveDuplicatesMoreThanTwice_15July2021 {

	@Test
	public void test1() {
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		Assert.assertEquals(removeDuplicatesIfMoreThanTwice(nums), 5);
	}

	private int removeDuplicatesIfMoreThanTwice(int[] nums) {

		int left=0,right=1;
		while(left<nums.length-1) {
			if(nums[left]==nums[left+2]) {
				left++;
			}
			else {
				nums[right+1]=nums[right+2];
				right++;
				left++;
			}
		}
		
		System.out.println(Arrays.toString(nums));
		

		return 5;
	}

}
