package edu.ho.java.wk6.hwChapter9;
/**
 * 
 * @author Aidan
 * Exercise 12
 */
public class TimeSpan {
	public int hours;
	public int min;
	
	public void equal(int hour, int min) {
		if ((this.hours==hours)&&(this.min==min)) {
			System.out.print("Two time span are equal");
		}
		else {
			return;
		}
	}

}
