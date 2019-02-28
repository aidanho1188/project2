package edu.ho.java.wk6.classwork;

public class TeeShirt extends CustomTee {

	private int orderNumber;
	private String size;
	private String Color;
	private int price;
	
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		if( size == "XX" || size =="XXL") {
			price = (int) 22.99;
		}
		else {
			price = (int) 19.99;
		}
		this.size = size;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getPrice() {
		return price;
	}
	
	
}
