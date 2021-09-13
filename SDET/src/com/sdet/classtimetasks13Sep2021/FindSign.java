package com.sdet.classtimetasks13Sep2021;

import org.junit.Assert;
import org.junit.Test;


/*
 * Question: 1822. Sign of the Product of an Array
 * Input -> int[]
 * Output -> int
 * Constraints -> TC - O(n)
 * 
 * Pseudocode:
 * 
 * 
 * 
 */


public class FindSign {
	@Test
	public void test1() {
		int[] nums = {-1,-2,-3,-4,3,2,1};
		Assert.assertEquals(toFindSign(nums), 1);
		
	}
	
	@Test
	public void test2() {
		int[] nums = {1,5,0,2,-3};
		Assert.assertEquals(toFindSign(nums), 0);
		
	}
	
	@Test
	public void test3() {
		int[] nums = {-1,1,-1,1,-1};
		Assert.assertEquals(toFindSign(nums), -1);
		
	}
	@Test
	public void test4() {
		int[] nums = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
		Assert.assertEquals(-1, toFindSign(nums));
		
	}	
	@Test
	public void test5() {
		int[] nums = {1,5,0,2,-3};
		Assert.assertEquals(toFindSign(nums), 0);
		
	}
			
	private int toFindSign(int[] nums) {
		int res = 1;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==0) return 0;
			res*=nums[i] < 0 ? -1 : 1;
		}
		return res;
	}
}
