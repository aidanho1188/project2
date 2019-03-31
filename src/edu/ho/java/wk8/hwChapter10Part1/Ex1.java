package edu.ho.java.wk8.hwChapter10Part1;

import java.util.ArrayList;
/**
 * 
 * @author Aidan
 *
 */

public class Ex1 {

	public double averageVowels(ArrayList<String> input) {

		double totalVowels = 0;
		String vowels = "aeiouAEIOU";

		// test each word in the arrayList
		for (String word : input) {
			// test a word in the arrayList
			for (int i = 0; i < word.length(); i++) {
				// for each word, loop through vowels for a match
				for (int i2 = 0; i2 < vowels.length(); i2++) {
					if (word.charAt(i) == vowels.charAt(i2)) {
						totalVowels++;
					}
				}

			}
		}
		// return the average
		return totalVowels / input.size();

	}
}
