package edu.ho.java.wk6.hwChapter9;

import java.awt.Rectangle;

/**
 * 
 * @author Aidan
 * Exercise 14
 */
public class Circle {

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
	