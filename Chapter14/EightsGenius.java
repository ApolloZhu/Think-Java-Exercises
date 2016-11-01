//
//  EightsGenius.java
//  Chapter14
//
//  Created by Apollo Zhu on 8/19/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

import java.util.ArrayList;

public class EightsGenius extends EightsPlayer{

   public EightsGenius(String name){
      super(name);
   }
   /**
    * Evaluate value of certain card under certain condition 
    */
   private static int eval(EightsCard card, int total,  boolean vary){ 
      return eval(card.getRank(), total, vary); 
   }

   /**
    * Evaluate value of certain card under certain condition 
    */
   private static int eval(int rank, int total, boolean vary){
      if (rank > 10){
         return 10;
      }
      if (rank == 8){
         if (total < 5 && !vary){
            return 12;
         }
         return 0;
      }
      return rank;
   }

   /**
    * Searches the player's hand for the best matching card.
    */
   public EightsCard searchForMatch(EightsCard prev) {
      int[] suitStat = new int[4];
      int[] rankStat = new int[14];
      int index = -1;
      EightsCardCollection pile = getHand();
      ArrayList<Integer> possible = new ArrayList<Integer>();
      for (int i = 0; i < pile.size(); i++) {
         EightsCard card = pile.getCardAt(i);
         int suit = card.getSuit();
         int rank = card.getRank();
         suitStat[suit] += 1;
         rankStat[rank] += 1;
         if (card.matches(prev)){ 
            possible.add(i);
            if (possible.size() == 1){ index = i; }
         }
      }
      int total = possible.size();
      if (total == 0){ 
         return null; 
      } 
      if (total > 1){
          // Evalute cards 
         int max = -1;
         boolean vary = true;
         for (int i=0;i<4;i++){ 
            if (suitStat[i] == 0){
               vary = false; 
               break;
            } 
         }
         for (int i=0;i<total;i++){
            int position = possible.get(i);
            EightsCard card = pile.getCardAt(position);  
            int rank = card.getRank();
            int suit = card.getSuit();
            int val = eval(rank, total, vary);
            // With different weight
            int value = val * 3 + suitStat[suit] * 6 + rankStat[rank] * 5;
            if (value > max) { index = position; max = value; }
         }
      }
      return pile.removeAt(index);
   }
}
