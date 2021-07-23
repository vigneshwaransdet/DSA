package com.sdet.classtimetasks20July2021;

import org.junit.Assert;
import org.junit.Test;

/*
 * Given a sorted charcter array and a target character, find the 
 * next biggest character in the array.
 * Example:
 * Input : char[] charArr = ['b','d','h'], target = 'e'
 * Output : 'h'
 * 
 * 1. input -> char[]
 * 2. outpur -> char
 * 3. Constraints -> Time -> O(n)
 * 
 * Test Data Set:
 * Positive : ['b','d','h'], target = 'e'
 * Negative : ['b'], t = 'c'
 * Edge : ['b','d','h'], target = 'd' 
 * 
 * Known Approach -> Brute Force
 * 
 * 
 * 
 * 	
 */


public class FineNextBiggestElementCharacter20July2021 {
	
	@Test
	public void test1() {
		char[] input = {'b','d','h'};
		char k = 'e';
		Assert.assertTrue(toFindBiggestTargetCharUsingBS(input,k) == 'h');
		
	}
	
	@Test
	public void test2() {
		char[] input = {'b'};
		char k = 'e';
		Assert.assertTrue(toFindBiggestTargetCharUsingBS(input,k) == ' ');
		
	}
	
	@Test
	public void test3() {
		char[] input = {'b','c','d','g','h'};
		char k = 'a';
		Assert.assertTrue(toFindBiggestTargetCharUsingBS(input,k) == 'b');
	}
	
	@Test
	public void test4() {
		char[] input = {'b','c','d','g','h'};
		char k = 'i';
		Assert.assertTrue(toFindBiggestTargetCharUsingBS(input,k) == ' ');
	}
	
	@Test
	public void test5() {
		char[] input = {'b','c','d','g','h'};
		char k = 'd';
		Assert.assertTrue(toFindBiggestTargetCharUsingBS(input,k) == 'g');
	}
	
	@Test
	public void test6() {
		char[] input = {'b','c','d','g','h'};
		char k = 'c';
		Assert.assertTrue(toFindBiggestTargetCharUsingBS(input,k) == 'd');
	}

	private char toFindBiggestTargetChar(char[] input, char k) {
		for (int i = 0; i < input.length; i++) {
			if(input[i]>k) return input[i];
			
		}
		return ' ';
	}
	
	private char toFindBiggestTargetCharUsingBS(char[] input, char k) {
		int low = 0,high = input.length-1;
		
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(input[mid]==k && (mid+1)<=input.length-1) return input[mid+1];
			else if(input[mid] < k ) low = mid+1;
			else if(input[mid]>k) high=mid-1;
		}
		if(low>=0 && low<input.length) return input[low];
		return ' ';
		
	}

}
