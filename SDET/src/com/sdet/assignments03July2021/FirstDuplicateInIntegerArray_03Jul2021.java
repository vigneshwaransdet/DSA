package com.sdet.assignments03July2021;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Order;

/*
 * Question : Find first duplicate in integer array 
 * 
 * 1. Do I understand the problem? -> Yes
 * 		-> 1.a) what is the input? -> int array[1,2,2,5,6,6] 
 * 		-> 1.b) what is the expected output? ->  2
 * 		-> 1.c) Do I have constraints to solve the problem? -> based on the interviewer 
 * 		-> 1.d) Do I have all the informations to go to next step? -> yes
 * 		-> 1.e) How big is your test data set will be? -> 1 set
 * 2. Test Data Set
 * 		Positive -> int[] arr = {1,2,2,5,6,6} => Output : 2
 * 		Negative -> int[] arr = {1,2,5,6} => Output : appropriate message // doubt
 * 		Edge -> int[] arr = {6,6,6,6} => Output : 6 // doubt
 * 
 * 3. Do I know how to solve it? 
 * 		yes -> Is there an alternate? -> No
 * 		No -> Break down the problem into subproblems
 * 4. Ask for hint
 * 5. Do I know alternate solutions as well?
 * 		yes -> what are those? 
 * 		No -> Brute Force
 * 6. If you know the alternate solutions? - No
 * 7. Pseudo Code
 * 		-> Input : int[] arr = {1,2,2,5,6,6}
 * 		-> Output : return the first duplicate number 
 * 		-> Expectation : 2
 * 		-> Traverse through each element first input
 * 		-> Traverse through following element (after the current index)
 * 		-> Compare the value first input with second input
 * 			a) If it matches, return the matched element for one time and ignpre the rest of the  duplicate elements
 *  	-> If none of the elements were dupplicate, then return what? // doubt
 */

public class FirstDuplicateInIntegerArray_03Jul2021 
{
	@Test
	@Order(1)
	public void testPositive()
	{
		int[] arr = {1,2,2,5,6,6};
		int[] arr1 = new int[arr.length];
		arr1 = firstDuplicateInteger(arr,arr1);
		Assert.assertArrayEquals(new int[] {0, 2, 0, 0, 0, 0}, arr1);
	}
	
	private int[] firstDuplicateInteger(int[] arr ,int[] arr1)
	{
		int count =0;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]==arr[j])
				{
					arr1[i] = arr[i];
					System.out.println("First Duplicate : "+arr[i]);
					count++;
					break;
				}
			}
			if(count==1)
			{
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		return arr1;
	}
}
