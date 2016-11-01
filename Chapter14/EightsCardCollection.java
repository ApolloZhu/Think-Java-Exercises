//
//  EightsCardCollection.java
//  Chapter14
//
//  Created by Apollo Zhu on 8/20/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

import java.util.ArrayList;

public class EightsCardCollection extends CardCollection{
   
   private ArrayList<EightsCard> eightCards;
   
    /**
     * Constructs an empty collection.
     */
   public EightsCardCollection(String label) {
      super(label);
      this.eightCards = new ArrayList<EightsCard>();
   }

    /**
     * Returns the card with the given index.
     */
   public EightsCard getCardAt(int i) {
      return eightCards.get(i);
   }

    /**
     * Returns the last card.
     */
   public EightsCard last() {
      int i = size() - 1;
      return getCardAt(i);
   }

    /**
     * Adds the given card to the collection.
     */
   public void append(EightsCard card) {
      eightCards.add(card);
   }

    /**
     * Removes and returns the card with the given index.
     */
   public EightsCard removeAt(int i) {
      return eightCards.remove(i);
   }

    /**
     * Removes and returns the last card.
     */
   public EightsCard removeLast() {
      int i = size() - 1;
      return removeAt(i);
   }

   /**
    * Returns the number of cards.
    */
   public int size() {
      return eightCards.size();
   }

    /**
     * Moves n cards from this collection to the given collection.
     */
   public void deal(EightsCardCollection that, int n) {
      for (int i = 0; i < n; i++) {
         EightsCard card = removeLast();
         that.append(card);
      }
   }

    /**
     * Moves all remaining cards to the given collection.
     */
   public void dealAll(EightsCardCollection that) {
      int n = size();
      deal(that, n);
   }

    /**
    * Swaps the cards at indexes i and j.
    */
   public void swapAt(int i, int j) {
      append(eightCards.get(i));
      eightCards.set(i, getCardAt(j));
      eightCards.set(j, removeLast());
   }

   /**
    * Returns a string representation of the card collection.
    */
   public String toString() {
      return getLabel() + ": " + eightCards.toString();
   }

   /**
    * Prints the label and cards.
    */
   public void display() {
      System.out.println(getLabel() + ": ");
      for (Card card: eightCards){
         System.out.println(card);
      }
      System.out.println();
   }

}
