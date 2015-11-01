
public class Score {
	// holds the score of the game,2 attributes as score of players
	private int scoreOfP1 = 0;
	private int scoreOfP2 = 0;

	public int getScoreOfP1() {
		return scoreOfP1;
	}

	public int getScoreOfP2() {
		return scoreOfP2;
	}

	public void update(boolean player) {
		if (player)
			this.scoreOfP1 = this.scoreOfP1 + 1;
		else
			this.scoreOfP2 = this.scoreOfP2 + 1;
	}
}
