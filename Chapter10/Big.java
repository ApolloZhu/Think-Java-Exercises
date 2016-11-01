//
//  Big.java
//  Chapter10
//
//  Created by Apollo Zhu on 8/12/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

import java.math.BigInteger;

public class Big{
   public static void main(String args[]){
      BigInteger integer = BigInteger.valueOf(2147483647);
      System.out.println(integer.add(BigInteger.ONE).pow(10));
      for (int i=0;i<30;i++){
         System.out.println(i+": "+factorial(i));
      }
   }
   public static BigInteger factorial(int number){
      BigInteger result = BigInteger.valueOf(1);
      for (int i = number;i>0;i--){
         result = result.multiply(BigInteger.valueOf(i));
      }
      return result; 
   }
   // Imutable; According to documentation...; No Value to change
}