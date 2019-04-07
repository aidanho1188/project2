package edu.ho.java.wk9.hwChapter10Part2;

import java.awt.Point;

/**
 * 
 * @author Aidan
 *
 */
public class Ex18_Point implements Comparable<Point> {
	private int x;
	private int y;

	public int compareTo(Point other) {
		if (x < other.x) {
			return other.x;// case
		} else if (x > other.x) {
			return x;// case
		} else if (y < other.y) {
			return other.y;
		} else if (y > other.y) {
			return y;
		} else if (x != other.x) { // Break ties by comparing x-coordinate values.
			return x - other.x; // different x
		} else {
			return y - other.y; // same x; compare y
		}
	}

}
