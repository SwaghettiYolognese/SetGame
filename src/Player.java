import java.util.PriorityQueue;
import java.util.Scanner;

public class Player {
	// gives input to user,takes the set input from user,gives name,attributes
	// are name
	private String name;

	public void determineName() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter name:");
		String name = scan.next();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public PriorityQueue<Integer> play() {
		Scanner scan = new Scanner(System.in);
		try {
			String input = scan.next();
			switch (input) {
			case "s":
				System.out.println("\nChoose 3 Cards:");
				PriorityQueue<Integer> chosenCards = new PriorityQueue<Integer>();
				for (int i = 0; i < 3; i++) {
					chosenCards.add(scan.nextInt());
				}
				return chosenCards;
			}
		} finally {
			scan.close();
		}
		return null;
	}
}
