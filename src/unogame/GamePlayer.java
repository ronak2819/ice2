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
public class GamePlayer {
    
    public static void main(String[] args) {
		Cardhand ch = new Cardhand();
                ch.generateHand();
                for(UnoGame c: ch.unogame)
                {
                    System.out.println(c.getValue() + " of " + c.getSuit());
                }
               // System.out.println(ch.cards); show what happens when there is no toString()
	}
    
}
