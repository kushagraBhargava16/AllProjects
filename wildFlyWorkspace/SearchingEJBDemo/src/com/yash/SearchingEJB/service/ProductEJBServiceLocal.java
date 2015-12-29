package com.yash.SearchingEJB.service;

import java.util.List;

import javax.ejb.Local;

import com.yash.SearchingEJB.domain.Product;

@Local
public interface ProductEJBServiceLocal {
	public List<Product> searchProduct(Product product, List<Product> listProduct, String sortBy);
}
