package com.yash.user;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Scanner;

import com.yash.DAO.AccountDAO;
import com.yash.DAO.CustomerDAO;
import com.yash.domain.Account;
import com.yash.domain.Customer;

public class Presentation {
	Scanner sc;

	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		CustomerDAO customerDAO = new CustomerDAO();

		do {
			System.out.println("\t...Welcome...\n1.Register\n2.LogIn\n0.Exit");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				// Get customer details
				Customer customer = new Customer();

				System.out.println("Name:");

				String name = sc.next();

				System.out.println("Username:");

				String userName = sc.next();

				System.out.println("Password:");

				String password = sc.next();

				customer.setName(name);
				customer.setUserName(userName);
				customer.setPassword(password);

				int get = customerDAO.signUp(customer);

				if (get == 1) {
					System.out.println("\n...Username already exist!...\n");
				} else if (get == 2) {
					System.out
							.println("\n...Account created successfull!...\n");

					addAccount(userName);
				} else if (get == 3) {
					System.out.println("Invalid data!\n");
				} else {
					System.out.println("Unknown error!");
				}

				break;

			case 2:
				System.out.println("Username:");
				String username = sc.next();
				System.out.println("Password:");
				String passWord = sc.next();
				Customer customer2 = new Customer();
				customer2.setUserName(username);
				customer2.setPassword(passWord);
				Customer customer3 = customerDAO.signIn(customer2);

				if (customer3 == null) {
					System.out
							.println("\n...Username or Password is invalid!...\n");
				} else {
					System.out.println("\n...Login successful!Welcome Mr."
							+ customer3.getName().toUpperCase() + "\n");

					accountApplication(customer3);
				}
				break;

			case 0:
				System.exit(0);

			default:
				System.out.println("Invalid Entry!");
			}
		} while (true);

	}

	static void addAccount(String userName) {

		// Now get account details
		AccountDAO accountDAO = new AccountDAO();
		Scanner sc = new Scanner(System.in);

		Account account = new Account();

		System.out.println("Please enter your account number:");

		int accountNum = sc.nextInt();
		if (!accountDAO.checkAccountAlreadyExist(accountNum)) {
			System.out.println("Please enter your initial balance:");

			int balance = sc.nextInt();

			account.setUserName(userName);

			account.setAccountNum(accountNum);

			account.setBalance(balance);
			accountDAO.createAccount(account);
		} else {
			System.out
					.println("Account number is taken!Please enter a correct account");
			addAccount(userName);
		}

	}

	static void accountApplication(Customer customer) {
		System.out.println("\t***Your Account!***");
		Scanner sc = new Scanner(System.in);
		AccountDAO accountDAO = new AccountDAO();
		do {
			System.out
					.println("\n1.Deposit\n2.Withdraw\n3.Display Details\n4.Add Beneficiary\n5.Transfer\n6.Display Beneficiary\n0.Logout!\n");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:// deposit
				System.out.println("Please enter the account number: ");
				int accountNumber = sc.nextInt();
				System.out
						.println("Please enter the amount you want to enter: ");
				int amount = sc.nextInt();
				accountDAO.deposit(amount, accountNumber);
				break;

			case 2:// withdraw
				System.out.println("Please enter the amount to be withdrawn:");
				boolean status = accountDAO.withDraw(customer.getUserName(),
						sc.nextInt());
				if (status) {
					System.out.println("Withdraw successful!");
				} else {
					System.out.println("Insufficient amount!");
				}
				break;

			case 3:// display details
				System.out.println("Your account balance is: "
						+ accountDAO.displayBalance(customer.getUserName()));

				break;

			case 4:// Add benefisiery

				System.out
						.println("Please enter the account number of benefisiery:");

				int benefisieryAccountNumber = sc.nextInt();

				String myUserName = customer.getUserName();

				ArrayList<Integer> benefisieryAlreadyHave = accountDAO
						.getBenefisieries(myUserName);

				if (!benefisieryAlreadyHave.contains(benefisieryAccountNumber)
						|| benefisieryAlreadyHave.isEmpty()) {

					if (accountDAO.addBenefisiery(benefisieryAccountNumber,
							myUserName)) {

						System.out.println("beneficiary added!");

					} else {

						System.out
								.println("beneficiary account does not exist!");

					}

				}

				else {

					System.out.println("Beneficiary already exist!");

				}

				break;
			case 5:// transfer

				String myUserNameForTransfer = customer.getUserName();

				ArrayList<Integer> benefisieryList = accountDAO
						.getBenefisieries(myUserNameForTransfer);
				if (benefisieryList.isEmpty()) {
					System.out
							.println("No beneficiary exist for your account!");
				} else {
					System.out.println("Your beneficiery list->"
							+ benefisieryList);
				}
				if (!benefisieryList.isEmpty()) {

					System.out
							.println("Please enter the account number of your beneficiery:");

					int benefisieryAccountNumberToTrnsfer = sc.nextInt();

					if (benefisieryList
							.contains((benefisieryAccountNumberToTrnsfer))) {

						System.out
								.println("Please enter the amount to be transfered");

						int amountToTransfer = sc.nextInt();

						boolean checkStatus = accountDAO.transfer(
								amountToTransfer, myUserNameForTransfer,
								benefisieryAccountNumberToTrnsfer);

						if (checkStatus) {

							System.out.println("Transfer Successful!");

						}

						else {

							System.out.println("Balance not available!");

						}

					} else {
						System.out
								.println("Sorry!This account holder is not your beneficiary.");
					}
				} else {
					System.out.println("No beneficiery available!");
				}

				break;
			case 6:
				String myUserNameB = customer.getUserName();
				ArrayList<Integer> benefisieryList2 = accountDAO
						.getBenefisieries(myUserNameB);

				System.out.println(benefisieryList2);
				break;
			case 0:
				System.out
						.println("........Thankyou for banking with us!........");
				main();
			}
		} while (true);

	}

}
