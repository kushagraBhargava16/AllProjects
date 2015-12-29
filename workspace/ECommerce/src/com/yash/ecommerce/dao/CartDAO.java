package com.yash.ecommerce.dao;

import java.util.List;

import com.yash.ecommerce.beans.CartBeans;

public interface CartDAO {
	public void addProductDetails(CartBeans cartBeans);
	public List getCartDetails(String username);
	public int getCartCount(String username);
}
