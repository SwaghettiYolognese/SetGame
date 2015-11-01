import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;

public class Referee {
	// checks whos turn is it,the given set is true,how many sets left,check
	// sets(gets a list of cards an an input and finds the all possible
	// sets),Announce winner when sets are over or someone gets more
	// sets,attribute of cards in play possible sets,has a tmer attribute,whos
	// turn attribute
	private int remainingSets = 0;
	private LinkedHashSet<PriorityQueue<Integer>> allSets;

	public boolean isSet(Card card1, Card card2, Card card3) {

		if (!((card1.getNumber() == card2.getNumber()) && (card2.getNumber() == card3.getNumber())
				|| (card1.getNumber() != card2.getNumber()) && (card1.getNumber() != card3.getNumber())
						&& (card2.getNumber() != card3.getNumber()))) {
			return false;
		}
		if (!((card1.getShape() == card2.getShape()) && (card2.getShape() == card3.getShape())
				|| (card1.getShape() != card2.getShape()) && (card1.getShape() != card3.getShape())
						&& (card2.getShape() != card3.getShape()))) {
			return false;
		}
		if (!((card1.getShading() == card2.getShading()) && (card2.getShading() == card3.getShading())
				|| (card1.getShading() != card2.getShading()) && (card1.getShading() != card3.getShading())
						&& (card2.getShading() != card3.getShading()))) {
			return false;
		}
		if (!((card1.getColor() == card2.getColor()) && (card2.getColor() == card3.getColor())
				|| (card1.getColor() != card2.getColor()) && (card1.getColor() != card3.getColor())
						&& (card2.getColor() != card3.getColor()))) {
			return false;
		}
		this.remainingSets=remainingSets+1;
		return true;
	}

	public void findAllSets(ArrayList<Card> cardList) {
		int cardCount = cardList.size();
		LinkedHashSet<PriorityQueue<Integer>> allSets = new LinkedHashSet<PriorityQueue<Integer>>();
		PriorityQueue<Integer> possibleSet = new PriorityQueue<Integer>();
		for (int i = 0; i < cardCount; i++) {
			for (int j = 0; j < cardCount; j++) {
				for (int k = 0; k < cardCount; k++) {
					if (i != j && j != k && i != k) {
						if (isSet(cardList.get(i), cardList.get(j), cardList.get(k))) {
							possibleSet.add(i);
							possibleSet.add(j);
							possibleSet.add(k);
							allSets.add(possibleSet);
							possibleSet.clear();
						}
					}
				}
			}
		}
		this.allSets = allSets;
	}

	public boolean doesSetExists(PriorityQueue<Integer> possibleSet) {
		if (allSets.contains(possibleSet)) {
			allSets.remove(possibleSet);
			decreaseRemainingSets();
			return true;
		}
		return false;
	}

	public int getRemainingSets() {
		return remainingSets;
	}

	public void decreaseRemainingSets() {
		this.remainingSets = remainingSets - 1;
	}

}
