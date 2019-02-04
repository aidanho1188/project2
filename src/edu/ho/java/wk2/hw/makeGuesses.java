package edu.ho.java.wk2.hw;

import java.util.Random;

/**
 * 
 * @author Aidan 
 * Exercise 6
 */
public class makeGuesses {

	public static void makeGuesses() {
		int count = 0;
		Random r = new Random();
		int guess;

		do {
			guess = 1 + r.nextInt(50); // pick a random number from 1 to 50
			count++;
			System.out.println("guess = " + guess);
		} while (guess < 48); // stop if it guess a number over 48

		System.out.println("total guesses = " + count);

	}

	// test
	public static void main(String[] args) {
		makeGuesses();
	}
}
