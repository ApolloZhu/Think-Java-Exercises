//
//  7.3.java
//  Chapter7
//
//  Created by Apollo Zhu on 7/29/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

   public static double power(double x, int n){
      double result = 1;
      for (int i=0;i<n;i++){
         result *= x;
      }
      return result;
   }