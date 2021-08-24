package com.sdet.classtimetasks24Aug2021;

/*
 * Input String[][] meetingTimes = {{"09 00", "09 45"},{"09 30", "10 30"},
 * 									{"10 40", "12 00"},{"11 00", "13 00"},
 * 									{"11 45", "14 00"},{"16 00", "17 00"}};
 * Output : 3
 * 
 * PseudoCode:
 * 
 */

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


public class NoOfMeetings {
	@Test
	public void test1() {
		String[][] meetingTimes = {{"09 00", "09 45"},{"09 30", "10 30"},
								{"10 40", "12 00"},{"11 00", "13 00"},
								{"11 45", "14 00"},{"16 00", "17 00"}};
		Assert.assertEquals(toFindMeetingIntervals(meetingTimes), 3);
	}
	
	@Test
	public void test2() {
		String[][] meetingTimes = {{"09 00", "09 30"},{"09 10", "09 40"},
								{"09 50", "10 00"},{"10 40", "11 50"}};
		Assert.assertEquals(toFindMeetingIntervals(meetingTimes), 2);
	}

	private int toFindMeetingIntervals(String[][] meetingTimes) {
		int[][] meetingTimesInt = new int[meetingTimes.length][2];
		
		for (int i = 0; i < meetingTimesInt.length; i++) {
			meetingTimesInt[i][0] = Integer.parseInt(meetingTimes[i][0].replace(" ", ""));
			meetingTimesInt[i][1] = Integer.parseInt(meetingTimes[i][1].replace(" ", ""));
		}
		System.out.println("Before:");
		for (int i = 0; i < meetingTimesInt.length; i++) {
			for (int j = 0; j < meetingTimesInt[i].length; j++) {
				System.out.print(meetingTimesInt[i][j]+" ");
			}
			System.out.println();
		}
		
		Arrays.sort(meetingTimesInt, (a,b) -> {
			if (a[1] != b[1])
				return a[1] - b[1];// end times
			else
				return a[0] - b[0];// start times
		});
		System.out.println("After:");
		for (int i = 0; i < meetingTimesInt.length; i++) {
			for (int j = 0; j < meetingTimesInt[i].length; j++) {
				System.out.print(meetingTimesInt[i][j]+" ");
			}
			System.out.println();
		}
		int left=0,right=1;
		int noOfMeetings = meetingTimesInt.length;
		while(right<meetingTimesInt.length) {
			int endTime=meetingTimesInt[left][1];
			int nextStartTime = meetingTimesInt[right][0];
			if(endTime<=nextStartTime) {
				noOfMeetings--;
				left=right-1; // OR left++; [need to check with this]
			}
			right++;
		}
		return noOfMeetings;
	}

}
