package edu.ho.java.wk10.hwChapter11;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Ex6 {

	public static int countUnique(List<Integer> list) {
		// hashset use same index with size without duplicate
	    HashSet<Integer> set = new HashSet<Integer>();

	    for(int n : list)
	        set.add(n);
	    // return the size of unique numbers
	    return set.size();
	}
}
