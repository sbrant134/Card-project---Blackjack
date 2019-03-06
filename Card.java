public class Card {
	
	private String suit;
	private String rank;
	private int pointValue;
	
	public Card(String cardRank, String cardSuit, int cardPointValue) {
		rank = cardRank;
		suit = cardSuit;
		pointValue = cardPointValue;
	}
	
	public String suit() {
		return suit;
  	}
	
	public String rank() {
		return rank;
	}
	
	public int pointValue() {
		return pointValue;
	}
	
	public boolean matches(Card otherCard) {
		if ((otherCard.rank().equals(rank)) && (otherCard.suit().equals(suit)) && (otherCard.pointValue() == pointValue)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return (rank + " of " + suit + " (point value = " + pointValue + ")");
	}
}

