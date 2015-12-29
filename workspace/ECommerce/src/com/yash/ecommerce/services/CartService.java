package com.yash.ecommerce.services;

import java.util.List;

import com.yash.ecommerce.beans.CartBeans;

public interface CartService {
	public String addToCart(CartBeans cartBeans);
	public List getCart(String username);
	public int getItemCount(String username);
}
