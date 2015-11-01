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
		ref.findAllSets(cardsInPlay);
		// initializing players
		Player p1 = players.get(0);
		Player p2 = players.get(1);
		p1.determineName();
		p2.determineName();
		// initializing the layout
		System.out.println(p1.getName() + "VS" + p2.getName());
		System.out.println("RemainingSets" + ref.getRemainingSets());
		layout.printLayout(cardsInPlay);
		Player currentPlayer;

		while (ref.getRemainingSets() > 0) {
			while (!clock.isEndTurn()) {
				// Start counter
				clock.reset();
				clock.run();
				// Assigns the current player according to the clock
				if (clock.getTurn()) {
					currentPlayer = p1;
				} else {
					currentPlayer = p2;
				}
				// we check if current player has given an answer and its
				// correctness
				if (currentPlayer.play() != null && ref.doesSetExists(currentPlayer.play())) {
					scoreboard.update(clock.getTurn());
				}
			}
			clock.alternateTurn();
		}
	}
}
