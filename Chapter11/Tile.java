//
//  Tile.java
//  Chapter11
//
//  Created by Apollo Zhu on 8/13/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

public class Tile{
   public static void main(String args[]){
      Tile aTile = testTile();
      aTile.setValue(20);
      printTile(aTile);
      System.out.println(aTile.equals(testTile())+" "+aTile.getLetter());
   }
   private char letter;
   private int value;
   public Tile(char letter, int value){
      this.letter = letter;
      this.value = value;
   }
   public static void printTile(Tile tile){
      System.out.println("A tile with "+tile.letter+" and "+tile.value);
   }
   public static Tile testTile(){
      Tile tile = new Tile('Z',10);
      printTile(tile);
      return tile;
   }
   public String toString(){
      return "A tile with "+this.letter+" and "+this.value;
   }
   public boolean equals(Tile that){
      return this.letter == that.letter && this.value == that.value;
   }
   public char getLetter(){
      return this.letter;
   }
   public void setLetter(char letter){
      this.letter = letter;
   }
   public int getValue(){
      return this.value;
   }
   public void setValue(int value){
      this.value = value;
   }
}