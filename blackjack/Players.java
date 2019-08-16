package blackjack;

import java.util.Scanner;
/**
 * Methods to play user and dealer
 * @author james
 *
 */
public class Players {
	
	private static MagicHand user = new MagicHand( );
	private static MagicHand dealer = new MagicHand( );
	
//allows user to play game of blackjack
//method returns the users final card value	
	public static int playUser(int size, Deck deck) {
		Scanner in = new Scanner(System.in);
		user.generateHand(size , deck.getDeck( ) );
	       String select = "Y";  
	       System.out.println("YOU DRAW: " + user.toString());
	       		//ask user to draw card, loop until user says no, or end if hand total is 21 or above
	    	   while (select.toUpperCase().contentEquals("Y")) {
	    		   while(user.totalValue(deck.getDeck())<21 && select.toUpperCase().contentEquals("Y")) {
	    			   System.out.println("TOTAL VALUE " + user.totalValue(deck.getDeck()));    	   
	    			   System.out.println("DRAW CARD? [Y/N] ");
	    			   select = in.nextLine();
	    			   
	    		   //ask user to re-enter input if invalid option is given
	       			while (!select.equalsIgnoreCase("Y") && !select.equalsIgnoreCase("N")) {
	       				System.out.println(!select.equalsIgnoreCase("N"));
	     	    	   System.out.println ("INVALID OPTION: " + select + ", PRESS Y or N");
	     	    	   System.out.println("\nDRAW CARD? [Y/N]");
	     		       select = in.nextLine();
	       			}		   
	       			
	       			if (select.toUpperCase().contentEquals("Y") ) {
	       				user.drawCard(deck.getDeck());
	       				System.out.println("YOU DRAW: " + user.printCard());
	       			}
	       			
	       			if (user.totalValue(deck.getDeck())>=21){
	       				if(user.totalValue(deck.getDeck())>21)
		    			   System.out.println("YOU BUST! YOU DREW OVER 21\n");
	       				else
	       					System.out.println("BLACKJACK! YOU DRAW 21!");
		    			select = "N";
		    		   }
	    		   }    		   
	    	   }	       
	       int userVal = user.totalValue(deck.getDeck());
	       user.resetHand();
	       return userVal;
	}
	
//automates the dealers turn, will draw cards only if hand value is less than 17, as per blackjack rules
//method returns the dealers final card value
	public static int playDealer(int size, Deck deck) {
		
		dealer.generateHand(size, deck.getDeck());
		System.out.println("DEALER DRAWS HAND: " + dealer.toString());
				
		while (dealer.totalValue(deck.getDeck()) < 17){		
			dealer.drawCard(deck.getDeck());			
			System.out.println("DEALER DRAWS: " + dealer.printCard());
		}
		
		System.out.println("DEALER FINAL SCORE: " + dealer.totalValue(deck.getDeck()));	
		
		int dealerVal = dealer.totalValue(deck.getDeck());
		dealer.resetHand();
		
		return dealerVal;
		
	}
	
}