package com.yash.SearchingEJB.sorting;

import java.util.Comparator;

import com.yash.SearchingEJB.domain.Product;

public class SortByProductName implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {

		return o1.getName().compareToIgnoreCase(o2.getName());
	}

}
