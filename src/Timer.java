
public class Timer implements Runnable {
	// counts to 10
	private int time = 0;
	private boolean turn=true;

	public void run() {
		while (time != 10) {
			System.out.println(time++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	public void resetTimer() {
		time = 0;
	}
	public void alternateTurn() {
		turn = !turn;
		resetTimer();
	}
	public boolean getTurn(){
		return turn;
	}
}
