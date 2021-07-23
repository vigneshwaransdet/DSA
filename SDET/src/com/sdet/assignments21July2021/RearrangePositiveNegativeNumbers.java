package com.sdet.assignments21July2021;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
 * Question:
 * 
 * 	array of nums, contains equal no of positve and negative, rearrange in an order +ve and then -ve in alternate positions.
	Constraint: cannot use extra space
	eg : int[] input = {12, -90, -100, 15, 98, 99, -56, -2};
	expected output {12, -90, 15, -100, 98,-56,99,-2} or {12,-100,98,-56,99,-2,15,-90}
 * 
 * 1. Inout -> int[] array
 * 2. Ouput -> int[] array
 * 3. Constraints -> Time Complexity -> 
 * 					 and Space Complexity -> O(1)
 * 
 * 4. Test Data Set
 * 		Positive ->
 * 		Neagtive ->
 * 		Edge -> 
 * 
 * 5. Ask for Hint -> 
 * 
 * 6. Approaches to Solve:
 * 		Brute Force
 * 		Optimized
 * 
 * 7. Pseudo code:
 * 	-
 * 
 */

public class RearrangePositiveNegativeNumbers {
	
	@Test
	public void test1() {
		int[] data = {12, -90, -100, 15, 98, 99, -56, -2};
		Assert.assertTrue(Arrays.equals(testMethod(data), new int[] {12, -100, 15, -90, 98, -56, 99, -2}));
	}
	
//	@Test
	public void test2() {
		int[] data = {};
	}

	private int[] testMethod(int[] data) {
		int slow = 0,fast=1;
		for (int i = 0; i < data.length;i++) {
			if(data[slow]>0) slow++;
			if(fast<data.length && data[fast]>0) {
				if(data[slow]<0 && data[fast]>0) {
				int temp=data[fast];
				data[fast] = data[slow];
				data[slow] = temp;
				}
			}
			fast++; 
		}
		System.out.println(fast);
		System.out.println(slow);
		System.out.println(Arrays.toString(data));
		int[] arr = new int[data.length];
		int left = 0,right=slow;
		for (int i = 0; i < data.length; i+=2) {
			arr[i] = data[left];
			arr[i+1] = data[right];
			left++;
			right++;
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}

}
