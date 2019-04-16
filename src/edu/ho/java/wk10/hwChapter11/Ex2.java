package edu.ho.java.wk10.hwChapter11;

import java.util.LinkedList;
import java.util.List;

public class Ex2 {

	public List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
		// new list
		List<Integer> temp = new LinkedList<>();

		boolean alternate = true;
		int size1 = list1.size();
		int size2 = list2.size();
		int index1 = 0;
		int index2 = 0;
		
		while (index1 < size1 || index2 < size2) {
			if (index1 < size1 && alternate) {
				temp.add(list1.get(index1));
				index1++;
			} else if (index2 < size2 && !alternate) {
				temp.add(list2.get(index2));
				index2++;
			}
			alternate = !alternate;
		}
		return temp;
	}
}
