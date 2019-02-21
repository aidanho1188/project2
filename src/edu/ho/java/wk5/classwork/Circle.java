package edu.ho.java.wk5.classwork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Circle extends JPanel implements ActionListener {

	    double angle;
	    Timer timer;
	    Circle() {
	        super(null);
	        timer = new Timer(100, this);
	        timer.start();
	    }
       
       public void actionPerformed(ActionEvent e) {
	        angle += 0.1;
	        if(angle > (2* Math.PI))
	            angle = 0.0;
	        repaint();
	    }

       public void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        int width = getWidth();
	        int height = getHeight();
	        int x = (int) (Math.cos(angle) * (width / 3) + (width / 2));
	        int y = (int) (Math.sin(angle) * (height / 3) + (height / 2));
	        g.fillOval(x, y, 10, 10);
	    }

	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Circle");
	        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        frame.add(new Circle());
	        frame.setSize(500, 500);
	        frame.setVisible(true);
	    }
      }