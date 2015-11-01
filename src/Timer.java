
public class Timer implements Runnable {
	// counts to 10
	private int time = 0;
	private boolean turn=true;
	private boolean endTurn=false;
	
	public void run() {
		while (time != 10) {
			System.out.println(time++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		this.setEndTurn(true);
	}

	public void reset() {
		time = 0;
	}
	public void alternateTurn() {
		turn = !turn;
		reset();
	}
	public boolean getTurn(){
		return turn;
	}

	public boolean isEndTurn() {
		return endTurn;
	}

	public void setEndTurn(boolean endTurn) {
		this.endTurn = endTurn;
	}
}
