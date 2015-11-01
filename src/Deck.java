import java.util.ArrayList;

public class Deck {
	// holds deck of 81,has a method of giving 12 random cards
	private ArrayList<Card> allCards;

	// creates a random deck
	public Deck() {
		ArrayList<Card> allCards = new ArrayList<Card>();
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				for (int k = 1; k < 4; k++) {
					for (int l = 1; l < 4; l++) {
						allCards.add(new Card(i, j, k, l));
					}
				}
			}
		}
		// shuffling the deck order
		java.util.Collections.shuffle(allCards);
		this.allCards = allCards;
	}

	// just gives the first 12 cards because the deck is already shuffled
	public ArrayList<Card> give12Cards() {
		ArrayList<Card> cardsToPlay = new ArrayList<Card>();
		for (int i = 0; i < 12; i++) {
			cardsToPlay.add(this.allCards.get(i));
		}
		return cardsToPlay;
	}
}
