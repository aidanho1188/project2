package edu.ho.java.wk2.hw;

import java.util.Random;

/**
 * 
 * @author Aidan 
 * Exercise 8
 */
public class randomWalk {
	
	public static void randomWalk() {
		int position = 0;
		// max should only be  positive number
		int max = 0;
		Random r = new Random();
		int step;

		while ((-3 < position) && (position < 3)) {
			System.out.println("position = " + position); // starting point = 0
			step = r.nextBoolean() ? -1 : 1; // random pick, -1 or 1
			position += step;
			max = Math.max(max, position);
		}

		System.out.println("position = " + position);
		System.out.println("max position = " + max);
	}

	//test
	public static void main(String[] args) {
		randomWalk();
	}
}
