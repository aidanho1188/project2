package edu.ho.java.wk6.hw;

import java.util.Random;

/**
 * 
 * @author Aidan Exercise 17
 */
public class RandomIncrementer implements Incrementable{
	// create random instance
	private int num = 0;
	Random r = new Random();

	public RandomIncrementer() {
		num = r.nextInt();
	}
	// random inccrement
	public void increment() {
		num = r.nextInt();
	}
	// returns num
	public int getValue() {
		return num;
	}
}
