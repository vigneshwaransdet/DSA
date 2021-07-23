package com.sdet.assignments22July2021;

import org.junit.Assert;
import org.junit.Test;

/*
 * Question:
 * 
 * 
 * 
 * 1. Inout -> 
 * 2. Ouput ->
 * 3. Constraints -> Time Complexity -> 
 * 					 and Space Complexity ->
 * 
 * 4. Test Data Set
 * 		Positive ->
 * 		Neagtive ->
 * 		Edge -> 
 * 
 * 5. Ask for Hint -> 
 * 
 * 6. Approaches to Solve:
 * 		Brute Force
 * 		Optimized
 * 
 * 7. Pseudo code:
 * 	-
 * 
 */

public class SecondMaxNumber {
	
	@Test
	public void test1() {
		int[] data = {2,1,5,4};
		Assert.assertEquals(testMethod(data), 4);
	}
	
	@Test
	public void test2() {
		int[] data = {2,1,3,4};
		Assert.assertEquals(testMethod(data), 3);
	}
	
	@Test
	public void test3() {
		int[] data = {200,99,36,4800};
		Assert.assertEquals(testMethod(data), 200);
	}
	
	
	
	private int testMethod(int[] data) {
		int firstMax = Integer.MIN_VALUE,secondMax=Integer.MIN_VALUE;
		
		for (int i = 0; i < data.length; i++) {
			if(firstMax<data[i]) {
				secondMax = firstMax;
				firstMax = data[i]; // 2
			}
			else if(secondMax<data[i] && data[i]<firstMax) {
				secondMax = data[i];
			}
		}
		return secondMax;
	}
	

}
