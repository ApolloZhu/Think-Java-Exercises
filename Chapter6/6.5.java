//
//  6.5.java
//  Chapter6
//
//  Created by Apollo Zhu on 7/28/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

public static void main(String[] args) {
   boolean flag1 = isHoopy(202);
//true
   boolean flag2 = isFrabjuous(202);
//true
   System.out.println(flag1);
//true\n
   System.out.println(flag2); //true\n
   if (flag1 && flag2) {
      System.out.println("ping!"); //ping!\n
   }
   if (flag1 || flag2) {
  
      System.out.println("pong!"); //pong!\n
   }
}
public static boolean isHoopy(int x) {
// AZMark: Int.isEven
   boolean hoopyFlag;
   if (x % 2 == 0) {
      hoopyFlag = true;
   } else {
      hoopyFlag = false;
   }
   return hoopyFlag;
}
public static boolean isFrabjuous(int x) {
// AZMark: Int.isPositive
   boolean frabjuousFlag;
   if (x > 0) {
      frabjuousFlag = true;
   } else {
      frabjuousFlag = false;
   }
   return frabjuousFlag;
}

/*
   true\ntrue\nping!\npong!\n
*/