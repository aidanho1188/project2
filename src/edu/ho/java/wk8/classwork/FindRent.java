package edu.ho.java.wk8.classwork;

import javax.swing.JOptionPane;

public class FindRent {

	public static void main(String[] args) {
		int[][] rents = {{400,450,510},{500,560,630},{332,123,543},{342,553,765}};
		
		String entry;
		int floor;
		int bedroom;
		entry = JOptionPane.showInputDialog(null, "Enter a floor number ");
		floor = Integer.parseInt(entry);
		entry = JOptionPane.showInputDialog(null, "Enter number of bedroom");
		bedroom = Integer.parseInt(entry);
		JOptionPane.showInputDialog(null, "The rent for a" + bedroom+"bedroom appartment on floor "+ floor+ " is it"+ rents[floor][bedroom]);
	}
}
