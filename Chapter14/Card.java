//
//  Card.java
//  Chapter14
//  
//  Created by Allen Downey and Chris Mayfield
//  Modified by Apollo Zhu on 8/20/16.
//

/**
 * A standard playing card.
 */
public class Card {

   public static final String[] RANKS = {
      null, "Ace", "2", "3", "4", "5", "6", "7",
      "8", "9", "10", "Jack", "Queen", "King"};

   public static final String[] SUITS = {
      "Clubs", "Diamonds", "Hearts", "Spades"};

   private final int rank;
   private final int suit;

   /**
    * Constructs a card of the given rank and suit.
    */
   public Card(int rank, int suit) {
      this.rank = rank;
      this.suit = suit;
   }

   /**
    * Returns a negative integer if this card comes before
    * the given card, zero if the two cards are equal, or
    * a positive integer if this card comes after the card.
    */
   public int compareTo(Card that) {
      if (suit < that.suit) {
         return -1;
      }
      if (suit > that.suit) {
         return 1;
      }
      if (rank < that.rank) {
         return -1;
      }
      if (rank > that.rank) {
         return 1;
      }
      return 0;
   }

   /**
    * Returns true if the given card has the same
    * rank AND same suit; otherwise returns false.
    */
   public boolean equals(Card that) {
      return rank == that.rank
         && suit == that.suit;
   }

   /**
    * Gets the card's rank.
    */
   public int getRank() {
      return rank;
   }

   /**
    * Gets the card's suit.
    */
   public int getSuit() {
      return suit;
   }

   /**
    * Returns the score of the card
   */
   public int score(){
      return rank;
   }

   /**
    * Returns a string representation of the card.
    */
   public String toString() {
      return RANKS[rank] + " of " + SUITS[suit];
   }

}
