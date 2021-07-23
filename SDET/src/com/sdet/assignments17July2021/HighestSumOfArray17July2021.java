package com.sdet.assignments17July2021;

import org.junit.Test;

import junit.framework.Assert;

public class HighestSumOfArray17July2021 {
	
	@Test
	public void test1() {
		int[] arr= {1,-5,2,-3,7,1};
		
		Assert.assertEquals(toFindHighestSum(arr), 8);
	}

	private int toFindHighestSum(int[] arr) {
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) {
				
			}
		}
		
		return sum;
	}
	
//	private int toFindHighestSum(int[] arr) {	
//		int sum=0,k=2;
//		for (int i = 0; i < k; i++) {
//			sum += arr[i];
//		}
//		int prevSum = sum;
//		
//		for(int i = 1;i<-arr.length-k;i++) {
//			sum += arr[i+k-1]-arr[i-1];
//			prevSum = Math.max(prevSum, sum);
//			}
//		
//		return sum;
//	}
}