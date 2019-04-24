package edu.ho.java.wk12.classwork;

public class Thermometer {

	private double degreesCelsius;

	public void setCelsius(double degrees) {
		degreesCelsius = degrees;
	}

	public void setFahrenheit(double degrees) {
		degreesCelsius = (degrees - 32.0) * 5. / 9;
	}

	public double getCelsius() {
		return degreesCelsius;
	}

	public double getFahrenheit() {
		return degreesCelsius * 9 / 5 + 32;
	}

}
