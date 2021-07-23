package com.sdet.assesments.one;

import org.junit.Assert;
import org.junit.Test;

/*
 Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, 
and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.

Example 3:
Input: digits = [0]
Output: [1]

 * 
 * 
 * 
 * 
 */

public class Assesment3_One {
	
	@Test
	public void test1() {
		int[] arr = {1,2,3}; 
		Assert.assertArrayEquals(new int[] {1,2,4}, increaseToOneNumber(arr));
		
	}
	
	@Test
	public void test2() {
		int[] arr = {9,9,9};
		Assert.assertArrayEquals(new int[] {1,0,0,0}, increaseToOneNumber(arr));
		
	}
	
	private int[] increaseToOneNumber(int[] arr) {
		
		for (int i = arr.length-1; i >=0; i--) {
			
			if(arr[i]<9) {
				arr[i] = arr[i]+1; 
				return arr;
			}
			else {
				arr[i] = 0;
			}
		}
		int[] output = new int[arr.length+1];
		output[0] = 1;
		return output;
	}
	
	
}
