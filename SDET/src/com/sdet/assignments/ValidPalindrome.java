package com.sdet.assignments;

import org.junit.Assert;
import org.junit.Test;

public class ValidPalindrome {
	
	@Test
	public void test1() {
		String s = "abca";
		Assert.assertEquals(true,checkValidPalindrome(s));
	}
	
	@Test
	public void test2() {
		String s = "abacba";
		checkValidPalindrome(s);
		Assert.assertEquals(true,checkValidPalindrome(s));
	}
	
	private boolean checkValidPalindrome(String s) {
		int L=0,R=s.length()-1;
		while(L<R && s.charAt(L)==s.charAt(R)) {
				L++;
				R--;
		}
		
		if(forValidPalindrome(s,L,R-1) || forValidPalindrome(s,L+1,R)) {
			return true;
		}
		
		return false;
	}
	
	private boolean forValidPalindrome(String s,int L,int R) {
		
		while(L<R) {
			if(s.charAt(L)==s.charAt(R)){
				L++;
				R--;
			}
			else return false;
		}
		return true;
	}
}
