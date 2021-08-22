package com.sdet.classtimetasks21Aug2021;

import org.junit.Assert;
import org.junit.Test;

/*
 * Question 1: 
Count the number of strictly increasing subarray of a specified size k in an array of size N.
Example 1:
int[] nums = [ 5,3,5,7,8] and k=3 , 
The answer is 2 as [3,5,7] and [5,7,8] are the sub arrays.
Example 2:
int[] nums = [ 5,3,5,7,8] and k=2 , 
The answer is 3 as [3,5] and [5,7] and [7,8] are the sub arrays.
 * 
 * 
 */

public class CountTheNumberForIncreasingOrderElements {
	@Test
	public void test1() {
		int[] nums = {5,3,5,7,8};
		int k = 3;
		Assert.assertEquals(toFindCountTheNumberForIncreasingOrderElements(nums,k), 2);
	}
	
	@Test
	public void test2() {
		int[] nums = {5,3,5,7,8};
		int k = 2;
		Assert.assertEquals(toFindCountTheNumberForIncreasingOrderElements(nums,k), 3);
	}

	private int toFindCountTheNumberForIncreasingOrderElements(int[] nums, int k) {
		int left = 0, right = 1;
		int count = 1;
		int res=0;
		while(left < nums.length && right < nums.length) {
			if(nums[left] < nums[right]) {
				count++;
				if(count==k) {
					res++;
					left++;
					right=left;
					count=1;
				}
			}
			else {
				left++;
			}
			right++;
		}
		return res;
	}
}
