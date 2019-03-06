package edu.ho.java.wk6.hw;
/**
 * 
 * @author Aidan
 * Exercise 8
 */
public class StudentAdvanceTicket extends AdvanceTicket{

	public StudentAdvanceTicket(int days) {
		super(days);
		if (days>=10) {
			super.price=15;
		}
		else if (days < 10) {
			super.price=20;
		}
		System.out.print(toString()+"Id: Required");
	}

}
