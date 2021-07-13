package com.sdet.assignments;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.Test;

import junit.framework.Assert;

//import static java.util.stream.Collectors.groupingBy;
//import java.util.Arrays;
//import static java.util.stream.Collectors.counting;
//import static java.util.function.Function.identity;
//import java.util.List;

//**************************************************************************************************
//Using Java 1.8, below code is used to count the unique values. But, yet to work it on more
//List li = Arrays.asList(arr);
//map = (Map<Integer, Integer>) li.stream().collect(groupingBy(identity(),counting()));
//**************************************************************************************************

/*
 * Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.
 *	Example 1:
 *	Input: arr = [1,2,2,1,1,3]
 *	Output: true
 * 1. Do I understand the problem? -> Yes
 * 		-> 1.a) what is the input? -> int[] array
 * 		-> 1.b) what is the expected output? -> boolean
 * 		-> 1.c) Do I have constraints to solve the problem?
 * 		-> 1.d) Do I have all the informations to go to next step? -> yes
 * 		-> 1.e) How big is your test data set will be? -> 3 set
 * 2. Test Data Set
 * 		Positive  
 * 		Negative  
 * 		Edge 
 * 3. Do I know how to solve it? 
 * 		yes -> Is there an alternate? -> No
 * 		No -> Break down the problem into subproblems
 * 4. Ask for hint
 * 5. Do I know alternate solutions as well?
 * 		yes -> what are those? 
 * 		No -> HashMap
 * 6. If you know the alternate solutions? - No
 * 7. Pseudo Code
 * 		-> Input : int[] arr = {1,2,2,1,1,3}
 * 		-> Output : return true if no of occurences of array elements unique
 * 		-> Expectation : true
 * 		-> if the element occurred in the array for the first time then, 
 * 			insert the array elements to map as key,value pair -> key - array, value -> 1
 * 				else, by adding 1 to value  
 * 		->  Declare Set for to find the unique values from the map
 * 		->  set flag value as "1"
 * 		->  Traverse the map using entryset
 * 		-> To check if no values should be duplicate then add the value in the set then return true
 * 				else set the flag as "0" and return false 
 */


public class NumberOfConsequencesArrayIsUnique_04Jul2021 
{
	@Test
	public void testPositive()
	{
		int[] arr = {1,2,2,1,1,3,3};
		System.out.println(noOfConArrUnique(arr));
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void testNegative()
	{
		int[] arr = {1,2,2,1,1,3,3};
		System.out.println(noOfConArrUnique(arr));
		Assert.assertEquals(false, false);
	}
	
	@Test
	public void testEdge()
	{
		int[] arr = {2,2,2,2,2};
		System.out.println(noOfConArrUnique(arr));
		Assert.assertEquals(true, true);
	}

	private boolean noOfConArrUnique(int[] arr) 
	{
		Map<Integer,Integer> map = new HashMap<Integer,Integer>(); // O()
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i], 1);
			}
			
			else
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		Set<Integer> set = new HashSet<>();
		int flag = 1;
		for (Map.Entry<Integer,Integer> n : map.entrySet()) 
		{
			if(!set.contains(n.getValue()))
			{
				set.add(n.getValue());
			}
			else
			{
				flag = 0;
				return false;
			}
		}
		
		if(flag==1)
			return true;
		else
		return false;
		
	}
}
