package com.sdet.assignments;

import org.junit.Test;
import org.junit.jupiter.api.Order;
import junit.framework.Assert;

/*
 * Question : Reverse the given integer
 * 
 * 1. Do I understand the problem? -> Yes
 * 		-> 1.a) what is the input? -> integer [Eg: 125] 
 * 		-> 1.b) what is the expected output? -> reversed integer [Eg: 521]
 * 		-> 1.c) Do I have constraints to solve the problem? -> based on the interviewer 
 * 		-> 1.d) Do I have all the informations to go to next step? -> yes
 * 		-> 1.e) How big is your test data set will be? -> 3 set
 * 2. Test Data Set
 * 		Positive -> int a = 121, output : 121
 * 		Negative -> int a = 1, output : 1 [less than 10 -> less than 2 digits]
 * 		Edge -> int a = 12000, output : 21
 * 3. Do I know how to solve it? 
 * 		yes -> Is there an alternate? -> No
 * 		No -> Break down the problem into subproblems
 * 4. Ask for hint
 * 5. Do I know alternate solutions as well?
 * 		yes -> what are those? 
 * 		No -> Brute Force
 * 6. If you know the alternate solutions? - No
 * 7. Pseudo Code
 * 		-> Input : int a = 123
 * 		-> Output : reversed given integer
 * 		-> Expectation : 321
 * 		-> Create new compare variable and assign the value as same as the input
 * 		-> Traverse the integer until less than "zero"
 * 		-> To Create a new variable to store the reminder of an integer using modulus operation repeat until its "zero"
 * 		-> To store the quotient of an integer using dividend operation repeat until its "zero" and re-assign its to an input
 * 		-> Create a new reverse variable to store the reversed digits using with adding both (variable*10) + reminder
 * 		-> Compare the reversed variable and the compare variable
 * 				-> If its true, then return the reversed variable
 * 				-> else return the appropriate message      
 * 
 */

public class ReverseAnInteger_03Jul2021 
{
	@SuppressWarnings("deprecation")
	@Test
	@Order(1)
	public void testPositive()
	{
		int num = 123;
		int sum = 0;
		sum=revreseAnInteger(num,sum);
		Assert.assertEquals(321,sum);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	@Order(2)
	public void testNegative()
	{
		int num = 1;
		int sum = 0;
		sum=revreseAnInteger(num,sum);
		Assert.assertEquals(1, sum);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	@Order(3)
	public void testEdge()
	{
		int num = 12000;
		int sum = 0;
		sum=revreseAnInteger(num,sum);
		Assert.assertEquals(00021, sum);
	}
	
	private int revreseAnInteger(int num,int sum)
	{
		int rem = 0;
		if(num<10) 
		{
			System.out.println("Given integer is not a proper value");
			return sum;
		}
		while(num>0)
		{
			rem = num%10;
			num = num/10;
			sum = (sum*10) + rem;
		}
		System.out.println(sum);
		return sum;
	}
}
