package com.yash.ecommerce.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Default;

import com.yash.ecommerce.beans.CartBeans;
import com.yash.ecommerce.util.DBUtil;

@Default
public class CartDAOImpl implements CartDAO {

	@Override
	public void addProductDetails(CartBeans cartBeans) {
		String sql = "insert into cartdetails(productName,baseprice,quantity,username,totalprice) values('"
				+ cartBeans.getProductName()
				+ "','"
				+ cartBeans.getProductPrice()
				+ "','"
				+ cartBeans.getQuantity()
				+ "','" + cartBeans.getUsername() + "','"+cartBeans.getTotalPrice()+"')";
		DBUtil.update(sql);
	}

	@Override
	public List getCartDetails(String username) {
List list=new ArrayList();
		String sql = "select * from cartdetails where username='"
				+ username + "'";
		System.out.println(sql);
		
		ResultSet resultSet=DBUtil.select(sql);

		try {
			while (resultSet.next()) {
				CartBeans beans=new CartBeans();
				beans.setProductId(resultSet.getInt("cartDetailsId"));
				beans.setProductName(resultSet.getString("productName"));
				beans.setUsername(resultSet.getString("username"));
				beans.setProductPrice(resultSet.getInt("basePrice"));
				beans.setTotalPrice(resultSet.getInt("totalPrice"));
				beans.setQuantity(resultSet.getInt("quantity"));
				list.add(beans);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int getCartCount(String username) {
int count=0;
String sql=" SELECT  COUNT(*) FROM cartdetails GROUP BY username HAVING username='"+username+"' ";
ResultSet resultSet=DBUtil.select(sql);
try {
	while(resultSet.next()){
		count=Integer.parseInt(resultSet.getString(1));
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return count;
	}

}
