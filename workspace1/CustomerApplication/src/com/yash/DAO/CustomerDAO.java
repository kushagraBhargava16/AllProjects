package com.yash.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;

import com.yash.domain.Account;
import com.yash.domain.Customer;
import com.yash.util.ConnectionProvider;

public class CustomerDAO {

	public int signUp(Customer customer) {// Registering user
		String customerSql = "INSERT INTO CUSTOMERDETAIL VALUES(?,?,?)";
		int displayString = 0;
		Connection connection = ConnectionProvider.getConnection();

		if (getUserName(customer.getUserName())) {
			displayString = 1;//"\n...Username already exist!...\n";
			return displayString;
		} else {
			try {
				PreparedStatement preparedStatement = connection
						.prepareStatement(customerSql);
				preparedStatement.setString(1, customer.getUserName());
				preparedStatement.setString(2, customer.getPassword());
				preparedStatement.setString(3, customer.getName());
				preparedStatement.executeUpdate();
				displayString = 2;//"\n...Account created successfull!...\n";
				//connection.commit();
				} catch (Exception e) {
				displayString = 3;//"Invalid data!\n";
				e.printStackTrace();
			}
		}
		return displayString;
	}

	public Customer signIn(Customer customer) {// log in
		Connection connection = ConnectionProvider.getConnection();
		Customer customer2= new Customer();
		
				String  gotPassword , name,username;

		if (!getUserName(customer.getUserName())) {
			//displayString = 1;//"\n...Username doesnot exist!...\n";
			return null;
		} else {

			PreparedStatement preparedStatement1;

			try {

				preparedStatement1 = connection
						.prepareStatement("SELECT * FROM CUSTOMERDETAIL WHERE (USERNAME=?)");

				preparedStatement1.setString(1, customer.getUserName());

				preparedStatement1.execute();

				ResultSet resultSet = preparedStatement1.getResultSet();
				
				while (resultSet.next()) {
					gotPassword = resultSet.getString("PASSWORD");
					name = resultSet.getString("NAME").toUpperCase();
					username=resultSet.getString("USERNAME");

					if (gotPassword.equals(customer.getPassword())) {
						customer2.setPassword(gotPassword);
						customer2.setUserName(username);
						customer2.setName(name);
						//displayString = 2;//"\n...Login successful!Welcome " + name+ "...\n";
						//connection.commit();
					} else

					{
						//displayString = 3;//"Invalid password!\n";
						//connection.commit();
					}
				}
			} catch (SQLException e) {
			
				e.printStackTrace();
			}

		}
		return customer2;
	}

	private boolean getUserName(String name) {
		Connection connection = ConnectionProvider.getConnection();
		PreparedStatement preparedStatement1;
		boolean check = false;
		try {
			preparedStatement1 = connection
					.prepareStatement("SELECT USERNAME FROM CUSTOMERDETAIL");
			preparedStatement1.execute();
			ResultSet resultSet = preparedStatement1.getResultSet();

			while (resultSet.next()) {
				if (resultSet.getString("USERNAME").equals(name)) {
					check = true;
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Sorry!" + e.getMessage());
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

}
