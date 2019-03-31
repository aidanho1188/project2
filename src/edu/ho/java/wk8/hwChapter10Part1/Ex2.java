package edu.ho.java.wk8.hwChapter10Part1;

import java.util.ArrayList;
/**
 * 
 * @author Aidan
 *
 */
public class Ex2 {

	public void swapPairs(ArrayList<String> list) {
		// repeat depend on the pairs of the list
		for (int i = 0; i <= list.size() - 2; i += 2) {
			String temp = list.get(i + 1);
			list.set(i + 1, list.get(i));
			list.set(i, temp);
		}
	}
}
