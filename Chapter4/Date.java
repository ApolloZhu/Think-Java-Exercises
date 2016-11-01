//
//  Date.java
//  ThinkJava-Chapter2
//
//  Created by Apollo Zhu on 7/23/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

public class Date{

   public static void printAmerican(String day, int date, String month, int year){
      System.out.println(day + ", " + month + " " + date + ", " + year);
   }
   
   public static void printEuropean(String day, int date, String month, int year){
      System.out.println(day + " " + date + " " + month + " " + year);
   }
   
   public static void main(String args[]){
   
      String day = "Saturday", month = "July";
      int date = 23, year = 2016;
      System.out.println("American format:");
      printAmerican(day, date, month, year);
      System.out.println("European format:");
      printEuropean(day, date, month, year);
   }
   
}