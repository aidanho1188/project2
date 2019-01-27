package edu.ho.java.wk1.hw;

/**
 * @author Aidan Ho
 * 
 *         Exercise 12
 *  Print out a song
 */

public class FightSong {

    public static void main(String[] args) {
    	cheer();
    	best();
    	cheer();
    	best();
    	cheer();
    }
    
    public static void cheer(){
    	System.out.print("Go, team, go!\n" + 
    			"You can do it.\n" + 
    			"Go, team, go!\n" + 
    			"You can do it.\n");
    }
    
    public static void best() {
    	System.out.print("You're the best,\n" + 
    			"In the West.\n");
    }
                                                    
}
