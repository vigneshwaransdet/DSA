package com.sdet.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Given an integer x, return true if x is palindrome integer.

	An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
	
 * Problem Solving Techniques :
 * 1. Do you understand the question?
 * 		Yes - Go to next step
 * 		No - Ask the person to provide more detail with example(s).
 * 
 *  ->what is the input(s)? --> based on the question, we decide to create an input
 *  	 [i.e., Palindrome program needs input as integer]
 * 	->what is the expected output? --> [boolean true or false]
 *  ->Do i have constraints to solve the problem? --> [Eg: Its based on the question or interviewer expectations such as 
 *  specific algorithms -> "O Notations" - > 1) Time Complexity 2) Space Complexity ]
 *  ->Do i have all informations to go to next step? -> If all the above mentioned steps (i.e., for Yes) we can proceed
 *  ->How big is your test data will be? -> Eg., If input is 5 digits (10001), so the Time complexity will be O(n) 
 *  
 *  2. Test Data Set
 *  -> Minimum of 3 data set !! "Positive" , "Edge" and "Negative" 
 *  ----> Positive - 1221 -> 1221
 *  ----> Negative - 1234 -> 4321
 *  ----> Edge - 120000 -> 21 
 *  -> Validate with the interviewer if the data set is fine -> its depends on the interviewer
 *  
 *  3. Do i know how to solve it?
 *  
 *  Yes - Great, is there an alternate? -> Yes
 *  No - Can i break down the problem into sub problems? -> Let's Assume, 
 *  	 If interviewer ask to solve without using string, 
 *  	 to know the integer length, in this we can't have any straight forward way
 *  then -> 
 * 
 * 4. Ask for hint (if you do not know how to solve it?) 
 *  		-> Ask one time and thank the interviewer
 *  		-> Worst Case! even after got the hint, we don't know how to solve, then convince them and prove with your confidence 
 *  		   level to get the next question 
 *  
 * 5. Do I know alternate solutions as well?
 * 	
 * 	Yes - What are those?
 *     way of Approach to solve with the following
 *    -> Brute Force (Standard) --> recursive function, using for loop --> without considering this Time complexity and space complexity 
 *    -> inbuilt approach --> using String, Collections --> Use Time complexity and space complexity
 *    
 * Pseudo Code:
 *    		1. to use while loop (if its unknown length of the integer -> iterations are unknown)
 *  		2. create a variable for and initialize as same value as input (121).
 *  		3. Create a variable for to store the reminder and initialize as 'zero'.
 *  		4. use modulus to get the reminder values (E.g., Itr 1: 121%10 = 1 Itr 2 : 12% Itr 3: 1%10 = 1)
 *  		5. assign this reminder values to the created variable (step 3)
 *  		6. compare the created variable (step 2) and input 
 *  		7. print out the output
 */

public class Palindrome_04Jul2021 
{
	@Test
	public void testPositive() 
	{
		int integer = 121;
		Assert.assertEquals(121,checkPalindrome(integer));
	}
	
	@Test
	public void testNegative() 
	{
		int integer = 123;
		Assert.assertEquals(-1,checkPalindrome(integer));
	}
	
//	@Test
//	public void testEdge()
//	{
//		int integer = 010;
//		Assert.assertEquals(121,checkPalindrome(integer));
//	}
	
//	Using Brute Force Method
	private int checkPalindrome(int integer) 
	{
		int rem =0;
		int sum =0;
		int num = integer;
		
		while(integer>0)
		{
			rem = integer%10;
			integer = integer/10;
			sum = (sum*10) + rem;
		}
		
		if(sum==num)
		{
			return sum;
		}
		else
		{
			return -1;
		}
	}
	
//	Using StringBuilder:
//	{
//		String str = Integer.toString(integer);
//		
//		StringBuilder sb = new StringBuilder(str);
//		StringBuilder reverse = sb.reverse();
//		
//		if(str.equals(reverse.toString()))
//		{
//			String string = reverse.toString();
//			return Integer.valueOf(string);
//		}
//		else
//		{
//			String string = reverse.toString();
//			return Integer.valueOf(string);
//		}
//	}
	
	
//	Using String
//	{
//		String str = Integer.toString(integer);
//		
//		String str1 = "";
//		
//		for (int i = str.length()-1; i >= 0; i--)
//		{ 
//			str1 = str1+ str.charAt(i);
//		}
//		
//		if(str1.equals(str))
//		{
//			return Integer.valueOf(str1);
//		}
//		else
//		{
//			return Integer.valueOf(str1);
//		}
//	}
}
