package com.sdet.classtimetasks07Aug2021;

import org.junit.Assert;
import org.junit.Test;



/*
 * Fibonacci Series 
 * 0,1,1,2,3,5,8,13,.....
 * 
 * Pseudocode:
 * 
 * 
 */

public class FibonacciSeries01 {
	@Test
	public void test1() {
		int n=5;
		Assert.assertEquals(toFind(n), 3);
		
	}
	
	private int toFind(int n) {
		if(n==1) return 0;
		if(n==2) return 1;
		
		return toFind(n-1)+toFind(n-2);
	}

}
