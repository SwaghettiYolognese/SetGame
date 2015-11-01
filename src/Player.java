import java.util.Scanner;

public class Player {
	// gives input to user,takes the set input from user,gives name,attributes
	// are name
	private String name;

	public void determineName() {
		Scanner scan = new Scanner(System.in);
		try {
			String name = scan.next();
			this.name = name;
		} finally {
			scan.close();
		}
	}

	public void printName() {
		System.out.println(name);
	}

	public int[] play() {
		Scanner scan = new Scanner(System.in);
		try {
			String input = scan.next();
			switch (input) {
			case "s":
				System.out.println("\nChoose 3 Cards:");
				int[] chosenCards;
				chosenCards = new int[3];
				for (int i = 0; i < 3; i++) {
					chosenCards[i] = scan.nextInt();
				}
				return chosenCards;
			}
		} finally {
			scan.close();
		}
		return null;
	}
}
