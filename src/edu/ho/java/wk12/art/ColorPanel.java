package edu.ho.java.wk12.art;

// Panel to draw Mondrian-like paintings
// Fills areas with random colors

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ColorPanel extends JPanel{
	
   private int level;
   private Random gen;

   public ColorPanel(Color backColor){
      setBackground(backColor);
      setPreferredSize(new Dimension(300, 200));
      level = 0;
      gen = new Random();
   }
	
   public void setLevel(int newLevel){
      level = newLevel;
      repaint();
   }

   public void paintComponent (Graphics g){
      super.paintComponent(g);
      mondrian(g, 0, 0, getWidth(), getHeight(), level);
   }

   private void mondrian(Graphics g, int x1, int y1, int x2, int y2, int level){
      if (level > 0){
         g.setColor(randomColor());
         g.fillRect(x1, y1, x2 - x1, y2 - y1);
         int vertical = gen.nextInt(2);              // Decide whether to split
                                                     // vertically or horizontally.

         int biggerSide = gen.nextInt(2);               // Decide which side
                                                        // to make larger.
         if (vertical == 0)
            if (biggerSide == 0){
               // Split vertically with bigger side on right
               mondrian(g, x1, y1, (x2 - x1) / 3 + x1, y2, level - 1);
               mondrian(g, (x2 - x1) / 3 + x1, y1, x2, y2, level - 1);
            }else{
               // Split vertically with bigger side on left
               mondrian(g, x1, y1, (x2 - x1) * 2 / 3 + x1, y2, level - 1);
               mondrian(g, (x2 - x1) * 2 / 3 + x1, y1, x2, y2, level - 1);
            }
         else if (biggerSide == 0){
            // Split horizontally with bigger side on bottom
            mondrian(g, x1, y1, x2, (y2 - y1) / 3 + y1, level - 1);
            mondrian(g, x1, (y2 - y1) / 3 + y1, x2, y2, level - 1);
         }else{
            // Split horizontally with bigger side on top
            mondrian(g, x1, y1, x2, (y2 - y1) * 2 / 3 + y1, level - 1);
            mondrian(g, x1, (y2 - y1) * 2 / 3 + y1, x2, y2, level - 1);
         }
      }
   }

   private Color randomColor(){
      int red = gen.nextInt(256);
      int blue = gen.nextInt(256);
      int green = gen.nextInt(256);
      return new Color (red, blue, green);
   }
}	