package com.mockinterview03Aug2021;

import java.util.Arrays;

import org.junit.Test;

public class FirstMissingPositive {
	@Test
	public void test1() {
		int[] nums = {3,0,1};
		toFirstMissingPositive(nums);
	}
	
	@Test
	public void test2() {
		int[] nums = {0,1};
		toFirstMissingPositive(nums);
	}
	
	@Test
	public void test3() {
		int[] nums = {9,6,4,2,3,5,7,0,1};
		toFirstMissingPositive(nums);
	}
	
	@Test
	public void test4() {
		int[] nums = {0};
		toFirstMissingPositive(nums);
	}
	@Test
	public void test5() {
		int[] nums = {0,1,2};
		toFirstMissingPositive(nums);
	}
	
	@Test
	public void test6() {
		int[] nums = {7,8,11,12};
		toFirstMissingPositive(nums);
	}

	private int toFirstMissingPositive(int[] nums) {
		Arrays.sort(nums);
		int max = nums[nums.length-1];
		if(max == 1 || max == 0) {
			max+=1;
		}
		int[] arr = new int[max];
		int i;
		int min = Integer.MAX_VALUE;
		for (i = 0; i < arr.length; i++) {
			if(nums.length == arr.length) {
				
			}
			if(nums[i]>0 && nums[i]!=i) {
				min = Math.min(min, i);
				System.out.println(min);
				return min;
			}
			
		}
		if(i>=arr.length ) {
			min = i;
		}
		else min = i+1;
		System.out.println(min);
		return min;
	}
}
