package edu.ho.java.wk8.hwChapter10Part1;

import java.util.ArrayList;

/**
 * 
 * @author Aidan
 *
 */
public class Ex12 {

	public void markLength4(ArrayList<String> list) {
		ArrayList<String> temp = new ArrayList<String>();

		// repeat for every str in list 
		for (String str : list) {
			// if the next string is 4 or more chars
			if (str.length() == 4) {
				// add "****"
				// will be in the front of the word
				temp.add("****");
			}
			// add the word after the if statement
			temp.add(str);
		}

		// set new list
		list.clear();
		list.addAll(temp);
	}
}
