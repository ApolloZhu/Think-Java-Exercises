//
//  5.5.java
//  Chapter5
//
//  Created by Apollo Zhu on 7/26/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

   public static void lyricsFor(int bearNumber){
      if (bearNumber > 0){
         System.out.println(bearNumber + " bottles of beer on the wall,");
         System.out.println(bearNumber + " bottles of beer,");
         System.out.println("ya' take one down, ya' pass it around,");
         System.out.println(bearNumber-- + "bottles of beer on the wall.");
         lyricsFor(bearNumber);
      } 
      else {
         System.out.println("No bottles of beer on the wall,");
         System.out.println("no bottles of beer,");
         System.out.println("ya' can't take one down, ya' can't pass it around,");
         System.out.println("'cause there are no more bottles of beer on the wall!");
      }
   }