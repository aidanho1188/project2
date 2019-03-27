package edu.ho.java.wk7.classwork;

import java.util.Scanner;

/**
 * 
 * @author Aidan
 *
 */
public class Percentages2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.print("Enter an number: ");
		num1 = sc.nextInt();
		System.out.print("Enter a second number: ");
		num2 = sc.nextInt();

		// call method
		computePercent(num1, num2);
		computePercent(num2, num1);
	}

	private static void computePercent(double x, double y) {
		// p = (x/y)*100
		double percent = (x/y)*100;
		System.out.println(x + " is " + percent + " percent of " + y);

	}
}
