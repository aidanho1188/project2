package edu.ho.java.tools;

import java.io.File;
import java.util.Scanner;

/**
 * 
 * @author Aidan
 *	read file using scanner
 */
public class ReadFile {
	
	public static void main(String[] args) throws Exception {
		// enter the file path here
		File f = new File("file");
		Scanner input = new Scanner(f);
		method(input);
	}

	private static void method(Scanner input) {
		// TODO Auto-generated method stub
		
	}

}
