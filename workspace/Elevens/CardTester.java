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
	}
}
