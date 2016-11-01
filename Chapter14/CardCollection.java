//
//  CardCollection.java
//  Chapter14
//  
//  Created by Allen Downey and Chris Mayfield
//  Modified by Apollo Zhu on 8/20/16.
//

import java.util.ArrayList;
import java.util.Random;

/**
 * A collection of playing cards.
 */
public class CardCollection {

   private String label;
   private ArrayList<Card> cards;

   /**
    * Constructs an empty collection.
    */
   public CardCollection(String label) {
      this.label = label;
      this.cards = new ArrayList<Card>();
   }

   /**
    * Returns the label of the card collection.
    */
   public String getLabel() {
      return label;
   }

   /**
    * Returns the card with the given index.
    */
   public Card getCardAt(int i) {
      return cards.get(i);
   }

   /**
    * Returns the last card.
    */
   public Card last() {
      int i = size() - 1;
      return getCardAt(i);
   }

   /**
    * Adds the given card to the collection.
    */
   public void append(Card card) {
      cards.add(card);
   }

   /**
    * Removes and returns the card with the given index.
    */
   public Card removeAt(int i) {
      return cards.remove(i);
   }

   /**
    * Removes and returns the last card.
    */
   public Card removeLast() {
      int i = size() - 1;
      return removeAt(i);
   }

   /**
    * Returns the number of cards.
    */
   public int size() {
      return cards.size();
   }

   /**
    * True if the collection is empty, false otherwise.
    */
   public boolean isEmpty() {
      return size() == 0;
   }

   /**
    * Moves n cards from this collection to the given collection.
    */
   public void deal(CardCollection that, int n) {
      for (int i = 0; i < n; i++) {
         Card card = removeLast();
         that.append(card);
      }
   }

   /**
    * Moves all remaining cards to the given collection.
    */
   public void dealAll(CardCollection that) {
      int n = size();
      deal(that, n);
   }

   /**
    * Swaps the cards at indexes i and j.
    */
   public void swapAt(int i, int j) {
      append(cards.get(i));
      cards.set(i, cards.get(j));
      cards.set(j, removeLast());
   }

   /**
    * Randomly permute the cards.
    */
   public void shuffle() {
      Random random = new Random();
      for (int i = size() - 1; i > 0; i--) {
         int j = random.nextInt(i);
         swapAt(i, j);
      }
   }

   /**
    * Returns a string representation of the card collection.
    */
   public String toString() {
      return label + ": " + cards.toString();
   }

   /**
    * Prints the label and cards.
    */
   public void display() {
      System.out.println(label + ": ");
      for (Card card: cards){
         System.out.println(card);
      }
      System.out.println();
   }

}
