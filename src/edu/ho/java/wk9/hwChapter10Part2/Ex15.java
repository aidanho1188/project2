package edu.ho.java.wk9.hwChapter10Part2;

import java.util.ArrayList;

/**
 * 
 * @author Aidan
 *
 */
public class Ex15 {
	public void filterRange(ArrayList<Integer> list, int min, int max) {
	    ArrayList<Integer> temp = new ArrayList<Integer>();
	    //  [4, 7, 9, 2, 7, 7, 5, 3, 5, 1, 7, 8, 6, 7]
	    // min = 5
	    // max = 7
	    for(int n : list) {
	        if(n < min || max < n)
	            temp.add(n);
	    }

	    list.clear();
	    list.addAll(temp);
	}

}
