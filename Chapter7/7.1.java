//
//  7.1.java
//  Chapter7
//
//  Created by Apollo Zhu on 7/29/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

loop(10);
public static void loop(int n){
   int i = n;
   while (i > 1){
      System.out.println(i);
      if (i % 2 == 0){
         i = i/2;
      } else {
         i = i + 1;
      }
   }
}

/*
   1. n: constantly 10
      i: 10 -> 5 -> 6 -> 3 -> 4 -> 2 -> 1
   2. "10\n5\n6\n3\n4\n2\n"
   3. ...
*/