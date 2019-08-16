package blackjack;

/**
 * 
 * @author james
 *
 */


public class Card {


        public enum Suit { CLUBS, SPADES , HEARTS , DIAMONDS };

        public enum Value  { ONE , TWO , THREE, FOUR, FIVE, SIX , SEVEN ,

                    EIGHT, NINE, TEN, JOKER , QUEEN , KING};        

	private final Value value;

	private final Suit suit;

         

        public Card ( Suit suit , Value value ) {

            this.suit = suit;

            this.value = value;

        }


	public Value getValue() {

            return this.value;

	}


	public Suit getSuit() {

            return suit;

	}        

        public String toString( ) {

            return value + " of " + suit;

        }



}