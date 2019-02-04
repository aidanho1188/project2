package edu.ho.java.wk2.hw;
/**
 * 
 * @author Aidan
 * Exercise 10
 * 
 * each hops count as 2 lines
 */
public class hopscotch {
	
	public static void hopscotch(int hops) {
	    int currentNumber = 1; // start at 1
	    int total = 3 * hops + 1; // ex 7,  3*7+1 = 22... 22 is our seventh hops
	    
	    // loop until current(1) is < than total 22
	    while(currentNumber < total) {
	    	// print 1,4,7... in middle
	        if((currentNumber - 1) % 3 == 0) {
	            System.out.println("   " + currentNumber); 
	            currentNumber++;
	        } else { // print 2,3,5,6... outside
	            System.out.println(currentNumber + "     " + (currentNumber + 1));
	            currentNumber += 2;
	        }
	    }
	    
	    System.out.println("   " + currentNumber);
	}
	
	//test 
	public static void main(String[] args) {
		hopscotch(7);
	}

}
