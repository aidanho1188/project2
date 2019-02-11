package edu.ho.java.wk3.hw;

/**
 * 
 * @author Aidan 
 * Exercise 9
 * 1, 3, 6, 7, 12
 * 
 * 3-1 = 2
 * 6-3 = 3
 * 7-6 = 1
 * 12-7 = 5
 */
public class minGap {

	public static int minGap(int[] a) {
		// check array/ return 0 if false
		if (a.length < 2) {
			return 0;
		}

		// min = 2
		int min = a[1] - a[0];

		// start at 1 so a[i(1) +1] - a[1] < min would be true
		for (int i = 1; i <= a.length - 2; i++) {
			if (a[i + 1] - a[i] < min) {
				min = a[i + 1] - a[i];
			}
		}
		// return 1
		return min;
	}

	public static void main(String[] args) {
		int[] array = { 1, 3, 6, 7, 12 };
		System.out.print(minGap(array));
	}
}
