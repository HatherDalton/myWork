package Elevens_Lab;

import java.util.ArrayList;

public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	
		ArrayList<Card>deck= new ArrayList<Card>();
		
		for(int i=0; i<10;i++) {
			deck.add(new Card("3","Heart", 3));
			deck.add(new Card("3","Dimond", 3));
			deck.add(new Card("3","Spades", 3));
			deck.add(new Card("3","Clubs", 3));
		}
		
		deck.get(0).toString();
	}
}
