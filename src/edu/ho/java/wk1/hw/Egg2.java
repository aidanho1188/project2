package edu.ho.java.wk1.hw;

/**
 * @author Aidan Ho
 * 
 *         Exercise 10
 *  Print out eggs
 */

public class Egg2 {

	public static void main(String[] args) {
        printTop();
        printBot();
        printMid();
        printTop();
        printBot();
        printMid();
        printBot();
        printTop();
        printMid();
        printBot();
	}
	
    public static void printTop() {
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }

    public static void printMid() {
        System.out.println("-\"-'-\"-'-\"-");
    }

    public static void printBot() {
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
}
