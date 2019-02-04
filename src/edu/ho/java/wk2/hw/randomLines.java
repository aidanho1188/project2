package edu.ho.java.wk2.hw;

import java.util.Random;

/**
 * 
 * @author Aidan
 *Exercises  5
 */
public class randomLines {
    
	public static void randomLines() {
	    Random rLine = new Random(); // random number of lines
	    Random rLetter = new Random(); // random number of letter
	    String letters = "abcdefghijklmnopqrstuvwxyz";
	    // random numbers from 5-10
	    int nLines = 5 + rLine.nextInt(5);
	    
	    // print a lines base on nLines
	    for(int i = 0; i < nLines; i++) {
	    	// pick a random length starting from 1 to 80
	    	// each time it loop
	        int length = 1 + rLetter.nextInt(80);
	        
	        // print strings of letters base on random length
	        for(int i2 = 0; i2 < length; i2++) {
	            int sLetter = rLetter.nextInt(26); // take a random string in letters a-z
	            char c = letters.charAt(sLetter); //
	            System.out.print(c);
	        }
	        System.out.println();
	    }
		
	}
	
	// test
	
	public static void main(String[] args) {
		randomLines();
		}
	}
