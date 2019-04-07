package edu.ho.java.wk9.hwChapter10Part2;

import java.util.ArrayList;

/**
 * 
 * @author Aidan
 *
 */
public class Ex17 {

	public ArrayList<Integer> interleave(ArrayList<Integer> a1, ArrayList<Integer> a2) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (a1.size() > a2.size()) {
			int i = 0;
			int j = 0;
			while (i < a2.size() * 2) {
				System.out.println(i);
				a1.add(i, a2.get(j));
				i = i + 2;
				j++;
			}
			result = a1;
		} else {
			int i = 0;
			int j = 0;
			while (i < a1.size() * 2) {
				System.out.println(i);
				a2.add(i, a1.get(j));
				i = i + 2;
				j++;
			}
			result = a2;
		}
		return result;
	}
}
