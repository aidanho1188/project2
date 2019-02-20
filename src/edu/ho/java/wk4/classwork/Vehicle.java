package edu.ho.java.wk4.classwork;

public class Vehicle {

	int passengers; // number of people
	int fuelcap; // fuel capacity
	int mpg; // speed

	public static void main(String[] args) {
		Vehicle car1 = new Vehicle(); // creating object
		Vehicle car2 = new Vehicle();
		Vehicle car3 = car1; // parallel object
		int range1, range2;
		double gallons;
		int dist = 252;

		car1.passengers = 7; // set object value
		car1.fuelcap = 16;
		car1.mpg = 21;

		car2.passengers = 2; // set object value
		car2.fuelcap = 14;
		car2.mpg = 12;

		gallons = car1.fuelcapneeded(dist);
		System.out.println("To go distance " + dist + " and mile car needs " + gallons + " gallons of fuel.");

		range1 = car1.fuelcap * car1.mpg;
		range2 = car2.fuelcap * car2.mpg;
		int range3 = car1.ranges(); // use method to calculate the range

		System.out.println("Minivan can carry " + car1.passengers + " with a range of " + range1);
		car1.range();// invoke or call the range method
		System.out.println("Minivan can carry " + car2.passengers + " with a range of " + car2.ranges() + "miles"); // call
																													// method
																													// in
																													// System.out.print
		car2.range();
		System.out.println(range3);

	}

	void range() { // creating a method
		System.out.println("Range is " + fuelcap * mpg);

		// if(mpg==5) return; // terminate the method
	}

	int ranges() {
		return mpg * fuelcap; // return the range directly
	}

	public double fuelcapneeded(int miles) {
		return (double) (miles / mpg);

	}

}
