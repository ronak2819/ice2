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
public class Cardhand {
     private int handSize = 108;
	public UnoGame[] unogame = new UnoGame[handSize];

	
        /**
         * Add comments during class to explain what this method does.
         */
        public void generateHand()
        {
                int countCards = 0;
		for(UnoGame.Suit s: UnoGame.Suit.values())
                {
                    for(UnoGame.Value v: UnoGame.Value.values())
                    {
                        unogame[countCards] = (new UnoGame(s,v));
                        countCards++;
                    }
                }//end outter for
        }//end method

    
}
