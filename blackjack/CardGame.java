package blackjack;
import java.util.Scanner;

/**
 *
 * @author ramses
 */

public class CardGame {   

   public static void main( String args [ ] ) {

	   Scanner in = new Scanner(System.in);  
       
	   Deck deck = new Deck( );
       deck.setSize( 52 );
       deck.generateDeck( );

       String select = "Y";
       //loop while user decides to play again
       while (select.toUpperCase().contentEquals("Y")) {
	       int userVal = Players.playUser(2, deck);
	       int dealerVal = Players.playDealer(2, deck);
	       
	       System.out.println("\nUSER TOTAL: "+userVal+"  DEALER TOTAL: "+dealerVal);
	       //win conditions, user must have larger value than dealer and must have value of 21 or less
	       //tie game if user and dealer both exceed 21
	       if(userVal > dealerVal && userVal <= 21 || dealerVal > 21 && userVal <= 21) {
	    	   System.out.println("\nYOU WIN");
	       }     
	       else if(userVal > 21 && dealerVal >21)
	    	   System.out.println("\nTIE GAME");
	       else
	    	   System.out.println("\nYOU LOSE");
	       
	       System.out.println("\nPLAY AGAIN? [Y/N]");
	       select = in.nextLine();   
	       
	       while (!select.equalsIgnoreCase("Y") && !select.equalsIgnoreCase("N")) {
	    	   System.out.println(select.equalsIgnoreCase("Y"));
	    	   System.out.println ("INVALID OPTION: " + select + ", PRESS Y or N");
	    	   System.out.println("\nPLAY AGAIN? [Y/N]");
		       select = in.nextLine();
	       }
	       
	       if (select.toUpperCase().contentEquals("N")) {
	    	   System.out.println("\nGAME OVER");
	    	   in.close();
	       }
       }
       System.exit(0);
   }
}
