package com.sdet.classtimetasks13Sep2021;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SortColors {
	@Test
	public void test1() {
		int[] nums = {2,0,2,1,1,0};
		Assert.assertTrue(Arrays.equals(toSortColors(nums), new int[] {0,0,1,1,2,2}));
	}
	
	@Test
	public void test2() {
		int[] nums = {2,0,1};
		Assert.assertTrue(Arrays.equals(toSortColors(nums), new int[] {0,1,2}));
	}
	
	@Test
	public void test3() {
		int[] nums = {0};
		Assert.assertTrue(Arrays.equals(toSortColors(nums), new int[] {0}));
	}
	
	@Test
	public void test4() {
		int[] nums = {1};
		Assert.assertTrue(Arrays.equals(toSortColors(nums), new int[] {1}));
	}


	private int[] toSortColors(int[] nums) {
		int low=0,mid=0,high=nums.length-1;
		while(mid<=high) {
			if(nums[mid]==0) {
				int temp = nums[low];
				nums[low] = nums[mid];
				nums[mid] = temp;
				low++;mid++;
			}
			else if(nums[mid]==1) {
				mid++;
			}
			else if(nums[mid]==2) {
				int temp = nums[high];
				nums[high] = nums[mid];
				nums[mid] = temp;
				high--;
			}
		}
		System.out.println(Arrays.toString(nums));
		return nums;
	}

}
