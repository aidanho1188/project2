package edu.ho.java.wk1.hw;

/**
 * @author Aidan Ho
 * 
 *         Exercise 16
 *  Print "All work and no play makes Jack a dull boy." 1000 times
 */

public class Shining {
	
	// This will print 1000 lines
    public static void main(String[] args) {
    	fiveHundredLines();
    	fiveHundredLines();
    }
    
    public static void fiveHundredLines() {
    	oneHundredLines();
        oneHundredLines();
        oneHundredLines();
        oneHundredLines();
        oneHundredLines();
    }
    
    public static void oneHundredLines() {
    	fiftyLines();
        fiftyLines();
    }
    
    public static void fiftyLines() {
    	tenlines();
        tenlines();
        tenlines();
        tenlines();
        tenlines();
    }
    
    public static void tenlines() {
    	fiveLines();
        fiveLines();
    }
    
    public static void fiveLines() {
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
    }

	
}
