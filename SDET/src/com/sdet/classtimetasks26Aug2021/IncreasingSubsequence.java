package com.sdet.classtimetasks26Aug2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class IncreasingSubsequence {
	@Test
	public void test1() {
		int[] nums = {4,1,2,5,6,7,8,15,10,11,16};
		Assert.assertEquals(toFindIncreasingSubsequence(nums), new ArrayList<Integer>(Arrays.asList(1, 2, 5, 6, 7, 8, 10, 11, 16)));
	}

	private List<Integer> toFindIncreasingSubsequence(int[] arr) {
		List<Integer> li = new ArrayList<>();
		li.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>li.get(li.size()-1)) {
				li.add(arr[i]);
			}
			else {
				int j=0;
				while(arr[i]>li.get(j)) {
					j++;
				}
				if(j==li.size()-1) {
					li.set(j, arr[i]);
				}
			}
		}
		System.out.println(li);
		return li;
	}
}
