//
//  7.4.java
//  Chapter7
//
//  Created by Apollo Zhu on 7/29/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

   public static int factorial(int n){
      int result = 1;
      for (int i=1;i<=n;i++){
         result *=i;
      }
      return result;
   }