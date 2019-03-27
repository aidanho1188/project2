package edu.ho.java.wk7.hw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Aidan
 * Exercise 9
 */
public class Exercise9 {

	   public static void stripHtmlTags(Scanner input)
	   {
		   // set variables
	      String line = "";
	      String word = "";
	      
	      while(input.hasNext())
	      {
	    	  
	         line = input.nextLine();
	         // replaces
	         word = line.replaceAll("\\<.*?>","");
	         System.out.println(word);
	      }
	   }
	
	public static void main(String[] args) throws FileNotFoundException {
		// Enter file path here
		File f = new File("C:\\Users\\aaron\\eclipse-workspace\\CIS\\src\\edu\\ho\\java\\wk7\\hw\\stripHtmlTags");
		Scanner input = new Scanner(f);
		// call method
		stripHtmlTags(input);
	}
}
