//
//  6.6.java
//  Chapter6
//
//  Created by Apollo Zhu on 7/28/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

prod(1,4);

/**
   returns so-called interval factorial value
   @param m an interger
   @param n an integer not less than  m
   @error StackOverflowError if m > n
   @return m*(m+1)*...*n
*/
public static int prod(int m, int n) {
   /*if (m == n) {
      return n;
   } else {
      int recurse = prod(m, n - 1);
      int result = n * recurse;
      return result;
   }*/
   return ((m==n)?(n):(n*prod(m, n - 1)));
}

/*
   1. main||
      prod|m[1] n[4] recurse[6] result[24]| -> 24
      prod|m[1] n[3] recurse[2] result[6]|
      prod|m[1] n[2] recurse[1] result[2]|
      prod|m[1] n[1]| -> 1
*/
