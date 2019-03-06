/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	private static String[] ranks;
	private static String[] suits;
	private static int[] values;
	
	public static void main(String[] args) {
		ranks = new String[2];
		ranks[0] = "1";
		ranks[1] = "2";
		suits = new String[4];
		suits[0] = "D";
		suits[1] = "H";
		suits[2] = "C";
		suits[3] = "S";
		values = new int[2];
		values[0] = 1;
		values[1] = 2;

//Above is the tester "deck" used to create the deck.

		Deck d1 = new Deck(ranks, suits, values);
		System.out.println(d1.isEmpty());
		System.out.println(d1.size());
		System.out.println(d1.deal());
	}
}
//Above is the implementation of a deck and a call to its methods.

