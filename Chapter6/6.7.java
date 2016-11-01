//
//  6.7.java
//  Chapter6
//
//  Created by Apollo Zhu on 7/28/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

   /**
      @param n positive odd integer
      @return sum of odd integers form 1 to n
      @error StackoverflowError if n is not a positive odd integer
   */
   public static int oddSum(int n){
      return ((n==1)?(1):(n*oddSum(n-2)));
   }