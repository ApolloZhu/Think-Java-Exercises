//
//  Eights.java
//  Chapter14
//  
//  Created by Allen Downey and Chris Mayfield
//  Modified by Apollo Zhu on 8/20/16.
//

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/**
 * Simulates a game of Crazy Eights.  See
 * https://en.wikipedia.org/wiki/Crazy_Eights
 * for basic play and scoring rules.
 */
public class Eights {

    /**
    * Test with `players` for `count` times
    */
   public static void test(ArrayList<EightsPlayer> players, int count){
      int total = players.size();   
      int[] scores = new int[total];
      int[] board = new int[total];
      for (int round=0;round<count;round++){
         Eights newGame = new Eights(players);
         int[] result = newGame.play();
         for (int i = 0;i<total;i++){ scores[i] += result[i]; }
         board[newGame.getWinner()] += 1;
      }
      System.out.printf("\n\n----[Report for %d test(s)]----\n", count);
      for (int i=0;i<total;i++){
         System.out.printf("Player %s: %.2f percent, lost: %d points\n", players.get(i).getName(), board[i]*100/(double)count, scores[i]);
      }
   }

   public static boolean debug = false;
   private Scanner in;
   private Random random;
   private ArrayList<EightsPlayer> players;
   private EightsCardCollection drawPile;
   private EightsCardCollection discardPile;
   private int current;
   private int winner;

   /**
    * Initializes the state of the game.
    */
   public Eights(ArrayList<EightsPlayer> players) {
      EightsDeck deck = new EightsDeck("Deck");
      deck.shuffle();
   
      // deal cards to each player
      int handSize = 5;
      this.players = players;
      for (int i=0;i<players.size();i++)
         deck.deal(players.get(i).getHand(), handSize);
   
      random = new Random();
      current = random.nextInt(players.size());
   
      // turn one card face up
      discardPile = new EightsCardCollection("Discards");
      deck.deal(discardPile, 1);
   
      // put the rest of the deck face down
      drawPile = new EightsCardCollection("Draw pile");
      deck.dealAll(drawPile);
   
      // create the scanner we'll use to wait for the user
      in = new Scanner(System.in);
   }

   /**
    * Plays the game.
    */
   public int[] play() {
      EightsPlayer player = players.get(current);
      
      // keep playing until there's a winner
      while (!isDone()) {
         displayState();
         waitForUser();
         takeTurn(player);
         player = nextPlayer();
      }
   
      // display the final score
      int[] result = new int[players.size()];
      for (int i = 0;i<players.size();i++){
         EightsPlayer user = players.get(i);
         user.displayScore();
         result[i] = user.score();
      }
      winner = previousIndex();
      return result;
   }

   /**
    * Returns true if either hand is empty.
    */
   public boolean isDone() {
      return players.get(previousIndex()).getHand().isEmpty();
   }

   /**
    * Displays the state of the game.
    */
   public void displayState() {
      for (EightsPlayer user: players){
         user.display();
      }
      discardPile.display();
      System.out.print("Draw pile: ");
      System.out.println(drawPile.size() + " cards");
   }

   /**
    * Waits for the user to press enter.
    */
   public void waitForUser() {
      if (!debug){ in.nextLine(); }
   }

   /**
    * One player takes a turn.
    */
   public void takeTurn(EightsPlayer player) {
      EightsCard prev = discardPile.last();
      EightsCard next = player.play(this, prev);
      discardPile.append(next);
   
      System.out.println(player.getName() + " plays " + next);
      System.out.println();
   }

   /**
    * Get current player's index
    */
   public int getCurrent(){
      return current;
   }

   /**
    * Get winner's index
    */
   public int getWinner(){
      return winner;
   }

   /**
    * Increase and returns the current index
    */
   public int increaseIndex(){
      if (++current == players.size()) { current = 0; }
      return current;
   }

   /**
    * Switch to next player
    */
   public EightsPlayer nextPlayer() {
      return players.get(increaseIndex());
   }

   /**
    * Get previous player's index
    */
   public int previousIndex() {
      if (current == 0){
         return players.size() - 1;
      }
      return current - 1;
   }

   /**
    * Returns a card from the draw pile.
    */
   public EightsCard draw() {
      if (drawPile.isEmpty()) {
         reshuffle();
      }
      return drawPile.removeLast();
   } 

   /**
    * Moves cards from the discard pile to the draw pile and shuffles.
    */
   public void reshuffle() {
      // save the top card
      EightsCard prev = discardPile.removeLast();
   
      // move the rest of the cards
      discardPile.dealAll(drawPile);
   
      // put the top card back
      discardPile.append(prev);
   
      // shuffle the draw pile
      drawPile.shuffle();
   }
}
