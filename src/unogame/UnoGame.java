/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unogame;

/**
 *
 * @author ronak
 */
public class UnoGame {

     public enum Suit {RED, YELLOW,GREEN,BLUE}; // thype of cards
        public enum Value{ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, 
        NINE, COLOR,SKIP,REVERSE,DRAWTWO,DRAWFOUR,WILDCARD};  // number of cards
        private final Suit suit;
        private final Value value;
       
       
        
        public UnoGame(Suit s, Value gVal)
        {
           suit =s;
           value= gVal;
        }
	public Value getValue() {
		return this.value;
	}

	
	public Suit getSuit() {
		return this.suit;
        }
	
    
}
