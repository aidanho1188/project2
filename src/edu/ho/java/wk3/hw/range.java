package edu.ho.java.wk3.hw;

import java.util.Arrays;

/**
 * 
 * @author Aidan 
 * Exercise 2
 * range = high-low
 * add 1 since the range is 1 more 
 */
public class range {

	public static int range(int[] array) {
		//sort arrays
		Arrays.sort(array);
		// set  min and max
		int min = array[0];
		int max = array[array.length-1];
		//calculate and return
		return max - min + 1;
	}

	// test
	public static void main(String[] args) {
		int[] list = { 36, 12, 25, 19, 46, 31, 22 };		
		System.out.print(range(list));
	}

}
