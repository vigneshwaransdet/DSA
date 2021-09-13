package com.sdet.classtimetasks13Sep2021;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import org.junit.Assert;
import org.junit.Test;

public class ValidParanthesis {
	@Test
	public void test1() {
		String s = "()";
		Assert.assertEquals(toFindValidParanthesis(s),true);
	}
	
	@Test
	public void test2() {
		String s = "()[]{}";
		Assert.assertEquals(toFindValidParanthesis(s),true);
	}
	
	@Test
	public void test3() {
		String s = "(]";
		Assert.assertEquals(toFindValidParanthesis(s),false);
	}
	
	@Test
	public void test4() {
		String s = "([)]";
		Assert.assertEquals(toFindValidParanthesis(s),false);
	}
	
	@Test
	public void test5() {
		String s = "{[]}";
		Assert.assertEquals(toFindValidParanthesis(s),true);
	}

	private boolean toFindValidParanthesis(String s) {
		Map<Character,Character> map = new HashMap<>();
		for (int i = 0; i < 3; i++) {
			map.put(')', '(');
			map.put('}', '{');
			map.put(']', '[');
		}
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
		if(!st.isEmpty() && st.peek() == map.get(s.charAt(i))) {
				st.pop();
			}
			
			else if(!st.isEmpty() && st.peek() == map.get(s.charAt(i))) {
				st.pop();
			}
			
			else if(!st.isEmpty() && st.peek() == map.get(s.charAt(i))) {
				st.pop();
			}
			else {
				st.push(s.charAt(i));
			}
		}
		if(st.isEmpty()) return true;
		return false;
	}
	

}
