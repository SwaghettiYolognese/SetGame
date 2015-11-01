import java.util.LinkedHashSet;
import java.util.Scanner;

public class Player {
	// gives input to user,takes the set input from user,gives name,attributes
	// are name
	private String name;
	private LinkedHashSet<Integer> chosenCards;

	public Player() {
		chosenCards = new LinkedHashSet<Integer>();
	}

	public void determineName() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter name:");
		String name = scan.next();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public LinkedHashSet<Integer> getChosenCards() {
		return chosenCards;
	}

	public void play() {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			this.chosenCards.add(scan.nextInt());
		}
	}
}
