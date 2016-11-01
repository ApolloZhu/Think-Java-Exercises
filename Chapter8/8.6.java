//
//  8.6.java
//  Chapter8
//
//  Created by Apollo Zhu on 8/11/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

   public static boolean areFactors(int n, int[] factors){
      for (int factor:factors){
         if (n % factor != 0)
            return false;
      }
      return true;
   }