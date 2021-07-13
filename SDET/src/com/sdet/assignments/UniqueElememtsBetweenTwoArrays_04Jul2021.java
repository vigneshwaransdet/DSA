package com.sdet.assignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

/*
 * Given two integer arrays nums1 and nums2, return an array of their intersection. 
 * Each element in the result must be unique and you may return the result in any order.
 * 
 * Example 1:
 *	Input: nums1 = [1,2,2,1], nums2 = [2,2]
 *	Output: [2]
 * 1. Do I understand the problem? -> Yes
 * 		-> 1.a) what is the input? -> int[] array1, int[] array2
 * 		-> 1.b) what is the expected output? -> int array
 * 		-> 1.c) Do I have constraints to solve the problem?
 * 		-> 1.d) Do I have all the informations to go to next step? -> yes
 * 		-> 1.e) How big is your test data set will be? -> 3 set
 * 2. Test Data Set
 * 		Positive  
 * 		Negative  
 * 		Edge 
 * 3. Do I know how to solve it? 
 * 		yes -> Is there an alternate? -> No
 * 		No -> Break down the problem into subproblems
 * 4. Ask for hint
 * 5. Do I know alternate solutions as well?
 * 		yes -> what are those? 
 * 		No -> HashMap
 * 6. If you know the alternate solutions? - No
 * 7. Pseudo Code
 * 		-> Input : int[] arr1 = {1,2,2,1},int[] arr2 = {2,2}
 * 		-> Output : return the unique element common in both arrays
 * 		-> Expectation : 2
 * 		-> declare set
 * 		-> Traverse the num1 array into set and get the unique values
 * 		-> Traverse the num2 array into set and get the unique values
 * 		-> set1 retain all from set 2 -> return the unique element(s) common in both arrays
 * 		-> if s1 is not empty, then return the elemenst which is common in both arrays
 * 				else return the {-1}
 *
 */

public class UniqueElememtsBetweenTwoArrays_04Jul2021 
{
//	@Test
	public void testPositive()
	{
		int[] num1 = {1,2,2,1,3,3};
		int[] num2 = {2,2,3,3};
		uniqueElement(num1,num2);
		Assert.assertArrayEquals(new int[]{2,3},uniqueElement(num1,num2));
	}
	
	@Test
	public void testNegative()
	{
		int[] num1 = {1,2,1,3};
		int[] num2 = {4,5,6,7};
		Assert.assertArrayEquals(new int[]{-1},uniqueElement(num1,num2));
	}
	
	public int[] uniqueElement(int[] num1,int[] num2) 
	{
		Set<Integer> s1 = new HashSet<>();
		
		for (int i=0;i<num1.length;i++) 
		{
			s1.add(num1[i]);
		}
		
		System.out.println(s1);
		
		Set<Integer> s2 = new HashSet<>();
		
		for (int j=0;j<num2.length;j++) 
		{
			s2.add(num2[j]);
		}
		
		System.out.println(s2);
		
		s1.retainAll(s2);
		System.out.println(s1);
		
		if (!s1.isEmpty() /* || s1.size()>0 */)
		{
		
		int[] intArr = new int[s1.size()]; 
		
		int index=0;
		
		for(int i : s1) 
		{
			intArr[index++]=i;
		}
		return intArr;
		}
		else
		{
			return new int[] {-1};
		}
		
		// OR
		
//		Iterator itr = s1.iterator();
//				
//		while(itr.hasNext())
//		{
//			if(s2.contains(itr.next()))
//			{
//				System.out.print(itr.next()); // not working
//			}
//		}
	}
}
