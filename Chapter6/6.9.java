//
//  6.9.java
//  Chapter6
//
//  Created by Apollo Zhu on 7/28/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//
   
   /**
      A recursive method to evaluate power
      @param x base
      @param n power which is a positive integer 
      @return 233 if illegal, otherwise x^n
   */
   public static double power(double x, int n){
      if (x == 0){
         if (n == 0){
            return 233.3;
         } 
         else {
            return 0;
         }
      }
      else {
         if (n == 1){
            return x;
         } 
         else if (n == 2){
            return x*x;
         } 
         else {
            if (n % 2 == 0){
               return power(power(x,n/2),2);
            } 
            else {
               return x*power(x,n-1);
            }
         }
      }
   }
