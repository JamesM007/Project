
/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */

package blackjack;



/**

 *

 * @author ramses

 */

public class MagicHand {

    

    private Card[ ] hand;

    

    

    public void generateHand( int size , Card [ ] deck ) {

        hand = new Card[ size ];

        

        for ( int i = 0 ; i < size ; i ++ ) {

            int randomNumber = ( int ) ( Math.random() * 60 );

            hand[ i ] = deck[ randomNumber ];

        }

        

    }

    

    public boolean isCardInHand( Card cardSought ) {

        for ( Card card : hand ) {

            if ( card == cardSought ) {

                return true;

            }

        }

        return false;

    }

    

    public String toString( ) {

        String cardString = "";

        for ( Card card : hand ) {

             cardString += ( card.toString( ) + " , " );

        }

        return cardString;

    }

    

}


