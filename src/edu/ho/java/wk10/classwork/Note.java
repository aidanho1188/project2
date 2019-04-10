package edu.ho.java.wk10.classwork;

import java.util.*;
// Arraylist implement List

public class Note {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		List<String> list2 = new ArrayList<String>(list);

		for (int i = 0; i < 5; i++) {
			list.add(i, "item" + (i + 1));
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (String str : list) {
			System.out.println("");
		}
		// search using String type
		System.out.println(list.indexOf(("item3")));
		
		int x;
		// Student students();
		// List list<int> list1 = new ArrayList<int>();  is invalid
		
		Integer intObj3 = new Integer(3);
		Integer intObj4 = new Integer(4);
		
		
		x = intObj3.intValue();
		System.out.println(intObj3.equals(intObj4));
		System.out.println(intObj3.compareTo(intObj4));
		
		// Interator<String> iteratorObject = list1.iterator();
	}

}
