package edu.ho.java.midtermInClass;
/**
 * 
 * @author Aidan
 * 6 = 1+2+3
 * 12!= 1+2+3+4
 */
public class Perfect {

	public static void main(String[] args){
	    int x = 1; 
	    int y = 1000;

	    // repeat until x is greater than y
	    for (x = 1; x <= y; x++) { 
	    	// set sum
	        int sum = 0;
	        // check if x%z is 0
	        for (int z = 1; z < x; z++) {
	            if ((x % z) == 0) {
	                sum += z;
	            } 
	        }  
	        // check if sum = x
	        if (sum == x){       
	        	// print out the sum if sum = x
	            System.out.println(sum);
	        }          
	    }      
	}
}
