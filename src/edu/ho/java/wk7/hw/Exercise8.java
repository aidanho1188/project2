package edu.ho.java.wk7.hw;

import java.util.Scanner;

/**
 * 
 * @author Aidan Exercise 8
 */
public class Exercise8 {

	public static void runningSum(Scanner input) {
		// set variable
		double currNum = 0;
		double nextNum = 0;
		int numLine = 6;
		double highestSum= 0;
		String current = input.next();;
		String next = "";
		System.out.print("Running sum = ");
		while (input.hasNextLine()) {
			// turn string into double
			next = input.next();
			currNum = Double.parseDouble(current);
			nextNum = Double.parseDouble(next);
			// print current
			System.out.print("\t" + currNum);
			// print current + next
			// print current + next + next
			// print current + next + next + next
			// Formular: A(n)= A(n+1)+A(n)
			currNum = currNum + nextNum; // A(n)
			current= String.valueOf(currNum);
			// save highest sum
			if (currNum > highestSum) {
				highestSum = currNum;
			}
		}
		System.out.println("\t"+currNum);
		System.out.print("Max Sum: "+ highestSum);

	}

	public static void main(String[] args) {
		String list = "3.25 4.5 -8.25 7.25 3.5 4.25 -6.5 5.25";
		Scanner input = new Scanner(list);
		System.out.println("Input: " + list);
		runningSum(input);
	}
}
