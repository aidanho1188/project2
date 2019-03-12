package edu.ho.java.wk6.hwChapter9;
/**
 * 
 * @author Aidan
 * Exercise 5
 */

public class Ticket {
	
	public double price;
	public int ticketNumber;

	public void setTicket(int number) {
		ticketNumber = number;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return "Number: "+ticketNumber+", Price:" + getPrice();
	}

}
