package edu.ho.java.wk8.hwChapter10Part1;

import java.util.ArrayList;
/**
 * 
 * @author Aidan
 *
 */
public class Ex3 {

	public void removeEvenLength(ArrayList<String> list) {
		ArrayList<String> temp = new ArrayList<String>();

		for (int i = 0; i < list.size(); i++) {
			// add odd chars to temp
			if (list.get(i).length() % 2 == 1)
				temp.add(list.get(i));
		}

		list.clear();
		list.addAll(temp);
	}

}
