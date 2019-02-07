package edu.ho.java.wk3.classwork;

public class array {
	
	public static void main() {
	int[] array1 = {1,2,3,4,5}; // do this
	int array2[];
	
	String[] names = new String[10]; // 10 index in the array
	
//-----------------------------------------------------------
	
	System.out.print("how many players? ");
	
//	int count = sc.nextInt(); // scanner
//	String[] player = new String[count];
	
	
// initialize
	String[] days = new String[7];
	days[0] = "Sunday";
	days[1] = "Monday";
	
// other ways to initialize
	String[] daysEx = {"sunday","monday"};
	
// loop with array
	int[] numbers = new int[100];
	
	for(int i= 0; i < 100; i++) {
		numbers[i] = (int) ((Math.random()*100) +1);
	}
	
	
	}
	

}
