package edu.ho.java.wk2.hw;

/**
 * 
 * @author Aidan
 *Exercise 3 
 */
public class toBinary {
	
	public static String toBinary(int n) {
	    String s = "";
	    while (n > 0)
	    {
	    	if (n%2 == 0){
	    		// add 0 into the string
	    		s= "0" + s;
	    	}
	    	else {
	    		// else add 1
	    		s = "1" + s;
	    	}
	    	// divide by 2
	    	n = n/2;
	    	// n!=0, loop again.
	    }
	    return s;
	}
	
	// test
	public static void main(String[] args) {
		System.out.print(toBinary(156));
	}

}
