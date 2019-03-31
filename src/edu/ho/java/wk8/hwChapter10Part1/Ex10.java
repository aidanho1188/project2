package edu.ho.java.wk8.hwChapter10Part1;

import java.util.ArrayList;
/**
 * 
 * @author Aidan
 *
 */

public class Ex10 {

	public void removeInRange(ArrayList<String> strings, String begin, String end) {
		// begin = free
		// end = rich
		// repeat strings.size times
		for (int i = strings.size() - 1; i >= 0; i--) {
			// remove any element between free and rich
			if (strings.get(i).compareToIgnoreCase(begin) > 0 && strings.get(i).compareToIgnoreCase(end) < 0) {
				strings.remove(strings.lastIndexOf(strings.get(i)));
			}
		}
	}

}
