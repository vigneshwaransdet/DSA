package com.java.theory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/*
 * 
 * 
 * 
 */

public class Encapsulation {
	@Test
	public void test1() {
		toDoEncapsulation();
	}

	private void toDoEncapsulation() {
		String s = "abc";
		s.hashCode();
		List<Integer> li = new ArrayList<>();
		ArrayList<Integer> al = new ArrayList<>();
		List<Integer> li1 = new LinkedList<>();
		LinkedList<Integer> li2 = new LinkedList<>();
	}
}
