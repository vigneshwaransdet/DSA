package com.sdet.assignments18July2021;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
 * P1) Given an array nums of integers and integer k,
 *  return the maximum sum such that there exists i < j with nums[i] + nums[j] = sum and sum < k. 
 *  If no i, j exist satisfying this equation, return -1.
 
Example 1:

Input: nums = [34,23,1,24,75,33,54,8], k = 60
Output: 58
Explanation: We can use 34 and 24 to sum 58 which is less than 60.
 * 
 * 1. input -> int[] array and target int
 * 2. output -> int
 * 3. constraints -> Use Binary Search
 * 4. Ask for a hint -> Need hint for the Binary Search Technique for one test data given below
 * 			int[] arr [1,8,24,26,33,34,54,75], target = 60
 * 5. 
 */

public class MaxSumLessThanTarget18July2021 {

	@Test
	public void test1UsingBruteForce() {
		int[] data = { 34, 23, 1, 24, 75, 33, 54, 8 };
		int target = 60;
		Assert.assertEquals(returnMaxSumLessThanTargetUsingBruteForce(data, target), 58);
	}

	@Test
	public void test2UsingBruteForce() {
		int[] data = { 10, 20, 30 };
		int target = 15;
		Assert.assertEquals(returnMaxSumLessThanTargetUsingBruteForce(data, target), -1);
	}

	@Test
	public void test1UsingTwoPointers() {
		int[] data = { 34, 23, 1, 24, 75, 33, 54, 8 };
		int target = 60;
		Assert.assertEquals(returnMaxSumLessThanTargetUsingTwoPointers(data, target), 58);
	}

	@Test
	public void test2UsingTwoPointers() {
		int[] data = { 10, 20, 30 };
		int target = 15;
		Assert.assertEquals(returnMaxSumLessThanTargetUsingTwoPointers(data, target), -1);
	}

	private int returnMaxSumLessThanTargetUsingBruteForce(int[] data, int target) {
		int sum = 0, max = -1;
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] + data[j] < target) {
					sum = data[i] + data[j];
					max = Math.max(max, sum);
				}
			}
		}
		return max;
	}

	private int returnMaxSumLessThanTargetUsingTwoPointers(int[] data, int target) {
		int left = 0, right = data.length - 1, sum = 0, max = -1;
		Arrays.sort(data);
		while (left < right) {
			if (data[left] + data[right] > target)
				right--;
			else {
				sum = data[left] + data[right];
				max = Math.max(max, sum);
				left++;
			}
		}

		return max;
	}

}
