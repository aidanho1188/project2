package edu.ho.java.wk7.hw;

import java.io.File;
import java.util.Scanner;

/**
 * 
 * @author Aidan Exercise 7
 */
public class Exercise7 {

	public static void reverseLines(Scanner inputFile) {
		while(inputFile.hasNextLine()) {
			// get a line
			String st = inputFile.next();
			// Can use StringBuffer or StringBuilder to reverse this.
			StringBuffer sb = new StringBuffer(st);
			sb.append(inputFile.nextLine());
			sb.reverse();
			System.out.println(sb.toString());
		}
	}

	public static void reverseWords(Scanner inputFile) {
		while(inputFile.hasNextLine()) {
			String line = inputFile.nextLine();
			String s = "";
			String a[] = line.split(" ");

			System.out.print("");
			for(int i = a.length-1; i>=0;i--) {
				s = s +a[i] +" ";
			}
			System.out.println(s);
		}
	}
	public static void main(String[] args) throws Exception {
		// enter the file path here
		File f = new File("C:\\Users\\aaron\\eclipse-workspace\\CIS\\src\\edu\\ho\\java\\wk7\\hw\\reverseLines");
		Scanner input = new Scanner(f);
		System.out.println("Reverse the whole string:");
		reverseLines(input);
		System.out.println("");
				
		System.out.println("Reverse only words in the string:");
		File f2 = new File("C:\\Users\\aaron\\eclipse-workspace\\CIS\\src\\edu\\ho\\java\\wk7\\hw\\reverseLines");
		Scanner input2 = new Scanner(f2);
		reverseWords(input2);

	}
}
