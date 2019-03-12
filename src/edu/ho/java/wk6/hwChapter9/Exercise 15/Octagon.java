package edu.ho.java.wk6.hwChapter9;
/**
 * 
 * @author Aidan
 * Exercise 15
 */
public class Octagon implements Shape{

	Octagon o = new Octagon();
	public int a; // side
	private double area;
	private int perimeter;
	
	// A =2(1+2)a2
	public double area() {
		return area = (double) (2*(1+2)*Math.sqrt(a));
	}
	// P=8a
	public double perimeter() {
		return perimeter = 8*a;
	}
}
