package edu.ho.java.wk4.hw;

/**
 * 
 * @author Aidan Exercise 7-9
 */
public class TimeSpan {

	private int hours;
	private int minutes;

	// Exercise 7, add time
	public void add(TimeSpan span) {
		hours = this.hours + span.hours;
		minutes = this.minutes + span.minutes;
	}

	// Exercise 8 , subtract time
	public void subtract(TimeSpan span) {
		hours = this.hours - span.hours;
		minutes = this.minutes - span.minutes;
	}

	// Exercise 9 , scale, this.hours=1, factor = 3
	public void scale(int factor) {
		// turn hours into minutes, add minutes, then multiply "factor" given
		double total = ((this.hours * 60) + 45) * factor;
		hours = (int) (total / 60);
		minutes = (int) (((total / 60) - hours) * 60); // (210/60)=3.5-3=.5*60=30 minutes
	}

}
