//
//  6.8.java
//  Chapter6
//
//  Created by Apollo Zhu on 7/28/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

   /**
      Evaluate Ackermann function with two non-negative integers
      @return the value of the Ackermann function, or 233 if illegal paramter#
      @error StackOverflow if m is larger than 3
   */
   public static int ack(int m, int n){
      if (m==0){
         return n+1;
      } 
      else if (m > 0 && n == 0) {
         return ack(m-1,1);
      } 
      else if (m > 0 && n > 0){
         return ack(m-1,ack(m,n-1));
      } 
      else {
         return 233;
      }
      
   }