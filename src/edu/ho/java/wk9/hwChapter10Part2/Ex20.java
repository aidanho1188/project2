package edu.ho.java.wk9.hwChapter10Part2;
/**
 * 
 * @author Aidan
 *
 */
public class Ex20 implements Comparable<CalendarDate>{
	
	private int month;
	private int day;

	public int compareTo(CalendarDate other) {
		
        if (this.month != other.month) {
            return this.month - other.month;
        } else {
            return this.day - other.day;
        }
	}

}
