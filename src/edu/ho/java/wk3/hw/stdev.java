package edu.ho.java.wk3.hw;
/**
 * 
 * @author Aidan
 * Exercise 6
 * 
 * 
 */
public class stdev {
	 
	public static double stdev(int[] a) {
	    double num = 0;
	    double sum = 0;
	    double mean;
	    
	    // find sum of x
	    for (int i = 0; i < a.length;i++) {
	    	sum += a[i];
	    }
	    // calculate mean
	    mean = sum/a.length;
	    
	    // sum of (a[i] - sum)^2
	    for(int i = 0; i < a.length; i++) {
	        num += (a[i] - mean) * (a[i] - mean);
	    }
	    //calculate (a[i] - sum)^2/n-1
	    return Math.sqrt(num / (a.length - 1));
	}
	
	
	// test
	public static void main(String[] args) {
		int[] list = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
		System.out.print(stdev(list));
	}

}
