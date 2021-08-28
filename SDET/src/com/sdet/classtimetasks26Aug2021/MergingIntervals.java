package com.sdet.classtimetasks26Aug2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/*
 * Given an array of intervals [[1,3],[2,4],[6,9]], merge the overlapping intervals, i.e to [[1,4],[6,9]]

Input : [[1,4],[2,3],[3,6]]

Output : [1,6]
 * 
 * Input -> int[][]
 * Output -> int[][]
 * 
 * 
 * 
 * 
 */

public class MergingIntervals {
	@Test
	public void test1() {
		int[][] nums = {{1,3},{2,4},{6,9}};
//		System.out.println(Arrays.deepToString(nums));
		Assert.assertArrayEquals(toFindMergingIntervals(nums), new int[][] {{1,4},{6,9}});
		
	}
	
	@Test
	public void test2() {
		int[][] nums = {{1,4},{2,3},{3,6}};
//		System.out.println(Arrays.deepToString(nums));
		Assert.assertArrayEquals(toFindMergingIntervals(nums), new int[][] {{1,6}});
	}

	private int[][] toFindMergingIntervals(int[][] nums) {
		Arrays.sort(nums, (a,b) -> {
			return a[0]-b[0];
		});
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		List<int[]> li = new ArrayList<>();
		li.add(nums[0]);
		int[] end = li.get(0);
		int endIndex = end[1];
		int j = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if(endIndex >= nums[i][0]) {
				li.get(j)[1] = Math.max(endIndex, nums[i][1]);
			}
			else {
				li.add(nums[i]);
				j++;
			}
			endIndex = li.get(j)[1];
		}
		
		int[][] array = li.toArray(new int[li.size()][2]);
		System.out.println(Arrays.deepToString(array));
		
		return array;
	}
}
