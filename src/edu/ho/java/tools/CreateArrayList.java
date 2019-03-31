package edu.ho.java.tools;
import java.util.*;
import java.util.ArrayList;
public class CreateArrayList{

//	ArrayList al = new ArrayList();// creating old non-generic arraylist

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Zach");
		names.add("Ryan ");
		names.add("name");
		names.remove("name");
	}
}
