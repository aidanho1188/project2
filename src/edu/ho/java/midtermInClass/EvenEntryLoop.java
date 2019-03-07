package edu.ho.java.midtermInClass;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Aidan
 * 
 */
public class EvenEntryLoop {

	public static void main(String[] args) {
		System.out.println("Please enter an even number or enter 999 to quit.");
		Scanner input = new Scanner(System.in);
		askUser(input);
	}

	// flow
	public static void askUser(Scanner input){
		int x = 0;
		while (x!=999) {
		try {
			String y = input.next();
			y.equals(x);
		// check if number is event
		if (x % 2 == 0) {
			// print Good job
			System.out.println("Good Job!");
			// repeat
			input.next();
		}
		else {
			// if odd
			// display error message
			System.out.println("The input is not an even number!");
			// repeat8
		}
		}
		catch (InputMismatchException e){
			System.out.println("This is not a number!");
			break;
		}
		}
	}
}
