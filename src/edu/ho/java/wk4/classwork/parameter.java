package edu.ho.java.wk4.classwork;

public class parameter {

	boolean isEven(int x) {
		if ((x % 2 == 0)) {
			return true;
		} else {
			return false;
		}

	}

	boolean isFactor(int a, int b) {
		if ((b % a) == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		parameter para = new parameter();
		if (para.isEven(10)) {
			System.out.println("10 is even");
		}
		
		
	}
	
	
}
