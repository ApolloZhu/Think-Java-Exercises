//
//  9.3.java
//  Chapter9
//
//  Created by Apollo Zhu on 8/11/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

   public static int diff(String str, char open, char close){
      int count = 0;
      for (int i = 0; i<str.length(); i++){
         char c = str.charAt(i);
         if (c == open){
            count++;
         } 
         else if (c == close){
            count--;
         }
      }
      return count;
   }

   public static int diffParenthesis(String str){
      return diff(str, '(',')');
   }