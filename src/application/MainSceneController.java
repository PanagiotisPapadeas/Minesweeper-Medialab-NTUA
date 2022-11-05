package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.io.BufferedInputStream;
//import java.awt.event.MouseEvent;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import javafx.event.ActionEvent;

public class MainSceneController {
	
    public int difficulty;
    public int bombcount;
    public int timerseconds;
    public boolean hyperbomb;
    public int[][] fieldVisible;
    public int[][] fieldHidden;
    public int arraydimension;
    public int flagcnt;
    public int activeflagcnt;
    public int i;
    public int j;
    public int m;
    public String example;
    public int cou;
    public boolean sched;
    public int attempts, timeplayed, winner;
    
    @FXML
    private Button button00;
    
    @FXML
    private Button button01;
    
    @FXML
    private Button button02;

    @FXML
    private Button button03;

    @FXML
    private Button button04;

    @FXML
    private Button button05;

    @FXML
    private Button button06;

    @FXML
    private Button button07;

    @FXML
    private Button button08;

    @FXML
    private Button button10;

    @FXML
    private Button button11;

    @FXML
    private Button button12;

    @FXML
    private Button button13;

    @FXML
    private Button button14;

    @FXML
    private Button button15;

    @FXML
    private Button button16;

    @FXML
    private Button button17;

    @FXML
    private Button button18;

    @FXML
    private Button button20;

    @FXML
    private Button button21;

    @FXML
    private Button button22;

    @FXML
    private Button button23;

    @FXML
    private Button button24;

    @FXML
    private Button button25;

    @FXML
    private Button button26;

    @FXML
    private Button button27;

    @FXML
    private Button button28;

    @FXML
    private Button button30;

    @FXML
    private Button button31;

    @FXML
    private Button button32;

    @FXML
    private Button button33;

    @FXML
    private Button button34;

    @FXML
    private Button button35;

    @FXML
    private Button button36;

    @FXML
    private Button button37;

    @FXML
    private Button button38;

    @FXML
    private Button button40;

    @FXML
    private Button button41;

    @FXML
    private Button button42;

    @FXML
    private Button button43;

    @FXML
    private Button button44;

    @FXML
    private Button button45;

    @FXML
    private Button button46;

    @FXML
    private Button button47;

    @FXML
    private Button button48;

    @FXML
    private Button button50;

    @FXML
    private Button button51;

    @FXML
    private Button button52;

    @FXML
    private Button button53;

    @FXML
    private Button button54;

    @FXML
    private Button button55;

    @FXML
    private Button button56;

    @FXML
    private Button button57;

    @FXML
    private Button button58;

    @FXML
    private Button button60;

    @FXML
    private Button button61;

    @FXML
    private Button button62;

    @FXML
    private Button button63;

    @FXML
    private Button button64;

    @FXML
    private Button button65;

    @FXML
    private Button button66;

    @FXML
    private Button button67;

    @FXML
    private Button button68;

    @FXML
    private Button button70;

    @FXML
    private Button button71;

    @FXML
    private Button button72;

    @FXML
    private Button button73;

    @FXML
    private Button button74;

    @FXML
    private Button button75;

    @FXML
    private Button button76;

    @FXML
    private Button button77;

    @FXML
    private Button button78;

    @FXML
    private Button button80;

    @FXML
    private Button button81;

    @FXML
    private Button button82;

    @FXML
    private Button button83;

    @FXML
    private Button button84;

    @FXML
    private Button button85;

    @FXML
    private Button button86;

    @FXML
    private Button button87;

    @FXML
    private Button button88;
    
    @FXML
    public GridPane GridPane;
    
	@FXML
	public TextField tftitle;
	
    @FXML
    public TextField bombsfield;

    @FXML
    public TextField flagsfield;

    @FXML
    public TextField timefield;
    
    @FXML
    public TextField scenar;
    
    @FXML
    public TextField trou;
    

    @FXML
    private TextField difficultyfield;

    @FXML
    private TextField hyperbofield;

    @FXML
    private TextField numbombsfield;

    @FXML
    private TextField scenarioidfield;

    @FXML
    private TextField timesecfield;
    
    @FXML
    private Label label;
    
    @FXML
    private TextField bomb1;

    @FXML
    private TextField bomb2;

    @FXML
    private TextField bomb3;

    @FXML
    private TextField bomb4;

    @FXML
    private TextField bomb5;

    @FXML
    private TextField c1;

    @FXML
    private TextField c2;

    @FXML
    private TextField c3;

    @FXML
    private TextField c4;

    @FXML
    private TextField c5;

    @FXML
    private TextField t1;

    @FXML
    private TextField t2;

    @FXML
    private TextField t3;

    @FXML
    private TextField t4;

    @FXML
    private TextField t5;

    @FXML
    private TextField w1;

    @FXML
    private TextField w2;

    @FXML
    private TextField w3;

    @FXML
    private TextField w4;

    @FXML
    private TextField w5;

    @FXML
    void show(ActionEvent event) 
    throws FileNotFoundException{
    	Scanner sc2= new Scanner(new File("history.txt"));
    	for (int i = 0; i<5; i++) {
    		if (sc2.hasNextInt()) {  
    		if (i==0){
    			bomb1.setText(sc2.nextInt()+"");
    			c1.setText(sc2.nextInt()+"");
    			t1.setText(sc2.nextInt()+"");
    			if (sc2.nextInt()==0) w1.setText("You");
    			else w1.setText("Pc");
    			}
    		else if (i==1){
    			bomb2.setText(sc2.nextInt()+"");
    			c2.setText(sc2.nextInt()+"");
    			t2.setText(sc2.nextInt()+"");
    			if (sc2.nextInt()==0) w2.setText("You");
    			else w2.setText("Pc");
    			}
    		if (i==2){
    			bomb3.setText(sc2.nextInt()+"");
    			c3.setText(sc2.nextInt()+"");
    			t3.setText(sc2.nextInt()+"");
    			if (sc2.nextInt()==0) w3.setText("You");
    			else w3.setText("Pc");
    			}
    		if (i==3){
    			bomb4.setText(sc2.nextInt()+"");
    			c4.setText(sc2.nextInt()+"");
    			t4.setText(sc2.nextInt()+"");
    			if (sc2.nextInt()==0) w4.setText("You");
    			else w4.setText("Pc");
    			}
    		if (i==4){
    			bomb5.setText(sc2.nextInt()+"");
    			c5.setText(sc2.nextInt()+"");
    			t5.setText(sc2.nextInt()+"");
    			if (sc2.nextInt()==0) w5.setText("You");
    			else w5.setText("Pc");
    			}
    	}
    	}
    }

	
	@FXML
    void create(ActionEvent event)
		throws InvalidDescriptionException, InvalidValueException, FileNotFoundException, IOException{
			Parent root = FXMLLoader.load(getClass().getResource("Createscenario.fxml"));
	        Scene scene = new Scene(root);
	        Stage stage = new Stage();
	        stage.setTitle("Create Scenario");
	        stage.setScene(scene);
	        stage.show();
    }
	
	 @FXML
	    void okclicked(ActionEvent event) 
		 throws FileNotFoundException, IOException{
				//example = scenar.getText();
		        System.out.println(scenarioidfield.getText());
		        Writer wr = new FileWriter(new File(scenarioidfield.getText()+".txt"));
		        wr.write(difficultyfield.getText()+"\n");
		        wr.write(numbombsfield.getText()+"\n");
		        wr.write(timesecfield.getText()+"\n");
		        wr.write(hyperbofield.getText()+"\n");
				wr.close();
				((Stage)(((Button)event.getSource()).getScene().getWindow())).close();

	    }
	
	@FXML
    void start(ActionEvent event) 
    		throws InvalidDescriptionException, InvalidValueException, FileNotFoundException{
		Button[][] board = {{button00, button01, button02, button03, button04, button05, button06, button07, button08},
   			 {button10, button11, button12, button13, button14, button15, button16, button17, button18},
   			 {button20, button21, button22, button23, button24, button25, button26, button27, button28},
   			 {button30, button31, button32, button33, button34, button35, button36, button37, button38},
   			 {button40, button41, button42, button43, button44, button45, button46, button47, button48},
   			 {button50, button51, button52, button53, button54, button55, button56, button57, button58},
   			 {button60, button61, button62, button63, button64, button65, button66, button67, button68},
   			 {button70, button71, button72, button73, button74, button75, button76, button77, button78},
   			 {button80, button81, button82, button83, button84, button85, button86, button87, button88}};
		System.out.println(example);
		Scanner sc1= new Scanner(new File("SCENARIO-ID.txt"));
		if (!sc1.hasNextInt()) throw new InvalidDescriptionException("Input file must contain 1 integer");
		int sid = sc1.nextInt();
		try {
		Scanner sc= new Scanner(new File(sid+".txt"));
		if (!sc.hasNextInt()) throw new InvalidDescriptionException("Input file must contain 4 integers");
		int a=sc.nextInt();
		if (a != 1 && a != 2) throw new InvalidValueException("Difficulty level must be 1 or 2");
		if (!sc.hasNextInt()) throw new InvalidDescriptionException("Input file must contain 4 integers");
		int b=sc.nextInt();
		if ((a==1 && (b < 9 || b > 11))) throw new InvalidValueException("Bombs for difficulty level 1 must be in range 9-11");
		if ((a == 2 && (b < 35 || b > 45))) throw new InvalidValueException("Bombs for difficulty level 2 must be in range 35-45");
		if (!sc.hasNextInt()) throw new InvalidDescriptionException("Input file must contain 4 integers");
		int c=sc.nextInt();
		if ((a==1 && (c < 120 || c > 180))) throw new InvalidValueException("Timer for difficulty level 1 must be 120-180 sec");
		if ((a==2 && (c < 240 || c > 360))) throw new InvalidValueException("Timer for difficulty level 2 must be 240-360 sec");
		if (!sc.hasNextInt()) throw new InvalidDescriptionException("Input file must contain 4 integers");
		int d=sc.nextInt();
		if (d != 0 && d != 1) throw new InvalidValueException("Hyperbombs must be 0 or 1");
		if (a==1 && d!=0) throw new InvalidValueException("There can't be a hyperbomb for difficulty level 1");
		difficulty = a;
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
    	bombcount = b;
    	timerseconds = c;
    	timeplayed = c;
    	if (d==0) hyperbomb = false;
    	else hyperbomb = true;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		flagsfield.setText(""+flagcnt);
		flagsfield.setStyle("-fx-opacity: 1");
		bombsfield.setText(""+bombcount);
		bombsfield.setStyle("-fx-opacity: 1");
		timefield.setText(""+timerseconds);
		timefield.setStyle("-fx-opacity: 1");
		flagcnt=0;
		activeflagcnt=0;
		attempts = 0;
		startGame(); 
		for (int i=0; i<arraydimension; i++) {
			for (int j=0; j<arraydimension; j++) {
				board[i][j].setText("");
				board[i][j].setStyle(null);
				board[i][j].setDisable(false);
			}
		}
		starttimer();
		}
		catch (FileNotFoundException e) {
			Alert a1 = new Alert(Alert.AlertType.INFORMATION);
	        a1.setHeaderText("Scenario doesn't exist");
	        a1.showAndWait();
		}
    }
	@FXML
	void load(ActionEvent actionEvent)
			throws InvalidDescriptionException, InvalidValueException, FileNotFoundException, IOException{
		Parent root = FXMLLoader.load(getClass().getResource("loadscenario.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Load Scenario");
        stage.setScene(scene);
        stage.show();

	}
	
	@FXML
    void loadsenarioid(ActionEvent event) 
    		throws FileNotFoundException, IOException{
		example = scenar.getText();
        System.out.println(scenar.getText());
        Writer wr = new FileWriter(new File("SCENARIO-ID.txt"));
        wr.write(scenar.getText());
//		wr.write(""+1+"\n");
//		wr.write(""+9+"\n");
//		wr.write(""+120+"\n");
//		wr.write(""+0+"\n");
		wr.close();
		((Stage)(((Button)event.getSource()).getScene().getWindow())).close();

    }
	
	@FXML
	public void exit(ActionEvent actionEvent) {
        Alert a1 = new Alert(AlertType.INFORMATION);
        a1.setHeaderText("Thank you for playing!");
        a1.showAndWait();
        System.exit(0);
    }
	
	 @FXML
	    void solution(ActionEvent event) {
		 displayHidden();
		 winner = 1;
		 System.out.println(bombcount + " "+ attempts + " " + (timeplayed - timerseconds) + " "+ winner+ "\n");
		 writestatistics();
         System.out.print("============GAME OVER============");
         label.setText("GAME OVER");
         sched=false;
	    }
	 
	 @FXML
	 void rounds(ActionEvent event) 
	    		throws InvalidDescriptionException, InvalidValueException, FileNotFoundException, IOException{
			Parent root = FXMLLoader.load(getClass().getResource("Rounds.fxml"));
	        Scene scene = new Scene(root);
	        Stage stage = new Stage();
	        stage.setTitle("Rounds History");
	        stage.setScene(scene);
	        stage.show();
	    }
	
	
	
	//public Button[][] board = {{button00, button01, button02, button03, button04, button05, button06, button07, button08}};
	
    @FXML
    void mouseEntered(MouseEvent e) {
    	 Button[][] board = {{button00, button01, button02, button03, button04, button05, button06, button07, button08},
    			 {button10, button11, button12, button13, button14, button15, button16, button17, button18},
    			 {button20, button21, button22, button23, button24, button25, button26, button27, button28},
    			 {button30, button31, button32, button33, button34, button35, button36, button37, button38},
    			 {button40, button41, button42, button43, button44, button45, button46, button47, button48},
    			 {button50, button51, button52, button53, button54, button55, button56, button57, button58},
    			 {button60, button61, button62, button63, button64, button65, button66, button67, button68},
    			 {button70, button71, button72, button73, button74, button75, button76, button77, button78},
    			 {button80, button81, button82, button83, button84, button85, button86, button87, button88}};
    	//button00.setText("troll");
    	//Button[][] board = {{button00, button01, button02, button03, button04, button05, button06, button07, button08}};
    	String check = (((Control) e.getSource()).getId());
    	System.out.println(check);
    	if(e.getButton()== MouseButton.SECONDARY) {
    		System.out.println("right click pressed");
    		m = 1;
    	}
    	else {m=0;}
    	char x = (check.charAt(6));
    	char y = (check.charAt(7));
    	i = Character.getNumericValue(x);
    	j = Character.getNumericValue(y);
    	//System.out.println(i+","+j);
    	//System.out.println(board[i][j]);
    	//if (cou!=1) 
    	System.out.println(i+","+j);
    	attempts++;
    	//System.out.println(board[i][j]);
    	boolean flag = playMove();
        if (flag) displayVisible();
        
        if(checkWin())
        {
            displayHidden();
            winner = 0;
            System.out.println("\n================You WON!!!================");
            writestatistics();
            sched=false;
            label.setText("Congratulations!You WON!");
            //break;
        }
    	//System.out.println(i+","+j);
    	//System.out.println(board[i][j]);
    	//board[i][j].setText("hi");
    	//board[x][y].setStyle("-fx-background-color: #ff0000; ");
    	//board[x][y].setStyle("-fx-text-fill: #ff0000");
    	//board[i][j].setDisable(true);
    	//board[i][j].setStyle("-fx-opacity: 1;"+
    	//"-fx-text-fill: #ff0000;"+
    	//"-fx-background-color: #ffffff;");
    	//board[x][y].setStyle("-fx-text-fill: #ff0000");
    	System.out.println(i+","+j);
    	//displayVisible();
    	//Node source = (Node)e.getSource() ;
        //int colIndex = GridPane.getColumnIndex((Node) e.getTarget());
        //flagsfield.setText(""+colIndex);
        //int rowIndex = GridPane.getRowIndex((Node) e.getTarget());
        //System.out.println("Mouse entered cell "+ colIndex+ rowIndex);
    }
	
	 public void displayVisible()
	    {   
		 Button[][] board = {{button00, button01, button02, button03, button04, button05, button06, button07, button08},
    			 {button10, button11, button12, button13, button14, button15, button16, button17, button18},
    			 {button20, button21, button22, button23, button24, button25, button26, button27, button28},
    			 {button30, button31, button32, button33, button34, button35, button36, button37, button38},
    			 {button40, button41, button42, button43, button44, button45, button46, button47, button48},
    			 {button50, button51, button52, button53, button54, button55, button56, button57, button58},
    			 {button60, button61, button62, button63, button64, button65, button66, button67, button68},
    			 {button70, button71, button72, button73, button74, button75, button76, button77, button78},
    			 {button80, button81, button82, button83, button84, button85, button86, button87, button88}};
		    System.out.println(i+","+j);
	    	//System.out.println(board[i][j]);
//		    board[i][j+2].setStyle("-fx-opacity: 1;"+
//		        	"-fx-text-fill: #ff0000;"+
//		        	"-fx-background-color: #ffffff;");
		    System.out.print("\t ");
	        for(int i=0; i<arraydimension; i++)
	        {
	            System.out.print(" " + i + "  ");
	        }
	        System.out.print("\n");
	        for(int i=0; i<arraydimension; i++)
	        {
	            System.out.print(i + "\t| ");
	            for(int j=0; j<arraydimension; j++)
	            {
	                if(fieldVisible[i][j]==0)
	                {
	                    System.out.print("?");
	                    board[i][j].setText("");
	                    
	                }
	                else if(fieldVisible[i][j]==50)
	                {
	                    System.out.print(" ");
	                    board[i][j].setDisable(true);
	                    board[i][j].setText("");
	                    board[i][j].setStyle("-fx-opacity: 1;"+
	                	"-fx-text-fill: #ff0000;"+
	                	"-fx-background-color: #ffffff;");
	                }
	                else if(fieldVisible[i][j]==20) {
	                	System.out.print("F");
	                	board[i][j].setText("F");
	                }
	                else if(fieldVisible[i][j]==100)
	                {
	                    System.out.print("X");
	                    board[i][j].setDisable(true);
	                    board[i][j].setText("X");
	                    board[i][j].setStyle("-fx-opacity: 1;"+
	    	                	"-fx-text-fill: #ff0000;"+
	    	                	"-fx-background-color: #ffffff;");
	                    
	                }
	                else if(fieldVisible[i][j]==200)
	                {
	                    System.out.print("B");
	                    board[i][j].setDisable(true);
	                    board[i][j].setText("B");
	                    board[i][j].setStyle("-fx-opacity: 1;"+
	    	                	"-fx-text-fill: #ff0000;"+
	    	                	"-fx-background-color: #ffffff;");
	                }
	                else
	                {
	                    System.out.print(fieldVisible[i][j]);
	                    board[i][j].setDisable(true);
	                    board[i][j].setText(""+fieldVisible[i][j]);
	                    board[i][j].setStyle("-fx-opacity: 1;"+
	    	                	"-fx-text-fill: #ff0000;"+
	    	                	"-fx-background-color: #ffffff;");
	                }
	                System.out.print(" | ");
	            }
	            System.out.print("\n");
	        }
	    }

	    public void displayHidden()
	    {   
	    	Button[][] board = {{button00, button01, button02, button03, button04, button05, button06, button07, button08},
	    			 {button10, button11, button12, button13, button14, button15, button16, button17, button18},
	    			 {button20, button21, button22, button23, button24, button25, button26, button27, button28},
	    			 {button30, button31, button32, button33, button34, button35, button36, button37, button38},
	    			 {button40, button41, button42, button43, button44, button45, button46, button47, button48},
	    			 {button50, button51, button52, button53, button54, button55, button56, button57, button58},
	    			 {button60, button61, button62, button63, button64, button65, button66, button67, button68},
	    			 {button70, button71, button72, button73, button74, button75, button76, button77, button78},
	    			 {button80, button81, button82, button83, button84, button85, button86, button87, button88}};
	        System.out.print("\t ");
	        for(int i=0; i<arraydimension; i++)
	        {
	            System.out.print(" " + i + "  ");
	        }
	        System.out.print("\n");
	        for(int i=0; i<arraydimension; i++)
	        {
	            System.out.print(i + "\t| ");
	            for(int j=0; j<arraydimension; j++)
	            {
	                if(fieldHidden[i][j]==0)
	                {
	                    System.out.print(" ");
	                    board[i][j].setDisable(true);
	                    board[i][j].setText("");
	                    board[i][j].setStyle("-fx-opacity: 1;"+
	    	                	"-fx-text-fill: #ff0000;"+
	    	                	"-fx-background-color: #ffffff;");
	                }
	                else if(fieldHidden[i][j]==100)
	                {
	                    System.out.print("X");
	                    board[i][j].setDisable(true);
	                    board[i][j].setText("X");
	                    board[i][j].setStyle("-fx-opacity: 1;"+
	    	                	"-fx-text-fill: #ff0000;"+
	    	                	"-fx-background-color: #ffffff;");
	                }
	                else if(fieldHidden[i][j]==200)
	                {
	                    System.out.print("B");
	                    board[i][j].setDisable(true);
	                    board[i][j].setText("B");
	                    board[i][j].setStyle("-fx-opacity: 1;"+
	    	                	"-fx-text-fill: #ff0000;"+
	    	                	"-fx-background-color: #ffffff;");
	                }
	                else
	                {
	                    System.out.print(fieldHidden[i][j]);
	                    board[i][j].setDisable(true);
	                    board[i][j].setText(""+fieldHidden[i][j]);
	                    board[i][j].setStyle("-fx-opacity: 1;"+
	    	                	"-fx-text-fill: #ff0000;"+
	    	                	"-fx-background-color: #ffffff;");
	                }
	                System.out.print(" | ");
	            }
	            System.out.print("\n");
	        }
	    }

	    public void fixVisible(int i, int j)
	    {   if (fieldVisible[i][j] == 0 || fieldVisible[i][j]==20) {
	        fieldVisible[i][j] = 50;
	        if(i!=0)
	        {   
	        	if (fieldVisible[i-1][j] == 0 || fieldVisible[i-1][j] == 20) {
	            fieldVisible[i-1][j] = fieldHidden[i-1][j];
	            if(fieldVisible[i-1][j]==0 || fieldVisible[i-1][j] == 20) fixVisible(i-1,j);
	            	//fieldVisible[i-1][j] = 50;
	        	}
	            if(j!=0)
	            {
	            	if (fieldVisible[i-1][j-1] == 0 || fieldVisible[i-1][j-1] == 20) {
	                fieldVisible[i-1][j-1] = fieldHidden[i-1][j-1];
	                if(fieldVisible[i-1][j-1]==0 || fieldVisible[i-1][j-1] == 20) fixVisible(i-1,j-1);
	                	//fieldVisible[i-1][j-1]=50;
	            	}
	            }
	        }
	        if(i!=(arraydimension-1))
	        {
	        	if (fieldVisible[i+1][j] == 0 || fieldVisible[i+1][j] == 20) {
	            fieldVisible[i+1][j]=fieldHidden[i+1][j];
	            if(fieldVisible[i+1][j]==0 || fieldVisible[i+1][j]==20) fixVisible(i+1,j); 
	            	//fieldVisible[i+1][j]=50;
	        	}
	            if(j!=(arraydimension-1))
	            {
	            	if (fieldVisible[i+1][j+1] == 0 || fieldVisible[i+1][j+1] == 20) {
	                fieldVisible[i+1][j+1]= fieldHidden[i+1][j+1];
	                if(fieldVisible[i+1][j+1]==0 || fieldVisible[i+1][j+1] == 20) fixVisible(i+1,j+1);
	                //fieldVisible[i+1][j+1] = 50;
	            	}
	            }
	        }
	        if(j!=0)
	        {   
	        	if (fieldVisible[i][j-1] == 0 || fieldVisible[i][j-1] == 20) {
	            fieldVisible[i][j-1]=fieldHidden[i][j-1];
	            if(fieldVisible[i][j-1]==0 || fieldVisible[i][j-1] == 20) fixVisible(i,j-1);
	            //fieldVisible[i][j-1] = 50;
	        	}
	            if(i!=(arraydimension-1))
	            {
	            	if (fieldVisible[i+1][j-1]==0 || fieldVisible[i+1][j-1] == 20) {
	                fieldVisible[i+1][j-1]=fieldHidden[i+1][j-1];
	                if(fieldVisible[i+1][j-1]==0 || fieldVisible[i+1][j-1] == 20) fixVisible(i+1,j-1);
	                //fieldVisible[i+1][j-1] = 50;
	            	}
	            }
	        }
	        if(j!=(arraydimension-1))
	        {
	        	if (fieldVisible[i][j+1] == 0 || fieldVisible[i][j+1] == 20) {
	            fieldVisible[i][j+1]=fieldHidden[i][j+1];
	            if(fieldVisible[i][j+1]==0 || fieldVisible[i][j+1] == 20) fixVisible(i, j+1);
	            //fieldVisible[i][j+1] = 50;
	        	}
	            if(i!=0)
	            {
	            	if (fieldVisible[i-1][j+1] == 0 || fieldVisible[i-1][j+1] == 20) {
	                fieldVisible[i-1][j+1]=fieldHidden[i-1][j+1];
	                if(fieldVisible[i-1][j+1]==0 || fieldVisible[i-1][j+1] == 20) fixVisible(i-1,j+1);
	                //fieldVisible[i-1][j+1] = 50;
	            	}
	            }
	        }
	    }
	    }

	    public void fixNeighbours(int i, int j)
	    {
	        fieldVisible[i][j] = fieldHidden[i][j];
	    }

	    public boolean playMove()
	    {
//	        Scanner sc= new Scanner(System.in);
//	        System.out.print("\nEnter action(0 for left click 1 for right click flag):");
//	        int m=sc.nextInt();
//	        System.out.print("Enter Row Number: ");
//	        int i= sc.nextInt();
//	        System.out.print("Enter Column Number: ");
//	        int j= sc.nextInt();

	        if(i<0 || i>(arraydimension-1) || j<0 || j>(arraydimension-1) || (fieldVisible[i][j]!=0 && fieldVisible[i][j]!=20) ||( m!=0 && m!=1))
	        {
	            System.out.print("\nIncorrect Input!!");
	            return true;
	        }
	        
	        if (m==0) {
	      /*	if (fieldVisible[i][j]==20) {
	        	System.out.print("\nIncorrect Input!!");
	        	return true;
	        }*/
	        if(fieldHidden[i][j]==100 || fieldHidden[i][j]==200)
	        {
	            displayHidden();
	            winner = 1;
	            System.out.print("Oops! You stepped on a mine!\n============GAME OVER============");
	            writestatistics();
	            label.setText("You stepped on a mine!");
	            sched = false;
	            return false;
	        }
	        else if(fieldHidden[i][j]==0)
	        {
	            fixVisible(i, j);
	        }
	        else
	        {
	            fixNeighbours(i, j);
	        }
	        }
	        else {
	        	if (fieldVisible[i][j]==0) {
	        		flagcnt++;
	        		activeflagcnt++;
	        		flagsfield.setText(activeflagcnt+"");
	        		System.out.println(activeflagcnt+"hello");
	        	    fieldVisible[i][j] = 20;
	        	    if (fieldHidden[i][j] == 200 && flagcnt <= 4) {
	        	    	for (int k=0; k<arraydimension; k++) {
	        	    		fieldVisible[i][k] = fieldHidden[i][k];
	        	    				if (fieldVisible[i][k]==0) fieldVisible[i][k]=50;
	        	    	}
	        	    	for (int u=0; u<arraydimension; u++) {
	        	    		fieldVisible[u][j] = fieldHidden[u][j];
	        	    		if (fieldVisible[u][j]==0) fieldVisible[u][j]=50;
	        	    	}
	        	    }
	        	}  	
	        	else if (fieldVisible[i][j]==20) {
	        		fieldVisible[i][j] = 0;
	        	activeflagcnt--;
	        	flagsfield.setText(activeflagcnt+"");
        		System.out.println(activeflagcnt+"hello");
	        	}
	        }

	        return true;
	    }

	    public void buildHidden()
	    {
	        for(int i=0; i<arraydimension; i++)
	        {
	            for(int j=0; j<arraydimension; j++)
	            {
	                int cnt=0;
	                if(fieldHidden[i][j]!=100 && fieldHidden[i][j]!=200)
	                {

	                    if(i!=0)
	                    {
	                        if(fieldHidden[i-1][j]==100 || fieldHidden[i-1][j]==200) cnt++;
	                        if(j!=0)
	                        {
	                            if(fieldHidden[i-1][j-1]==100 || fieldHidden[i-1][j-1]==200) cnt++;
	                        }

	                    }
	                    if(i!=(arraydimension-1))
	                    {
	                        if(fieldHidden[i+1][j]==100 || fieldHidden[i+1][j]==200) cnt++;
	                        if(j!=(arraydimension-1))
	                        {
	                            if(fieldHidden[i+1][j+1]==100 || fieldHidden[i+1][j+1]==200) cnt++;
	                        }
	                    }
	                    if(j!=0)
	                    {
	                        if(fieldHidden[i][j-1]==100 || fieldHidden[i][j-1]==200) cnt++;
	                        if(i!=(arraydimension-1))
	                        {
	                            if(fieldHidden[i+1][j-1]==100 || fieldHidden[i+1][j-1]==200) cnt++;
	                        }
	                    }
	                    if(j!=(arraydimension-1))
	                    {
	                        if(fieldHidden[i][j+1]==100 || fieldHidden[i][j+1]==200) cnt++;
	                        if(i!=0)
	                        {
	                            if(fieldHidden[i-1][j+1]==100 || fieldHidden[i-1][j+1]==200) cnt++;
	                        }
	                    }

	                    fieldHidden[i][j] = cnt;
	                }
	            }
	        }

	        //displayHidden();
	    }

	    public void setupField(int diff)
	    {
	        int var=0;
	        String data="";
	        while(var!=bombcount)
	        {
	            Random random = new Random();
	            int i = random.nextInt(arraydimension);
	            int j = random.nextInt(arraydimension);
	            //System.out.println("i: " + i + " j: " + j);
	            if (var==(bombcount-1) && hyperbomb) {
	            	fieldHidden[i][j] = 200;
	            	data = data + i+","+j+","+1+"\n";
	            }
	            else {
	            fieldHidden[i][j] = 100;
					data = data + i+","+j+","+0+"\n";
	            }
					//System.out.println(data);
	            var++;
	        }
	        try {
	        FileOutputStream file = new FileOutputStream("output.txt");			// Creates a FileOutputStream
			BufferedOutputStream output = new BufferedOutputStream(file);		// Creates a BufferedOutputStream
			
			byte[] array = data.getBytes();
			output.write(array);												// Writes data to the output stream
			
			output.close();
		     }
		    catch (Exception ex) {
			     ex.getStackTrace();
		      }
	             buildHidden();
	    }
	    
	    public void writestatistics() {
	    	String data = "";
			try{
				FileInputStream file = new FileInputStream("history.txt");			//Creates a FileInputStream
				BufferedInputStream input = new BufferedInputStream(file);			//Creates a BufferedInputStream
				int i = input.read();												//Reads first byte from file
				while (i != -1) {
					data = data + (char) i;
					System.out.print(data + (char) i);
					i = input.read();												//Reads next byte from the file
				}
			
				input.close();
			}
			
			catch (Exception ex) {
				ex.getStackTrace();
			}
			try {
				
				//String data = "This is a line of text inside the file";
				String example = bombcount + " "+ attempts + " " + (timeplayed - timerseconds) + " "+ winner+ "\n";
				String fstr = example + data;
				FileOutputStream file = new FileOutputStream("history.txt");			// Creates a FileOutputStream
				BufferedOutputStream output = new BufferedOutputStream(file);		// Creates a BufferedOutputStream
				
				byte[] array = fstr.getBytes();
				output.write(array);												// Writes data to the output stream
				
				output.close();
			}
			catch (Exception ex) {
				ex.getStackTrace();
			}
	    }

	    public boolean checkWin()
	    {
	        for(int i=0; i<arraydimension; i++)
	        {
	            for(int j=0; j<arraydimension; j++)
	            {
	                if(fieldVisible[i][j]==0)
	                {
	                    if(fieldHidden[i][j]!=100 && fieldHidden[i][j]!=200)
	                    {
	                        return false;
	                    }
	                }
	            }
	        }
	        return true;
	    }

	    public void startGame()
	    {
	        System.out.println("\n\n================Welcome to Minesweeper ! ================\n");
	        for (int i=0; i<arraydimension; i++) {
	        	for (int j=0; j<arraydimension; j++) {
	        		fieldVisible[i][j]=0;
	        		fieldHidden[i][j]=0;
	        	}
	        }
	        setupField(1);
	        boolean timerstart = true;
	        //CountTimer timer = new CountTimer(timerseconds);

	        boolean flag = true;
	        //while(flag)
	        //{
	            displayVisible();
	            //flag = playMove();
	            //displayVisible();
	            //if (timerstart) timer.starttimer();
	            timerstart = false;
	            //timer.printtimer();
//	            if (timer.checktimerend()) {
//	            	displayHidden();
//	            	System.out.println("\n-------Time out! You LOST!-------");
//	            	break;
//	            }
//	            if(checkWin())
//	            {
//	                displayHidden();
//	                System.out.println("\n================You WON!!!================");
//	                //break;
//	            }
	        }
	    public void starttimer(){
	        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
	        sched = true;
	        final Runnable runnable = new Runnable() {

	            public void run() {
	            	if (!sched) scheduler.shutdown();
	            	timefield.setText(timerseconds+"");
	                System.out.println(timerseconds);
	                timerseconds--;

	                if (timerseconds < 0) {
	                	winner = 1;
	                    System.out.println("Timer Over!");
	                    scheduler.shutdown();
	                    displayHidden();
	                    writestatistics();
	                    System.out.println("Time out!You lost");
	                }
	                
	          
	            }
	        };
	        scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);
	    }
	   // }
}
