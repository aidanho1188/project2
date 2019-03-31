package edu.ho.java.wk8.hwChapter10Part1;

import java.util.ArrayList;

/**
 * 
 * @author Aidan
 *
 */
public class Ex11 {

	public void stutter(ArrayList<String> list, int k) {
		ArrayList<String> temp = new ArrayList<String>();

		for (String str : list) {
			// add str to temp if  k > 0
			for (int i = 0; i < k; i++)
				temp.add(str);
			// else add nothing
		}

		// set list
		list.clear();
		list.addAll(temp);
	}

}
