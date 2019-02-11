package edu.ho.java.wk3.hw;

import java.util.Arrays;

/**
 * 
 * @author Aidan
 * Exercise 8
 */
public class median {
	
	public static double median(int[] array) {
		double median = 0;
		Arrays.sort(array);
		int mid; // middle
		
		// check if array length is odd or even
		if( array.length % 2 == 0) {
			// if even find median
			mid = array.length/2;
			double min = array[mid];
			double max = array[mid-1];
			median = (min+max)/2;
		}
		else {
			// if odd
			mid = array.length/2;
			median = array[mid];
		}
		return median;
		
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10,11}; // median should be 5
		System.out.print(median(array));
	}

}
