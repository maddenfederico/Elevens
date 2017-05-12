/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card ace = new Card("2", "spades", 2);
		System.out.println(ace);
		System.out.println(ace.rank());
		
		Card myCard = new Card("3", "diamonds", 3);
		System.out.println(myCard);
		System.out.println(myCard.rank());
		
		Card theBestCard = new Card("ace", "clubs", 11);
		System.out.println(theBestCard);
		System.out.println(theBestCard.rank());
	}
}
