//
//  7.2.java
//  Chapter7
//
//  Created by Apollo Zhu on 7/29/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

   public static double squareRoot(double a){
      double oldValue = a/2;
      double newValue = a/2;
      double interval = 0;
      do{
         oldValue = newValue;
         newValue = (oldValue + a/oldValue)/2;
         interval = Math.abs(newValue - oldValue);
         System.out.println(interval);
      }while(interval > 0.001);
      return newValue;
   }