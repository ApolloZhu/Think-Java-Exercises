//
//  6.2.java
//  Chapter6
//
//  Created by Apollo Zhu on 7/28/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

   /**
      A method to test if the first argument is divisible by the second argument
      @param n the integer to be divided
      @param m the integer to divide
      @ return true if m is not `0` and n is divisible by m 
   */
   public static boolean isDivisible(int n, int m){
      return (m != 0 && n % m == 0);
   }