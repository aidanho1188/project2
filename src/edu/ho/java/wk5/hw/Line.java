package edu.ho.java.wk5.hw;

import java.awt.Point;

/**
 * 
 * @author Aidan 
 * Exercise 14-17
 */
public class Line {

	// Exercise 14
	Point p1;
	Point p2;

	// create setter
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	// create getter
	public Point getP1() {
		return p1;
	}

	public Point getP2() {
		return p2;
	}

	public String toString() {
		return "[" + p1.toString() + ", " + p2.toString() + "]"; // return this string
	}

	// Exercise 15
	public double getSlope() {
		// get x and y
		double y1 = (double) p1.getY();
		double y2 = (double) p2.getY();
		double x1 = (double) p1.getX();
		double x2 = (double) p2.getX();
		// equation: (y2-y1)/(x2-x1)
		double slope = (y2 - y1) / (x2 - x1);
		// check x2 and x1
		if (x2 == x1) {
			throw new IllegalStateException();
		} else {
			return slope;
		}
	}

	// Exercise 16
	public Line(int x1, int y1, int x2, int y2) {
		// create new object/point for new line
		p1 = new Point();
		p2 = new Point();
		// set point
		p1.setLocation(x1, y1);
		p2.setLocation(x2, y2);
	}

	// Exercise 17
	public boolean isCollinear(Point p) { // p is the point/line we want to test
		// check if both lines start at the same x
		if (p1.getX() == p2.getX())
			return p.getX() == p2.getX(); // should return true if it start at the same x
		else {// else calculate the slope
			double slope1 = ((double) (p.getY() - p1.getY())) / (p.getX() - p1.getX());
			double slope2 = ((double) (p.getY() - p2.getY())) / (p.getX() - p2.getX());

			return slope1 == slope2; // return true if slope is equal, false if it not equal
		}
	}

}
