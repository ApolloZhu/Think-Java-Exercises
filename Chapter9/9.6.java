//
//  9.6.java
//  Chapter9
//
//  Created by Apollo Zhu on 8/11/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

   // 9.2
   public static int[] letterHist(String str){
      char[] characters = str.toUpperCase().toCharArray();
      int[] result = new int[27];
      for (char letter:characters){
         if (letter >= 65 && letter <= 90){
            result[letter-65]+=1;
         } 
         else if (letter != 32){
            result[27]+=1;
         }
      }
      return result;
   }

   public static boolean isDoubloon(String str){
      if (str.length() == 0) {
         return false;}
      for (int count:letterHist(str)){
         if (count != 0 && count != 2){
            return false;
         }
      }
      return true;
   }