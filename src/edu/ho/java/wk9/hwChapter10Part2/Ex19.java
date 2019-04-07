package edu.ho.java.wk9.hwChapter10Part2;

/**
 * 
 * @author Aidan
 *
 */
public class Ex19 implements Comparable<TimeSpan>{
	public int compareTo(TimeSpan other) {
		int hours = 0;
		int minutes = 0;
		double length = (hours*60)+minutes;
		if (length < other.length) {
			System.out.print(length +" is less than" +other.length);
			return (int)length;//case
		}
		else {
			System.out.print(other.length +" is less than" +length);
			return (int)other.length;//case
		}
	}

}
