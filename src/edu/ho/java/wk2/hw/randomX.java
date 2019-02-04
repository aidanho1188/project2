package edu.ho.java.wk2.hw;

import java.util.Random;

/**
 * 
 * @author Aidan 
 * Exercise 4
 */
public class randomX {

	public static void randomX() {
		Random r = new Random();
		int n;

		do {
			// start with 5, nextInt from 1 to 15 which add up to 20
			n = 5 + r.nextInt(15);
			for (int i = 0; i < n; i++) {
				System.out.print("x");
			}
			System.out.println();
		} while (n < 16);
		// stop is this line is true

	}

	// test
	public static void main(String[] args) {
		randomX();
	}
}
