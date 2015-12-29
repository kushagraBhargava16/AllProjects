package com.yash.SearchingEJB.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.yash.SearchingEJB.domain.Product;
import com.yash.SearchingEJB.service.ProductEJBServiceLocal;

@ManagedBean
@SessionScoped
public class ProductBean {
	List<Product> listProduct = new ArrayList<Product>();
	Set<String> products = new TreeSet<>();
	Set<String> vendors = new TreeSet<>();
	Set<String> cities = new TreeSet<>();
	String productName;
	String vendor;
	String city;
	List<Product> searchedProduct = null;
	String sortBy;
	@EJB
	ProductEJBServiceLocal serviceLocal;

	public List<Product> getSearchedProduct() {
		return searchedProduct;
	}

	public void setSearchedProduct(List<Product> searchedProduct) {
		this.searchedProduct = searchedProduct;
	}

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public Set<String> getProducts() {
		return products;
	}

	public void setProducts(Set<String> products) {
		this.products = products;
	}

	public Set<String> getVendors() {
		return vendors;
	}

	public void setVendors(Set<String> vendors) {
		this.vendors = vendors;
	}

	public Set<String> getCities() {
		return cities;
	}

	public void setCities(Set<String> cities) {
		this.cities = cities;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Product> getListProduct() {
		return listProduct;
	}

	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}

	@PostConstruct
	public void init() {
		// listProduct.add(new Product("--Select--", "--Select--",
		// "--Select--"));
		listProduct.add(new Product("Mobile", "LG", "Indore"));
		listProduct.add(new Product("Mobile", "APPLE", "Indore"));
		listProduct.add(new Product("Mobile", "Samsung", "Pune"));
		listProduct.add(new Product("Mobile", "LG", "Mumbai"));

		listProduct.add(new Product("Tv", "Samsung", "Indore"));
		listProduct.add(new Product("Tv", "Sony", "Mumbai"));
		listProduct.add(new Product("Tv", "LG", "Delhi"));
		listProduct.add(new Product("Tv", "Micromax", "Indore"));
		listProduct.add(new Product("Tv", "Philips", "Indore"));
		listProduct.add(new Product("Tv", "LG", "Indore"));

		listProduct.add(new Product("Microwave", "LG", "Pune"));
		listProduct.add(new Product("Microwave", "Philips", "Indore"));
		listProduct.add(new Product("Microwave", "Samsung", "Mumbai"));
		listProduct.add(new Product("Microwave", "LG", "Indore"));

		for (Product product : listProduct) {
			products.add(product.getName());
			vendors.add(product.getVendor());
			cities.add(product.getCity());
		}

		System.out.println("list is-------------------------->" + listProduct);
		System.out.println("Products is-------------------------->" + products);
	}

	public List<Product> searchByProduct() {
		Product product = new Product(productName, vendor, city);
		searchedProduct = serviceLocal.searchProduct(product, listProduct,sortBy);
		System.out.println("product------------------------->" + searchedProduct);
		return searchedProduct;
	}

}
