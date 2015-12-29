package com.yash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.yash.domain.Customer;
import com.yash.samplecrudapplication.util.ConnectionProvider;
import com.yash.util.CustomerNextId;

public class CustomerDAO {

	public void save(Customer customer) { // inserting data
		Connection connection = ConnectionProvider.getConnection();
		String sql = "INSERT INTO CUSTOMER VALUES(?,?,?)";
		try {
			PreparedStatement preparedStatement1 = connection
					.prepareStatement("SELECT ID FROM CUSTOMER ");
			preparedStatement1.execute();
			ResultSet resultSet = preparedStatement1.getResultSet();
			CustomerNextId customerNextId = new CustomerNextId();
			int id = customerNextId.nextId();

			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setInt(2, id);
			preparedStatement.setString(3, customer.getAddress());
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<Customer> getCustomers() {// getting customers(show)

		Connection connection = ConnectionProvider.getConnection();
		String sql = "SELECT * FROM CUSTOMER";

		ArrayList<Customer> customerList = new ArrayList<Customer>();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.execute();
			ResultSet resultSet = preparedStatement.getResultSet();

			while (resultSet.next()) {
				Customer customer = new Customer();
				String name = resultSet.getString("NAME");
				int id = resultSet.getInt("ID");
				String address = resultSet.getString("ADDRESS");
				customer.setName(name);
				customer.setAddress(address);
				customer.setId(id);
				customerList.add(customer);

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return customerList;

	}

	public void delete(int id) {
		Connection connection = ConnectionProvider.getConnection();
		String sql = "DELETE FROM CUSTOMER WHERE ID =? ";

		try {

			if (getId(id) == 1) {
				PreparedStatement preparedStatement = connection
						.prepareStatement(sql);
				preparedStatement.setInt(1, id);
				preparedStatement.executeUpdate();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void deleteAll() {
		Connection connection = ConnectionProvider.getConnection();
		String sql = "DELETE FROM CUSTOMER";

		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private int getId(int id) {
		Connection connection = ConnectionProvider.getConnection();
		PreparedStatement preparedStatement1;
		int check = 0;
		try {
			preparedStatement1 = connection
					.prepareStatement("SELECT ID FROM CUSTOMER ");
			preparedStatement1.execute();
			ResultSet resultSet = preparedStatement1.getResultSet();

			while (resultSet.next()) {
				if (resultSet.getInt("ID") == id) {
					check = 1;
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("The id not found" + e.getMessage());
			return check;
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return check;

	}

	public void update(Customer customer) {
		Connection connection = ConnectionProvider.getConnection();
		String sql = "UPDATE CUSTOMRE SET NAME=?,ADDRESS=? WHERE ID=?";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, customer.getAddress());
			preparedStatement.setInt(3, customer.getId());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
