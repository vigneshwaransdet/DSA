package com.sdet.classtimetasks21Aug2021;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

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
