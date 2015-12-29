package com.yash.SearchingEJB.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.yash.SearchingEJB.domain.Product;
import com.yash.SearchingEJB.sorting.SortByCity;
import com.yash.SearchingEJB.sorting.SortByProductName;
import com.yash.SearchingEJB.sorting.SortByVendor;

/**
 * Session Bean implementation class ProductEJBService
 */
@Stateless
@LocalBean
public class ProductEJBService implements ProductEJBServiceLocal {

	/**
	 * Default constructor.
	 */
	public ProductEJBService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Product> searchProduct(Product productTOBE, List<Product> listProduct, String sort) {
		// TODO Auto-generated method stub
		List<Product> searchedProduct = new ArrayList<>();
		String check = "--Select--";

		for (Product product : listProduct) {

			// 1 All empty
			if (check.equalsIgnoreCase(productTOBE.getName()) && check.equalsIgnoreCase(productTOBE.getVendor())
					&& check.equalsIgnoreCase(productTOBE.getCity())) {
				searchedProduct = listProduct;
			}

			// 2 All filled
			else if (product.getName().equalsIgnoreCase(productTOBE.getName())
					&& product.getCity().equalsIgnoreCase(productTOBE.getCity())
					&& product.getVendor().equalsIgnoreCase(productTOBE.getVendor())) {
				searchedProduct.add(product);
			}

			// 3 Name empty
			else if (check.equalsIgnoreCase(productTOBE.getName())
					&& product.getCity().equalsIgnoreCase(productTOBE.getCity())
					&& product.getVendor().equalsIgnoreCase(productTOBE.getVendor())) {

				searchedProduct.add(product);

			}
			// 4 Vendore empty
			else if (product.getName().equalsIgnoreCase(productTOBE.getName())
					&& product.getCity().equalsIgnoreCase(productTOBE.getCity())
					&& check.equalsIgnoreCase(productTOBE.getVendor())) {

				searchedProduct.add(product);

			}
			// 5 city empty
			else if (product.getName().equalsIgnoreCase(productTOBE.getName())
					&& product.getVendor().equalsIgnoreCase(productTOBE.getVendor())
					&& check.equalsIgnoreCase(productTOBE.getCity())) {

				searchedProduct.add(product);

			}

			// 6 name and city empty
			else if (check.equalsIgnoreCase(productTOBE.getName())
					&& product.getVendor().equalsIgnoreCase(productTOBE.getVendor())
					&& check.equalsIgnoreCase(productTOBE.getCity())) {

				searchedProduct.add(product);

			}
			// 7 city and vendore empty
			else if (product.getName().equalsIgnoreCase(productTOBE.getName())
					&& check.equalsIgnoreCase(productTOBE.getVendor())
					&& check.equalsIgnoreCase(productTOBE.getCity())) {
				searchedProduct.add(product);

			}
			// 8 name and vendor empty
			else if (check.equalsIgnoreCase(productTOBE.getName()) && check.equalsIgnoreCase(productTOBE.getVendor())
					&& product.getCity().equalsIgnoreCase(productTOBE.getCity())) {

				searchedProduct.add(product);

			}

		}
		if ("product".equalsIgnoreCase(sort)) {
			Collections.sort(searchedProduct, new SortByProductName());
		} else if ("vendor".equalsIgnoreCase(sort)) {

			Collections.sort(searchedProduct, new SortByVendor());
		} else if ("city".equalsIgnoreCase(sort)) {

			Collections.sort(searchedProduct, new SortByCity());
		}

		return searchedProduct;
	}

}
