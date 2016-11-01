//
//  EightsPlayer.java
//  Chapter14
//
//  Created by Apollo Zhu on 8/20/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

public class EightsPlayer extends Player{

   private EightsCardCollection eightsHand;

   public EightsPlayer(String name){
      super(name);
      eightsHand = new EightsCardCollection(name);
   }
   
   /**
    * Gets the player's hand.
    */
   public EightsCardCollection getHand(){
      return eightsHand;
   }

   /**
    * Calculates the player's score (penalty points).
    */
   public int score() {
      int sum = 0;
      for (int i = 0; i < getHand().size(); i++) {
         sum += getHand().getCardAt(i).score();
      }
      return sum;
   }

   /**
    * Displays the player's hand.
    */
   public void display() {
      getHand().display();
   }

   /**
    * Displays the player's name and score.
    */
   public void displayScore() {
      System.out.println(getName() + " has " + score() + " points");
   }

   /**
    * Removes and returns a legal card from the player's hand.
    */
   public EightsCard play(Eights eights, EightsCard prev) {
      EightsCard card = searchForMatch(prev);
      if (card == null) {
         card = drawForMatch(eights, prev);
      }
      return card;
   }

   /**
    * Searches the player's hand for a matching card.
    */
   public EightsCard searchForMatch(EightsCard prev) {
      for (int i = 0; i < getHand().size(); i++) {
         EightsCard card = getHand().getCardAt(i);
         if (card.matches(prev)) {
            return getHand().removeAt(i);
         }
      }
      return null;
   }

   /**
    * Draws cards until a match is found.
    */
   public EightsCard drawForMatch(Eights eights, EightsCard prev) {
      while (true) {
         EightsCard card = eights.draw();
         System.out.println(getName() + " draws " + card);
         if (card.matches(prev)) {
            return card;
         }
         getHand().append(card);
      }
   }
}