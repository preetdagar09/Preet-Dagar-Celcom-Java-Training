package com.celcom.day7;
import java.util.Scanner;

class SavingAccount{
	private long balanceAmount;
	
	void deposit(long amount) {
		this.balanceAmount = this.balanceAmount + amount;
				}
	void withdraw(long amount) {
		this.balanceAmount = this.balanceAmount - amount;
	}
	
	long getBalanceAmount() {
		return balanceAmount;
	}
	
}

class WithDrawer extends Thread{
	SavingAccount savingAccount;
	
	WithDrawer(SavingAccount savingAccount){
		this.savingAccount = savingAccount;//Doubt
	}
	
	@Override
	public void run() {
		synchronized(savingAccount) {
			System.out.println("Withdrawer is waiting for the depositer to deposit a money...");
			try {
				savingAccount.wait();
			} catch(InterruptedException e){
				
			}
			System.out.println("Enter the amount to withdraw");
			long amount = new Scanner(System.in).nextLong();
			savingAccount.withdraw(amount);
			System.out.println(amount + "Withdraw Successfully");
			System.out.println("Balance : " + savingAccount.getBalanceAmount());
			
		}
	}
}

class Depositer extends Thread{
	SavingAccount savingAccount;
	
	Depositer(SavingAccount savingAccount){
		this.savingAccount = savingAccount;//Doubt
	}
	
	public void run() {
		synchronized(savingAccount) {
			System.out.println("Depositer started to depositing the amount..");
			System.out.println("Enter the amount to deposit : ");
			long amount = new Scanner(System.in).nextLong();
			savingAccount.deposit(amount);
			System.out.println(amount + "Deposited Successfully");
			System.out.println("Balance : " + savingAccount.getBalanceAmount());
			savingAccount.notify();
			}
	}
}

public class InterThreadExample2 {
	public static void main(String args[]) throws InterruptedException {
		SavingAccount savingAccount = new SavingAccount();
		
		WithDrawer withdraw = new WithDrawer(savingAccount);
		withdraw.start();
		
		Thread.sleep(20000);
		
		Depositer deposit = new Depositer(savingAccount);
		deposit.start();
	}

}
