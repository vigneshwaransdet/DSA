package com.sdet.classtimetasks07Aug2021;

import org.junit.Assert;
import org.junit.Test;

/*
 * 0,1,1,2,3,5,8,13,21,34
 * 1,2,3,4,5,6,7, 8, 9
 * 
 */

public class FibonacciSeries {
	@Test
	public void test1() {
		int n = 5;
		Assert.assertEquals(toFindFibonacciSeries(n), 3);
	}
	
	@Test
	public void test2() {
		int n = 9;
		Assert.assertEquals(toFindFibonacciSeries(n), 21);
	}

	//Using Brute Force
	private int toFindFibonacciSeries(int n) {
		int fVal = 0, sVal = 1;
		int s = 0;
		for (int i = 2; i < n; i++) {// 2 3 4 < n=5
			s = fVal+sVal; //1 2 3
			fVal = sVal; // 1 1 2
			sVal = s; // 1 2 3
		}
		return s;
	}
	
//	Using Recursion
	private int toFindFibonacciSeriesUsingRecursion(int n) {
		
		if(n<=1) return n;
		
		return toFindFibonacciSeriesUsingRecursion(n-1)+toFindFibonacciSeriesUsingRecursion(n-2);
	}
	
	

}
