package edu.ho.java.wk9.hwChapter10Part2;

import java.util.ArrayList;

/**
 * 
 * @author Aidan
 *
 */
public class Ex17 {

	public ArrayList<Integer> interleave(ArrayList<Integer> a1, ArrayList<Integer> a2) {
		ArrayList<Integer> temps = new ArrayList<Integer>();
		// size check
		if (a1.size() > a2.size()) {
			int i = 0;
			int j = 0;
			// combine list
			while (i < a2.size() * 2) {
				// add to list 1
				a1.add(i, a2.get(j));
				i = i + 2;
				j++;
			}
			// set temp
			temps = a1;
		} else {
			int i = 0;
			int j = 0;
			while (i < a1.size() * 2) {
				// add to list 2
				a2.add(i, a1.get(j));
				i = i + 2;
				j++;
			}
			// set temp
			temps = a2;
		}
		// return temp, either a1 or a2
		return temps; // return new array list
	}
}
