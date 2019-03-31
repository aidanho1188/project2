package edu.ho.java.wk8.hwChapter10Part1;

import java.util.ArrayList;
/**
 * 
 * @author Aidan
 *
 */
public class Ex8 {

	public void removeZeroes(ArrayList<Integer> list) {
		// repeat (list.size) times
		for (int i = 0; i < list.size(); i++) {
			int number = list.get(i);
			// remove 0
			if (number == 0) {
				list.remove(i);
				i--;
			}
		}
		// print
		System.out.println(list);
	}

}
