package com.collectionsconcept.hashmap.internalworking;

import java.util.HashMap;
import java.util.Map;

public class HashcodeIndexValue 
{
	public static void main(String[] args) 
	{
		String s1 = "Babu";
		String s2 = "SSP";
		String s3 = "Sarathy";
		String s4 = "Haja";
		
//		Get the hashcode -> int
		System.out.println(s1.hashCode());
		int hashcode1 = s1.hashCode();
		
		System.out.println(s2.hashCode());
		int hashcode2 = s2.hashCode();
		
		System.out.println(s3.hashCode());
		int hashcode3 = s3.hashCode();
		
		System.out.println(s4.hashCode());
		int hashcode4 = s4.hashCode();
		
		int n1 = 15; // 2^4
		int n2 = 31;
		
//		Get the index
		System.out.println("Capactity : 16");
		int index1 = hashcode1 & (n1-1);
		System.out.println(index1);
		
		int index2 = hashcode2 & (n1-1);
		System.out.println(index2);
		
		int index3 = hashcode3 & (n1-1);
		System.out.println(index3);
		
		int index4 = hashcode4 & (n1-1);
		System.out.println(index4);
		
		System.out.println("Capactity : 32");
		int index5 = hashcode1 & (n2-1);
		System.out.println(index5);
		
		int index6 = hashcode2 & (n2-1);
		System.out.println(index6);
		
		int index7 = hashcode3 & (n2-1);
		System.out.println(index7);
		
		int index8 = hashcode4 & (n2-1);
		System.out.println(index8);
	}
}
