package com.sdet.assignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

import junit.framework.Assert;

/*
 * Question : Given an array nums of size n, return the majority element. 
 * you may assume that the majority element always exists in the array.
 * The majority element is the element that appears more than [n/2] times. 
 * 
 * 1. Do I understand the problem? -> Yes
 * 		-> 1.a) what is the input? -> int array[2,2,2,2,6,6,7,8] 
 * 		-> 1.b) what is the expected output? ->  2
 * 		-> 1.c) Do I have constraints to solve the problem? ->  n == nums.length, 1 <= n <= 5 * 10^4, -2^31 <= nums[i] <= 2^31 - 1
 * 		-> 1.d) Do I have all the informations to go to next step? -> yes
 * 		-> 1.e) How big is your test data will be? -> 1 <= n <= 5 * 10^4
 * 2. Test Data Set
 * 		Positive -> int[] arr = {2,2,2,2,6,6,7,8} => Output : 2
 * 		Negative -> int[] arr = {2,2,6,6,7,8} => Output : -1
 * 		Edge -> int[] arr = {-2147483648,-2147483648,-2147483648,2147483647,2147483647} => Output : -2147483648
 * 
 * 3. Do I know how to solve it? 
 * 		yes -> Is there an alternate? -> Yes
 * 		No -> Break down the problem into subproblems
 * 4. Ask for hint? -> No need
 * 5. Do I know alternate solutions as well?
 * 		yes -> what are those? -> Brute Force and HashMap 
 * 		No -> 
 * 6. If you know the alternate solutions? - Yes
 * 7. Pseudo Code for Brute Force
 * 		-> Find the mid size of the array and store in a variable
 * 		-> Initialize the variable for to store the count
 * 		-> Traverse through each element in the first for loop 
 * 		-> Traverse through each element in the second for loop
 * 				a->	compare the array elements and increment the count if it's matches
 * 		-> Once found the final count then compare with this mid size variable value
 * 				a-> if it's true then return the current array element
 * 				b-> else return false  
 */

public class FindMajorityElement_04Jul2021 
{
	@Test
	public void testPositive()
	{
		int[] arr = {2,2,2,2,6,6,1};
		findMajority(arr);
		Assert.assertEquals(2,findMajority(arr));
	}
	
	@Test
	public void testNegative()
	{
		int[] arr = {2,6,1,5,4,3};
		findMajority(arr);
		Assert.assertEquals(-1,findMajority(arr));
	}
	
	@Test
	public void testEdge()
	{
		int[] arr = {2,2,2,6,6,6};
		findMajority(arr);
		Assert.assertEquals(-1,findMajority(arr));
	}
	
	private int findMajority(int[] arr) 
	{
		int midSize = arr.length/2; // O(1) -> SC
//		Method 1 -> Brute Force 
		for (int i = 0; i < arr.length; i++) // O(n) -> TC
		{
			int count=0; // O(1) -> SC
			for (int j = 0; j < arr.length; j++) // O(n)*O(n) -> O(n^2) -> TC
			{
				if(arr[i]==arr[j]) // O(1) -> TC
				{
					count++; 
				}
			}
			if(count>midSize) // O(1) -> TC
			{
				return arr[i]; // TC should come or not?
			}
		}
		return -1;// TC should come or not?
		
//		Time Complexity -> O(n^2) + O(1)+ O(1) -> O(n^2) + O(2) -> drop the constants (O(2)) -> O(n^2)
//		Space Complexity -> O(1) + O(1) -> O(2) -> O(1) -> doubt?? 
		
//		Method 2 -> Using HashMap
		
//		Map<Integer,Integer> map = new HashMap<Integer,Integer>(); // O(1) or O(n)-> SC -> doubt
//		
//		for (int i = 0; i < arr.length; i++) // O(n) -> TC
//		{
//			if(!map.containsKey(arr[i])) // O(1) -> TC
//			{
//				map.put(arr[i], 1); // O(1) -> TC
//			}
//			else
//			{
//				map.put(arr[i], map.get(arr[i])+1); // O(1) -> TC
//			}
//		}
//		
//		for (Map.Entry<Integer,Integer> entry : map.entrySet()) // O(m) -> TC
//		{
//			if(entry.getValue()>midSize) // O(1) -> TC
//			{
//				return entry.getKey(); // TC should come or not?
//			}
//		}
//		return -1;// TC should come or not?
		
//		Time Complexity -> O(n) + O(1) + O(1) + O(1) + O(m) + O(1) -> O(n) + O(4) + O(m) -> O(n+m)
//		Space Complexity -> doubt?
	}
}
