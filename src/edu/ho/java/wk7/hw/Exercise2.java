package edu.ho.java.wk7.hw;

import java.io.File;
import java.util.Scanner;

/**
 * 
 * @author Aidan 
 * Exercise 2
 */
public class Exercise2 {

	public static void flipLines(Scanner inputFile) {
		// flip line by printing the current and next line
		while (inputFile.hasNextLine()) {
			// current line
			String l = inputFile.nextLine();
			if (!inputFile.hasNextLine()) {
				System.out.println(l);
			} else {
				// print next line and the current line
				System.out.println(inputFile.nextLine());
				System.out.println(l);
			}
		}

	}

	// test flipLines
	public static void main(String[] args) throws Exception {
		// enter the file path here
		File f = new File("C:\\Users\\aaron\\eclipse-workspace\\CIS\\src\\edu\\ho\\java\\wk7\\hw\\flipLines");
		Scanner input = new Scanner(f);
		// call method here
		flipLines(input);
	}
}
