//
//  Card.java
//  Chapter13
//  
//  Created by Allen Downey and Chris Mayfield
//  Modified by Apollo Zhu on 8/19/16.
//

import java.util.Arrays;
import java.util.Random;

/**
 * A deck of playing cards (of fixed size).
 */
public class Deck {

   private static final Random random = new Random();

    /**
    * Chooses a random number between low and high, including both.
    */
   public static int randomInt(int low, int high){
      return random.nextInt(Math.max(high,low) - Math.min(high,low) + 1) + low;
   }

    /**
    * Swaps the cards at indexes i and j.
    */
   public void swapCards(int i, int j) {
      // System.out.println("Swapping "+cards[i]+" and "+cards[j]);
      Card temp = cards[i];
      cards[i] = cards[j];
      cards[j] = temp;
   }

   /**
    * Randomly permutes the array of cards.
    */
   public void shuffle() {
      for (int i=0;i<cards.length;i++){
         swapCards(i, randomInt(i, cards.length - 1));
      }
   }
    
    /**
    * Finds the index of the lowest card
    * between low and high inclusive.
    */
   public int indexLowest(int low, int high) {
      int index = Math.min(low,high);
      for (int i = index+1;i<=Math.max(low,high);i++){
         if (cards[index].compareTo(cards[i]) == 1){
            index = i;
         }
      }
      return index;
   }

   /**
    * Sorts the cards (in place) using selection sort.
    */
   public void selectionSort() {
      for (int i=0;i<cards.length-1;i++){
         swapCards(i, indexLowest(i, cards.length - 1));
      }
   }

   /**
    * Combines two previously sorted subdecks.
    */
   public static Deck merge(Deck d1, Deck d2) {
      Card[] c1 = d1.getCards();
      Card[] c2 = d2.getCards();
      int l1 = c1.length;
      int l2 = c2.length;
      Card[] sorted = new Card[l1+l2];
      int i = 0;
      int j = 0;
      if (l1 == 0){
         sorted = c2;
      } 
      else if (l2 == 0){
         sorted = c1;
      } 
      else {
         for (int k = 0;k<sorted.length;k++){
            if (j >= c2.length || i < c1.length && c1[i].compareTo(c2[j]) <= 0){
               sorted[k] = c1[i];
               i++;
            } 
            else {
               sorted[k] = c2[j];
               j++;
            }
         }
      }
      Deck deck = new Deck(l1+l2);
      deck.cards = sorted;
      return deck;
   }

   /**
    * Returns a sorted copy of the deck using merge sort.
    */
   public Deck mergeSort() {
      int len = cards.length;
      if (len == 0 || len == 1){
         return this;
      } 
      else {
         int mid = len / 2;
         Deck d1 = subdeck(0, mid - 1).mergeSort();
         Deck d2 = subdeck(mid, len -1).mergeSort();
         return merge(d1, d2);
      }
   }

   /**
    * Reorders the cards (in place) using insertion sort.
    */
   public void insertionSort() {
      for (int i=1;i<cards.length;i++){
         for (int j=i; j>0;j--){
            if (cards[j-1].compareTo(cards[j]) == 1){
               swapCards(j-1,j);
            } 
            else {
               break;
            }
         }
      }
   }

/**
    * Returns a string representation of the deck.
    */
   public String toString() {
      StringBuilder result = new StringBuilder();
      for (int i = 0; i < this.cards.length; i++) {
         result.append(cards[i]);
         result.append('\n');
      }
      return result.toString();
      
   }

    // ------------------------------------------------
    // MARK:  Supporting

   private Card[] cards;

   /**
    * Constructs a standard deck of 52 cards.
    */
   public Deck() {
      this.cards = new Card[52];
      int index = 0;
      for (int suit = 0; suit <= 3; suit++) {
         for (int rank = 1; rank <= 13; rank++) {
            this.cards[index] = new Card(rank, suit);
            index++;
         }
      }
   }

   /**
    * Constructs a deck of n cards (null).
    */
   public Deck(int n) {
      this.cards = new Card[n];
   }

   /**
    * Gets the internal cards array.
    */
   public Card[] getCards() {
      return this.cards;
   }

   /**
    * Displays each of the cards in the deck.
    */
   public void print() {
      for (int i = 0; i < this.cards.length; i++) {
         System.out.println(this.cards[i]);
      }
   }

   /**
    * Returns a subset of the cards in the deck.
    */
   public Deck subdeck(int low, int high) {
      Deck sub = new Deck(high - low + 1);
      for (int i = 0; i < sub.cards.length; i++) {
         sub.cards[i] = this.cards[low + i];
      }
      return sub;
   }

}
