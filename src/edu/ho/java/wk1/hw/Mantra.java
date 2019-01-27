package edu.ho.java.wk1.hw;

/**
 * 
 * @author Aidan
 *          Exercise 7
 * Using more than one static method and print
 *  
 * There's one thing every coder must understand:
 * The System.out.println command.
 * There's one thing every coder must understand: 
 * The System.out.println command.
 */
public class Mantra {
	
    public static void main(String[] args) {
    	printSentences();
        System.out.println();
        printSentences();
    }
                                    
    public static void printSentences() {
        System.out.println("There's one thing every coder must understand:");
        System.out.println("The System.out.println command.");
    }

}
