//
//  6.3.java
//  Chapter6
//
//  Created by Apollo Zhu on 7/28/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

   /**
      determine if given three interger is possible to be the three sides of a triangle
      @return true if can form a triangle
   */      
   public static boolean isTriangle(int s1, int s2, int s3){
      return (s1 > 0 && s2 > 0 && s3 > 0 && s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1);
   }