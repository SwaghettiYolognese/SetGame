package setClasses;
import java.util.ArrayList;
import java.util.Scanner;

public class SetGame {
	// main class of playing the game,attributes,one referee, one layout,2
	// players,12 cards,score,
	private Referee ref;
	private Layout layout;
	private ArrayList<Player> players;
	private Deck deck;
	private ArrayList<Card> cardsInPlay;
	private Clock clock;
	private Score scoreboard;

	public SetGame() {
		this.ref = new Referee();
		this.layout = new Layout();
		this.players = new ArrayList<Player>();
		this.deck = new Deck();
		this.clock = new Clock();
		this.scoreboard= new Score();
	}

	public void playSetGame() {
		// initializing the game
		System.out.println("Welcome to SetGame!!!\n");
		cardsInPlay = deck.give12Cards();
		ref.findAllSets(cardsInPlay);
		// initializing players
		players.add(new Player());
		players.add(new Player());
		Player p1 = players.get(0);
		Player p2 = players.get(1);
		p1.determineName();
		p2.determineName();
		// initializing the layout
		System.out.println("\n<<<<" + p1.getName().toUpperCase() + " VS " + p2.getName().toUpperCase() + ">>>>\n");
		layout.printLayout(cardsInPlay);
		System.out.println( ref.getRemainingSets()+" SETS to find.\n");
		Player currentPlayer = p1;
		clock.startTimer(clock);

		while (ref.getRemainingSets() > 0) {
			
			

			Scanner scan = new Scanner(System.in);
			System.out.print("\nPress S to enter a SET!// D to display Score!\n");
			String input = scan.nextLine();

			switch (input) {
			case "s":
				// Assigns the current player according to the clock
					boolean turn=clock.getTurn();
				if (turn == true)
					currentPlayer = p1;
				else
					currentPlayer = p2;
				
				System.out.print(currentPlayer.getName().toUpperCase() + "'s Cards are:\n");
				currentPlayer.play();
				if(ref.doesSetExists(currentPlayer.getChosenCards())){
					scoreboard.update(turn);
				}
				else{
					System.out.print("Not a valid SET.\n");
				}
			case "d":
				scoreboard.displayScore();
			}
		}
		clock.cancel();
		boolean winner =scoreboard.determineWinner();
		if(winner)
			System.out.print(p1.getName());
		else
			System.out.print(p2.getName());
			System.out.println( "is the WINNER!!!!!");
			
	}

	public static void main(String[] args) {
		SetGame set = new SetGame();
		set.playSetGame();
	}
}
