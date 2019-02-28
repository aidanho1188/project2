package edu.ho.java.wk6.classwork;
/**
 * 
 * @author Aidan
 * Main class
 * Use throw and catch
 *
 */
public class TicTacToeApp {
	
	public static void main(String[] args ) {
		Player p1 = new Player(); // create object
		Player p2 = new Player();
		playTheGame(p1,p2);
	}
	
	public static void playTheGame(Player p1, Player p2) {
		p1.move();
		p2.move();
	}

}
