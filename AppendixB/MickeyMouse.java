//
//  MickeyMouse.java
//  AppendixB
//
//  Created by Apollo Zhu on 8/14/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

import java.awt.*;
import javax.swing.*;

public class MickeyMouse extends Canvas{
   public static void main(String[] args){
      JFrame frame = new JFrame("Window Title");
      Canvas canvas = new MickeyMouse();
      canvas.setSize(400, 400);
      frame.add(canvas);
      frame.pack();
      frame.setVisible(true);
   }
   public void paint(Graphics g){
      // Drawing codes
      Color ty = new Color(102,204,255);
      g.setColor(ty);
      Rectangle r = new Rectangle(152,304,96,96);
      mickey(g, r);
   }
   public void boxOval(Graphics g, Rectangle bb) {
      g.fillOval(bb.x, bb.y, bb.width, bb.height);
   }
   public void mickey(Graphics g, Rectangle bb) {
      boxOval(g, bb);
      int dx = bb.width / 2;
      int dy = bb.height / 2;
      boolean needsSubEar = dx >= 3; 
      Rectangle half = new Rectangle(bb.x, bb.y, dx, dy);
      half.translate(-dx / 2, -dy / 2);
      boxOval(g, half);
      if (needsSubEar){
         mickey(g,half);
      }
      half.translate(dx * 2, 0);
      boxOval(g, half);
      if (needsSubEar){
         mickey(g,half);
      }
   }
}