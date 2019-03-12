package edu.ho.java.wk6.hwChapter9;

/**
 * 
 * @author Aidan
 * Exercise 14
 */
public class Triangle {

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
