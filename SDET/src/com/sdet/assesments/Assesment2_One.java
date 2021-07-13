package com.sdet.assesments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/*
 * Given two integer arrays nums1 and nums2, return an array of their intersection. 
 * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

   Example 1:
   Input: nums1 = [1,2,2,1], nums2 = [2,2]
   Output: [2,2]
   
   Example 2:
   Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
   Output: [4,9]
   Explanation: [9,4] is also accepted.
 * 
 * Problems Solving Techniques:
 * 1. Do I understand the problem? -Yes
 * a) What is the input? -> int[] array
 * b) What is the output> -> Output[] array
 * c) Do I have constraints to solve the problem? 
 * 		-> Yes 
 * 			Constraints:
			1 <= nums1.length, nums2.length <= 1000
			0 <= nums1[i], nums2[i] <= 1000
 * d) Do I have all the informations to go to next step? -> Yes
 * e) How big is your test data will be? -> 
 * 
 * 2. Test Data Set
 * Positive -> 
 * Negative ->
 * Edge ->
 * 
 * 3.Do I know how to solve it? - Yes 
 * yes -> Is there an alternate? - 
 * 
 * 4. Ask for hint - 
 *
 * 5. Do I know alternate solutions as well?
 * 		yes -> what are those? 
 * 		No -> Using Two Pointer Approach
 * 6. If you know the alternate solutions? 
 * Find out the 'O' notations
 * Then explain either both or the best
 * Approach 1: Start with worst -> Using Brute Force
 * Approach 2: Write down the options and the benefits of the code
 * 
 * 7.Pseudo Code 
 * -
 * - 
 * -  
 * -	
 * -
 * -
 * 
 * 8.Implement them in the code
 * 9.Debug /Test against the different data set
 * 10.If it fails, debug them to solve it 
 */

public class Assesment2_One {
	
	@Test
	public void test1() {
		int[] nums1= {1,2,2,1}; //{1,1,2,2}
		int[] nums2= {2,2};
		Assert.assertArrayEquals(new int[] {2,2}, findIntersectionElements(nums1,nums2));
	}
	
	@Test
	public void test2() {
		int[] nums1= {4,9,5};
		int[] nums2= {9,4,9,8,4};
		Assert.assertArrayEquals(new int[] {4,9}, findIntersectionElements(nums1,nums2));
	}
	
	
	private int[] findIntersectionElements(int[] nums1,int[]nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		List<Integer> output = new ArrayList<>();
		int left=0,right=0;
		while(left < nums1.length && right < nums2.length) {
			if(nums1[left] < nums2[right]) {
				left++;
			}
			else if(nums2[right] < nums1[left]) {
				right++;
			}
			
			else {
				output.add(nums2[right++]);
				left++;
			}
		}
		
		int[] finalOPRes=new int[output.size()];
		int index=0;
		for (int finalOP : output) {
			finalOPRes[index++] = finalOP;
		}
		
		return finalOPRes;
	}

}
