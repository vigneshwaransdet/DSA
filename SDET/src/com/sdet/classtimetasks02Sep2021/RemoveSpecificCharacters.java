package com.sdet.classtimetasks02Sep2021;

import java.util.Stack;
import org.junit.Assert;
import org.junit.Test;

public class RemoveSpecificCharacters {
	@Test
	public void test1() {
		String s = "deeedbbcccbdaa";
		int k = 3;
		Assert.assertEquals(toRemoveSpecificCharacters(s,k), "aa");
	}

	private String toRemoveSpecificCharacters(String s, int k) {
		Stack<Character> charSt = new Stack<>();
		Stack<Integer> charCount = new Stack<>();
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if(!charSt.isEmpty() && charSt.peek()==s.charAt(i)) {
				charSt.push(s.charAt(i));
				charCount.push(charCount.peek()+1);
				if(charCount.peek()==k) {
					for (int j = 0; j < k; j++) {
						charSt.pop();
						charCount.pop();
					}
				}
			}
			else {
				charSt.push(s.charAt(i));
				charCount.push(1);
			}
		}
		String res="";
		for (char out : charSt) {
			res+=out;
		}
		System.out.println(res);
		return res;
	}
	
	
}
