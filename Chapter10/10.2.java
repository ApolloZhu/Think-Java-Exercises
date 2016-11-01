//
//  10.2.java
//  Chapter10
//
//  Created by Apollo Zhu on 8/12/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

   /*
   Point blank = new Point(5,8);
   Rectangle rect = new Rectangle(0,2,4,4);
   Point center = findCenter(rect);
   double dist = distance(center, blank);
   System.out.println(dist);
   */
   
   public static double distance(Point p1, Point p2){
      int dx = p2.x - p1.x;
      int dy = p2.y - p1.y;
      return Math.sqrt(dx*dx+dy*dy);
   }

   public static Point findCenter(Rectangle box){
      int x = box.x + box.width / 2;
      int y = box.y + box.height / 2;
      return new Point(x, y);
   }
   /*
   1.   main.blank[] -> Point[x[5] y[8]]
        main.rect[] -> Rect [x[0] y[2] w[4] h[4]]
        main.center[] -> findCenter[rect[]-^ x[1] y[3]] -> Point[x[1] y[3]]
        main.dist[distance[p1[]->center p2[]->blank dx[4] dy[3]]
   2. output: 5.0
   */