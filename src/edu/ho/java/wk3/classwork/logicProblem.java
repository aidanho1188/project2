package edu.ho.java.wk3.classwork;

public class logicProblem {

	public static void loop() {

		// true = open; false = closed
		boolean[] lockers = new boolean[1000];
		int count = 0;

		// close all the lockers
		for (int i = 0; i < lockers.length; i++) {
			lockers[i] = false;
			for (int skip = 0; i < lockers.length; skip ++) {
				System.out.println("bobo is chaning every " + skip + "lockers.");
				for (int locker = skip; locker < 1000; locker += skip) {
					lockers[locker] = !lockers[locker];
				}
			}
		}
		// count and list the open lockers
		System.out.println(count);
		
		// close every 2 locker
		for (int i = 0; i < lockers.length; i+= 2) {
			lockers[i] = false;
		}
		
		// count and list the open lockers
		System.out.println(count);
		}

	public static void main(String[] args) {

		loop();
	}
}
