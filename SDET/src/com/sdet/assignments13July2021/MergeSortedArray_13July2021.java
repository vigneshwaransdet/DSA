package com.sdet.assignments13July2021;

import org.junit.Assert;
import org.junit.Test;

/*
P1) Merge Sorted Array

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, 
but instead be stored inside the array nums1. 
To accommodate this, nums1 has a length of m + n, 
where the first m elements denote the elements that should be merged, 
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 
Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

Example 2:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 * 
 * 
 * Problems Solving Techniques:
 * 1. Do I understand the problem? -Yes
 * a) What is the input? -> int[] array1 and int[] array2, two integers
 * b) What is the output> -> int[]
 * c) Do I have constraints to solve the problem? 
 * 		-> Yes 
 * 			Constraints: Should use Two Pointer technique, Time complexity -> O(n)
			
 * d) Do I have all the informations to go to next step? -> Yes
 * e) How big is your test data will be? -> 
 * 
 * 2. Test Data Set
 * Positive -> 
 * Negative ->
 * Edge ->
 * 
 * 3.Do I know how to solve it? - Yes 
 * yes -> Is there an alternate? 
 * 
 * 4. Ask for hint 
 *
 * 5. Do I know alternate solutions as well?
 * 		yes -> what are those? 
 * 		No -> Using HashMap
 * 6. If you know the alternate solutions? 
 * Find out the 'O' notations
 * Then explain either both or the best
 * Approach 1: Start with worst -> Using Brute Force
 * Approach 2: Write down the options and the benefits of the code
 * 
 * 7.Pseudo Code 
 * -Traverse through the while loop until the integers were less than "Zero"
 * -check condition for either from array1 or array2 which one is having smaller element
 * -if it is smaller, then add it to the least place else move the element to the last index in array 1  
 * -check condition whether array2 is fully iterated until "0" or not
 * -if true then traverse the array2 until its lesser then "0"
 * 
 * 
 * 8.Implement them in the code
 * 9.Debug /Test against the different data set
 * 10.If it fails, debug them to solve it 
 */

public class MergeSortedArray_13July2021 {
	
	@Test
	public void test1() {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m = 3,n=3;
		Assert.assertArrayEquals(new int[] {1,2,2,3,5,6}, mergedSortArrayMethod(nums1,nums2,m,n));
	}
	
//	@Test
	public void test2() {
		int[] nums1 = {0};
		int[] nums2 = {1};
		int m = 0,n=1;
		Assert.assertArrayEquals(new int[] {1}, mergedSortArrayMethod(nums1,nums2,m,n));
	}
	
	private int[] mergedSortArrayMethod(int[] nums1, int[] nums2,int m,int n) {
		
		while(m>0 && n>0) {
			if(nums1[m-1]<nums2[n-1]) {
				nums1[m+n-1]=nums2[n-1];
				n--;
			}
			else {
				nums1[m+n-1] = nums1[m-1];
				m--;
			}
			
		}
		
		while(n>0) {
			nums1[m+n-1]=nums2[n-1];
			n--;
		}
		
		return nums1;
	}
}
