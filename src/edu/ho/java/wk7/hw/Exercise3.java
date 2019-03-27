package edu.ho.java.wk7.hw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Aidan 
 * Exercise 3
 */
public class Exercise3 {

	public static int frequentFlier(Scanner inputFile) {
		// set variables
		int sum = 0;

		while (inputFile.hasNext()) {
			// set variables
			String name = inputFile.next();
			int miles = inputFile.nextInt();
			// use equalsIgnoreCase method to buy pass nextInt error
			if (name.equalsIgnoreCase("coach")) {
				sum += miles;
			}
			if (name.equalsIgnoreCase("firstclass"))
				sum += 2 * miles;
		}
		return sum;

	}

	// test method
	public static void main(String[] args) throws FileNotFoundException {
		// Enter file path here
		File f = new File("C:\\Users\\aaron\\eclipse-workspace\\CIS\\src\\edu\\ho\\java\\wk7\\hw\\frequentFlier");
		Scanner input = new Scanner(f);
		// call method
		System.out.print(frequentFlier(input));
	}

}
