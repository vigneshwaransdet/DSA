package com.sdet.assesments.four;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class ConferenceScehdule {
	@Test
	public void test1() {
		List<Integer> start = Arrays.asList(1,1,2,3);
		List<Integer> end = Arrays.asList(2,3,3,4);	
		Assert.assertEquals(toFindProblem3(start,end), 3);
	}
	
	@Test
	public void test2() {
		List<Integer> start = Arrays.asList(6,1,2,3);
		List<Integer> end = Arrays.asList(8,9,4,7);	
		Assert.assertEquals(toFindProblem3(start,end), 2);
	}
	
	@Test
	public void test3() {
		List<Integer> start = Arrays.asList(6,3,3,7,2,3,5,6,7,6,15,4,7,8);
		List<Integer> end = Arrays.asList(8,9,4,7);	
		Assert.assertEquals(toFindProblem3(start,end), 2);
	}
	
	

	private int toFindProblem3(List<Integer> start, List<Integer> end) {
		int count = 0;
		if(start.get(0)<end.get(0)) {
			count++;
		}
		int j=1;	
		int sIndex=0,eIndex=0;
		for (int i = 1; i < start.size(); i++) {
			if(start.get(sIndex) != start.get(i) && end.get(eIndex)<end.get(j)) {
				count++;
			}
			j++;
		}
		
//		System.out.println(count);
		return count;
	}
}
