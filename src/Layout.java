import java.util.ArrayList;

public class Layout {
	// holds the screen pattern of cards,takes and prints cards

	public void printLayout(ArrayList<Card> cardsInPlay) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println((i + j) + '.');
				cardsInPlay.get(i).printCard();
			}
			System.out.println("\n");
		}
	}
}
