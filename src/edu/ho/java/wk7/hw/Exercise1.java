package edu.ho.java.wk7.hw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 * @author Aidan
 * Exercise 1
 */
public class Exercise1 {

	public static void coinFlip(Scanner inputFile) {
		while (inputFile.hasNextLine()) {
			Scanner line = new Scanner(inputFile.nextLine());
			// set variables
			int h = 0;
			int t = 0;
			// check number of heads and tails
			while (line.hasNext()) {
				if (line.next().toLowerCase().equals("h")) {
					h++;
				} else {
					t++;
				
			}}
			// calculating percents
			double percent = (double) (h * 100) / (h + t);
			if (h > t) {
				System.out.println(h + " heads (" + String.format("%.1f", percent) + "%)");
				System.out.println("You win!");
				System.out.println("");
			} else {
				System.out.println(h + " heads (" + String.format("%.1f", percent) + "%)");
				System.out.println("");
			}
		}

	}

	// test coinFlip method
	public static void main(String[] args) throws Exception {
		// enter the file path here
		File f = new File("C:\\Users\\aaron\\eclipse-workspace\\CIS\\src\\edu\\ho\\java\\wk7\\hw\\coinFlip");
		Scanner input = new Scanner(f);
		// call method here
		coinFlip(input);
	}
}
