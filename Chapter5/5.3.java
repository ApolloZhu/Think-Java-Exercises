//
//  5.3.java
//  Chapter5
//
//  Created by Apollo Zhu on 7/26/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

public static void nLines(int n) {
   if (n > 0) {
      System.out.println();
      nLines(n - 1);
   }
}

/*
main   |   |
nLines |[4]|
nLines |[3]|
nLines |[2]|
nLines |[1]|
nLines |[0]|
*/