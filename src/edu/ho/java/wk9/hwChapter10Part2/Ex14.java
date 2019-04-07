package edu.ho.java.wk9.hwChapter10Part2;

import java.util.ArrayList;

/**
 * 
 * @author Aidan
 *
 */
public class Ex14 {
    public static void removeShorterStrings(ArrayList<String> strings) {
    	//["four", "score", "and", "seven", "years", "ago", "our"]

        // compare 2 pair
        for (int i = 1; i < strings.size();i += 2) {
        	String temp1 = strings.get(i);
        	String temp2 = strings.get(i+1);
        	
        	if (temp1.length() > temp2.length()) {
        		strings.remove(i+1);
        	}
        	else if(temp2.length() > temp1.length()) {
        		strings.remove(i);
        	}
        }
    }
}
