//
//  8.8.java
//  Chapter8
//
//  Created by Apollo Zhu on 8/11/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

   public static int maxInRange(int[] integers, int lowIndex, int highIndex){
      if (lowIndex == highIndex){
         return integers[lowIndex];
      }
      int mid = (lowIndex + highIndex) / 2;
      return Math.max(maxInRange(integers,lowIndex,mid),maxInRange(integers,(mid + 1),highIndex));
   }

   public static int max(int[] integers){
      return maxInRange(integers, 0, integers.length - 1);
   }