package edu.ho.java.wk4.hw;

/**
 * 
 * @author Aidan 
 * Exercise 1-6
 */

public class Point {

	private int x;
	private int y;

	// exercise 1
	public int quadrant() {
		// positive y and x
		if (this.y > 0 && this.x > 0) {
			return 1;
		}
		// negative x and positive y
		else if (this.x < 0 && this.y > 0) {
			return 2;
		}
		// negative x and y
		else if (this.x < 0 && this.y < 0) {
			return 3;
		}
		// positive x and negative y
		else if (this.x > 0 && this.y < 0) {
			return 4;
		}
		// x and y = (0,0)
		else {
			return 0;
		}
	}

	// exercise 2
	public void flip() {
		// flip x,y and negates
		// x = 2, y = 10
		int temp = this.x; // temp = 2
		this.x = -this.y; // x = -10
		this.y = -temp; // y = -2

	}

	// exercise 3
	public int manhattanDistance(Point other) {
		int d = (this.x - other.x) + (this.y - other.y);// find the diffences
		return Math.abs(d); // return the distance
	}

	// exercise 4
	public boolean isVertical(Point other) {
		if (this.x == other.x) {
			return true;
		} else {
			return false;
		}
		// that or return (this.x == other.x)
	}

	// exercise 5
	public double slope(Point other) {
		if (this.x == other.x) {
			throw new IllegalArgumentException();
		} else {
			int slope = (this.y - other.y) / (this.x - other.x);
			return slope;
		}
	}

	// exercise 6
	public boolean isCollinear(Point p1, Point p2) {
		// check if this.x and p1 or p2 are the same
		// if it the same then end the method
		if (this.x == p1.x || this.x == p2.x)
			return this.x == p1.x && this.x == p2.x;

		// calculate slopes
		double slope1 = ((double) (this.y - p1.y)) / (this.x - p1.x);
		double slope2 = ((double) (this.y - p2.y)) / (this.x - p2.x);

		// check if slopes are the same
		if (slope1 == slope2) {
			return true;
		} else {
			// return false if slopes are not the same
			// mean it never Collinear
			return false;
		}
	}
}
