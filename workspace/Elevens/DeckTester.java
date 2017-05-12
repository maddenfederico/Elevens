/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"jack", "queen", "king"}; 
		String[] suits = {"blue", "red"};
		 
		int[] pointValues = {11, 12, 13};
		 
		Deck d = new Deck(ranks, suits, pointValues);
		System.out.println(d.isEmpty());
		System.out.println(d.deal());
		System.out.println(d);
		
		 String[] newRanks = {"A", "B", "C"};
		 String[] newSuits = {"Giraffes", "Lions"};
		 int[] newPointValues = {2,1,6};
		 
		 Deck e = new Deck(newRanks, newSuits, newPointValues);
		 System.out.println(e.isEmpty());
		 System.out.println(e.deal());
		 System.out.println(e);
		 
		 String[] twentyOneRanks = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};
		 String[] twentyOneSuits = {"hearts", "spades", "clubs", "diamonds"};
		 int[] twentyOneValues = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
		 Deck fiftyTwoCards = new Deck(twentyOneRanks, twentyOneSuits, twentyOneValues);
		 
		 System.out.println(fiftyTwoCards);
		 fiftyTwoCards.shuffle();
		 System.out.print(fiftyTwoCards);
	}
}
