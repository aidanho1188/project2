package edu.ho.java.wk7.classwork;

import java.util.Scanner;

/**
 * 
 * @author Aidan
 *
 */
public class PaintCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double lenght;
		double width;
		double height;
		// 1 gallon = 350 feet
		// prompts user for length width and height
		System.out.print("Enter lenght: ");
		lenght = sc.nextDouble();

		System.out.print("Enter width: ");
		width = sc.nextDouble();

		System.out.print("Enter height: ");
		height = sc.nextDouble();

		Calculates(lenght, width, height);

	}

	private static void Calculates(double l, double w, double h) {
		double a = 2*((h * l) +(h*w));
		double gallon = calculateGallon(a);
		System.out.println("Gallon needed: "+ gallon);
		
		// 32$ per gallon
		double price = calculatePrice(a);
		System.out.println("Price is: "+price);
		
	}

	private static double calculatePrice(double a) {
		return a=a*32;
	}

	private static double calculateGallon(double a) {
		// 1 gallon = 350 feet
		// a = feet
		return a / 350;

	}
}
