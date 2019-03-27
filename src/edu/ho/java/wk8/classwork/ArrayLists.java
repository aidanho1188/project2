package edu.ho.java.wk8.classwork;

import java.util.*;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Zach");
		display(names);
		names.add("Ryan ");
		display(names);
		names.add("name");
		display(names);
		names.remove("name");
		display(names);
	}

	private static void display(ArrayList<String> names) {
		for(int i = 0; i< names.size(); i++) {
			System.out.println(names.get(i));
		}
		
	}

}
