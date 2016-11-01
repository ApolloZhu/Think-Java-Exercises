//
//  Player.java
//  Chapter14
//  
//  Created by Allen Downey and Chris Mayfield
//  Modified by Apollo Zhu on 8/20/16.
//

/**
 * A player in a game of crazy eights.
 */
public class Player {

   private String name;
   private CardCollection hand;

   /**
    * Constructs a player with an empty hand.
    */
   public Player(String name) {
      this.name = name;
      this.hand = new CardCollection(name);
   }

   /**
    * Gets the player's name.
    */
   public String getName() {
      return name;
   }

   /**
    * Gets the player's hand.
    */
   public CardCollection getHand() {
      return hand;
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
      System.out.println(name + " has " + score() + " points");
   }

}
