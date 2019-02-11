package edu.ho.java.wk3.hw;
/**
 * 
 * @author Aidan
 * Exercise 1
 */
public class lastIndexOf {
	
	public static int lastIndexOf(int[] array, int interger) {
	    for(int i = array.length - 1; i >= 0; i--) {
	        if(array[i] == interger)
	            return i;
	    }
	    return -1;
	}
	
	// test
	public static void main(String[] args) {
		int[] array = {74, 85, 102, 99, 101, 85, 56};
		System.out.print(lastIndexOf( array, 85));
	}

}
