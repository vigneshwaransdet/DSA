package com.mockinterview03Aug2021;

import java.util.Arrays;

import org.junit.Test;

/*
 * For Valli,
Given an array of integers, find the smallest positive int which is missing number.

input: int[] arr = {3,5,7,9};
output: int - 1

input: int[] arr = {1,5,7};
output: int - 2

input: int[] arr = {-3,-5,2,4};
output: int - 1
 * 
 * 
 * 
 */

public class SmallestPositive {
	@Test
	public void test1() {
		int[] nums = {1,2,0};
	}
	
	@Test
	public void test2() {
		int[] nums = {1,2,0};
	}
	
	 public int singleNumber(int[] nums) {
	        int left=0,right=1;
	        Arrays.sort(nums);
	        while(left<nums.length && right<nums.length){
	            if(nums[left]!=nums[right]){
	                return nums[left];
	            }
	            left+=2;right+=2;
	        }
	        return nums[left];
	    }
	    

}
