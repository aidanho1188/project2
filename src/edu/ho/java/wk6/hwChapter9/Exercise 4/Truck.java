package edu.ho.java.wk6.hwChapter9;
/**
 * 
 * @author Aidan
 * super class for MonsterTruck
 */
public class Truck extends Car{
	public void m1() {
		System.out.println("truck 1");
	}

	public void m2() {
		super.m1();
	}

	public String toString() {
		return super.toString() + super.toString();
	}
}
