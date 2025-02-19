package com.celcom.javaassignment2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Account{
	String name;
	String account_type;
	int account_number;
	Double balance;
	
	Account(String name, String account_type, int account_number, Double balance){
		this.name = name;
		this.account_type = account_type;
		this.account_number = account_number;
		this.balance = balance;
	}
	
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	
	public void withdraw(Double amount) {
		if(this.balance > amount) {
			balance -= amount;
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	
	public void viewDetails(int account_number) {
		System.out.println("Account Holder name : " + name);
		System.out.println("Account type : " + account_type);
		System.out.println("Current Balance : " + balance);
	}
	
}

public class Bank {
	static Scanner sc = new Scanner(System.in);
	List<Account> bank = new ArrayList<>();
	
	
	public void addAccount() {
		System.out.println("Enter Account Holder Name : ");
		String name = sc.next();
		System.out.println("Enter Account Type (Savings/Current): ");
		String account_type = sc.next();
		System.out.println("Enter Account number : ");
		int account_number = sc.nextInt();
		System.out.println("Enter Balance : ");
		Double balance = sc.nextDouble();
		
		
		Account newAccount = new Account(name, account_type, account_number, balance);
		bank.add(newAccount);
		System.out.println("Account added successfully");
		
		
	}
	
	public void removeAccount(int account_number) {
		for(Account acc : bank) {
			if(acc.account_number == account_number) {
				bank.remove(acc);
				System.out.println("Account removed successfully");
				return;
			}
		}
	}
	
	public void depositMoney(int account_number, double amount) {
		for(Account acc : bank) {
			if(acc.account_number == account_number) {
				acc.deposit(amount);
				System.out.println("Amount deposited Successfully!!");
			}
			else {
				System.out.println("No such account found.");
			}
		}
	}
	
	public void withdrawMoney(int account_number, double amount) {
		for(Account acc : bank) {
			if(acc.account_number == account_number) {
				acc.withdraw(amount);
				System.out.println("Amount witdrawed Successfully!!");
			}
			else {
				System.out.println("No such account found.");
			}
		}
	}
	
	public void viewDetails(int account_number) {
		for(Account acc : bank) {
			if(acc.account_number == account_number) {
				acc.viewDetails(account_number);
			}
			else {
				System.out.println("No such account found.");
			}
	}
	}
	
	
	
	public static void main(String[] args) {
		Bank obj = new Bank();

		
		while(true){
			
			System.out.println("Enter your choice : \n 1. Add a account \n 2. Remove the account \n 3. Deposit money \n 4. Withdraw money \n 5. View account details");

			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				obj.addAccount();
				break;
			case 2: 
				System.out.println("Enter the account number : ");
				int remove_Accnumber = sc.nextInt();
				obj.removeAccount(remove_Accnumber);
				break;
			case 3:
				System.out.println("Enter the account number : ");
				int deposit_Accnumber = sc.nextInt();
				System.out.println("Enter the amount you want to deposit : ");
				double deposit_amount = sc.nextDouble();
				obj.depositMoney(deposit_Accnumber, deposit_amount);
				break;
			case 4:
				System.out.println("Enter the account number : ");
				int withdraw_Accnumber = sc.nextInt();
				System.out.println("Enter the amount you want to withdraw : ");
				double withdraw_amount = sc.nextDouble();
				obj.depositMoney(withdraw_Accnumber, withdraw_amount);
				break;
			case 5:
				System.out.println("Enter the account number : ");
				int accnumber_Details = sc.nextInt();
				obj.viewDetails(accnumber_Details);
			}
		}
		
		
		
	}
}
