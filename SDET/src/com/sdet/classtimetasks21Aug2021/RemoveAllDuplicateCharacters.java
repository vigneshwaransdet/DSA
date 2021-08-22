package com.sdet.classtimetasks21Aug2021;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;


/*
 * Question 4:
You are given a string s and an integer k, a k duplicate removal consists of choosing k adjacent and equal letters from s and removing them, causing the left and the right side of the deleted substring to concatenate together. We repeatedly make k duplicate removals on s until we no longer can.
Return the final string after all such duplicate removals have been made. It is guaranteed that the answer is unique.
 
Example 1:
Input: s = "abcd", k = 2
Output: "abcd"
Explanation: There's nothing to delete.
Example 2:
Input: s = "deeedbbcccbdaa", k = 3
Output: "aa"
Explanation: 
First delete "eee" and "ccc", get "ddbbbdaa"
Then delete "bbb", get "dddaa"
Finally delete "ddd", get "aa"
Example 3:
Input: s = "pbbcggttciiippooaais", k = 2
Output: "ps"
 * 
 * 
 * 
 */
public class RemoveAllDuplicateCharacters {
	@Test
	public void test1() {
		String s = "deeedbbcccbdaa";
		int k = 3;
		Assert.assertEquals(toFindRemoveAllDuplicateCharacters(s,k), "aa");
	}
	private String toFindRemoveAllDuplicateCharacters(String s, int k) {
		Stack<Character> charStack = new Stack<>();
		Stack<Integer> charCountStack = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			if(!(charStack.isEmpty()) && charStack.peek()==s.charAt(i)) {
				charStack.push(s.charAt(i));
				charCountStack.push(charCountStack.peek()+1);
				if(charCountStack.peek()==k) {
					for (int j = 0; j < k; j++) {
						charStack.pop();
						charCountStack.pop();
					}
				}
			}
			else {
				charStack.push(s.charAt(i));
				charCountStack.push(1);
			}
		}
		String res = "";
		for (char out : charStack) {
			res+=out;
		}
		System.out.println(res);
		return res;
	}
}
