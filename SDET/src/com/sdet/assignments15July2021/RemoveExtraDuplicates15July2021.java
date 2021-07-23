package com.sdet.assignments15July2021;

import org.junit.Test;

import junit.framework.Assert;

/*
 * 2) Given a sorted array nums, remove the duplicates in-place such that duplicates appeared 
 * 	  at most twice and return the new length.
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
 * 1. Understood
 * 	-input - int[] nums
 *  -output - integer 
 *  -all info - yes
 *  -constraints - yes -> Space Complexity O(1) 
 *  
 *  Pseudo Code
 *  -Declare two int var i = 0 and k = 2
 *  -traverse the array until its end of the length
 *  -check if i < k OR current array element > arr[i-k]
 *  -if true, assign current element to same input array  
 *  -return the i value once loop ends
 *  
 */


public class RemoveExtraDuplicates15July2021 {
	
	@Test
	public void test1() {
		int[] nums = {1,1,1,2,2,3};
		Assert.assertEquals(findDuplicatesWithTwiceAlone(nums), 5);
	}
	
	@Test
	public void test2() {
		int[] nums = {0,0,1,1,1,1,2,3,3};
		Assert.assertEquals(findDuplicatesWithTwiceAlone(nums), 7);
	}
	
	

	private int findDuplicatesWithTwiceAlone(int[] nums) {
		int i = 0,k = 2;
		
		for (int n : nums) {
			if(i < k || n > nums[i-k]) {
				nums[i++] = n;
			}
		}
		System.out.println(i);
		return i;
	}
	
	

}
