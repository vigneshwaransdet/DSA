package com.sdet.assignments;

import org.junit.Test;

import junit.framework.Assert;

/*
 * 2)Write an algorithm to determine if a number n is happy. A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

Example 1:
Input: n = 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1

Example 2:
Input: n = 2
Output: false

Example 3: 40
4^2 + 0^2 = 16
1^2 + 6^2 = 37
3^2 + 7^2 = 58
5^2 + 8^2 = 89
8^2 + 9^2 = 145
 *
 * 10 Problems Solving Techniques:
 * 1. Do I understand the problem? -Yes
 * a) What is the input? -> int
 * b) What is the output> -> boolean 
 * c) Do I have constraints to solve the problem? range of int 0 < n < 2^31 -1, TC -> O(n), SC -> O(1)
 * 		-> Yes
 * d) Do I have all the informations to go to next step? -> Yes
 * e) How big is your test data will be? -> 
 * 
 * 2. Test Data Set
 * Positive -> int = 19
 * Negative -> int = 2,40
 * Edge -> int = 1,7
 * 
 * 3.Do I know how to solve it? - Yes 
 * yes -> Is there an alternate? - No
 * 
 * 4. Ask for hint - how to solve this 2 pointer approach?
 *
 * 5. Do I know alternate solutions as well?
 * 		yes -> what are those? 
 * 		No -> 
 * 6. If you know the alternate solutions? 
 * Find out the 'O' notations
 * Then explain either both or the best
 * Approach 1: Start with worst -> Using Brute Force
 * Approach 2: Write down the options and the benefits of the code
 * 
 * 7.Pseudo Code for O(n) - looks simple [need to change it as readable manner]
 * -get the integer
 * -Declare the reminder, sum variables as "0"
 * -Check condition if integer is equal to "1" or "7" then return true
 * -check condition using while loop as integer > "9" if true then proceed further
 * -assign the value as "0" to sum
 * -check condition using while loop as integer > "0" if true, then do the following steps 
 * -integer%10 multiply with integer%10 and store it in sum
 * -get the quotient value from integer dividend by "10" and store it in integer
 * -check condition if sum is equal to "7" then return true
 * -assign sum value to integer
 * then return sum is equal to "1"
 * 
 * 8.Implement them in the code
 * 9.Debug /Test against the different data set
 * 10.If it fails, debug them to solve it 
 */
public class ReturnTheHappiestElement_10Jul2021 
{
	@Test
	public void test1()
	{
		int num = 19;
		Assert.assertEquals(true, findHappiestNumber(num));
	}
	
	@Test
	public void test2()
	{
		int num = 2;
		Assert.assertEquals(false, findHappiestNumber(num));
	}
	
	@Test
	public void test3()
	{
		int num = 0;
		Assert.assertEquals(false, findHappiestNumber(num));
	}
	
	@Test
	public void test4()
	{
		int num = 40;
		Assert.assertEquals(false, findHappiestNumber(num));
	}
	
	@Test
	public void test5()
	{
		int num = 11;
		Assert.assertEquals(false, findHappiestNumber(num));
	}
	
	/*
	 * Time Complexity -> O(n^2)
	 * Space Complexity -> O(1) 
	 */
	
	private boolean findHappiestNumber(int num) {
		int sum=0;
		if(num==1||num==7) return true;
		while(num>9) {
			sum = 0;
			while(num>0) {
				sum = sum+(num%10)*(num%10);
				num = num/10;
			}
			if(sum==7 || sum==1) return true;
			num = sum;
		}
		return sum==1;
	}
}


