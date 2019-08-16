
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

    public Card[ ] hand;
       
    public void generateHand( int size , Card [ ] deck ) {  	
    	//setting maximum hand size to 7
        hand = new Card[ 7 ];

        for ( int i = 0 ; i < size ; i ++ ) {
            int randomNumber = ( int ) ( Math.random() * 52 );                     
            hand[ i ] = deck[ randomNumber ];
        }        
    }
    
    public void resetHand() {
    	for ( int i = 0 ; i < hand.length ; i ++ ) {
    		hand[i] = null;
    	}
    }
    
    public void drawCard(Card[]deck) {
    	for ( int i = 0 ; i < hand.length ; i ++ ) {
    		if (hand[i]==null) {
    			hand[i]= deck[(int)(Math.random()*52)];
    			break;
    		}
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
    
    public int totalValue (Card[]deck) {
    	int total = 0;
    	
    	for ( int i = 0 ; i < hand.length -1; i ++ ) {
    		if (hand[i] != null) {
    			switch(hand[i].getValue()) {
    			case ONE: total += 1; break;
    			case TWO: total += 2; break;
    			case THREE: total += 3; break;
    			case FOUR: total += 4; break;
    			case FIVE: total += 5; break;
    			case SIX: total += 6; break;
    			case SEVEN: total += 7; break;
    			case EIGHT: total += 8; break;
    			case NINE: total += 9; break;
    			case TEN: total += 10; break;
    			case JOKER: total += 10; break;
    			case QUEEN: total += 10; break;
    			case KING: total += 10; break;
    			
    			default: total = 0;
    			}
    			//System.out.println(total + " "); 			
    		}
    	}
    	return total;
    }
    

    public String toString( ) {

        String cardString = "";

        for ( Card card : hand ) {
        	if(card!=null)
        	cardString += ( card.toString( ) + " , " );
        }
        return cardString;
    }
    
    
    public String printCard( ) {

        String cardString = "";

        for ( Card card : hand ) {
        	if(card!=null)
        	cardString = ( card.toString( ));
        }

        return cardString;
    }

}


