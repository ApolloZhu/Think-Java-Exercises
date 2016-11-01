//
//  9.7.java
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

   public static boolean isAnagram(String str1, String str2){
      int[] result1 = letterHist(str1);
      int[] result2 = letterHist(str2);
      if (result1[26] != 0 || result2[26] != 0) {
         return false;}
      for (int i=0;i<26;i++){
         if (result1[i] != result2[i]){
            return false;
         }
      }
      return true;
   }