//
//  Recurse.java
//  Chapter9
//
//  Created by Apollo Zhu on 8/11/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

public class Recurse{
   public static void main(String args[]){
      System.out.println(isPalindrome("otto"));
   }

   public static void printString(String str){
      if (length(str) != 0){
         System.out.println(first(str));
         printString(rest(str));
      }
   }

   public static void printBackward(String str){
      if (length(str) != 0){
         printBackward(rest(str));
         System.out.println(first(str));
      }
   }

   public static String reverseString(String str){
      if (length(str) != 0){
         return reverseString(rest(str)) + first(str);
      }
      return "";
   }

   public static boolean isPalindrome(String str){
      int length = length(str);
      if (length == 1){
         return true;
      } 
      else if (length == 2){
         return first(str) == first(rest(str));
      } 
      else {
         return first(str) == first(reverseString(rest(str))) && isPalindrome(middle(str));
      }
   }
   // MARK: Supporting

   /**
    * Returns the first character of the given String.
    */
   public static char first(String s){
      return s.charAt(0);
   }

   /**
    * Returns all but the first letter of the given String.
    */
   public static String rest(String s) {
      return s.substring(1);
   }

   /**
    * Returns all but the first and last letter of the String.
    */
   public static String middle(String s) {
      return s.substring(1, s.length() - 1);
   }

   /**
    * Returns the length of the given String.
    */
   public static int length(String s) {
      return s.length();
   }
}