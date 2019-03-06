
public class DeckTester {
	
	public static void main(String[] args) {
		private static String[] ranks = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		private static String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};
		private static int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

		Deck d1 = new Deck(ranks, suits, values);
	}
}


