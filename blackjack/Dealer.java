package blackjack;

import java.util.Scanner;

public class Dealer {
	
	private static MagicHand user = new MagicHand( );
	private static MagicHand dealer = new MagicHand( );
	
	
	public static int playUser(int size, Deck deck) {
		Scanner in = new Scanner(System.in);
		user.generateHand(size , deck.getDeck( ) );
	       String select = "Y";  
	       System.out.println("YOU DRAW: " + user.toString());
   
	    	   while (select.toUpperCase().contentEquals("Y")) {
	    		   System.out.println("Total value " + user.totalValue(deck.getDeck()));    	   
	    		   System.out.println("Draw Card? [Y/N] ");
	       			select = in.nextLine();
	       			
	       			if (select.toUpperCase().contentEquals("Y") ) {
	       				user.drawCard(deck.getDeck());
	       				System.out.println("YOU DRAW: " + user.printCard());
	       			}
	    	   }
	       
	       int userVal = user.totalValue(deck.getDeck());
	       user.resetHand();
	       return userVal;
	}
	
	public static int playDealer(int size, Deck deck) {
		
		dealer.generateHand(size, deck.getDeck());
		System.out.println("DEALER DRAWS: " + dealer.toString());
				
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