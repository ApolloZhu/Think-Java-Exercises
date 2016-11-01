//
//  Time.java
//  ThinkJava-Chapter2
//
//  Created by Apollo Zhu on 7/20/16.
//  Copyright © 2015-2016 WWITDC WWITDC. All rights reserved.
//

public class Time{
   public static void main(String args[]){
   
      int timeOfDayInSeconds = 24 * 60 * 60;
   
      int hour = 18, minute = 58, second = 10;
      int timeSinceMidnightInSeconds = hour * 3600 + minute * 60 + second;
   
      int timeLeftInSeconds = timeOfDayInSeconds - timeSinceMidnightInSeconds;
   
      int startHour = 18, startMinute = 45, startSecond = 36;
      int startTimeSinceMidnightInSeconds = startHour * 3600 + startMinute * 60 + startSecond; //in seconds
   
      int timeInterval = timeSinceMidnightInSeconds - startTimeSinceMidnightInSeconds;
   
      System.out.println("Time since midnight: " + timeSinceMidnightInSeconds + " seconds");
      System.out.println("Time remaining today: " + timeLeftInSeconds + " seconds"); 
      System.out.println("Percentage of day passed: " + (double)timeSinceMidnightInSeconds / (double)(24 * 60 *60) +"%");
      System.out.println("Elapsed time: " + timeInterval + " seconds");
      
   }
}