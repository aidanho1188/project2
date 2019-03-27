package edu.ho.java.wk7.hw;

import java.util.Scanner;

/**
 * 
 * @author Aidan 
 * Exercise 7
 */
public class Exercise6 {

	public static void printStrings(Scanner input) {
		while (input.hasNextInt()) {
			// find and set next Int
			int n = input.nextInt();
			// find and set next word
			if (input.hasNext()) {
				String word = input.next();
				// print out number of word depend on n(int)
				System.out.println(padLine(word, n));
			} else {
				return;
			}
		}
	}

	private static String padLine(String word, int repeats) {
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < repeats; i++) {
			b.append(word);
		}
		return b.toString();
	}

	public static void main(String[] args) {
		System.out.println("Examples: 1 hi 2 hello >> hi hellohello");
		System.out.println("Please enter a number and a string to print: ");
		Scanner in = new Scanner(System.in);
		printStrings(in);
	}

}
