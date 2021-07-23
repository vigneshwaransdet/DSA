package com.sdet.assignments08July2021;

import org.junit.Test;
import junit.framework.Assert;

/*
 * Given an integer array arr, count how many elements x there are, 
 * such that x + 1 is also in arr. If there are duplicates in arr, count them separately.
 * Example 1:
 * Input: arr = [1,2,3]
 * Output: 2
 * Explanation: 1 and 2 are counted cause 2 and 3 are in arr.
 * 
1) Did I understand the problem? Yes or No !! - Yes 
	 * -> If No, Ask the person to provide more detail with example(s) 
	 * -> If yes, go to next step !!
	 * 
	 * What is the input(s)? - int []
	 * What is the expected output? - int
	 * Do I have constraints to solve the problem? - 
	 * 			If there are duplicates count them separately 	
	 * Do I have all informations to go to next step!!
	 * How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set
	 *  Minimum of 3 data set !! 
	 *  Positive : {1,2,3} => 3
	 *   
	 *  Edge     :  [2,1,1] => 2
	 *  
	 *  Negative : [1,3,5,7] => 0
	 *  Validate the data set with the interviewer 
	 *
	 * 3) Do I know how to solver it? => Yes
	 *	Yes - great, Is there any alternate solution? -> Yes
	 *	No - Can I break down the problem to sub problems?
	 *
	 * 4) Ask for the hint (If you don't know how to solve it)
	 *
	 *
	 * 5) Do I know alternate solution to solve this problem? - No
	 *	Yes - What are those? 
	 *	No – That is still fine, proceed to solve by what you know !!
	 *  
	 * 6) If you know alternate solutions -> find out the O Notations (Performance)
		 *	Then, explain either both or the best (depends on the time)
	 *	Approach 1: O(n^2) / O(1)
	 *  Approach 2: O(n logn) / O(1)
	 *
	 * 7) Start with Pseudo code
	 * 		a. int [] and inti as int count var = 0;
	 * 		b. Traverse the array with for loop
	 * 		c. Have a inner for loop with compare and set the cout var
	 * 		d. If(arr[i]+1==arr[j]) count ++ then break the loop;
	 * 		e. return the count
	 * 		
	 * 8)Implement the code
	 * 
	 * 9)Test against the different data set
	 * 
	 * 10) If it fails Debug them to solve it !!
 */


public class FindCount_08Jul2021_Incomplete 
{
	@Test
	public void test1()
	{
		int[] arr = {1,2,3};
		int count=0;
		Assert.assertEquals(2, findCount(arr,count));
	}
	
	@Test
	public void test2()
	{
		int[] arr = {1,1,3,3,5,5,7,7};
		int count=0;
		Assert.assertEquals(0, findCount(arr,count));
	}
	
	@Test
	public void test3()
	{
		int[] arr = {1,3,2,3,5,0};
		int count=0;
		Assert.assertEquals(3, findCount(arr,count));
	}
	
	@Test
	public void test4()
	{
		int[] arr = {1,1,2,2};
		int count=0;
		Assert.assertEquals(2, findCount(arr,count));
	}
	
	@Test
	public void test5()
	{
		int[] arr = {1,1,2};
		int count=0;
		Assert.assertEquals(2, findCount(arr,count));
	}
	
	private int findCount(int[] arr,int count) 
	{
		int temp = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		int c=0;
		for (int i = 0; i < arr.length-1; i++) 
		{
			for (int j = 0; j < arr.length-1;)
			{
				if(arr[i]+1==arr[j+1])
				{
					c+=1;
					j+=1;
				}
				else if(arr[i]==arr[j+1])
				{
					j+=1;
				}
				
				else
				{
					j+=1;
				}
			}
		}
		System.out.println(c);
		return c;
	}
}
