package com.sdet.assignments25July2021;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

/*
 * 
 * 2. question : remove adjacent characters

		Remove the adjacent duplicates in a string
		abbaaba = aba
		abccba  = empty string
 * 
 * input -> String
 * output -> String
 * Constraints -> TC - O(n), SC - O(n)
 * Approach -> Using Stack
 * 
 * Pseudocode:
 * -Declare the Stack and push the first character of the String to the stack
 * -Traverse the each character of the string 
 * -If stack.peek() == string.charAt(i)
 * 		then stack.pop()
 * -else 
 * 		then stack.push(string.charAt(i)) 
 * 
 * if stack is empty return the empty string
 * else return available character(s)
 * 
 * 
 * 
 */

public class RemoveAdjacentCharacters {
	
	@Test
	public void test1() {
		String s = "adda";
		Assert.assertEquals(findValidPalindrome(s),"");
	}
	
	@Test
	public void test2() {
		String s = "abbab";
		Assert.assertEquals(findValidPalindrome(s),"b");
	}

	private String findValidPalindrome(String s) {
        Stack<Character> stack = new Stack<Character>();
        stack.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++) {
        	if(!stack.isEmpty() && stack.peek()==s.charAt(i)) stack.pop();
            else stack.push(s.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder();
        
        
        return sb.toString();
	}

}
