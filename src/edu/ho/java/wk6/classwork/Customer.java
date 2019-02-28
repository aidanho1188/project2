package edu.ho.java.wk6.classwork;

public class Customer {

	private int idNumber;
	private double balanceOwned;
	public Customer(int id, double bal) {
		idNumber = id;
		balanceOwned = bal;
	}
	public void display() {
		System.out.print(idNumber + balanceOwned);
	}
}

/**
 * public class PerferedCustomer extends Customer{
 * double discountRate;
 * public PerferedCustome(int id, double bal, double rate){
 * super(id,bal);
 * discountRate = rate;
 * }
 * @override
 * public void display(){
 * super.display()
 * Systsem.out.print("");
 * }
 */

/**
 * public class TestCustomers{
 * public static void main(String[] args){
 * customer oneCost = new Customer(123,123.45);
 * PerferedCustomer onepCost = new PerferedCustomer(123,345.67,8.15);
 * oneCost.display();
 * onePcost.display();
 */
