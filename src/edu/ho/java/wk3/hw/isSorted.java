package edu.ho.java.wk3.hw;

/**
 * 
 * @author Aidan 
 * Exercise 4
 */
public class isSorted {

	public static boolean isSorted(double[] array) {
		// only 3 comparison needed so array.length -2
	    for(int i = 0; i < array.length-2; i++) {
	    	// ex. compare 1.5 with 4.3
	        if(array[i + 1] < array[i])
	            return false;
	    }
	    return true;
	}
	
	// test
	
	public static void main(String[] args) {
		double[] list2= {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		System.out.print(isSorted(list2));
	}
}
