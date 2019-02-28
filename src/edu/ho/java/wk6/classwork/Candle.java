package edu.ho.java.wk6.classwork;

public class Candle {

	// color height and price
	// get method
	// set mehtod color and height
	// not the price
	// calculate the price base on the height

	public String color;
	public int height;
	public int price;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getHeight() {
		return height;
	}
	// 2 dollar per inch
	public void setHeight(int height) {
		this.height = height;
	}

	public int getPrice() {
		return price;
	}
	
	public int setPrice() {
		return this.price = this.getHeight()*2;
	}

}
