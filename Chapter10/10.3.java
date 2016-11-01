//
//  10.3.java
//  Chapter10
//
//  Created by Apollo Zhu on 8/12/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

   Rectangle box1 = new Rectangle(2,4,7,9);
   Point p1 = findCenter(box1);
   printPoint(p1);
   box1.grow(1, 1);
   Point p2 = findCenter(box1);
   printPoint(p2);
      
   /*
   p2.x += 1;
   printPoint(p1);
   printPoint(p2);
   */

   public static void printPoint(Point p){
      System.out.println("("+p.x+", "+p.y+")");
   }

   public static Point findCenter(Rectangle box){
      int x = box.x + box.width / 2;
      int y = box.y + box.height / 2;
      return new Point(x,y);
   }

   /*
   1.   box1[] -> Rectangle[x[2] y[4] w[7] h[9]]
        p1[] -> findCenter[box[]->box1 x[5] y[8]] -> Point[x[5] y[8]]
        box1[] -> Rectangle[x[0] y[2] w[9] h[11]]
        p2[] -> findCenter[box[]->box1 x[5] y[8]] -> Point[x[5] y[8]]
   2. output (5, 8)\n(5, 8)\n
   3. Not. `new` creates a new object
   */