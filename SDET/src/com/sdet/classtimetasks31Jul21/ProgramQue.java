package com.sdet.classtimetasks31Jul21;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

/*
 * 
 * Create Queue to store the target sorted elements
 * traverse the queue until less than the queue length
 * start from offerLast until kth element
 * then add the rest elements offerFirst until the length of the element
 * 
 */

public class ProgramQue {
	@Test
	public void test1() {
		int[] arr = {2,4,6,8,10};
		int target = 3;
		Assert.assertTrue(Arrays.equals(toSortTargetElements(arr,target), new int[] {6,4,2,8,10}));
	}

	private int[] toSortTargetElements(int[] arr, int k) {
		ArrayDeque<Integer> qarr = new ArrayDeque<>();
		Stack<Integer> sarr = new Stack<>();
		for (int i = 0; i < k; i++) {
			sarr.push(arr[i]);
		}
		System.out.println(sarr);
		
		for (int i = 0; i < k; i++) {
			qarr.offer(sarr.pop());
		}
		System.out.println(qarr);
		for (int i = k; i < arr.length; i++) {
			qarr.offer(sarr.pop());
			qarr.offer(arr[i]);
		}
		System.out.println(qarr);
		int index =0;
		for (int res : qarr) {
			arr[index++] = res;
		}
		return arr;
	}

}
