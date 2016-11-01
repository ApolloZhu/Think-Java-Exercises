//
//  7.5.java
//  Chapter7
//
//  Created by Apollo Zhu on 7/29/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

   for (double i=0.1; i<=100; i*=10){
      check(i); // 1+14 -> 1+15 -> 5+1 -> ?
   }
   // for (double i=-0.1; i>=-100; i*=10){
      // check(i); // 1+15 -> 1+15 -> ? -> ?
   // }
   
   public static double myexp(double x, int n){
      double result = 1;
      double p = 1;
      double q = 1;
      for (int i=1;i<n;i++){
         result += (p*=x)/(q*=i);
      } 
      return result;
   }

   public static void check(double x){
      int i = 28;
      // double interval = 0;
      // do{
         // i++;
         // interval = Math.abs(myexp(x,i) - Math.exp(x));
         // System.out.println(i+"\t"+interval);
      // }
      // while (interval > 0.0000000000000001);
      System.out.println(x+"\t"+myexp(x, i)+"\t"+Math.exp(x));
   }