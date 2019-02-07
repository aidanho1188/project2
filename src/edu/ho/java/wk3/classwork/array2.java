package edu.ho.java.wk3.classwork;

import java.text.NumberFormat;

public class array2 {
	
	public static void main(String[] args) {
//		for(type idenitfier : array);
//		Statement.args;
		
		
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		for (String day : days) {
//			System.out.println(day);
		}
		
		sales();
	}
	
	public static void sales() {
		double sales [] []; // 2 dimension array
		sales = new double [5] [4]; // 5 year, 4 direction/place     every year will have 4 places
		
		double [] [] sales2 = new double [5] [4]; // create in 1 line
		sales2[0][0] = 23897.6;
		sales2[0][1] = 23123.1;
		sales2[0][2] = 12312;
		sales2[0][3] = 318972; // this is the max size
		
		
		NumberFormat cd = NumberFormat.getCurrencyInstance();
		System.out.println("\tNorth\t\tSouth\t\tEast\t\tWest");
		int year =2004;
		for( int y = 0; y <5; y++) {
			System.out.print(year + "\t");;
			for (int region = 0; region < 4; region++) {
				System.out.print(cd.format(sales2[y][region]));
				System.out.print("\t");
			}
			year++;
			System.out.println();
		}
	}
	
	public void arrays() {
//		String[] teams = {{"a","b","c","d"},{"h","g","f"}};
		
		
	}
	
}
