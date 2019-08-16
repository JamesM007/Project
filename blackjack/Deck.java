package blackjack;

/**
 * 
 * @author james
 *
 */

public class Deck {

	private Card[] cards;

        private int size;       

        public void setSize( int size ) {
            this.size = size;
        }
        
        public Card [] getDeck( ) {
            return cards;
        }


	public void generateDeck( ) {
         
		cards = new Card[ size ];
            
		int i = 0;
                // iterate through the suits
            
		for ( Card.Suit suit : Card.Suit.values( ) ){                
                    // iterate through the values 
                
			for ( Card.Value value : Card.Value.values( ) ) {
                    
				Card card = new Card( suit , value );
                    
				cards[ i ++  ] = card;
                
			}              
            
		}            
	}       	
       
	public Card findCard( String value , String suit ) {
                // iterate through the cards in the deck and compare both value and suit
           
		for ( Card card : cards ) {
               
			if ( card.getSuit( ).name( ).equals( suit ) && card.getValue( ).name( ).equals( value ) ) {
                   
				return card;
               
			}
           
		}

           return null;

        
	}



}