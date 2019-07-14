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

       deck.setSize( 52 );

       deck.generateDeck( );

       

            // create magic hand

       MagicHand hand = new MagicHand( );
       Dealer dealer = new Dealer();

       hand.generateHand(2 , deck.getDeck( ) );
       
       
       System.out.println( hand.toString( ) );
       hand.drawCard(deck.getDeck());
       System.out.println( hand.toString( ) );
       hand.drawCard(deck.getDeck());
       System.out.println( hand.toString( ) );
       System.out.println(hand.totalValue(deck.getDeck()));

      

       Card card = deck.findCard(value, suit);

       System.out.println( "Card selected is " + card.toString() );

       System.out.println( "Is your card on the magic hand: " + hand.isCardInHand( card ) );
       
       dealer.playDealer(2, deck);
       
       System.out.println();
       

   }

    

}