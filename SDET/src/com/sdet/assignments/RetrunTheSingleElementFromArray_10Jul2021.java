package com.sdet.assignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

/*
 * 1) Given a non-empty array of integers nums, every element appears twice except for one. 
 * Find that single one. You must implement a solution with a linear runtime complexity and use only constant extra space.
 * 
 * 	Example 1:                i
 *	Input: nums = [2,2,1] // [1,2,2] 
 *	Output: 1	                  j
 *
 *	Example 2:       s
 *	Input: nums = [2,4,1,2,1,2]
 *	Output: 4                f
 *
 *	Example 3:
 *	Input: nums = [1]
 *	Output: 1
 *
 *	Example 3:	   i	
 *	Input: nums = [1,1]
 *	Output: -1       j
 *
 * 10 Problems Solving Techniques:
 * 1. Do I understand the problem? -Yes
 * a) What is the input? -> int[] array
 * b) What is the output> -> int 
 * c) Do I have constraints to solve the problem? 
 * 		-> Yes -> Array shouldn't empty, Time Complexity O(n) and Space Complexity O(1)
 * d) Do I have all the informations to go to next step? -> Yes
 * e) How big is your test data will be? -> need to ask
 * 
 * 2. Test Data Set
 * Positive -> int[] arr = {2,2,1},{4,1,2,1,2},
 * Negative -> int[] arr = {2,2,5,5}
 * Edge -> int[] arr = {1}
 * 
 * 3.Do I know how to solve it? - Yes 
 * yes -> Is there an alternate? - Yes
 * 
 * 4. Ask for hint - how to solve this 2 pointer approach?
 *
 * 5. Do I know alternate solutions as well?
 * 		yes -> what are those? 
 * 		No -> Brute Force
 * 6. If you know the alternate solutions? 
 * Find out the 'O' notations
 * Then explain either both or the best
 * Approach 1: Start with worst -> Using Brute Force
 * Approach 2: Write down the options and the benefits of the code
 * 
 * 7.Pseudo Code for Bitwsie XOR
 * -Declare the variable "result" and initialize as "0"
 * -Traverse through for-each loop for all the elements
 * -XOR with result variable for the first time and store it in the result variable itself. 
 * -Now result XOR with array elements and store it in the result variable	
 * -return the result 
 * 
 * 8.Implement them in the code
 * 9.Debug /Test against the different data set
 * 10.If it fails, debug them to solve it 
 */

public class RetrunTheSingleElementFromArray_10Jul2021 
{
	@Test
	public void test1(){
		int[] arr = {2,2,1};
//		Assert.assertEquals(1, findUniqueElementUsingTwoPointer(arr));
		Assert.assertEquals(1, findUniqueElementUsingBitwiseXOR(arr));
//		Assert.assertEquals(1, findUniqueElementUsingHashMapWithAdd(arr)); 
//		Assert.assertEquals(1, findUniqueElementUsingHashMapWithRemove(arr));
	}
	
	@Test
	public void test2(){
		int[] arr = {4,1,2,1,2}; // {1,1,2,2,4}
//		Assert.assertEquals(4, findUniqueElementUsingTwoPointer(arr));
		Assert.assertEquals(4, findUniqueElementUsingBitwiseXOR(arr));
//		Assert.assertEquals(4, findUniqueElementUsingHashMapWithAdd(arr));
//		Assert.assertEquals(4, findUniqueElementUsingHashMapWithRemove(arr));
	}
	
	@Test
	public void test3(){
		int[] arr = {1};
//		Assert.assertEquals(1, findUniqueElementUsingTwoPointer(arr));
		Assert.assertEquals(1, findUniqueElementUsingBitwiseXOR(arr));
//		Assert.assertEquals(1, findUniqueElementUsingHashMapWithAdd(arr));
//		Assert.assertEquals(1, findUniqueElementUsingHashMapWithRemove(arr));
	}
	
	@Test
	public void test4(){
		int[] arr = {1,1};
//		Assert.assertEquals(-1, findUniqueElementUsingTwoPointer(arr));
		Assert.assertEquals(0, findUniqueElementUsingBitwiseXOR(arr));
//		Assert.assertEquals(0, findUniqueElementUsingHashMapWithAdd(arr));
//		Assert.assertEquals(0, findUniqueElementUsingHashMapWithRemove(arr));
	}
	
	@Test
	public void test5(){
		int[] arr = {};
//		Assert.assertEquals(-1, findUniqueElementUsingTwoPointer(arr));
		Assert.assertEquals(-1, findUniqueElementUsingBitwiseXOR(arr));
//		Assert.assertEquals(-1, findUniqueElementUsingHashMapWithAdd(arr));
//		Assert.assertEquals(-1, findUniqueElementUsingHashMapWithRemove(arr));
	}
	
//	private int findUniqueElementUsingTwoPointer(int[] arr){
		
		// Two Pointer Approach fails
//		Arrays.sort(arr); //{1,1,2,2,3}   // {1,2,2}
//							         s f	    s f
//		int slow =0,fast=1,result=0,flag=0;
//		while(slow<arr.length && fast<arr.length){
//				if(arr[slow]==arr[fast]) {slow+=2;fast+=2;}
//				else {
//					result = slow;
//					flag = 1;
//					slow+=1;
//					fast+=1;
//				} 
//			}
//		if(flag==1)	return arr[result];
//		return arr[slow];
//		}
		
		/*
		 * Time Complexity -> O(n)
		 * Space Complexity -> O(1)
		 */
		
		// Using Bitwise XOR operation 
		private int findUniqueElementUsingBitwiseXOR(int[] arr){
		int result=0;
		if(arr.length==0) return -1;
		for (int ele : arr) 
		{
			result = result^ele; 
		}
		return result;
		}
	
	//Alternate way using HashMap with Add
	/*
	 * Time Complexity -> O(n) + O(m) -> O(n+m)
	 * Space Complexity -> O(n) 
	 *
	 * Pseudo Code:
	 * -Declare HashMap
	 * -Declare result variable and initialize as "-1"
	 * -Traverse through the array and store the count of each array element in the map  
	 * -Traverse through the map and find the key which has occurred once then return the key 
	 */
	
//	private int findUniqueElementUsingHashMapWithAdd(int[] arr) {
//	Map<Integer,Integer> map = new HashMap<>();
//	int result=-1;
//	if(arr.length==0) return result;
//	for (int i = 0; i < arr.length; i++) {
//		
//		if(!map.containsKey(arr[i])) map.put(arr[i], 1);
//		else map.put(arr[i], map.get(arr[i])+1);
//	}
//	
//	for (Map.Entry<Integer, Integer> uniqueResult: map.entrySet()) {
//		if(uniqueResult.getValue()==1) result=uniqueResult.getKey();
//	}
//	return result;
//	}
	
	//Alternate way using HashMap with Remove
		/*
		 * Time Complexity -> O(n) + O(m) -> O(n+m)
		 * Space Complexity -> O(n) 
		 *
		 * Pseudo Code:
		 * -Declare HashMap
		 * -Declare result variable and initialize as "-1"
		 * -Traverse through the array and remove the key if this is already counted   
		 * -Traverse through the map and return the existing element 
		 */
		private int findUniqueElementUsingHashMapWithRemove(int[] arr) {
		Map<Integer,Integer> map = new HashMap<>();
		int result=0;
		if(arr.length==0) return -1;
		for (int i = 0; i < arr.length; i++) {
			
			if(!map.containsKey(arr[i])) map.put(arr[i], 1);
			else map.remove(arr[i]);
		}
		
		for (Map.Entry<Integer, Integer> uniqueResult: map.entrySet()) {
			result=uniqueResult.getKey();
		}
		return result;
		}
	
	
}
