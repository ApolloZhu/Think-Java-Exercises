//
//  Multadd.java
//  Chapter6
//
//  Created by Apollo Zhu on 7/28/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

public class Multadd{
   public static void main(String args[]){
      System.out.println(multadd(2.0,3.0,4.0));
      System.out.println(multadd(0.5,Math.cos(Math.PI/4),Math.sin(Math.PI/4)));
      System.out.println(Math.log(10)+multadd(2,Math.log(2),Math.log(5)));
   }
   public static double multadd(double a, double b, double c){
      return a*b+c;
   }
   public static double expSum(double x){
      return (multadd(x,Math.exp(-x),Math.sqrt(1-Math.exp(-x))));
   }
}