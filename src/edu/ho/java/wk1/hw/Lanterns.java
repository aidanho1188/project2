package edu.ho.java.wk1.hw;

/**
 * @author Aidan Ho
 * 
 *         Exercise 14
 *  Print out a picture of a lanterns
 */

public class Lanterns {
    public static void main(String[] args) {
    	triangleStars();
    	triangleStars();
        bars();
        printLine();
    	triangleStars();
    	triangleStars();
        fiveStars();
        bars();
        bars();
        fiveStars();
        fiveStars();
    }
    
    public static void triangleStars() {
        System.out.println("    *****");
        System.out.println("  *********");
        System.out.println("*************");
    }
    
    public static void bars() {
        System.out.println("* | | | | | *");
    }
    
    public static void printLine() {
        System.out.println("*************");
    }
    
    public static void fiveStars() {
        System.out.println("    *****");
    }

}
