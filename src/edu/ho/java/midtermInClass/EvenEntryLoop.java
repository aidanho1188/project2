package edu.ho.java.midtermInClass;
import java.util.Scanner;

/**
 * 
 * @author Aidan
 * 
 */
public class EvenEntryLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		// program end if user enter 999
		while (n != 999) {
			System.out.println("Please enter an even number:");
			n = input.nextInt();
			// check if input is odd
			if (n % 2 == 0) {
				System.out.println("Good job!");
			} else if (n == 999) {
				System.out.print("The program had ended.");
			} else {
				System.out.println("This number is odd, please enter another number.");
			}

		}
	}
}
