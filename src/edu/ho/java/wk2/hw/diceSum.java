package edu.ho.java.wk2.hw;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Aidan 
 * Exercise 7
 * 
 */
public class diceSum {

	public static void diceSum() {
		Scanner in = new Scanner(System.in);
		System.out.print("Desired dice sum: ");
		int sum = in.nextInt();
		Random r1 = new Random();
		Random r2 = new Random();
		// 2 dices
		int d1;
		int d2;

		do {
			d1 = 1 + r1.nextInt(6);
			d2 = 1 + r2.nextInt(6);
			System.out.println(d1 + " and " + d2 + " = " + (d1 + d2));
		} while (d1 + d2 != sum); // stop if d1 + d2 = sum
	}

	// test

	public static void main(String[] args) {
		diceSum();
	}
}
