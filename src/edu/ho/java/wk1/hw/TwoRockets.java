package edu.ho.java.wk1.hw;

/**
 * @author Aidan Ho
 * 
 *         Exercise 11
 *  Print out two rockets
 */

public class TwoRockets {

    public static void main(String[] args) {
        printTriangle();
        printSquare();
        printUS();
        printSquare();
        printTriangle();
    }
                                                    
    public static void printTriangle() {
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }

    public static void printSquare() {
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }

    public static void printUS() {
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
    }
}
