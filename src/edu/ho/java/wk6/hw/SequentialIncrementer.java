package edu.ho.java.wk6.hw;

/**
 * 
 * @author Aidan 
 * Exercise 17
 */
public class SequentialIncrementer implements Incrementable {
	
	private int num;

	public SequentialIncrementer(int num) {
		this.num = num;
		num = 0;
	}
	// increase num by 1
	public void increment() {
		num++;
	}
	// return num
	public int getValue() {
		return num;
	}
}
