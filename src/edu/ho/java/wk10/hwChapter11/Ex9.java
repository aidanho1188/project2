package edu.ho.java.wk10.hwChapter11;

import java.util.Set;

public class Ex9 {

	public boolean hasOdd(Set<Integer> set) {
	    for(int n : set) {
	    	// check odd
	        if(n % 2 == 1) {
	            return true;	        	
	        }
	    }

	    return false;
	}
}
