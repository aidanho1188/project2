package edu.ho.java.wk7.classwork;

import java.util.Scanner;

public class NumbersDemon2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.print("Enter an number: ");
		num1 = sc.nextInt();
		System.out.print("Enter a second number: ");
		num2 = sc.nextInt();
		displayTwiceTheNumber(num1);
		displayNumberPlusFive(num1);
		displayNumberSquared(num1);
		
		displayTwiceTheNumber(num2);
		displayNumberPlusFive(num2);
		displayNumberSquared(num2);
		
	}
	
	private static void displayNumberSquared(int num) {
		num =  num*num;
		System.out.println("NumberSquared " + num);

	}

	private static void displayNumberPlusFive(int num) {
		num = num + 5;
		System.out.println("NumberPlusFive " + num);
	}

	private static void displayTwiceTheNumber(int num) {
		num = num * 2;
		System.out.println("TwiceTheNumber " + num);

	}

}
