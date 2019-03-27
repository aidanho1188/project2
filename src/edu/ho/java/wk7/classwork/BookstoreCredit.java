package edu.ho.java.wk7.classwork;

import java.util.Scanner;

/**
 * 
 * @author Aidan
 *
 */
public class BookstoreCredit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		double gpa;

		System.out.print("Enter your name: ");
		name = sc.next();
		System.out.print("Enter your gpa: ");
		gpa = sc.nextDouble();

		displayAward(name, gpa);
	}

	private static void displayAward(String name, double gpa) {
		System.out.println("Name: " + name);
		System.out.println("GPA: " + gpa);
		double award = gpa * 10;
		System.out.println("Award: " + award);
	}
}
