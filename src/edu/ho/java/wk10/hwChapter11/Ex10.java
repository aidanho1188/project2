package edu.ho.java.wk10.hwChapter11;

import java.util.LinkedList;
import java.util.Set;

public class Ex10 {
	public void removeEvenLength(Set<String> set) {
		LinkedList<String> temp = new LinkedList<String>();

		for (String str : set) {
			// check odd
			if (str.length() % 2 == 1) {
				temp.add(str);				
			}
		}
		// clear and add
		set.clear();
		set.addAll(temp);
	}
}
