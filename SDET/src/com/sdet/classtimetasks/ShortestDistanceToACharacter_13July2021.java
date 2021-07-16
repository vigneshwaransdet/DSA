package com.sdet.classtimetasks;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
 * Given a string s and a character c that occurs in s,
 * return an array of integers answer where answer.length == s.length and answer[i] is the distance 
 * from index i to the closest occurrence of character c in s.

   The distance between two indices i and j is abs(i - j), where abs is the absolute value function.
 * 
 * Example 1:
 * Input: s = "loveleetcode", c = "e"
   Output: [3,2,1,0,1,0,0,1,2,2,1,0]
   Explanation: The character 'e' appears at indices 3, 5, 6, and 11 (0-indexed).
   The closest occurrence of 'e' for index 0 is at index 3, so the distance is abs(0 - 3) = 3.
   The closest occurrence of 'e' for index 1 is at index 3, so the distance is abs(1 - 3) = 3.
   For index 4, there is a tie between the 'e' at index 3 and the 'e' at index 5, but the distance is still the same: abs(4 - 3) == abs(4 - 5) = 1.
   The closest occurrence of 'e' for index 8 is at index 6, so the distance is abs(8 - 6) = 2.
 * 
 * 
 * Example 2:
 * Input: s = "aaab", c = "b"
   Output: [3,2,1,0]
   
 * Problems Solving Techniques:
 * 1. Do I understand the problem? -Yes
 * a) What is the input? -> int[] array
 * b) What is the output> -> int[] array
 * c) Do I have constraints to solve the problem? 
 * 		-> Yes 
 * 			Constraints:
			1 <= s.length <= 10^4
   			s[i] and c are lowercase English letters.
   			It is guaranteed that c occurs at least once in s.9
 * d) Do I have all the informations to go to next step? -> Yes
 * e) How big is your test data will be? -> 
 * 
 * 2. Test Data Set
 * Positive -> 
 * Negative ->
 * Edge ->
 * 
 * 3.Do I know how to solve it? - Yes 
 * yes -> Is there an alternate? - 
 * 
 * 4. Ask for hint - how to solve this 2 pointer approach?
 *
 * 5. Do I know alternate solutions as well?
 * 		yes -> what are those? 
 * 		No -> Using HashMap
 * 6. If you know the alternate solutions? 
 * Find out the 'O' notations
 * Then explain either both or the best
 * Approach 1: Start with worst -> Using Brute Force
 * Approach 2: Write down the options and the benefits of the code
 * 
 * 7.Pseudo Code 
   
 * 
 * 8.Implement them in the code
 * 9.Debug /Test against the different data set
 * 10.If it fails, debug them to solve it 
 */

public class ShortestDistanceToACharacter_13July2021 {
	
	@Test
	public void test1() {
		String s = "loveleetcode";
		char c = 'e';
		Assert.assertArrayEquals(new int[] {3,2,1,0,1,0,0,1,2,2,1,0}, shortestToChar(s,c));
	}
	
	@Test
	public void test2() {
		String s = "aaab";
		char c = 'b';
		Assert.assertArrayEquals(new int[] {3,2,1,0}, shortestToChar(s,c));
	}
	
	
	private int[] shortestToChar(String s, char c) {
		
		int prev = Integer.MIN_VALUE/2;
		int[] output = new int[s.length()];
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				prev=i;
			}
			output[i]=i-prev;
		}
		prev = Integer.MAX_VALUE/2;
		
		for(int i=s.length()-1;i>=0;i--) {
			
			if(s.charAt(i)==c) {
				prev=i;
			}
			output[i] = Math.min(output[i], prev-i);
		}
		
		System.out.println(Arrays.toString(output));
		return output;
		
		
	}

}
