package edu.ho.java.wk8.hwChapter10Part1;

import java.util.ArrayList;
/**
 * 
 * @author Aidan
 *
 */
public class Ex9 {

	public int rangeBetweenZeroes(ArrayList<Integer> list) {

		// set variables
		int numZeroes = 0;
		int firstZero = 0;
		int lastZero = 0;

		// repeat (list.size) times
		for (int i = 0; i < list.size(); i++) {
			// count the number of zeroes
			if (list.get(i).intValue() == 0 && numZeroes == 0) {
				numZeroes++;
				firstZero = i;
			} else if (list.get(i).intValue() == 0 && numZeroes > 0) {
				numZeroes++;
				lastZero = i;
			}
		}

		// return 0 if there is no zeroes
		if (numZeroes == 0) {
			return 0;
		} else if (numZeroes == 1) { // return 1 is 1 zeroes in the ist
			return 1;
		} else {
			return (lastZero - firstZero) + 1;
		}
	}

}
