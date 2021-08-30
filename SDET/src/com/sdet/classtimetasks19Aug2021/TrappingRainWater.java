package com.sdet.classtimetasks19Aug2021;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class TrappingRainWater {
	@Test
	public void test1() {
		int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
		Assert.assertEquals(toFindTrappingRainWater(nums), 6);
	}

	private int toFindTrappingRainWater(int[] nums) {
		int[] leftMax = new int[nums.length];
		int[] rightMax = new int[nums.length];
		int cMax = nums[0];
		for(int i=0;i<nums.length-1;i++) {
			cMax = Math.max(cMax,nums[i]);
			leftMax[i] = cMax;
		}
		System.out.println(Arrays.toString(leftMax));
		cMax = nums[nums.length-1];
		for (int i = nums.length-1; i >=0; i--) {
			cMax = Math.max(cMax,nums[i]);
			rightMax[i] = cMax;
		}
		System.out.println(Arrays.toString(rightMax));
		int count = 0;
		for (int i = 1; i < nums.length-1; i++) {
			count += ((Math.min(leftMax[i], rightMax[i]))-nums[i]);
		}
		System.out.println(count);
		return count;
	}
	
}
