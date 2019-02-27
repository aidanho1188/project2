package edu.ho.java.wk5.hw;

/**
 * 
 * @author Aidan 
 * Exercise 11-13
 */
// Given codes
// Each BankAccount object represents one user's account
// information including name and balance of money.
public class BankAccount {
	String name;
	double balance;
	private double transactionFee = 0;

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		if (transactionFee(transactionFee)) { // check the balance first before withdraw/ then withdraw
			balance -= amount;
		} else {
			System.out.print("You don't have enough money to withdraw");
		}
	}

	// Exercise 11
	public boolean transactionFee(double fee) {
		double transactions = 0;
		// calculate the amount the user taking out
		double amount = (fee * transactions * (transactions + 1)) / 2;
		// if the amount is less then balance, then take out the money
		if (balance > amount) {
			return true;
		} else {
			return false;
		}
	}

	// Exercise 12
	public String toString(String amount) {
	    // name, $[-/+]amount
	    return name + ", " + "$" + balance;
	}
	
	// Exercise 13
	public void transfer(BankAccount ba, double money) {
	    if(balance < 5 || money <= 0)
	        return;
	    
	    if(balance < 5 + money) {
	        ba.deposit(balance - 5);
	        this.withdraw(balance);
	    } else {
	        ba.deposit(money);
	        this.withdraw(5 + money);
	    }
	}
}
