//
//  Test.java /*9.1*/
//  Chapter9
//
//  Created by Apollo Zhu on 8/11/16.
//  Copyright © 2015-yyyy WWITDC. All rights reserved.
//

public class Test{
   public static void main(String args[]){
      /*
         System.out.println("1"+"2");
         
      // Unavoidable: ()
      // arbitrary: []
      // Problematic: {}
               bool  char  int   double   str
      bool     {0}   (0)   [0]   (0)      (cat)  
      char     (0)   {add  add   add}     (cat)
      int      [0]   {add} (add  add      cat)
      double   (0)   {add} (add  add      cat)
      str      (cat   cat   cat   cat     cat)
      */
      
      /*
      char x = 127;
      x=x+1;
      throw -> possible lossy conversion from int to char
      x -> 65 -> 66 -> Character(66) // might exceed ASCII
      */
      
      /*
      boolean temp = "" + true;
      make the other type a String
      */
      
      // boolean<<bool
      // char<<char, int
      // int<<char, int
      // double<<char, int, double
      // String<<String
   }
}


