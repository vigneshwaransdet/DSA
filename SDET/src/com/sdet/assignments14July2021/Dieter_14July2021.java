package com.sdet.assignments14July2021;

import org.junit.Assert;
import org.junit.Test;

/*
 * 1) A dieter consumes calories[i] calories on the i-th day. For every consecutive sequence of k days, they look at T, the total calories consumed during that sequence of k days:

If T < lower, they performed poorly on their diet and lose 1 point;
If T > upper, they performed well on their diet and gain 1 point;
Otherwise, they performed normally and there is no change in points.
Return the total number of points the dieter has after all calories.length days.

Note that: The total points could be negative.

Example 1:
Input: calories = [1,2,3,4,5], k = 1, lower = 3, upper = 3
Output: 0
Explaination: calories[0], calories[1] < lower and calories[3], calories[4] > upper, total points = 0.

Example 2:
Input: calories = [3,2], k = 2, lower = 0, upper = 1
Output: 1
Explaination: calories[0] + calories[1] > upper, total points = 1.

Example 3:
Input: calories = [6,5,0,0], k = 2, lower = 1, upper = 5
Output: 0
Explaination: calories[0] + calories[1] > upper, calories[2] + calories[3] < lower, total points = 0.
 * 
 * 
 * 
 */

public class Dieter_14July2021 {
	
	@Test
	public void test1() {
		int[] arr = {1,2,3,4,5};
		int k = 1, lower = 3,upper = 3;
		Assert.assertEquals(returnDieterPoints(arr,k,lower,upper), 0);
	}
	
	@Test
	public void test2() {
		int[] arr = {3,2};
		int k = 2, lower = 0,upper = 1;
		Assert.assertEquals(returnDieterPoints(arr,k,lower,upper), 1);
	}
	
	@Test
	public void test3() {
		int[] arr = {6,5,0,0};
		int k = 2, lower = 1,upper = 5;
		Assert.assertEquals(returnDieterPoints(arr,k,lower,upper), 0);
	}
	
	
	private int returnDieterPoints(int[] arr,int k,int l,int u) {
		
		int sum = 0 ,t=0;
		for(int i=0;i<k;i++) {
			sum = sum+arr[i];
		}
		if(sum<l) t--;
		else if(sum>u) t++;
		
		for(int i=1;i<arr.length;i++) {
			if((i+k-1)<arr.length) {
				if(k<arr.length) {
					sum = sum+arr[i+k-1]-arr[i-1];
					if(sum<l) t--;
					else if(sum>u) t++;
					
				}
				else return t;
			}
		}
		
		return t;
	}

}
