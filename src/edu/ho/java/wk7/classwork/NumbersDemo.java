package edu.ho.java.wk7.classwork;

import java.util.*;

public class NumbersDemo {

	public static void main(String[] args) {
		int x = 4;
		int y = 33;
		displayTwiceTheNumber(x);
		displayNumberPlusFive(x);
		displayNumberSquared(x);

		displayTwiceTheNumber(y);
		displayNumberPlusFive(y);
		displayNumberSquared(y);
	}

	private static void displayNumberSquared(int num) {
		num =  (int) (num*Math.sqrt(2));
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
