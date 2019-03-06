package edu.ho.java.wk6.hw;
/**
 * 
 * @author Aidan
 * Super class for MinMaxAccount
 */
public class BankingAccount {
	private int currentBalance;
	private int debit;
	private int credit;

	public void BankAccount(int s) { //Startup c
		
	}
	
	public void debit(int d) { // Debit d
		this.debit= d;
		
	}
	
	public void credit(int c) { // Creadit c
		this.credit = c;
		
	}
	
	public int getBalance() {
		return currentBalance;
	}
}
