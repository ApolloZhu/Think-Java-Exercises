//
//  10.1.java
//  Chapter10
//
//  Created by Apollo Zhu on 8/12/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

   /*
   int x = 5;
   Point blank = new Point(1, 2);
   System.out.println(riddle(x, blank));
   System.out.println(x);
   System.out.println(blank.x);
   System.out.println(blank.y);
   */
   public static int riddle(int x, Point p){
      x = x+7;
      //p.x += 2;
      return x+p.x+p.y;
   }

   /*
   1.   main.x [5]
        main.blank[] -> Point[x[1] y[2]]
        riddle.x [5]            ^
        riddle [x[5] p[]--------|]
        riddle [x[12] p[]-------|]
   2. output: 15\n5\n1\n2\n
   3. mutable
   */