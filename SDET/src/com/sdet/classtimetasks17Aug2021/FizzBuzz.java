package com.sdet.classtimetasks17Aug2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/*
 * Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i if non of the above conditions are true.
 * 
 * 
 * Example 1:

Input: n = 3
Output: ["1","2","Fizz"]

Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]

Example 3:

Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 * 
 * 
 * input -> int
 * output -> String
 * 
 * Constraints -> Use Map and Two Pointers
 * 
 * Time 
 * Understand the Question - 2 mins
 * Think the logic - 
 * 
 */


public class FizzBuzz {
	@Test
	public void test1() {
		int n = 3;
		List<String> list = Arrays.asList("1","2","Fizz");
		Assertions.assertEquals(toFindFizzBuzzUsingTwoPointers(n), list);
//		Assertions.assertEquals(toFindFizzBuzzUsingBruteForce(n), list);
	}
	
	@Test
	public void test2() {
		int n = 5;
		List<String> list = Arrays.asList("1","2","Fizz","4","Buzz");
		Assertions.assertEquals(toFindFizzBuzzUsingTwoPointers(n), list);
//		Assertions.assertEquals(toFindFizzBuzzUsingBruteForce(n), list);
	}
	
	@Test
	public void test3() {
		int n = 15;
		List<String> list = Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");
		Assertions.assertEquals(toFindFizzBuzzUsingTwoPointers(n), list);
//		Assertions.assertEquals(toFindFizzBuzzUsingBruteForce(n), list);
	}
	
	private List<String> toFindFizzBuzzUsingBruteForce(int n) {
		List<String> li = new ArrayList<>(); 
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0) {
				li.add("FizzBuzz");
			}
			else if(i%5==0) {
				li.add("Buzz");
			}
			else if(i%3==0) {
				li.add("Fizz");
			}
			
			else {
				li.add(String.valueOf(i));
			}
		}
		
		System.out.println(li);
		return li;
	}
	
	private List<String> toFindFizzBuzzUsingTwoPointers(int n) {
		int left=1,right=n;
		List<String> li = new ArrayList<>();
//		List<String> li = Arrays.asList(new String[n]); // refer for list add specific index
		String[] sa = new String[n];
		while(left<=right) {
			if(left%3 ==0 && left%5==0) {
//				li.set(n, "FizzBuzz");// refer for list add specific index
				sa[left-1] = "FizzBuzz";
			}
			else if(left%5==0) {
				sa[left-1] = "Buzz";
			}
			else if(left%3==0) {
				sa[left-1] = "Fizz";
			}
			else {
				sa[left-1] = String.valueOf(left);
			}
			if(right!=left) {
				if(right%3 ==0 && right%5==0) {
					sa[right-1] = "FizzBuzz";
				}
				else if(right%5==0) {
					sa[right-1] = "Buzz";
				}
				else if(right%3==0) {
					sa[right-1] = "Fizz";
				}
				else{
					sa[right-1] = String.valueOf(right);
				}
			}
			left++;
			right--;
		}
		System.out.println(Arrays.toString(sa));
		for (String string : sa) {
			li.add(string);
		}
		return li;
	}
}
