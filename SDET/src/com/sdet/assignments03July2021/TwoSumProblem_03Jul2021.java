package com.sdet.assignments03July2021;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Order;

/*
 * Question : Two Sum Problem
 * 
 * 1. Do I understand the problem? -> Yes
 * 		-> 1.a) what is the input? -> int array[1,2,3,5,6] , int target = 8
 * 		-> 1.b) what is the expected output? ->  indices [1,4]
 * 		-> 1.c) Do I have constraints to solve the problem? -> based on the interviewer 
 * 		-> 1.d) Do I have all the informations to go to next step? -> yes
 * 		-> 1.e) How big is your test data set will be? -> 1 set
 * 2. Test Data Set
 * 		Positive -> int[] arr = {1,3,5,6,8}, target = 11 => Output : indices [2,3]
 * 		Negative -> int[] arr = {1,3,5,6,8}, target = 11 => Output : indices [2,3] // doubt
 * 		Edge -> int[] arr = {1,3,5,6,8}, target = 11 => Output : indices [2,3] // doubt
 * 
 * 3. Do I know how to solve it? 
 * 		yes -> Is there an alternate? -> No
 * 		No -> Break down the problem into subproblems
 * 4. Ask for hint
 * 5. Do I know alternate solutions as well?
 * 		yes -> what are those? 
 * 		No -> Brute Force
 * 6. If you know the alternate solutions? 
 * Find out the 'O' notations
 * Then explain either both or the best
 * Approach 1: Start with worst -> Using Brute Force
 * Approach 2: Write down the options and the benefits of the code
 *  
 * 7. Pseudo Code
 * 		-> Input : int array[1,2,3,5,6], int target = 8
 * 		-> Output : sum of two indices matching with target 
 * 		-> Expectation : [1,4]
 * 		-> Traverse through the each element in the first input
 * 		-> Traverse through the following element (after the current index)  
 * 		-> Compare the value of sum with the target
 * 				a) If it matches, return the index
 *		-> If none of the matches (after the loop), return the negative!
 *
 */

public class TwoSumProblem_03Jul2021 
{
	@Test
	@Order(1)
	public void testPositive()
	{
		int[] arr = {1,2,3,5,6};
		int target = 11;
		twoSumMatchWithTarget(arr,target);
//		Assert.assertArrayEquals(new int[]{3,4}, arr);
	}
	
	private int[] twoSumMatchWithTarget(int[] arr,int target)
	{
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.print(i+" "+j);
					
				}
//				else
//				{
//					System.out.println("[-1,-1]");// need to ask doubt for the negative case
//				}
			}
		}
		
		return arr;	
	}
}
