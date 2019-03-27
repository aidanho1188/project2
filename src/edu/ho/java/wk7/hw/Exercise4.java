package edu.ho.java.wk7.hw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Aidan
 * Exercise 4
 */
public class Exercise4 {
	
	public static void mostCommonNames(Scanner inputFile) {
		while(inputFile.hasNextLine()) {
			// scan line
			Scanner line = new Scanner(inputFile.nextLine());
			// set variable and find words
			String word = line.next();
			String most = word;
			int count = 1;
			int highestCount= 1;
			while (line.hasNext()) {
				String nextWord = line.next();
				// check word
				if (word.equals(nextWord)) {
					count++;
					if (count > highestCount) {
						highestCount = count;
						most = word;
					}
				}
				else {
					word = nextWord;
					count = 1;
				}
				
			}
		    System.out.println("Most common name: " + most);
		}
	}
	
	// test method
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("C:\\Users\\aaron\\eclipse-workspace\\CIS\\src\\edu\\ho\\java\\wk7\\hw\\mostCommonNames");
		Scanner input = new Scanner(f);
		mostCommonNames(input);
	}

}
