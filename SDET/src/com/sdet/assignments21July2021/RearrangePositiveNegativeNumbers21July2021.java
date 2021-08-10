package com.sdet.assignments21July2021;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
 * Question:
 * 
 * 	array of nums, contains equal no of positve and negative, rearrange in an order +ve and then -ve in alternate positions.
	Constraint: cannot use extra space
	eg : int[] input = {12, -90, -100, 15, 98, 99, -56, -2};
	expected output {12, -90, 15, -100, 98,-56,99,-2} or {12,-100,98,-56,99,-2,15,-90}
 * 
 * 1. Inout -> int[] array
 * 2. Ouput -> int[] array
 * 3. Constraints -> Time Complexity -> 
 * 					 and Space Complexity -> O(1)
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

public class RearrangePositiveNegativeNumbers21July2021 {
	
	@Test
	public void test1() {
		int[] data = {12, -90, -100, 15, 98, 99, -56, -2};
		Assert.assertTrue(Arrays.equals(testMethod(data), new int[] {98, -100, 99, -2, 12, -56, 15, -90}));
	}
	
//	@Test
	public void test2() {
		int[] data = {};
	}

	private int[] testMethod(int[] data) {
		int lessIndex = -1;
		for(int i=0;i<data.length;i++) {
			
			if(data[i]<0) {
				lessIndex++;
				int temp=data[lessIndex];
				data[lessIndex]=data[i];
				data[i]=temp;
			}
		}
		int negativeBound=lessIndex+1,negativeIndex=negativeBound;
		
		for(int positiveIndex=0; positiveIndex < negativeBound && positiveIndex < data.length; positiveIndex+=2,negativeIndex+=1) {
			int temp = data[positiveIndex];
			data[positiveIndex] = data[negativeIndex];
			data[negativeIndex] = temp;
			
			negativeBound++;
		}
		return data;
	}

}
