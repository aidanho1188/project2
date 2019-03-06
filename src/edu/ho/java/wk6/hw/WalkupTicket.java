package edu.ho.java.wk6.hw;
/**
 * 
 * @author Aidan
 * Exercise 6
 */
public class WalkupTicket extends Ticket{
	public static void main(String[] args) {
		Ticket p = new Ticket();
		p.price = 50;
		p.setTicket(17);
		System.out.print(p.toString());
	}
}
