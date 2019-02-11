package edu.ho.java.wk3.hw;
/**
 * 
 * @author Aidan
 * Exercise 5
 */
public class mode {
	
	public static int mode(int[] numbers) {
	    int[] counts = new int[101]; //including 0
	    int maxCount = 0;
	    int frequently = -1;
	    // loop the array
	    for(int i = 0; i < numbers.length; i++) {
	    	// add the number to the array
	        counts[numbers[i]]++; 
	        // compare the count of number to maxCount
	        if(counts[numbers[i]] > maxCount) {
	            maxCount = counts[numbers[i]];
	            frequently = numbers[i];
	        }
	    }  
	    // return the most counted number
	    return frequently;
	}
	
	public static void main(String[] args) {
		int[] list = {27, 15, 15, 11, 27};
		System.out.print(mode(list));
	}
}
