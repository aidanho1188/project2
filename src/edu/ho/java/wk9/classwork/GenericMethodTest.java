package edu.ho.java.wk9.classwork;

public class GenericMethodTest {
	/*
	 * E - Element (used extensively by the Java Collections Framework)
K - Key
N - Number
T - Type
V - Value
S,U,V etc. - 2nd, 3rd, 4th types
	 */
	// generic method printArray
	public static <E> void printArray(E[] inputArray) {
		// display array elemtns
		for(E element: inputArray) {
			System.out.printf("%s", element);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//Create arrays pf Int double and char
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.2,3.3,4.4};
		Character[] charArray = {'H','E','L','L','O'};
		
		System.out.println("int");
		printArray(intArray);
		
		System.out.println("double");
		printArray(doubleArray);
		
		System.out.println("chars");
		printArray(charArray);
	}
}
