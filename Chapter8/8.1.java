//
//  8.1.java
//  Chapter8
//
//  Created by Apollo Zhu on 8/10/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

   public static double[] powArray(double[] array, double power){
      double[] accumulator = new double[array.length];
      for (int i=0;i<array.length;i++){
         accumulator[i] = Math.pow(array[i],power);
      }
      return accumulator;
   }
   
   public static int[] histogram(int[] array, int count){
      int[] counter = new int[count];
      for (int element:array){
         counter[element]++;
      }
      return counter;
   }