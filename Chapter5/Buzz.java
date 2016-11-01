//
//  5.6.java
//  ProjectName
//
//  Created by Apollo Zhu on m/dd/yy.
//  Copyright © 2015-yyyy WWITDC. All rights reserved.
//

public class Buzz {
   public static void baffle(String blimp) {//8
      System.out.println(blimp);//9
      zippo("ping", -5); //10
   }
   public static void zippo(String quince, int flag) { //3, 11
      if (flag < 0) {//4, 12
         System.out.println(quince + " zoop");//13
      } 
      else {//5
         System.out.println("ik");//6
         baffle(quince); //7
         System.out.println("boo-wa-ha-ha");//14
      }
   }
   public static void main(String[] args) { //1
      zippo("rattle", 13); //2
   }
}

/*
   3. "rattle"
   4. "ik\nrattle\nping zoop\nboo-wa-ha-ha\n"
*/