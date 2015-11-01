import java.util.Timer;
import java.util.TimerTask;

public class Clock extends TimerTask {
	// counts to 10
	private boolean turnValue = false;

	public void run() {
		this.turnValue = !turnValue;
		if(getTurn())
			System.out.print("\t\n<<<<  Turn of P1  >>>>>\n");
		else
			System.out.print("\t\n<<<<  Turn of P2  >>>>>\n");
	}

	public boolean getTurn() {
		return turnValue;
	}
	public void startTimer(Clock clock){
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(clock, 0, 5000);
	}
}
