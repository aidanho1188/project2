package edu.ho.java.wk3.hw;
/**
 * 
 * @author Aidan
 * Exercise 10
 * 
 * calculate the precentage of even number in a array
 */
public class percentEven {
	
	public static double percentEven(int[] a) {
	    if(a.length == 0)
	        return 0.0;// 0%
	        
	    int count = 0;
	    // count+1 everytime the number is even
	    for(int i = 0; i < a.length; i++) {
	        if(a[i] % 2 == 0)
	            count++;
	    }
	    // percent=n*100/total
	    return count * 100.0 / a.length;
	}
	
	// test
	public static void main(String[] args) {
		int[] list = {6, 2, 9, 11, 3};
		System.out.print(percentEven(list));
		
	}

}
