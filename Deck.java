import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private List<Card> cards;
	//Below is the ArrayList deck1, which is the deck!
	private ArrayList<Card> deck1 = new ArrayList<Card>();
	private int counter;
	private String[] deckRanks; 
	private String[] deckSuits;
	private int[] deckValues;


	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;
	//Size is the number of cards in the deck.

	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
	//Setting deck.java's variables equal to the inputs
		deckRanks = ranks;
		deckSuits = suits;
		deckValues = values;


		//for (int i=0; i < ranks.length; i++){
		//	deckRanks[i] = ranks[i];
		//}
		//for (int j=0; j < suits.length; j++){
		//	deckSuits[j] = suits[j];
		//}
		//for (int k=0; k < values.length; k++){
		//	deckValues[k] = values[k];
		//}

	//Below's code is to create the deck of cards.
		
		for (int z=0; z < ranks.length; z++) {
			for (int i=0; i<suits.length; i++) {
				Card c1 = new Card(deckRanks[z], deckSuits[i], deckValues[z]);
				deck1.add(c1);
			}
		}
		
		//Card c1 = new Card(deckRanks[0], deckSuits[0], deckValues[0]);
		//zoom.add(c1);
		//counter = ranks.length;
		//for (int i=0; i < counter; i++) {
			//Card a+(i) = new Card(ranks[i], suits[0], values[i]);
			//Card b+(i) = new Card(ranks[i], suits[1], values[i]);
			//Card c+(i) = new Card(ranks[i], suits[2], values[i]);
			//Card d+(i) = new Card(ranks[i], suits[3], values[i]);
			//zoom.add(a0);
			//zoom.add(a1);
			//zoom.add(a2);
			//zoom.add(a3);
		//}
		//size = deck1.size();
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		size = deck1.size();
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		size = size--;
		return deck1.get(size-1);
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
