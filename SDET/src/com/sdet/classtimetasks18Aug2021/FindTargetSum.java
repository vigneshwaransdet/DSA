package com.sdet.classtimetasks18Aug2021;

import org.junit.Assert;
import org.junit.Test;

/*
 * Problem 1)
Given an int array [1,4,20,3,10,5] and target sum 33.
If target subarray sum is found, return true else false
Time : 20 Minutes 
- Write another 2 test data (edge and neg)
- Pseudo Code for Optimised Solution
- Code, Debug
- Time everything 
- Do it yourself !
 * 
 * Pseudocode:
 * init left and right pointers as 0 and 1
 * iterate the array until matches with the target sum
 * if yes,
 * 		return true
 * else,
 * 		increment the left pointer and re-assign the right as left+1
 * 
 * if no target sum matches with this array elements,
 * finally return false.
 * 
 * Time:
 * Pseudocode - 4 mins
 * 
 * 
 */

//abbcafcd
//bcaf

public class FindTargetSum {
	
	@Test
	public void test1() {
		int[] data = {1,4,20,3,10,5};
		int target = 33;
		Assert.assertEquals(testMethod(data,target), true);
	}
	
	@Test
	public void test2() {
		int[] data = {1,2,20,3,10,5};
		int target = 5;
		Assert.assertEquals(testMethod(data,target), true);
	}
	
	@Test
	public void test3() {
		int[] data = {1,4,20,3,10,5};
		int target = 50;
		Assert.assertEquals(testMethod(data,target), false);
	}

	private boolean testMethod(int[] data,int k) {
		int left=0,right=1;
		int currentSum=data[left];
		while(left<data.length) {
			if(currentSum==k) return true;
			else if(currentSum<k && right<data.length) {
				currentSum+=data[right];	
				right++;
			}
			else {
				currentSum-=data[left];
				left++;
			}
		}
		return false;
	}
	
}
