import java.util.ArrayList;

public class SetGame {
	// main class of playing the game,attributes,one referee, one layout,2
	// players,12 cards,score,
	private Referee ref;
	private Layout layout;
	private ArrayList<Player> players;
	private Deck deck;
	private ArrayList<Card> cardsInPlay;
	private Timer clock;
	private Score scoreboard;

	public SetGame(Referee ref, Layout layout, ArrayList<Player> players, Deck deck) {
		this.ref = ref;
		this.layout = layout;
		this.players = players;
		this.deck = deck;
	}

	public void playSetGame() {
		// initializing the game
		System.out.println("Welcome to SetGame!!!\n");
		cardsInPlay = deck.give12Cards();
		layout.printLayout(cardsInPlay);
		while () {
			if (clock.getTurn()) {
				players.get(0).play();
			} else {
				players.get(1).play();
			}
		}
	}
}
