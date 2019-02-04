package edu.ho.java.wk2.hw;
/**
 * 
 * @author Aidan
 * Exercise 9
 */
public class printFactors {
	
	public static void printFactors(int n) {
	    System.out.print(1);
	    for(int i = 2; i <= n; i++) {
	        if(n % i == 0)
	            System.out.print(" and " + i);
	    }
	}
	
	// test
	
	public static void main(String[] args) {
		printFactors(24);
	}

}
