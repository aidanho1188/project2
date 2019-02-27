package edu.ho.java.wk5.hw;

import java.awt.Point;

/**
 * 
 * @author Aidan 
 * Exercise 18-22
 */
public class Rectangle {
	private int height;
	private int x;
	private int y;
	private int width;

	// Exercise 18
	// create setter
	public Rectangle(int x, int y, int width, int height) {
		if (width < 0 || height < 0)
			throw new IllegalArgumentException();
		this.height = height;
		this.x = x;
		this.y = y;
		this.width = width;
	}

	// create getter
	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	// print everything out
	public String toString() {
		return "Rectangle[x=" + x + "y=" + y + "width=" + width + ", height=" + height + "]";
	}

	// Exercise 19
	public Rectangle(Point p, int width, int height) {
		// set point, width, and height
		this.x = (int) p.getX();
		this.y = (int) p.getY();
		this.width = width;
		this.height = height;
	}

	// Exercise 20
	// test x and y
	public boolean contains(int x, int y) {
		// let say x=1,y=2,width=3, height=4, and x,y is the top-left corner of the rect
		// if x is <= the given x, mean it outside of the rect
		// given x must also be less then the width
		// same thing apply for y
		if (this.x <= x && x <= this.x + width && this.y <= y && y <= this.y + height) {
			return true;
		} else {
			return false;
		}
	}

	// test point
	public boolean contains(Point p) {
		return contains((int) p.getX(), (int) p.getY());
	}

	// Exercise 21
	public Rectangle union(Rectangle rect) {
		/**
		 * represents the area occupied by the tightest bounding box that contains both
		 * this Rectangle and the given other Rectangle?
		 */
		// create new rect
		int x1 = rect.getX() + this.x;
		int y1 = rect.getY() + this.y;
		int width1 = rect.getWidth() + this.width;
		int height1 = rect.getHeight() + this.height;
		// return new rect
		return new Rectangle(x1, y1, width1, height1);
	}

	// Exercise 22
	public Rectangle intersection(Rectangle rect) {
		// create new rect that contain both this.rect and the given rect
		// test if this.rect intersect with given rect
		if (this.getX() + this.getWidth() > rect.getWidth() || this.getY() + this.getHeight() > rect.getHeight()
				|| rect.getX() + rect.getWidth() > this.getWidth()
				|| rect.getY() + rect.getHeight() > this.getHeight()) {
			return new Rectangle(x, y, 0, 0);
		}
		// new rect
		int x2 = rect.getX() + this.x;
		int y2 = rect.getY() + this.y;
		int width2 = rect.getWidth() + this.width;
		int height2 = rect.getHeight() + this.height;
		return new Rectangle(x2, y2, width2, height2);
	}

}
