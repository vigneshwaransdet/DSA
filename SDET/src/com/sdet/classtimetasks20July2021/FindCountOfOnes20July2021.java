package com.sdet.classtimetasks20July2021;

import org.junit.Assert;
import org.junit.Test;

/*
 * Given a sorted  array with ones and zeros, find the count of how many ones.

Input : int[] nums = {0,0,0,1,1,1,1};

Output: int = 4

Constraint - > TC - less than O(n) and not allowed to use extra space 
 * 
 * 
 * 
 * 
 */

public class FindCountOfOnes20July2021 {
	
	@Test
	public void test1() {
		int[] data = {0,0,0,1,1,1,1};
//		Assert.assertEquals(findCountOfOnesUsingBF(data),4);
//		Assert.assertEquals(findCountOfOnesUsingTP(data),4);
		Assert.assertEquals(findCountOfOnesUsingBS(data),4);
	}
	
	@Test
	public void test2() {
		int[] data = {0,0,0,0,0,0};
//		Assert.assertEquals(findCountOfOnesUsingBF(data),0);
//		Assert.assertEquals(findCountOfOnesUsingTP(data),0);
		Assert.assertEquals(findCountOfOnesUsingBS(data),0);
	}
	
	@Test
	public void test3() {
		int[] data = {};
//		Assert.assertEquals(findCountOfOnesUsingBF(data),0);
//		Assert.assertEquals(findCountOfOnesUsingTP(data),0);
		Assert.assertEquals(findCountOfOnesUsingBS(data),0);
	}
	
	@Test
	public void test4() {
		int[] data = {1,1,1,1,1,1};
//		Assert.assertEquals(findCountOfOnesUsingBF(data),6);
//		Assert.assertEquals(findCountOfOnesUsingTP(data),6);
		Assert.assertEquals(findCountOfOnesUsingBS(data),6);
	}
	
	private int findCountOfOnesUsingBF(int[] data) {
		
		
		return 0;
	}
	
	private int findCountOfOnesUsingTP(int[] data) {
		int left = 0,right = data.length-1;
		while(left<=right) {
			if(data[left]==1) return data.length-left;
			else if(data[right]==0) return data.length-1-right;
			left++;
			right--;
		}
		
		return left;
	}
	
	private int findCountOfOnesUsingBS(int[] data) {
		int low=0,high=data.length-1;
		if(data.length==1 && data[high]==0) return 0;
		while(low<=high) {
			int mid = low + (high-low)/2;
			if(data[mid]==1 && data[low] == data[high]) return high-low+1;
			else if(data[mid]==1 && data[low]<1) low++;
			else if(data[mid]<1) low=mid+1;
			else high = mid-1;
		}
		return 0;
	}
}
