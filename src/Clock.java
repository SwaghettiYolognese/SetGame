import java.util.Timer;
import java.util.TimerTask;

public class Clock extends TimerTask {
	// counts to 10
	private boolean turnValue = true;

	public void run() {
		turnValue = !turnValue;
		System.out.print(turnValue);
	}

	public boolean getTurn() {
		return turnValue;
	}
	public void startTimer(){
		Timer timer = new Timer();
		timer.schedule(new Clock(), 0, 15000);
	}
}
