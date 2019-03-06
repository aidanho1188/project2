package edu.ho.java.wk6.hw;
/**
 * 
 * @author Aidan
 * Exercise 7
 */
public class AdvanceTicket extends Ticket{

	public AdvanceTicket(int days) {
		if (days >= 10){
			super.price= 30;
		}
		else if (days < 10){
			super.price = 40;
		}
	}
}
