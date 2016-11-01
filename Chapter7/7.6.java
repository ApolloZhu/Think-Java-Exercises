//
//  7.6.java
//  Chapter7
//
//  Created by Apollo Zhu on 7/29/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

   public static double gauss(double x, int n){
      double result = 1;
      int q = 1;
      double p = 1;
      int pre = 1;
      for (int i=1;i<n;i++){
         result += (pre*=-1)*(p*=x*x)/(q*=i);
      }
      return result;
   }