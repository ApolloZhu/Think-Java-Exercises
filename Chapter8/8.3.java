//
//  8.3.java
//  Cahpter8
//
//  Created by Apollo Zhu on 8/11/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

   int[] bob = make(5);
   dub(bob);
   mus(bob)
   
   public static int[] make(int n){
      int[] a = new int[n];
      for (int i = 0;i<n;i++){
         a[i] = i + 1;
      }
      return a;
   }
   public static void dub(int[] jub){
      for (int i=0; i < jub.length; i++){
         jub[i] *= 2;
      }
   }
   /**
   * Calculates the summary of adding all elements in `zoo`
   * reduce(0) {$0 + $1} 
   */
   public static int mus(int[] zoo){
      int fus = 0;
      for (int i=0;i<zoo.length;i++){
         fus += zoo[i];
      }
      return fus;
   }
   
   /*
   bob [] -> make |n [5] a[]| -> [1|2|3|4|5]
   bob [] -> dub |jub [bob[]]| -> [2|4|6|8|10]
   mus |zoo [bob[]] fus [30]|
   
   output: 30
   */