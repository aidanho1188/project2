package edu.ho.java.wk2.hw;

/**
 * 
 * @author Aidan
 * Exercise 1
 *
 */
public class showTwos {

	public static void showTwos(int num) {
		//if num = 18 then val = 18
		int val = num;
		int count = 0;

		// 18 % 2 = 0
		while (val % 2 == 0) {
			// count++, count = 1
			count++;
			// 9 = 18 / 2
			val = val / 2;
		}
		//18 = 
		System.out.print(num + " = ");

		// repeat 1 times
		for (int i = 0; i < count; i++) {
			System.out.print("2 * ");
		}
		System.out.println(val);
	}

	// test
	public static void main(String[] args) {
		showTwos(7);
		showTwos(18);
		showTwos(68);
		showTwos(120);

	}
}
