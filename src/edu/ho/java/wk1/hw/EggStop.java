package edu.ho.java.wk1.hw;

/**
 * @author Aidan Ho
 * 
 *         Exercise 15
 *  Print out eggs/stop
 */

public class EggStop {
	
	public static void main(String[] args) {
		printTop();
		printBot();
		printBot();
		printMid();
		System.out.println("");
		printTop();
		stop();
		printBot();
		System.out.println("");
		printTop();
		printMid();
		
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
    
    public static void stop() {
        System.out.println("|  STOP  |");
    }

}
