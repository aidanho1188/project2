package edu.ho.java.wk12.classwork;

import javax.swing.*;

public class ConvertWithGUI {

	public static void main(String[] args) {
		GUIWindow theGUI = new GUIWindow();
		theGUI.setTitle("F to C converter");
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theGUI.pack();
		theGUI.setVisible(true);
	}
}
