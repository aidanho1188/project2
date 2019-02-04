package edu.ho.java.wk2.hw;

import java.lang.Math;
/**
 * 
 * @author Aidan
 * Exercise 2
 * 2 integers in parameter
 * 
 * GCD(a,b)=GCD(b,a%b)GCD(a, 0)=Absolute value of a
 * b = a
 * a%b = 0
 * GCD(a,b) = abs(a)
 *
 */
public class gcd {
	
	public static int gcd(int a, int b) {
		while (b!=0) {
	        int a2 = a;
	        b = a;
	        b = a2 % b;	
		}
		return Math.abs(a);
		
	}
	
	// test
	public static void main(String[] args) {
		System.out.print(gcd(10,100));
	}

}
