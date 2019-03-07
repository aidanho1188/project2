package edu.ho.java.midtermInClass;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Aidan
 * 
 */
public class EvenEntryLoop {

	public static int x;

	public static void main(String[] args) {
		System.out.println("Please enter an even number or enter 999 to quit.");
		Scanner input = new Scanner(System.in);
		askUser(input);
	}

	// flow
	public static void askUser(Scanner input){
		int x = input.nextInt();
		while (x!=999) {
		try {
		// check if number is event
		if (x % 2 == 0) {
			// print Good job
			System.out.print("Good Job!");
			// repeat
		}
		else {
			// if odd
			// display error message
			System.out.print("The input is not an even number!");
			// repeat
		}
		}
		catch (InputMismatchException e){
			System.out.print("This is not a number!");
		}
		}
	}
}
