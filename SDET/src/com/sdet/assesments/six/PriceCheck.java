package com.sdet.assesments.six;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class PriceCheck {
	@Test
	public void test1() {
		List<String> products = Arrays.asList("eggs","milk","cheese");
		List<Float> productPrices =  Arrays.asList(2.89f,3.29f,5.97f);
		List<String> soldProducts = Arrays.asList("eggs","eggs","cheese","milk");
		List<Float> soldProductPrices = Arrays.asList(2.89f,2.99f,5.99f,3.29f);
		Assert.assertEquals(toFindPriceCheck(products,productPrices,soldProducts,soldProductPrices), 2);
	}

	private int toFindPriceCheck(List<String> products, List<Float> productPrices, List<String> soldProducts,
			List<Float> soldProductPrices) {
		int count = 0;
		int index=0;
		Map<String,Float> map = new HashMap<>();
		for (int i = 0; i < products.size(); i++) {
			if(!map.containsKey(products.get(i))) {
				map.put(products.get(i), productPrices.get(i));
			}
		}
		
		for (int i = 0; i < soldProducts.size(); i++) {
			if(soldProductPrices.get(i) - map.get(soldProducts.get(i)) != 0) {
				count++;
			}
		}
		return count;
	}
}
