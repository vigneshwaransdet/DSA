package com.sdet.assesments.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.junit.Assert;
import org.junit.Test;


public class GroupingTranscationsByItemsNames {
	
	@Test
	public void test1() {
		String[] str = {"notebook","notebook","mouse","keyboard","mouse"};
		List<String> transactions = new ArrayList<>(Arrays.asList(str));
		Assert.assertEquals(toGroupingTranscationsByItemsNamesMethod(transactions), Arrays.asList("mouse2","notebook2","keyboard1"));
	}

	public static List<String> toGroupingTranscationsByItemsNamesMethod(List<String> transactions) {
		
		Map<String,Integer> map = new TreeMap<>();
		for (int i = 0; i < transactions.size(); i++) {
			map.put(transactions.get(i), map.getOrDefault(transactions.get(i), 0)+1);
		}
		
		int index = 0;
		List<String> li = new ArrayList<>();
		for (Map.Entry<String,Integer> mapEle : map.entrySet()) {
			//add the first entry to list
			int prevVal = 0;
			if(index==0) {
				li.add(mapEle.getKey()+""+mapEle.getValue());
			}
			else {
				//check if the current value is greater than previous
				if(mapEle.getValue()>prevVal) {
					li.add(index-1,mapEle.getKey()+""+mapEle.getValue());
				}
				else {
					li.add(index, mapEle.getKey()+""+mapEle.getValue());
				}
				
			}
			
			prevVal = mapEle.getValue();
			index++;
		}
		System.out.println(li);
		return li;
	}

}
