package edu.ho.java.wk7.classwork;

import java.util.Scanner;

/**
 * 
 * @author Aidan
 *
 */
public class InchConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double inch;

		System.out.print("Enter inches: ");
		inch = sc.nextDouble();
		
		//call method
		displayFeet(inch);	
		displayYards(inch);
	}

	private static void displayYards(double inch) {
		// 1 yards = 36 inches
		double yard = inch / 36;
		System.out.println(inch +" Inches is " + yard + " Yards.");
		
	}

	private static void displayFeet(double inch) {
		// 1 inches = 1/12 feet
		double feet = inch / 12;
		System.out.println(inch +" Inches is " + feet + " Feet.");
		
	}
}
