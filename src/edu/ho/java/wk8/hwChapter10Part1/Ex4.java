package edu.ho.java.wk8.hwChapter10Part1;

import java.util.ArrayList;
/**
 * 
 * @author Aidan
 *
 */
public class Ex4 {
	public void doubleList(ArrayList<String> list) {
		ArrayList<String> temp = new ArrayList<String>();

		// add str into temp list
		for (String str : list) {
			temp.add(str);
			temp.add(str);
		}
		// reset
		list.clear();
		// add new str from temp into list list
		for (String str : temp)
			list.add(str);
	}
}
