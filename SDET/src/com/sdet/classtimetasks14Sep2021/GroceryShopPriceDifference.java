package com.sdet.classtimetasks14Sep2021;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;


/*
 * You have an old grocery shop that instead of scanning their sold products once sold, they type in the prices, which leaves room for mistyping sold prices. Given 4 lists: 
soldItems = ['eggs', 'milk', 'apple'], 
soldPrices = [1.00, 2.50, 2.1], 
productsAvailable = ['eggs', 'lemons', 'milk', 'apple'], 
productPrices = [1.01, 0.5, 2.50, 2.1], 
Find the number of items with mistyped prices
 * 
 * Input -> String[],float
 * Output -> int
 * 
 * 
 * 
 */

public class GroceryShopPriceDifference {
	@Test
	public void test1() {
		List<String> productsAvailable = Arrays.asList("eggs","lemons","milk","apple");
		List<Float> productPrices = Arrays.asList(1.01f, 0.5f, 2.50f, 2.1f);
		List<String> soldItems = Arrays.asList("eggs","milk","apple");
		List<Float> soldPrices = Arrays.asList(1.00f, 2.50f, 2.1f);
		Assert.assertEquals(toFindGroceryShopPriceDifference(productsAvailable,productPrices,soldItems,soldPrices), 1);
	}

	private int toFindGroceryShopPriceDifference(List<String> productsAvailable, List<Float> productPrices,
			List<String> soldItems, List<Float> soldPrices) {
		int count = 0;
		int index=0;
		Map<String,Float> map = new HashMap<>();
		for (int i = 0; i < productsAvailable.size(); i++) {
			if(!map.containsKey(productsAvailable.get(i))) {
				map.put(productsAvailable.get(i), productPrices.get(i));
			}
		}
		
		for (int i = 0; i < soldItems.size(); i++) {
			if(soldPrices.get(i) - map.get(soldItems.get(i))!=0) {
				count++;
			}
		}
		return count;
	}
}
