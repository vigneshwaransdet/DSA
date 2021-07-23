package com.sdet.assignments18July2021;

import org.junit.Test;


/* Pseudo Code for Linear Approach:
 * Assign the given num to another var result
 * check condition num > 0
 * decrement the given num
 * multiply the decremented value with the same
 * check condition where result == multiplied value
 * else check condition multiplied value < result
 * return the current num 
 * 
 */

/*
 * Pseudo Code for Binary Search
 * 
 * to find the average of input divided with 2
 * multiply the average value with the same is equal to num and return the average
 * else multiplied average value < num return the average
 * 
 */

public class FindSquareRoot18July2021 {
	
//	@Test
	public void test1() {
		int num = 0;
		System.out.println(squareRootNumUsingLinear(num));
	}
	
	@Test
	public void test2() {
		int num = 17;
		System.out.println(squareRootNumUsingBinary(num));
	}
	
	private int squareRootNumUsingBinary(int num) {
		int midNum=num;
		while(midNum>0) {
			midNum = midNum/2;
			if(midNum*midNum==num)return midNum;
			if(midNum*midNum<num)return midNum;
		}
		
		return 0;
	}

	private int squareRootNumUsingLinear(int num) {
			
		int actualNum = num;
		while(num>0) {
			num--;
			if(num*num==actualNum) return num;
			if(num*num<actualNum) return num;
		}
		return 0;
	}
	
	

}
