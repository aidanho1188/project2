package edu.ho.java.wk3.hw;

import java.util.Arrays;
import java.util.Collections;

/**
 * 
 * @author Aidan
 * Exercise 7
 * 
 * k= 2, return value = 99
 */
public class kthLargest {

	public static int kthLargest(int k, Integer[] a) {
		int value;
		Arrays.sort(a, Collections.reverseOrder()); // 102,101,99,85,84,74,56
		value = a[k];
		
		return value;
	}
	
	// test
	public static void main(String[] args) {
		// use Integer type to do a reverse sort
		Integer[] list = {74, 85, 102, 99, 101, 56, 84};
		System.out.print(kthLargest(2,list));
	}
}
