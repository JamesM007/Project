package blackjack;



/**

 *

 * @author ramses

 */

public class CardGame {

    

   public static void main( String args [ ] ) {

       

       String value = args [ 0 ];

       String suit = args[ 1 ];



       

            // create deck with 60 cards

       Deck deck = new Deck( );

       deck.setSize( 60 );

       deck.generateDeck( );

       

            // create magic hand

       MagicHand hand = new MagicHand( );

       hand.generateHand( 7 , deck.getDeck( ) );

       System.out.println( hand.toString( ) );

       

       Card card = deck.findCard(value, suit);

       System.out.println( "Card selected is " + card.toString() );

       System.out.println( "Is your card on the magic hand: " + hand.isCardInHand( card ) );

       

   }

    

}