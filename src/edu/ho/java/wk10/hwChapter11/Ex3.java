package edu.ho.java.wk10.hwChapter11;

import java.util.LinkedList;
import java.util.List;

public class Ex3 {

	public void removeInRange(LinkedList<Integer> list, int val, int start, int end) {
		if (start > end) {
			return;
		}
		// removeInRange(list, 0, 5, 13)
		List<Integer> temp = new LinkedList<Integer>();
		// add to temp list
		for (int i = 0; i < start; i++) {
			temp.add(list.get(i));			
		}
		
		// start at 5, end at 13
		for (int i = start; i < end; i++) {
			// add index if i!= 0
			if (list.get(i) != val)
				temp.add(list.get(i));
		}
		// i = 13, stop if index 13 > list size
		for (int i = end; i < list.size(); i++) {
			// else add
			temp.add(list.get(i));			
		}
		// clear and add new list
		list.clear();
		list.addAll(temp);
	}
}
