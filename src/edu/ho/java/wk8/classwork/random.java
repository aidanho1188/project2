package edu.ho.java.wk8.classwork;

public class random {

	public static void main(String[] args) {
		int[] someNums = { 90, 85, 65, 95, 75 };
		int a = 1;

		while (a < someNums.length) {

			int temp = someNums[a];
			int b = a - 1;
			while (b >= 0 && someNums[b] > temp) {
				someNums[b + 1] = someNums[b];
				System.out.println(temp);
				b--;
			}

			someNums[b + 1] = temp;
			a++;
		}
	}

}
