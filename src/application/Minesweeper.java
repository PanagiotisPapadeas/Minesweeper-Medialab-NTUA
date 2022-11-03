package application;

public class Minesweeper {
	
    private int difficulty;
    private int bombcount;
    private int timerseconds;
    private boolean hyperbomb;
    private int[][] fieldVisible;
    private int[][] fieldHidden;
    private int arraydimension;
    private int flagcnt = 0;
    
    public Minesweeper (int diff, int bombs, int time, int hyperb) {
    	difficulty = diff;
    	if (difficulty == 1) {
    	fieldVisible = new int [9][9];
    	fieldHidden = new int [9][9];
    	arraydimension=9;
    	}
    	else if (difficulty == 2) {
    		fieldVisible = new int [16][16];
        	fieldHidden = new int [16][16];
        	arraydimension=16;
    	}
    	bombcount = bombs;
    	timerseconds = time;
    	if (hyperb==0) hyperbomb = false;
    	else hyperbomb = true;
    }
    
    
}