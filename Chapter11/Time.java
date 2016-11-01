//
//  Time.java
//  Chapter11
//
//  Created by Apollo Zhu on 8/13/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

public class Time{

   public static void main(String[] args){
      Time time = new Time();
      time.increment(3600*8+6*60+5);
      System.out.println(time);
   }

   public int hour;
   public int minute;
   public double second;
   public Time(int hour, int minute, double second){
      this.hour = hour;
      this.minute = minute;
      this.second = second;
   }
   public Time(){
      this(0,0,0);
   }
   public String toString(){
      return this.hour+":"+this.minute+":"+this.second;
   }
   public void increment(double seconds) {
      this.second += seconds;
      this.minute += this.second / 60;
      this.second %= 60;
      this.hour += this.minute / 60;
      this.minute %= 60;
   }
}