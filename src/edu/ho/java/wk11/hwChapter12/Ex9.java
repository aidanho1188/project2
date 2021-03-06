package edu.ho.java.wk11.hwChapter12;

public class Ex9 {

	public double sumTo(int n) {
	    if(n < 0) {
	        throw new IllegalArgumentException();
	    }
	    if(n == 0) {
	        return 0.0;
	    }
	    return sumTo(n-1) + 1.0 / n;
	}
}
