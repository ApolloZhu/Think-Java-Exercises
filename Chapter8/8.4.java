//
//  8.4.java
//  Chapter8
//
//  Created by Apollo Zhu on 8/11/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

   public static int indexOfMax(int[] numbers){
      int index = 0;
      for (int i=1;i<numbers.length;i++){
         if (numbers[i] > numbers[index]){
            index = i;
         }
      }
      return index;
   }

   public static int indexOfMaxWrittenInEnhancedForLoop(int[] numbers){
      int index = 0;
      int i = 0;
      for (int number:numbers){
         if (numbers[i] > numbers[index]){
            index = i;
         }
         i++;
      }
      return index;
   }