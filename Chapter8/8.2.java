//
//  8.2.java
//  Chapter8
//
//  Created by Apollo Zhu on 8/10/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

   /**
   * Calculates the result of multiplying all elements in `a`
   * reduce(1) {$0 * $1}
   */
   public static int banana(int[] a){
     // Storing result of calculation
      int kiwi = 1;
      // Storing index to travserse `a`
      int i = 0;
      while (i < a.length){
         kiwi = kiwi * a[i];
         i++;
      }
      return kiwi;
   }
   
   /**
   * Finds the index of first `grape` in `a`
   * indexOf(`grape`)
   * @return Index of `grape`; -1 if not found
   */
   public static int grapefruit(int[]a, int grape){
      for (int i=0;i<a.length;i++){
         if (a[i] == grape){
            return i;
         }
      }
      return -1;
   }
   
   /**
   * Counts the total appearance of `apple` in `a`
   * (a.filter {$0 == apple}).count
   */
   public static int pineapple(int[] a, int apple){
      // Storing total number of `apple`
      int pear = 0;
      for (int pine: a){
         if (pine == apple){
            pear++
         }
      }
      return pear;
   }