import java.util.PriorityQueue;
import java.util.Scanner;

public class Player {
	// gives input to user,takes the set input from user,gives name,attributes
	// are name
	private String name;
	private PriorityQueue<Integer> chosenCards;
	public void determineName() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter name:");
		String name = scan.next();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void play() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nChoose 3 Cards:");
		for (int i = 0; i < 3; i++) {
			this.chosenCards.add(scan.nextInt());
		}

	}
}
