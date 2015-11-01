import java.util.ArrayList;

public class Layout {
	// holds the screen pattern of cards,takes and prints cards

	public void printLayout(ArrayList<Card> cardsInPlay) {
		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(count +". ");
				cardsInPlay.get(count).printCard();
				count++;
			}
			System.out.println("\n");
		}
	}
}
