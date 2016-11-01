//
//  EightsCard.java
//  Chapter14
//
//  Created by Apollo Zhu on 8/20/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

public class EightsCard extends Card{

   public EightsCard(int rank, int suit) {
      super(rank, suit);
   }
    
   /**
    * Returns `true` if matches `that` with rule of crazy eights
    * Otherwise `false`
   */
   public boolean matches(EightsCard that){
      if (getSuit() == that.getSuit()) {
         return true;
      }
      if (getRank() == that.getRank()) {
         return true;
      }
      if (getRank() == 8) {
         return true;
      }
      return false;
   }

   /**
    * Returns the score of the card
   */
   public int score(){
      int rank = getRank();
      if (rank == 8) {
         return -20;
      } 
      else if (rank > 10) {
         return -10;
      } 
      else {
         return -rank;
      }
   }
}