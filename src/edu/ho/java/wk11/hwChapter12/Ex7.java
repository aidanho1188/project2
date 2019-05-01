package edu.ho.java.wk11.hwChapter12;

public class Ex7 {

	
	public void writeChars(int n) {
	    if(n < 1)
	        throw new IllegalArgumentException();
	        
	    if(n == 1) {
	        System.out.print("*");
	        return;
	    }
	    
	    if(n == 2) {
	        System.out.print("**");
	        return;
	    }
	    
	    System.out.print("<");
	    writeChars(n-2);
	    System.out.print(">");
	}
}
