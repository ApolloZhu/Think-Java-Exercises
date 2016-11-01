//
//  Date.java
//  Chapter11
//
//  Created by Apollo Zhu on 8/13/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

public class Date{
   public static void main(String args[]){
      Date birthday = new Date();
      System.out.println(birthday.year+" "+birthday.month+" "+birthday.day);
   }
   public int year;
   public int month;
   public int day;
   public Date(int year, int month, int day){
      this.year = year;
      this.month = month;
      this.day = day;
   }
   public Date(){
      this(2001,4,17);
   }
}