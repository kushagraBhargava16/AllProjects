package com.yash.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.yash.domain.Account;
import com.yash.util.ConnectionProvider;

public class AccountDAO {

	public String createAccount(Account account) {
		Connection connection = ConnectionProvider.getConnection();
		String accountSql = "INSERT INTO ACCOUNT VALUES(?,?,?)";

		PreparedStatement preparedStatement1;
		try {
			preparedStatement1 = connection.prepareStatement(accountSql);
			preparedStatement1.setInt(1, account.getAccountNum());
			preparedStatement1.setString(2, account.getUserName());
			preparedStatement1.setInt(3, account.getBalance());
			preparedStatement1.executeUpdate();
		} catch (SQLException e) {
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

		return null;
	}

	public int deposit(int amount, int accountNumber) {
		int updatedAmount = 0;
		String updateSql = "UPDATE ACCOUNT SET BALANCE =? WHERE ACCOUNT_NUM=?";
		String sql = "SELECT BALANCE FROM ACCOUNT WHERE ACCOUNT_NUM=?";
		Connection connection = ConnectionProvider.getConnection();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setInt(1, accountNumber);
			preparedStatement.execute();
			ResultSet resultSet = preparedStatement.getResultSet();
			while (resultSet.next()) {
				updatedAmount = resultSet.getInt("BALANCE");
			}
			updatedAmount = updatedAmount + amount;
			if (updatedAmount > amount) {
				PreparedStatement preparedStatement2 = connection
						.prepareStatement(updateSql);
				preparedStatement2.setInt(1, updatedAmount);
				preparedStatement2.setInt(2, accountNumber);
				preparedStatement2.executeUpdate();
				return updatedAmount;
			} else {
				return updatedAmount;
			}
		} catch (SQLException e) {
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
		return updatedAmount;
	}

	public boolean withDraw(String userName, int amount) {
		int finalAmount;
		String sql = "SELECT BALANCE FROM ACCOUNT WHERE USERNAME=?";
		String updateSql = "UPDATE ACCOUNT SET BALANCE =? WHERE USERNAME=?";
		Connection connection = ConnectionProvider.getConnection();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setString(1, userName);
			preparedStatement.execute();
			ResultSet resultSet = preparedStatement.getResultSet();

			while (resultSet.next()) {
				finalAmount = resultSet.getInt("BALANCE");
				if (finalAmount >= amount) {
					finalAmount = finalAmount - amount;
					PreparedStatement preparedStatement2 = connection
							.prepareStatement(updateSql);
					preparedStatement2.setInt(1, finalAmount);
					preparedStatement2.setString(2, userName);
					preparedStatement2.executeUpdate();
					return true;
				}
			}
		} catch (SQLException e) {
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

		return false;
	}

	public Account displayBalance(String userName) {
		String sql = "SELECT * FROM ACCOUNT WHERE USERNAME=?";
		Connection connection = ConnectionProvider.getConnection();
		Account account = new Account();
		try {
			PreparedStatement preparedStatement = connection.prepareCall(sql);
			preparedStatement.setString(1, userName);
			preparedStatement.execute();
			ResultSet resultSet = preparedStatement.getResultSet();

			while (resultSet.next()) {
				account.setAccountNum(resultSet.getInt("ACCOUNT_NUM"));
				account.setBalance(resultSet.getInt("BALANCE"));
				account.setUserName(resultSet.getString("USERNAME"));
				return account;
			}
		} catch (SQLException e) {
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

		return null;
	}

	public boolean transfer(int amountToTransfer, String myUserName,
			int benefisieryAccountNumber) {
		int myAccountNumber = getAccountByUsername(myUserName);

		String sql = "UPDATE ACCOUNT SET BALANCE =? WHERE ACCOUNT_NUM=?";
		Connection connection = ConnectionProvider.getConnection();

		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			Account account = displayBalance(myUserName);
			if (account.getBalance() >= amountToTransfer) {
				if (withDraw(myUserName, amountToTransfer)) {
					if (deposit(amountToTransfer, benefisieryAccountNumber) != 0) {
						return true;
					}
				}

			} else {
				return false;
			}
		}

		catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	public boolean addBenefisiery(int benefisieryAccountNumber,
			String myUserName) {
		String sql = "SELECT * FROM ACCOUNT WHERE ACCOUNT_NUM=?";
		Connection connection = ConnectionProvider.getConnection();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setInt(1, benefisieryAccountNumber);
			preparedStatement.execute();
			ResultSet resultSet = preparedStatement.getResultSet();
			if (resultSet.next()) {
				int myAccountNumber = getAccountByUsername(myUserName);
				String insertSQL = "INSERT INTO BENEFISIERY VALUES(?,?)";
				PreparedStatement preparedStatement2 = connection
						.prepareStatement(insertSQL);
				preparedStatement2.setInt(1, benefisieryAccountNumber);
				preparedStatement2.setInt(2, myAccountNumber);
				preparedStatement2.executeUpdate();
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	private int getAccountByUsername(String userName) {
		String sql = "SELECT ACCOUNT_NUM FROM ACCOUNT WHERE USERNAME=?";
		Connection connection = ConnectionProvider.getConnection();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setString(1, userName);
			preparedStatement.execute();
			ResultSet resultSet = preparedStatement.getResultSet();
			while (resultSet.next()) {
				return resultSet.getInt("ACCOUNT_NUM");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}

	public ArrayList<Integer> getBenefisieries(String username) {
		int myAccountNumber = getAccountByUsername(username);
		ArrayList<Integer> benefisieries = new ArrayList();
		String sql = "SELECT BENIFISIERY_ACCOUNT_NUMBER FROM BENEFISIERY WHERE USER_ACCOUNT_NUMBER=?";
		Connection connection = ConnectionProvider.getConnection();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setInt(1, myAccountNumber);
			preparedStatement.execute();
			ResultSet resultSet = preparedStatement.getResultSet();
			while (resultSet.next()) {
				benefisieries.add(resultSet
						.getInt("BENIFISIERY_ACCOUNT_NUMBER"));
			}
			return benefisieries;
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	public boolean checkAccountAlreadyExist(int checkAccountNumber) {//check if account already exist
		Connection connection= ConnectionProvider.getConnection();
		String sql="SELECT ACCOUNT_NUM FROM ACCOUNT";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.execute();
			ResultSet resultSet=preparedStatement.getResultSet();
			while(resultSet.next()){
				if(resultSet.getInt("ACCOUNT_NUM")==checkAccountNumber){
					return true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
