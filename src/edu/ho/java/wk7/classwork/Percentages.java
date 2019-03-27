package edu.ho.java.wk7.classwork;

/**
 * 
 * @author Aidan
 *
 */
public class Percentages {

	public static void main(String[] args) {
		double x = 2;
		double y = 5;

		// call method
		computePercent(x, y);
		computePercent(y, x);
	}

	private static void computePercent(double x, double y) {
		// p = (x/y)*100
		double percent = (x/y)*100;
		System.out.println(x + " is " + percent + " percent of " + y);

	}

}
