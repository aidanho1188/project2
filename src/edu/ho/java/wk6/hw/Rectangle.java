package edu.ho.java.wk6.hw;

import java.awt.Shape;

/**
 * 
 * @author Aidan
 * Exercise 14
 */
public class Rectangle {

	Triangle t = new Triangle();
	Circle c = new Circle();
	Rectangle r = new Rectangle();

	// check if t=c or t=r or c=r
	public void equal() {
		if (t.equals(c) || t.equals(r) || c.equals(r)) {
			return;
		}
	}
}
	