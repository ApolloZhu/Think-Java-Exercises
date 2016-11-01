//
//  5.4.java
//  Chapter5
//
//  Created by Apollo Zhu on 7/26/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

public static void checkFermat(int a, int b, int c, int n){
   if ((n > 2) && (Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n))){
      System.out.println("Holy smokes, Fermat was wrong!");
   } else {
      System.out.println("No, that doesn’t work.");
   }
}