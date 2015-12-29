package com.yash.SearchingEJB.sorting;

import java.util.Comparator;

import com.yash.SearchingEJB.domain.Product;

public class SortByVendor implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getVendor().compareToIgnoreCase(o2.getVendor());
	}
}
