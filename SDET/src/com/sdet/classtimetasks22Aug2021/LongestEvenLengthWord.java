package com.sdet.classtimetasks22Aug2021;

import org.junit.Test;

/*
 * Problem: Consider a sentence, we want to find the first word in sentence having a length which is both an even number and greater than or equal to the length of any other word of even length in the sentence. If there are no even length words return “00”.

Example 1: GetLongestEvenLengthWord(“Time to write great code”);

Output: Time

Example 2: GetLongestEvenLengthWord(“Write code for a great time”);

Output: code

Example 3: GetLongestEvenLengthWord(“It is a pleasant day today”);

Output: pleasant

Example 4: GetLongestEvenLengthWord(“The one”);

Output: 00
 * 
 */

public class LongestEvenLengthWord {
	@Test
	public void test1() {
		String s  = "Time to write a great code";
		toFindLongestEvenLengthWord(s);
	}

	private String toFindLongestEvenLengthWord(String s) {
		String[] spliSentences = s.split(" ");
		for (int i = 0; i < spliSentences.length; i++) {
			System.out.println(spliSentences[i]);
			if(spliSentences[i].length()%2==0) {
				return spliSentences[i];
			}
		}
		return "00";
		
	}
	
}
