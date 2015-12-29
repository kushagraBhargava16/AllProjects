package com.yash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.yash.domain.Customer;
import com.yash.util.ConnectionProvider;

public class CustomerDAO {


	
	public ArrayList getAllCustomerById() {
		
		ResultSet resultSet=null;
		String sql = "select * from customer";
		Connection connection = ConnectionProvider.getConnection();
		PreparedStatement preparedStatement;
		ArrayList list=new ArrayList();

		try {
			preparedStatement = connection.prepareStatement(sql);
			 resultSet = preparedStatement.executeQuery();
			 while(resultSet.next()){
					Customer customer=new Customer();
					customer.setAddress(resultSet.getString("address"));
					customer.setId(resultSet.getString("id"));
					customer.setName(resultSet.getString("name"));
					list.add(customer);
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList getCustomerById(String id) {
		
		ResultSet resultSet=null;
		String sql = "select * from customer where id='" + id + "'";
		Connection connection = ConnectionProvider.getConnection();
		PreparedStatement preparedStatement;
		ArrayList list=new ArrayList();
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				Customer customer=new Customer();
				customer.setAddress(resultSet.getString("address"));
				customer.setId(resultSet.getString("id"));
				customer.setName(resultSet.getString("name"));
				list.add(customer);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
