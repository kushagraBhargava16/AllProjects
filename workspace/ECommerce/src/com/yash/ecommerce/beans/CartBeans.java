package com.yash.ecommerce.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.yash.ecommerce.domain.User;
import com.yash.ecommerce.services.CartService;

@ManagedBean
@SessionScoped
public class CartBeans {
	private int productId;
	private String productName;
	private int productPrice;
	private int quantity;
	private int totalPrice = 0;
	private String username;
	private List cartProducts = new ArrayList();
	private int count=0;


	HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
			.getExternalContext().getSession(true);
	User user = (User) session.getAttribute("user");

	public int getCount() {
		count=(cartService.getItemCount(user.getUsername()));
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List getCartProducts() {
		return cartProducts;
	}

	public void setCartProducts(List cartProducts) {
		this.cartProducts = cartProducts;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Inject
	CartService cartService;

	public String setCartDetails() {

		HttpServletRequest req = (HttpServletRequest) FacesContext
				.getCurrentInstance().getExternalContext().getRequest();

		String name = req.getParameter("name");

		int price = Integer.parseInt(req.getParameter("price"));

		setProductName(name);

		setProductPrice(price);

		setUsername(user.getUsername());
		totalPrice = quantity * price;

		setTotalPrice(totalPrice);

		cartService.addToCart(this);
		count = cartService.getItemCount(user.getUsername());
		// System.out.println(quantity + " " + a + "  " + b);
		System.out.println(count);
		return "home";
	}

	public String getCartDetails() {

		setUsername(user.getUsername());
		cartProducts = cartService.getCart(username);
		return "paySlip";
	}

	@Override
	public String toString() {
		return "CartBeans [productId=" + productId + ", productName="
				+ productName + ", productPrice=" + productPrice
				+ ", quantity=" + quantity + ", totalPrice=" + totalPrice
				+ ", username=" + username + "]";
	}

	public String logout() {
		session.invalidate();
		return "index";
	}

}
