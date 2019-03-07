package edu.ho.java.midtermInClass;

/**
 * 
 * @author Aidan
 *
 */
public class DrugTests {

	public static void main(String[] args) {

		for (int x = 0; x < 52; x++) { // x = weeks
			for (int x1 = 0; x1 < 4; x1++) {
				// pick random
				int testedEmployee = 1 + (int) (Math.random() * 30);
				System.out.print(testedEmployee + ", "); // display 4 employee on each line
			}
			System.out.println("");
		}
	}
}
