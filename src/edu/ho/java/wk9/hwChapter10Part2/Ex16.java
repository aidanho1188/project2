package edu.ho.java.wk9.hwChapter10Part2;

import java.util.ArrayList;

/**
 * 
 * @author Aidan
 *
 */
public class Ex16 {

	public static void clump(ArrayList<String> strings) {

		// ["four", "score", "and", "seven", "years", "ago", "our"]
		int length = (strings.size() - strings.size() % 2) / 2;// check odd and set size
		for (int i = 0; i < length; i++) {
			String temp;
			temp = strings.get(i) + " " + strings.get(i + 1);
			// remove current element
			strings.remove(i);
			strings.remove(i);
			strings.add(i, "(" + temp + ")");
		}
	}

}
