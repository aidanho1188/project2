package edu.ho.java.wk8.hwChapter10Part1;

import java.util.ArrayList;
/**
 * 
 * @author Aidan
 *
 */
public class Ex6 {

	public void minToFront(ArrayList<Integer> list) {
		// set variable for comparision
		int min = Integer.MAX_VALUE;
		int pos = -1;

		// repeat (list.size) times
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < min) {
				min = list.get(i);
				pos = i;
			}
		}
		// put the smallest value into index 0
		list.remove(pos);
		list.add(0, min);
	}

}
