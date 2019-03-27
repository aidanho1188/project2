package edu.ho.java.wk7.hw;

import java.io.File;
import java.util.Scanner;

/**
 * 
 * @author Aidan 
 * Exercise 5
 */
public class Exercise5 {

	public static void printDuplicates(Scanner inputFile) {
		while (inputFile.hasNextLine()) {
			String line = inputFile.nextLine();
			// scan line
			Scanner readLine = new Scanner(line);
			// set variables
			int count = 1;
			String word = "";
			if (readLine.hasNext())
				word = readLine.next();
			String nextWord = "";

			// Read line
			while (readLine.hasNext()) {
				nextWord = readLine.next();
				// if current word = next word then count++
				if (word.equals(nextWord)) {
					count++;
				}
				// print if count > 1 and the next is not equal the current word
				else if (!word.equals(nextWord) && count > 1) {
					System.out.print(word + "*" + count + "\t");
					word = nextWord;
					count = 1;
				} else {
					word = nextWord;
				}
			}
			// if line don't have any more word, print out the lastest result
			if (count > 1) {
				System.out.print(word + "*" + count + "\t");
			}
			System.out.println("");
		}

	}

	public static void main(String[] args) throws Exception {
		// enter the file path here
		File f = new File("C:\\Users\\aaron\\eclipse-workspace\\CIS\\src\\edu\\ho\\java\\wk7\\hw\\printDuplicates");
		Scanner input = new Scanner(f);
		printDuplicates(input);
	}
}
