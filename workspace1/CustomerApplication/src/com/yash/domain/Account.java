package com.yash.domain;

public class Account {
	private int accountNum;
	private int balance = 500;
	private String userName;

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String toString() {
		return "Account [Your Account Number=" + accountNum
				+ ",Account balance=" + balance + ", User Name=" + userName
				+ "]";
	}

}
