package com.sdet.assignments04July2021;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Order;

/*
 * Given an array nums containing n distinct numbers in the range [0, n], 
 * return the only number in the range that is missing from the array. 
 *	Input: nums = [3,0,1] or [3,0,1,5,6,4] -> [0,1,3,4,5,6]
 *	Output: 2
 *
 * 1. Do I understand the problem? -> Yes
 * 		-> 1.a) what is the input? -> int[] array
 * 		-> 1.b) what is the expected output? -> int 
 * 		-> 1.c) Do I have constraints to solve the problem? -> positive elements 
 * 		-> 1.d) Do I have all the informations to go to next step? -> yes
 * 		-> 1.e) How big is your test data will be? ->  
 * 2. Test Data Set
 * 		Positive  
 * 		Negative  
 * 		Edge 
 * 		
 * 3. Do I know how to solve it? 
 * 		yes -> Is there an alternate? -> yes
 * 		No -> Break down the problem into subproblems => 
 * 4. Ask for hint => 
 * 5. Do I know alternate solutions as well?
 * 		yes -> what are those? => yes 
 * 		No -> Brute Force
 * 6. If you know the alternate solutions? - No
 * 7. Pseudo Code
 * 		-> Input : int[] arr = {3,0,1} -> avoid
 * 		-> Output : return the missing element -> avoid
 * 		-> Expectation : 2 -> avoid
 * 		-> create a temp variable 
 * 		-> sort the array 		
 * 		-> Traverse through the first array start from index as "0"
 * 		-> compare the current array element by adding "1" and to the next element 
 * 		-> if true, return the missing element, else return -1
 * 			    
 */

public class FindMissingNumberInDistinctRangeArray_04Jul2021 
{
	@Test
	@Order(1)
	public void testPositive()
	{
		int[] arr = {3,0,1};
//		Assert.assertArrayEquals(new int[]{0,1,2,3},findMissingNumber(arr));
		Assert.assertEquals(2,findMissingNumber(arr));
		
		int index = 12 & 5;
		System.out.println(index);
	}
	
//	@Test
	@Order(2)
	public void testNegative()
	{
		int[] arr = {0,1,2};
		Assert.assertEquals(-1,findMissingNumber(arr));
	}
	
//	@Test
	@Order(3)
	public void testEdge()
	{
		int[] arr = {1,1,2,2}; 
		Assert.assertEquals(-1,findMissingNumber(arr));
	}
//	First Method:	
	public int findMissingNumber(int arr[]) 
	{
		int temp = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	
		for (int i = 0; i < arr.length-1; i++) 
		{
			if(arr[i]+1!=arr[i+1])
			{
				System.out.println(arr[i]+1);
				return arr[i]+1;
			}
		}
		
		return -1;
	}
	
//	Second Method:	
//	public int[] findMissingNumber(int arr[])
//	{
//		int temp = 0;
//		
//		for (int i = 0; i < arr.length; i++) 
//		{
//			for (int j = i+1; j < arr.length; j++)
//			{
//				if(arr[i]>arr[j])
//				{
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		
//		int missArr[] = new int[arr.length + 1];
//		int index = 0;
//		for (int i = 0; i < arr.length - 1; i++) 
//		{
//			if (arr[i]+1!=arr[i+1]) 
//			{
//				missArr[index++] = arr[i];
//				missArr[index++] = arr[i]+1;
//			} 
//			else 
//			{
//				missArr[index++] = arr[i];
//			}
//		}
//		missArr[index] = arr[arr.length - 1];
//		
//		System.out.println(Arrays.toString(missArr));
//		
//		return missArr;
//	}
	
	
}
