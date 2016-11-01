//
//  10.5.java
//  Chapter10
//
//  Created by Apollo Zhu on 8/12/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

   public static BigInteger pow(int x, int n) {
      if (n == 0) 
         return BigInteger.valueOf(1);
      // find x to the n/2 recursively
      BigInteger t = pow(x, n/2);
      // if n is even, the result is t squared
      // if n is odd, the result is t squared times x
      if (n % 2 == 0) {
         return t.multiply(t);
      } 
      else {
         return t.multiply(t).multiply(BigInteger.valueOf(x));
      } 
   }