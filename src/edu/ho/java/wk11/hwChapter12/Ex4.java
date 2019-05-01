package edu.ho.java.wk11.hwChapter12;

public class Ex4 {

	public static int doubleDigits(int input) {
		
	    if (input == 0) {
	    	
	        return 0;
	        
	    } else {

	        int lastDigit = input % 10;
	        
	        return 100 * doubleDigits(input / 10) + 10 * lastDigit + lastDigit;
	    }
	}
}
