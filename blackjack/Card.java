package blackjack;

/*Reused the enums Suit and Value
 * Renamed the values to correspond with UNO
 * 
 * The toString overload is useful and can be used by other programs to get the value of a card object
 */


public class Card {



        public enum Suit { RED, YELLOW , GREEN , BLUE };

        public enum Value  { ONE , TWO , THREE, FOUR, FIVE, SIX , SEVEN ,

                    EIGHT, NINE, TEN , SKIP , REVERSE , DRAWTWO , DRAWFOUR , WILDCARD };

        

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