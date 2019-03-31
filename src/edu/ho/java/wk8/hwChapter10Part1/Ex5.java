package edu.ho.java.wk8.hwChapter10Part1;

import java.util.ArrayList;
/**
 * 
 * @author Aidan
 *
 */
public class Ex5 {

	public static void ScaleByk(ArrayList<Integer> list) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		// repeat (list.size) times
		for (int x = 0; x < list.size(); x++) {
			// repeat x on the list
			for (int y = 0; y < list.get(x); y++) {
				if (list.get(x) < 0) {
					// do nothing
				} else {
					temp.add(list.get(x));
				}

			}
		}
		// reset
		for (int h = list.size() - 1; h > 0; h--) {
			list.remove(h);
		}
		// add temp to List
		list.addAll(temp);
	}
}
