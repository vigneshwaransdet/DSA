package com.sdet.assignments;

import org.junit.Assert;
import org.junit.Test;

/*
 3)Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 
Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]

Example 3:

Input: nums = [0]
Output: [0]
 *
 * 10 Problems Solving Techniques:
 * 1. Do I understand the problem? -Yes
 * a) What is the input? -> int[] array
 * b) What is the output> -> int[] array
 * c) Do I have constraints to solve the problem? TC -> best case=O(n log n),worst case=O(n),SC -> O(n)
 * d) Do I have all the informations to go to next step? -> Yes
 * e) How big is your test data will be? -> 
 * 
 * 2. Test Data Set
 * Positive -> int[] = {2,0,2,1,1,0},output[] = {0,0,1,1,2,2} || input[] = {2,0,1}, output[] = {0,1,2} 
 * Negative -> int[] = {}, output[] = {-1}
 * Edge -> int[] = {0},output[] = {0} 
 * 
 * 3.Do I know how to solve it? - Yes 
 * yes -> Is there an alternate? - Using Quick Sort Algorithm and Brute Force
 * 
 * 4. Ask for hint - how to solve this 3 pointer approach?
 *
 * 5. Do I know alternate solutions as well?
 * 		yes -> what are those? 
 * 		No -> 
 * 6. If you know the alternate solutions? 
 * Find out the 'O' notations -> O(n logn)
 * Then explain either both or the best
 * Approach 1: Start with worst -> Using Brute Force
 * Approach 2: Write down the options and the benefits of the code -> Use Quick Sort Algorithm
 * 
 * 7.Pseudo Code for Quick Sort Algorithm
 * -to find the pivot element -> assume last element is the pivot
 * -swap the array elements to find the pivot's right place
 * -replace the pivot element from last position to the correct position
 * -again split array as right and left sub-arrays from pivot's position
 * -do the quick sort technique for left and right sub-arrays
 * 
 * 8.Implement them in the code
 * 9.Debug /Test against the different data set
 * 10.If it fails, debug them to solve it 
 */

public class ToSortColors10Jul2021 {

	@Test
	public void test1() {
		int[] arr = {2,0,2,1,1,0}; 
//		Assert.assertArrayEquals(new int[] {0,0,1,1,2,2}, toSortColors(arr,0,arr.length-1));
//		System.out.println(usingThreePointer(arr));
		Assert.assertArrayEquals(new int[] {0,0,1,1,2,2}, usingThreePointer(arr));
	}
	
	@Test
	public void test2() {
		int[] arr = {2,0,1}; 
//		Assert.assertArrayEquals(new int[] {0,1,2}, toSortColors(arr,0,arr.length-1));
		Assert.assertArrayEquals(new int[] {0,1,2}, usingThreePointer(arr));
	}
	
	@Test
	public void test3() {
		int[] arr = {}; 
//		Assert.assertArrayEquals(new int[] {-1}, toSortColors(arr,0,arr.length-1));
		Assert.assertArrayEquals(new int[] {-1}, usingThreePointer(arr));
	}
	
	@Test
	public void test4() {
		int[] arr = {0}; 
//		Assert.assertArrayEquals(new int[] {0}, toSortColors(arr,0,arr.length-1));
		Assert.assertArrayEquals(new int[] {0}, usingThreePointer(arr));
	}
	
//	Use Quick Sort Algorithm
//	private int[] toSortColors(int[] arr,int low,int high) {
//		if(arr.length==0) return new int[] {-1};
//		if(low<high) {
//			int pi = partition(arr,low,high);
//			toSortColors(arr,low,pi-1);
//			toSortColors(arr,pi+1,high);
//		}
//		return arr;
//	}
//	
//	private int partition(int[] arr,int low,int high) {
//		int i = (low-1);
//		int pivot = arr[high];
//		
//		for(int j=low;j<high;j++) {
//			if(arr[j]<pivot) {
//				i++;
//				swap(arr,j,i);
//			}
//		}
//		swap(arr,high,i+1);
//		return i+1;
//	}
//	
//	private void swap(int[] arr,int j,int i) {
//		int temp = arr[i];
//		arr[i]=arr[j];
//		arr[j]=temp;
//	}
	
	// Use 3 pointer approach
	private int[] usingThreePointer(int[] arr) {
		int low = 0;
		int  mid = 0;
		int high = arr.length-1;
		boolean flag=false;
		if(arr.length==0) return new int[] {-1};
		for(int i=0;i<arr.length;i++) {
			if(arr[low]==0){
				int temp = arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
				flag=true;
			}
			else if(arr[low]==2) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				high--;
				flag=true;
			}
			else {
				mid++;
				flag=true;
			}
		}
		if(flag==true) return arr;
		else return new int[] {-1};
	}
}
