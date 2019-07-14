package blackjack;

public class Dealer {
	
	private MagicHand dealer = new MagicHand( );
	
	public void playDealer(int size, Deck deck) {
		
		dealer.generateHand(size, deck.getDeck());
		System.out.println("DEALER DRAWS: " + dealer.toString());
				
		while (dealer.totalValue(deck.getDeck()) < 17){		
			dealer.drawCard(deck.getDeck());			
			System.out.println("Dealer draws card " + dealer.printCard());
		}	
		System.out.println("Dealer draws card " + dealer.printCard());
		System.out.println("DEALER FINAL HAND OF: " + dealer.toString());
		System.out.println("Dealer draws card " + dealer.totalValue(deck.getDeck()));	
	}
	
}