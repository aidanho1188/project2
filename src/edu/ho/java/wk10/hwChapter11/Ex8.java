package edu.ho.java.wk10.hwChapter11;

import java.util.Set;

public class Ex8 {
	
	public int maxLength(Set<String> set) {
	    int maxLength = 0;

	    for(String str : set) {
	    	// check each string for the longest string
	        if(maxLength < str.length()) {
	            maxLength = str.length();
	        }
	    }

	    return maxLength;
	}

}
