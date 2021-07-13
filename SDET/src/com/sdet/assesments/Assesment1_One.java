package com.sdet.assesments;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

/*
 * Given an integer array nums, 
 * return true if any value appears at least twice in the array, and return false if every element is distinct.
 * 
 * Example 1:
   Input: nums = [1,2,3,1] , [1,1,2,3,4,4] [1,1,2]
   Output: true
   
   Example 2:
   Input: nums = [1,2,3,4]
   Output: false
   
   Example 3:
   Input: nums = [1,1,1,3,3,4,3,2,4,2]
   Output: true
 * 
 * 
 * Problems Solving Techniques:
 * 1. Do I understand the problem? -Yes
 * a) What is the input? -> int[] array
 * b) What is the output> -> boolean
 * c) Do I have constraints to solve the problem? 
 * 		-> Yes 
 * 			Constraints:
			1 <= nums.length <= 105
			-109 <= nums[i] <= 109
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
 * 4. Ask for hint - how to solve this 2 pointer approach?
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
 * -Declare the HashMap
 * -Traverse through the array from 0 to nums.length 
 * -check condition if no elements present then add 1 to the value  
 * -else add 1 to the value	
 * -Traverse the map
 * -check condition if map have the key more than one times return true else return false
 * 
 * 8.Implement them in the code
 * 9.Debug /Test against the different data set
 * 10.If it fails, debug them to solve it 
 */

public class Assesment1_One {
	
	@Test
	public void test1() {
		int[] nums= {1,2,3,1};
		Assert.assertEquals(true, containsDuplicate(nums));
	}
	
	@Test
	public void test2() {
		int[] nums= {1,2,3,4};
		Assert.assertEquals(false, containsDuplicate(nums));
	}
	
	@Test
	public void test3() {
		int[] nums= {1,1,1,3,3,4,3,2,4,2};
		Assert.assertEquals(true, containsDuplicate(nums));
	}
	
	
	/*
	 * Time Complexity -> O(n) + O(m)
	 * Space Complexity -> O(n)
	 * 
	 */
	public boolean containsDuplicate(int[] nums) {
		
//		First - a:
//		Map<Integer,Integer> map = new HashMap<>();
//		for (int i = 0; i < nums.length; i++) 
//		{
//			if(!map.containsKey(nums[i])) {
//				map.put(nums[i], 1);
//			}
//			else {
//				map.put(nums[i], map.get(nums[i])+1);
//			}
//		}
//		
//		for (Map.Entry<Integer, Integer> elements : map.entrySet()) {
//			if(elements.getValue()>1) return true;
//		}
//		return false;	
	
//		First - b:
//		Map<Integer,Integer> map = new HashMap<>();
//		for (int i = 0; i < nums.length; i++) 
//		{
//			if(!map.containsKey(nums[i])) {
//				map.put(nums[i], 1);
//			}
//			else {
//				map.put(nums[i], map.get(nums[i])+1);
//				if(map.get(nums[i])==2) return true;
//			}
//		}
//	 	return false;
		
		//Second Way:
//		Map<Integer,Integer> map = new HashMap<>();
//		for (int i = 0; i < nums.length; i++) {
//			map.put(nums[i], map.getOrDefault(nums[i],0)+1);
//		}
//		
//		for (Map.Entry<Integer, Integer> elements : map.entrySet()) {
//			if(elements.getValue()>1) return true;
//		}
//		return false;
		
//		Third Way: 
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if(!set.add(nums[i])) return true;
		}
		return false;
    }
}
