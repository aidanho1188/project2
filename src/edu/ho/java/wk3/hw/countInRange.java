package edu.ho.java.wk3.hw;
/**
 * 
 * @author Aidan
 * Exercise 3
 * 
 */
public class countInRange {

	public static int countInRange(int[] array,  int min, int max) {
		int count = 0;
		
	    for(int i = 0; i < array.length; i++) {
	        if(min <= array[i] && array[i] <= max)
	            count++;
	    }    
		return count;
	}
	
	//test
	public static void main(String[] args) {
		int[] array = {14, 1, 22, 17, 36, 7, -43, 5};
		System.out.print(countInRange(array, 4, 17));
	}
}
