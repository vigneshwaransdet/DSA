package com.sdet.classtimetasks21Aug2021;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


/*
 * Question 6:
Swap any two digits to get the biggest number
 
Example 1:
Input: num = 2736. 
Output: 7236
Explanation: Swap the number 2 and the number 7.
Example 2:
Input: num = 9973
Output: 9973
Explanation: No swap.
981405,1996
 * 
 * 
 */

public class SwapAnyTwoDigitsToGetTheBiggestNumber {
	@Test
	public void test1() {
		int num = 2736;
		Assert.assertEquals(toFindSwapAnyTwoDigitsToGetTheBiggestNumber(num), 7236);
	}
	
	@Test
	public void test2() {
		int num = 98405;
		Assert.assertEquals(toFindSwapAnyTwoDigitsToGetTheBiggestNumber(num), 98504);
	}
	
	@Test
	public void test3() {
		int num = 1996;
		Assert.assertEquals(toFindSwapAnyTwoDigitsToGetTheBiggestNumber(num), 9916);
	}
	
	private int toFindSwapAnyTwoDigitsToGetTheBiggestNumber(int num) {
		List<Integer> li = new ArrayList<>();
		int left=0;
		int temp = 0;
		while(num > 0) {
			temp = num%10;
			li.add(0,temp);
			num = num/10;
		}
		for (left = 1; left < li.size(); left++) {
			if(li.get(left)>li.get(left-1)) {
				break;
			}
		}
		
		int max=-1;int index=0;
		for(int i = left;i<li.size();i++) {
			if(max<=li.get(i)) {
				max = li.get(i);
				index=i;
			}
		}
		for (int i = 0; i < li.size(); i++) {
			if(li.get(i)<max) {
				int temp1 = li.get(i);
				li.set(index, temp1);
				li.set(i,max);
				break;
			}
		}
		String res = "";
		for (int out : li) {
			res+=out;
		}
		return Integer.parseInt(res);
	}
}
