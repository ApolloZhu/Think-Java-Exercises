//
//  8.7.java
//  Chapter8
//
//  Created by Apollo Zhu on 8/11/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

   public static boolean isPrime(int n){
      if (n < 2){
         return false;
      } 
      else if (n > 2){
         if (n % 2 == 0){
            return false;
         }
         for (int i = 3;i<=(int)Math.sqrt(n);i+=2){
            if (n % i !=0){
               return false;
            }
         }
      
      }
      return true;
   }
   
   public static boolean arePrimeFactors(int n, int[] arr){
      int result = 1;
      for (int element:arr){
         if (isPrime(element)){
            result *= element;
         } 
         else {
            return false;
         }
      }
      if (result == n){
         return true;
      } 
      else {
         return false;
      }
   }