package application;

import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.SECONDS;

public class CountTimer {
	private int countdownStarter = 20;
	
	public CountTimer (int x){
		countdownStarter = x;
	}
    
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
	
	public boolean checktimerend() {
		if (countdownStarter<0) return true;
		return false;
	}
	public void printtimer() {
	System.out.println("\nTime remaining: "+countdownStarter);
	}
}