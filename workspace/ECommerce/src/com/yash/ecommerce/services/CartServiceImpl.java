package com.yash.ecommerce.services;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.yash.ecommerce.beans.CartBeans;
import com.yash.ecommerce.dao.CartDAO;

@Default
public class CartServiceImpl implements CartService {
	@Inject
	CartDAO cartDAO;

	@Override
	public String addToCart(CartBeans cartBeans) {
		cartDAO.addProductDetails(cartBeans);
		return "home";
	}

	@Override
	public List getCart(String username) {
		List list=new ArrayList();
		
		list=cartDAO.getCartDetails(username);
		return list;
	}

	@Override
	public int getItemCount(String username) {
		int count=0;
		count=cartDAO.getCartCount(username);
		return count;
	}

}
