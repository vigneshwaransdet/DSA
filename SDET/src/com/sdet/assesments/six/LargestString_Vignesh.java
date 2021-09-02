package com.sdet.assesments.six;

import org.junit.Assert;
import org.junit.Test;

public class LargestString_Vignesh {
	@Test
	public void test1() {
		String s = "baccc";
		int k =2;
		Assert.assertEquals(toFindLargestString_Vignesh(s,k), "ccbca");
	}
	
	@Test
	public void test2() {
		String s = "zzzazz";
		int k =2;
		Assert.assertEquals(toFindLargestString_Vignesh(s,k), "zzazz");
	}

	@Test
	public void test3() {
		String s = "abcccaa";
		int k =2;
		Assert.assertEquals(toFindLargestString_Vignesh(s,k), "ccbcaa");
	}
	
	private String toFindLargestString_Vignesh(String s,int k) {
		int[] ascciArr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			ascciArr[(char)(s.charAt(i)-'a')]++;
		}
		int replaceCharCount = 0,temp=0,index=-1;
		StringBuilder sb = new StringBuilder("");
		for (int i = 25; i >=0; i--) {
			if(ascciArr[i]==0) continue;
			
			while(replaceCharCount>0 && ascciArr[i]>0) {
				index = sb.indexOf("1");
				char c = (char) (i+'a');
				sb.replace(index, index+1,c+"");
				replaceCharCount--;
				ascciArr[i]--;
			}
			temp=0;
			while(ascciArr[i]>0) {
				if(temp<k) {
					char c = (char) (i+'a');
					sb.append(c);//c c 1 c
					temp++;//1
					ascciArr[i]--;//c-0
				}
				else {
					sb.append('1');//c c 1
					temp=0;
					replaceCharCount++;//1
				}
			}
		}
		
		index = sb.indexOf("1");
		return (index >=0)? sb.substring(0, index) : sb.toString();
	}
}
