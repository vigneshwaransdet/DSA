package com.sdet.assignments;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
 * Given an integer array, move odd elements following with the even elements
 * 
 * input[] arr = [2,5,4,3,6]   
 * output[] arr = [2,4,6,3,5] or [6,2,4,5,3]
 * 
 * Do I understand this problem? - Yes
 * 	- input -> int[] array
 * 	- output -> int[] array
 * 	- Do i have any constraints? -> Two pointer technique, Time complexity -> O(n), Space Complexity -> O(1) 
 *  - Do I have all the informations? 
 *  
 * Test Data Set:
 * Positive -> [2,5,4,3,6]
 * Negative -> [2,4,6,8]
 * Edge -> 
 * 
 * Do I have any alternate Solutuons?
 * Yes - > Two pointer technique and brute force 
 * 
 * Pseudo Code
 * - Declare the left and right intergers and init as left = 0, right = length-1
 * - Traverse through until left and right pointers less than the array length
 * - check condition left elementy is even or odd and right element is even or odd
 * 
 */

public class SpotProblem {
	
	@Test
	public void test1() {
		int[] arr = {2,5,4,3,6};
		Assert.assertTrue(Arrays.equals(testMethod(arr),new int[] {2,4,6,5,3}));
		
	}
	
	@Test
	public void test2() {
		
		int[] arr = {-3,-1,-5,-2,-4,-6};
		Assert.assertTrue(Arrays.equals(testMethod(arr),new int[] {2,4,6,5,3}));
	}
	
	@Test
	public void test3() {
		
		int[] arr = {7,3,5,7,6,8};
		Assert.assertTrue(Arrays.equals(testMethod(arr),new int[] {2,4,6,5,3}));	
	}
	
	private int[] testMethod(int[] arr) {
		int left=0,right=arr.length-1;
		
		while(left<right) {
			if(arr[left]%2!=0 && arr[right]%2==0) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
//			    L
//			2 6 4 3 5
//				  R
			else if(arr[left]%2==0) {
				left++;
			}
			
			else if(arr[right]%2!=0) {
				right--;
			}
		}
		
		return arr;
	}

}
