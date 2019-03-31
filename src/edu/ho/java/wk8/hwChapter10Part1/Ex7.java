package edu.ho.java.wk8.hwChapter10Part1;

import java.util.ArrayList;
/**
 * 
 * @author Aidan
 *
 */
public class Ex7 {

	public void removeDuplicates(ArrayList<String> list) {
		ArrayList<String> temp = new ArrayList<String>();
		// repeat (list.size) times
		for (int i = 0; i < list.size(); i++) {
			if (temp.size() == 0 || !temp.get(temp.size() - 1).equals(list.get(i)))
				temp.add(list.get(i));
		}

		// set to list
		list.clear();
		list.addAll(temp);
	}

}
