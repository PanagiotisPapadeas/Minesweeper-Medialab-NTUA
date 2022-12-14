package application;

import java.util.concurrent.*;


import static java.util.concurrent.TimeUnit.SECONDS;

public class CountTimer {
	private int countdownStarter = 20;
	
	/** Creates a timer with the specified seconds
	 * * @param seconds The timer's seconds to start the countdown.
	 */
	public CountTimer (int seconds){
		countdownStarter = seconds;
	}
	/** Check if timer reaches 0
	 * @return A boolean that is true if it has reached 0.
	 */
	public boolean checktimerend() {
		if (countdownStarter<0) return true;
		return false;
	}
	/** Prints timer's remaining seconds
	 */
	public void printtimer() {
	System.out.println("\nTime remaining: "+countdownStarter);
	}
	/** Starts the timer
	 */
	public void starttimer(){
        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        final Runnable runnable = new Runnable() {

            public void run() {

                //System.out.println(countdownStarter);
                countdownStarter--;

                if (countdownStarter < 0) {
                    System.out.println("Timer Over!");
                    scheduler.shutdown();
                    
                }
            }
        };
        scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);
    }
}