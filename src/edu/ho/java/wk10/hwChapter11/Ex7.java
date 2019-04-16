package edu.ho.java.wk10.hwChapter11;

import java.util.HashSet;
import java.util.List;

public class Ex7 {

	public int countCommon(List<Integer> list1, List<Integer> list2) {
		// create sets
	    HashSet<Integer> set1 = new HashSet<Integer>(list1);
	    HashSet<Integer> set2 = new HashSet<Integer>(list2);
	    int count = 0;

	    for(int n : set2) {
	    	// compare 2 set
	        if(set1.contains(n)) {
	            count++;	        	
	        }
	    }

	    return count;
	}
}
