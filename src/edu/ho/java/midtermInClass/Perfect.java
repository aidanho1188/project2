package edu.ho.java.midtermInClass;
/**
 * 
 * @author Aidan
 * 6 = 1+2+3
 * 12!= 1+2+3+4
 */
public class Perfect {

	public static void main(String[] args){

	    // repeat 1000 times
	    for (int x = 1; x <= 1000; x++) { 
	    	// set sum
	        int sum = 0;
	        for (int z = 1; z < x; z++) {
	            if ((x % z) == 0) {
	                sum = sum + z;
	            } 
	        }  
	        if (sum == x){       
	        	// print out the sum if sum = x
	            System.out.println(sum);
	        }          
	    }      
	}
}
