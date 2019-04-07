package edu.ho.java.wk9.hwChapter10Part2;

import java.util.ArrayList;

/**
 * 
 * @author Aidan
 *
 */
public class Ex13 {
	
	public void reverse3(ArrayList<Integer> list) {
		// [3, 8, 19, 42, 7, 26, 19, -8]
		for(int i = 0; i < list.size() - 2; i += 3)
		{
			//swap index 1 and index 3
			Integer temp1 = list.get(i);
			Integer temp2 = list.get(i + 2);
			// set list
			list.set(i, temp2); // index[0] = 19
			list.set(i + 2, temp1); // index [2] = 3
		}
		
	}
}
