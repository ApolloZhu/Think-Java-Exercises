//
//  Temperature.java
//  Chapter3
//
//  Created by Apollo Zhu on 7/21/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

import java.util.Scanner;

public class Temperature{
   public static void main(String args[]){
      Scanner console = new Scanner(System.in);
      System.out.print("Input temperatur in Celsius: ");
      double temperature = console.nextDouble();
      double temperatureInF = temperature * 9 / 5 + 32;
      System.out.printf("%.1f C = %.1f F", temperature, temperatureInF);
   }
}