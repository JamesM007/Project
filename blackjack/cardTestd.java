package blackjack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class cardTestd {
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	//test for dealer completing turn and returning a score
	@Test
	void testDealerValue() {
		Deck deck = new Deck( );
	       deck.setSize( 52 );
	       deck.generateDeck( );
	       
		int dealer = 0;
		dealer = Players.playDealer(2, deck);
		assertTrue(dealer > 0);
	}
	// test for draw card method success in filling hand with one card
	@Test
	void testDrawCard() {
		Deck deck = new Deck( );
	       deck.setSize( 52 );
	       deck.generateDeck( );
	       
	       MagicHand user = new MagicHand( );
	       user.generateHand(0 , deck.getDeck( ) );
	       
	       user.drawCard(deck.getDeck());
	       
	       assertTrue(user.hand[0]!=null && user.hand[1]==null);      
	}
	@Test
	void testResetHand() {
		//test resertHand
	}

}
