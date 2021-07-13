package com.sdet.assignments;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


/*
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
 *  That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 *
	Return the answer in an array.
 * 
 * Pseudo Code:
 * 1. Get the input arg as int[] array
 * 2. Initialize the output array with the length of the input array
 *    
 * 3. Traverse through the first loop from index -> 0 to length and initialize the count var
 * 4. Traverse through the inner loop from index -> 1 to length
 * 5. check condition if i==j then continue
 * 6. if arr[j]<arr[i] then increment the count
 * 7. store the count in output arr
 * 8. return the out arr
 * 
 */

public class SmallerNumbersThanCurrentNumber_08Ju2021_Incomplete 
{
	@Test
	public void test1()
	{
		int[] arr = {8,1,2,2,3};
		Assert.assertArrayEquals(new int[] {4,0,1,1,3}, smallerNumbersThanCurrentNumber(arr));
	}
	
	@Test
	public void test2()
	{
		int[] arr = {6,5,4,8};
		Assert.assertArrayEquals(new int[] {2,1,0,3}, smallerNumbersThanCurrentNumber(arr));
	}
	
	@Test
	public void test3()
	{
		int[] arr = {7,7,7,7};
		Assert.assertArrayEquals(new int[] {0,0,0,0}, smallerNumbersThanCurrentNumber(arr));
	}
	
	
	
	private int[] smallerNumbersThanCurrentNumber(int[] arr) 
	{
		int[] output = new int[arr.length];

		for(int i=0;i<arr.length;i++)
		{
			int count =0;
			for(int j=0;j<arr.length;j++)
			{
				if(i==j || arr[i]==arr[j] ||arr[i]<arr[j])
				{
					continue;
				}
				if(arr[i]>arr[j])
				{
					count+=1;
				}
			}
			output[i] = count;
		}
		System.out.println(Arrays.toString(output));
		return output;

	}
}
