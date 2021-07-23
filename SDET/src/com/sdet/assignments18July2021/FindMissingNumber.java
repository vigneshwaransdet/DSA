package com.sdet.assignments18July2021;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

/*
 *P2) Given an array arr of positive integers sorted in a strictly increasing order, and an integer k. Find the kth positive integer that is missing from this array.
 
Example 1:

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

Example 2:

Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6. 
 * 
 * 
 * 
 */

public class FindMissingNumber {

	@Test
	public void test1() {
		int[] data = { 2, 3, 4, 7, 11 };
		int k =5;
		Assert.assertEquals(findMissingNumberUsingBruteForce(data,k), 9);
	}
	
	@Test
	public void test2() {
		int[] data = { 1,2,3,4 };
		int k =2;
		Assert.assertEquals(findMissingNumberUsingBruteForce(data,k), 6);
	}


	private int findMissingNumberUsingBruteForce(int[] data,int k) {
		int i = 1, missingEleCount = 0, missingEle = 0;
		Set<Integer> set = new HashSet<>();
		for (int ele : data) {
			set.add(ele);
		}
		while (1 > 0) {
			if (!set.contains(i)) {
				missingEle = i;
				i++;
				missingEleCount++;
				if(missingEleCount==k) return missingEle;
			}
			else {
				i++;
			}
			 
		}

	}

}
