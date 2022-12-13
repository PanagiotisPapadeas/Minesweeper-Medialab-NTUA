package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Pair;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.Control;
import javafx.scene.Parent;
import javafx.scene.Scene;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.awt.MenuItem;
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
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import javafx.event.ActionEvent;

public class MainSceneController {
	
    public int difficulty;
    public int bombcount;
    public int timerseconds;
    public boolean hyperbomb;
    public int[][] VisibleGrid;
    public int[][] HiddenGrid;
    public int arraydimension;
    public int flagcnt;
    public int activeflagcnt;
    public int i;
    public int j;
    public int m;
    public String example;
    public int cou;
    public boolean sched;
    public int attempts, timeplayed, winner, c;

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
    private Button button09;
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
    private Button button19;
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
    private Button button29;
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
    private Button button39;
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
    private Button button49;
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
    private Button button59;
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
    private Button button69;
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
    private Button button79;
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
    private Button button89;
    @FXML
    private Button button90;
    @FXML
    private Button button91;
    @FXML
    private Button button92;
    @FXML
    private Button button93;
    @FXML
    private Button button94;
    @FXML
    private Button button95;
    @FXML
    private Button button96;
    @FXML
    private Button button97;
    @FXML
    private Button button98;
    @FXML
    private Button button99;   
    @FXML
    private Button b0t10;
    @FXML
    private Button b0t11;
    @FXML
    private Button b0t12;
    @FXML
    private Button b0t13;
    @FXML
    private Button b0t14;
    @FXML
    private Button b0t15;
    @FXML
    private Button b10t0;
    @FXML
    private Button b10t1;
    @FXML
    private Button b10t10;
    @FXML
    private Button b10t11;
    @FXML
    private Button b10t12;
    @FXML
    private Button b10t13;
    @FXML
    private Button b10t14;
    @FXML
    private Button b10t15;
    @FXML
    private Button b10t2;
    @FXML
    private Button b10t3;
    @FXML
    private Button b10t4;
    @FXML
    private Button b10t5;
    @FXML
    private Button b10t6;
    @FXML
    private Button b10t7;
    @FXML
    private Button b10t8;
    @FXML
    private Button b10t9;
    @FXML
    private Button b11t0;
    @FXML
    private Button b11t1;
    @FXML
    private Button b11t10;
    @FXML
    private Button b11t11;
    @FXML
    private Button b11t12;
    @FXML
    private Button b11t13;
    @FXML
    private Button b11t14;
    @FXML
    private Button b11t15;
    @FXML
    private Button b11t2;
    @FXML
    private Button b11t3;
    @FXML
    private Button b11t4;
    @FXML
    private Button b11t5;
    @FXML
    private Button b11t6;
    @FXML
    private Button b11t7;
    @FXML
    private Button b11t8;
    @FXML
    private Button b11t9;
    @FXML
    private Button b12t0;
    @FXML
    private Button b12t1;
    @FXML
    private Button b12t10;
    @FXML
    private Button b12t11;
    @FXML
    private Button b12t12;
    @FXML
    private Button b12t13;
    @FXML
    private Button b12t14;
    @FXML
    private Button b12t15;
    @FXML
    private Button b12t2;
    @FXML
    private Button b12t3;
    @FXML
    private Button b12t4;
    @FXML
    private Button b12t5;
    @FXML
    private Button b12t6;
    @FXML
    private Button b12t7;
    @FXML
    private Button b12t8;
    @FXML
    private Button b12t9;
    @FXML
    private Button b13t0;
    @FXML
    private Button b13t1;
    @FXML
    private Button b13t10;
    @FXML
    private Button b13t11;
    @FXML
    private Button b13t12;
    @FXML
    private Button b13t13;
    @FXML
    private Button b13t14;
    @FXML
    private Button b13t15;
    @FXML
    private Button b13t2;
    @FXML
    private Button b13t3;
    @FXML
    private Button b13t4;
    @FXML
    private Button b13t5;
    @FXML
    private Button b13t6;
    @FXML
    private Button b13t7;
    @FXML
    private Button b13t8;
    @FXML
    private Button b13t9;
    @FXML
    private Button b14t0;
    @FXML
    private Button b14t1;
    @FXML
    private Button b14t10;
    @FXML
    private Button b14t11;
    @FXML
    private Button b14t12;
    @FXML
    private Button b14t13;
    @FXML
    private Button b14t14;
    @FXML
    private Button b14t15;
    @FXML
    private Button b14t2;
    @FXML
    private Button b14t3;
    @FXML
    private Button b14t4;
    @FXML
    private Button b14t5;
    @FXML
    private Button b14t6;
    @FXML
    private Button b14t7;
    @FXML
    private Button b14t8;
    @FXML
    private Button b14t9;
    @FXML
    private Button b15t0;
    @FXML
    private Button b15t1;
    @FXML
    private Button b15t10;
    @FXML
    private Button b15t11;
    @FXML
    private Button b15t12;
    @FXML
    private Button b15t13;
    @FXML
    private Button b15t14;
    @FXML
    private Button b15t15;
    @FXML
    private Button b15t2;
    @FXML
    private Button b15t3;
    @FXML
    private Button b15t4;
    @FXML
    private Button b15t5;
    @FXML
    private Button b15t6;
    @FXML
    private Button b15t7;
    @FXML
    private Button b15t8;
    @FXML
    private Button b15t9;
    @FXML
    private Button b1t10;
    @FXML
    private Button b1t11;
    @FXML
    private Button b1t12;
    @FXML
    private Button b1t13;
    @FXML
    private Button b1t14;
    @FXML
    private Button b1t15;
    @FXML
    private Button b2t10;
    @FXML
    private Button b2t11;
    @FXML
    private Button b2t12;
    @FXML
    private Button b2t13;
    @FXML
    private Button b2t14;
    @FXML
    private Button b2t15;
    @FXML
    private Button b3t10;
    @FXML
    private Button b3t11;
    @FXML
    private Button b3t12;
    @FXML
    private Button b3t13;
    @FXML
    private Button b3t14;
    @FXML
    private Button b3t15;
    @FXML
    private Button b4t10;
    @FXML
    private Button b4t11;
    @FXML
    private Button b4t12;
    @FXML
    private Button b4t13;
    @FXML
    private Button b4t14;
    @FXML
    private Button b4t15;
    @FXML
    private Button b5t10;
    @FXML
    private Button b5t11;
    @FXML
    private Button b5t12;
    @FXML
    private Button b5t13;
    @FXML
    private Button b5t14;
    @FXML
    private Button b5t15;
    @FXML
    private Button b6t10;
    @FXML
    private Button b6t11;
    @FXML
    private Button b6t12;
    @FXML
    private Button b6t13;
    @FXML
    private Button b6t14;
    @FXML
    private Button b6t15;
    @FXML
    private Button b7t10;
    @FXML
    private Button b7t11;
    @FXML
    private Button b7t12;
    @FXML
    private Button b7t13;
    @FXML
    private Button b7t14;
    @FXML
    private Button b7t15;
    @FXML
    private Button b8t10;
    @FXML
    private Button b8t11;
    @FXML
    private Button b8t12;
    @FXML
    private Button b8t13;
    @FXML
    private Button b8t14;
    @FXML
    private Button b8t15;
    @FXML
    private Button b9t10;
    @FXML
    private Button b9t11;
    @FXML
    private Button b9t12;
    @FXML
    private Button b9t13;
    @FXML
    private Button b9t14;
    @FXML
    private Button b9t15;    
    @FXML
    public GridPane Gridane;    
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
    private Button showb;    
    @FXML
    private MenuItem roundbut;
    @FXML
    private Text textfield;
    
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
		 throws FileNotFoundException, IOException, InvalidValueException{
		        System.out.println(scenarioidfield.getText());
		        int z;
		        try {
		        	z = Integer.parseInt(scenarioidfield.getText());
		        }
		        catch (Exception e) {
		        	throw new InvalidValueException("Scenario id must be an integer");
		        }
				int a = Integer.parseInt(difficultyfield.getText()); 
				if (a != 1 && a != 2) throw new InvalidValueException("Difficulty level must be 1 or 2");
				int b = Integer.parseInt(numbombsfield.getText()); 
				if ((a==1 && (b < 9 || b > 11))) throw new InvalidValueException("Bombs for difficulty level 1 must be in range 9-11");
				if ((a == 2 && (b < 35 || b > 45))) throw new InvalidValueException("Bombs for difficulty level 2 must be in range 35-45");
				int c = Integer.parseInt(timesecfield.getText());
				if ((a==1 && (c < 120 || c > 180))) throw new InvalidValueException("Timer for difficulty level 1 must be 120-180 sec");
				if ((a==2 && (c < 240 || c > 360))) throw new InvalidValueException("Timer for difficulty level 2 must be 240-360 sec");
				int d=Integer.parseInt(hyperbofield.getText());
				if (d != 0 && d != 1) throw new InvalidValueException("Hyperbombs must be 0 or 1");
				if (a==1 && d!=0) throw new InvalidValueException("There can't be a hyperbomb for difficulty level 1");
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
		if (sched == true) {
			Alert a1 = new Alert(Alert.AlertType.INFORMATION);
	        a1.setHeaderText("Finish the active game first or see solution");
	        a1.showAndWait();
		}
		else {
		Button[][] board = {{button00, button01, button02, button03, button04, button05, button06, button07, button08, button09, b0t10, b0t11, b0t12, b0t13, b0t14, b0t15},
   			 {button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, b1t10, b1t11, b1t12, b1t13, b1t14, b1t15},
   			 {button20, button21, button22, button23, button24, button25, button26, button27, button28, button29, b2t10, b2t11, b2t12, b2t13, b2t14, b2t15},
   			 {button30, button31, button32, button33, button34, button35, button36, button37, button38, button39, b3t10, b3t11, b3t12, b3t13, b3t14, b3t15},
   			 {button40, button41, button42, button43, button44, button45, button46, button47, button48, button49, b4t10, b4t11, b4t12, b4t13, b4t14, b4t15},
   			 {button50, button51, button52, button53, button54, button55, button56, button57, button58, button59, b5t10, b5t11, b5t12, b5t13, b5t14, b5t15},
   			 {button60, button61, button62, button63, button64, button65, button66, button67, button68, button69, b6t10, b6t11, b6t12, b6t13, b6t14, b6t15},
   			 {button70, button71, button72, button73, button74, button75, button76, button77, button78, button79, b7t10, b7t11, b7t12, b7t13, b7t14, b7t15},
   			 {button80, button81, button82, button83, button84, button85, button86, button87, button88, button89, b8t10, b8t11, b8t12, b8t13, b8t14, b8t15},
   			 {button90, button91, button92, button93, button94, button95, button96, button97, button98, button99, b9t10, b9t11, b9t12, b9t13, b9t14, b9t15},
   			 {b10t0, b10t1, b10t2, b10t3, b10t4, b10t5, b10t6, b10t7, b10t8, b10t9, b10t10, b10t11, b10t12, b10t13, b10t14, b10t15},
   			 {b11t0, b11t1, b11t2, b11t3, b11t4, b11t5, b11t6, b11t7, b11t8, b11t9, b11t10, b11t11, b11t12, b11t13, b11t14, b11t15 },
   			 {b12t0, b12t1, b12t2, b12t3, b12t4, b12t5, b12t6, b12t7, b12t8, b12t9, b12t10, b12t11, b12t12, b12t13, b12t14, b12t15 },
   			 {b13t0, b13t1, b13t2, b13t3, b13t4, b13t5, b13t6, b13t7, b13t8, b13t9, b13t10, b13t11, b13t12, b13t13, b13t14, b13t15 },
   			 {b14t0, b14t1, b14t2, b14t3, b14t4, b14t5, b14t6, b14t7, b14t8, b14t9, b14t10, b14t11, b14t12, b14t13, b14t14, b14t15 },
   			 {b15t0, b15t1, b15t2, b15t3, b15t4, b15t5, b15t6, b15t7, b15t8, b15t9, b15t10, b15t11, b15t12, b15t13, b15t14, b15t15 }};
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
		//if ((a==1 && (c < 120 || c > 180))) throw new InvalidValueException("Timer for difficulty level 1 must be 120-180 sec");
		//if ((a==2 && (c < 240 || c > 360))) throw new InvalidValueException("Timer for difficulty level 2 must be 240-360 sec");
		if (!sc.hasNextInt()) throw new InvalidDescriptionException("Input file must contain 4 integers");
		int d=sc.nextInt();
		if (d != 0 && d != 1) throw new InvalidValueException("Hyperbombs must be 0 or 1");
		if (a==1 && d!=0) throw new InvalidValueException("There can't be a hyperbomb for difficulty level 1");
		difficulty = a;
    	if (difficulty == 1) {
    	VisibleGrid = new int [9][9];
    	HiddenGrid = new int [9][9];
    	arraydimension=9;
    	}
    	else if (difficulty == 2) {
    		VisibleGrid = new int [16][16];
        	HiddenGrid = new int [16][16];
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
		textfield.setText("");
		flagcnt=0;
		activeflagcnt=0;
		attempts = 0;
		for (int i=0; i<16; i++) {
			for (int j=0; j<16; j++) {
				board[i][j].setText("");
				board[i][j].setStyle(null);
				board[i][j].setDisable(false);
			}
		}
		if(difficulty == 1) {
			for (int i=0; i<9; i++) {
				for (int j=9; j<16; j++) {
					board[i][j].setVisible(false);
				}
			}
			for (int i=9; i<16; i++) {
				for (int j=0; j<16; j++) {
				board[i][j].setVisible(false);
		  }
		}
		}
		else if (difficulty == 2) {
			for (int i=0; i<9; i++) {
				for (int j=9; j<16; j++) {
					board[i][j].setVisible(true);
				}
			}
			for (int i=9; i<16; i++) {
				for (int j=0; j<16; j++) {
				board[i][j].setVisible(true);
		  }
		}
		}
		startGame();
		System.out.println(board[10][10]);
		starttimer();
		}
		catch (FileNotFoundException e) {
			Alert a1 = new Alert(Alert.AlertType.INFORMATION);
	        a1.setHeaderText("Scenario doesn't exist");
	        a1.showAndWait();
		}
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
        //System.out.println(scenar.getText());
        Writer wr = new FileWriter(new File("SCENARIO-ID.txt"));
        wr.write(scenar.getText());
		wr.close();
		((Stage)(((Button)event.getSource()).getScene().getWindow())).close();

    }
	
	@FXML
	public void exit(ActionEvent actionEvent) {
		sched = false;
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
         textfield.setText("GAME OVER");
         sched=false;
	    }
	 
	 @FXML
	 void rounds(ActionEvent event) 
	    		throws InvalidDescriptionException, InvalidValueException, FileNotFoundException, IOException{
		 Parent root = FXMLLoader.load(getClass().getResource("Rounds.fxml"));
	        Scene scene = new Scene(root);
	        Stage stage = new Stage();
	        stage.setTitle("Create Scenario");
	        stage.setScene(scene);
	        stage.show();
	    }
	
    @FXML
    void mouseEntered(MouseEvent e) {
    	String check = (((Control) e.getSource()).getId());
    	System.out.println(check);
    	if(e.getButton()== MouseButton.SECONDARY) {
    		System.out.println("right click pressed");
    		m = 1;
    	}
    	else {m=0;}
    	if (check.length()==8) 
    	{
    	char x = (check.charAt(6));
    	char y = (check.charAt(7));
    	i = Character.getNumericValue(x);
    	j = Character.getNumericValue(y);
    	}
    	else {
    		int ind = check.indexOf("t");
    		System.out.println(ind+"ind");
    		String x = (check.substring(1,ind));
    		System.out.println(x+"string x");
    		String y = (check.substring((ind+1)));
    		System.out.println(y+"string y");
    		i=Integer.parseInt(x);
    		System.out.println(i+"i");
    		j=Integer.parseInt(y);
    		System.out.println(j+"j");
    	}
    	System.out.println(i+","+j);
    	attempts++;
    	boolean flag = playMove();
        if (flag) displayVisible();
        
        if(checkWin())
        {
            displayHidden();
            winner = 0;
            System.out.println("\n================You WON!!!================");
            writestatistics();
            sched=false;
            textfield.setText("Congratulations! You WON!");
        }
    }
	
	 public void displayVisible()
	    {   
		 Button[][] board = {{button00, button01, button02, button03, button04, button05, button06, button07, button08, button09, b0t10, b0t11, b0t12, b0t13, b0t14, b0t15},
	   			 {button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, b1t10, b1t11, b1t12, b1t13, b1t14, b1t15},
	   			 {button20, button21, button22, button23, button24, button25, button26, button27, button28, button29, b2t10, b2t11, b2t12, b2t13, b2t14, b2t15},
	   			 {button30, button31, button32, button33, button34, button35, button36, button37, button38, button39, b3t10, b3t11, b3t12, b3t13, b3t14, b3t15},
	   			 {button40, button41, button42, button43, button44, button45, button46, button47, button48, button49, b4t10, b4t11, b4t12, b4t13, b4t14, b4t15},
	   			 {button50, button51, button52, button53, button54, button55, button56, button57, button58, button59, b5t10, b5t11, b5t12, b5t13, b5t14, b5t15},
	   			 {button60, button61, button62, button63, button64, button65, button66, button67, button68, button69, b6t10, b6t11, b6t12, b6t13, b6t14, b6t15},
	   			 {button70, button71, button72, button73, button74, button75, button76, button77, button78, button79, b7t10, b7t11, b7t12, b7t13, b7t14, b7t15},
	   			 {button80, button81, button82, button83, button84, button85, button86, button87, button88, button89, b8t10, b8t11, b8t12, b8t13, b8t14, b8t15},
	   			 {button90, button91, button92, button93, button94, button95, button96, button97, button98, button99, b9t10, b9t11, b9t12, b9t13, b9t14, b9t15},
	   			 {b10t0, b10t1, b10t2, b10t3, b10t4, b10t5, b10t6, b10t7, b10t8, b10t9, b10t10, b10t11, b10t12, b10t13, b10t14, b10t15},
	   			 {b11t0, b11t1, b11t2, b11t3, b11t4, b11t5, b11t6, b11t7, b11t8, b11t9, b11t10, b11t11, b11t12, b11t13, b11t14, b11t15 },
	   			 {b12t0, b12t1, b12t2, b12t3, b12t4, b12t5, b12t6, b12t7, b12t8, b12t9, b12t10, b12t11, b12t12, b12t13, b12t14, b12t15 },
	   			 {b13t0, b13t1, b13t2, b13t3, b13t4, b13t5, b13t6, b13t7, b13t8, b13t9, b13t10, b13t11, b13t12, b13t13, b13t14, b13t15 },
	   			 {b14t0, b14t1, b14t2, b14t3, b14t4, b14t5, b14t6, b14t7, b14t8, b14t9, b14t10, b14t11, b14t12, b14t13, b14t14, b14t15 },
	   			 {b15t0, b15t1, b15t2, b15t3, b15t4, b15t5, b15t6, b15t7, b15t8, b15t9, b15t10, b15t11, b15t12, b15t13, b15t14, b15t15 }};
		    System.out.println(i+","+j);
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
	                if(VisibleGrid[i][j]==0)
	                {
	                    System.out.print("?");
	                    board[i][j].setText("");
	                    
	                }
	                else if(VisibleGrid[i][j]==50)
	                {
	                    System.out.print(" ");
	                    board[i][j].setDisable(true);
	                    board[i][j].setText("");
	                    board[i][j].setStyle("-fx-opacity: 1;"+
	                	"-fx-text-fill: #ff0000;"+
	                	"-fx-background-color: #ffffff;");
	                }
	                else if(VisibleGrid[i][j]==20) {
	                	System.out.print("F");
	                	board[i][j].setText("F");
	                }
	                else if(VisibleGrid[i][j]==100)
	                {
	                    System.out.print("X");
	                    board[i][j].setDisable(true);
	                    board[i][j].setText("X");
	                    board[i][j].setStyle("-fx-opacity: 1;"+
	    	                	"-fx-text-fill: #ff0000;"+
	    	                	"-fx-background-color: #ffffff;");
	                    
	                }
	                else if(VisibleGrid[i][j]==200)
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
	                    System.out.print(VisibleGrid[i][j]);
	                    board[i][j].setDisable(true);
	                    board[i][j].setText(""+VisibleGrid[i][j]);
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
	    	Button[][] board = {{button00, button01, button02, button03, button04, button05, button06, button07, button08, button09, b0t10, b0t11, b0t12, b0t13, b0t14, b0t15},
		   			 {button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, b1t10, b1t11, b1t12, b1t13, b1t14, b1t15},
		   			 {button20, button21, button22, button23, button24, button25, button26, button27, button28, button29, b2t10, b2t11, b2t12, b2t13, b2t14, b2t15},
		   			 {button30, button31, button32, button33, button34, button35, button36, button37, button38, button39, b3t10, b3t11, b3t12, b3t13, b3t14, b3t15},
		   			 {button40, button41, button42, button43, button44, button45, button46, button47, button48, button49, b4t10, b4t11, b4t12, b4t13, b4t14, b4t15},
		   			 {button50, button51, button52, button53, button54, button55, button56, button57, button58, button59, b5t10, b5t11, b5t12, b5t13, b5t14, b5t15},
		   			 {button60, button61, button62, button63, button64, button65, button66, button67, button68, button69, b6t10, b6t11, b6t12, b6t13, b6t14, b6t15},
		   			 {button70, button71, button72, button73, button74, button75, button76, button77, button78, button79, b7t10, b7t11, b7t12, b7t13, b7t14, b7t15},
		   			 {button80, button81, button82, button83, button84, button85, button86, button87, button88, button89, b8t10, b8t11, b8t12, b8t13, b8t14, b8t15},
		   			 {button90, button91, button92, button93, button94, button95, button96, button97, button98, button99, b9t10, b9t11, b9t12, b9t13, b9t14, b9t15},
		   			 {b10t0, b10t1, b10t2, b10t3, b10t4, b10t5, b10t6, b10t7, b10t8, b10t9, b10t10, b10t11, b10t12, b10t13, b10t14, b10t15},
		   			 {b11t0, b11t1, b11t2, b11t3, b11t4, b11t5, b11t6, b11t7, b11t8, b11t9, b11t10, b11t11, b11t12, b11t13, b11t14, b11t15 },
		   			 {b12t0, b12t1, b12t2, b12t3, b12t4, b12t5, b12t6, b12t7, b12t8, b12t9, b12t10, b12t11, b12t12, b12t13, b12t14, b12t15 },
		   			 {b13t0, b13t1, b13t2, b13t3, b13t4, b13t5, b13t6, b13t7, b13t8, b13t9, b13t10, b13t11, b13t12, b13t13, b13t14, b13t15 },
		   			 {b14t0, b14t1, b14t2, b14t3, b14t4, b14t5, b14t6, b14t7, b14t8, b14t9, b14t10, b14t11, b14t12, b14t13, b14t14, b14t15 },
		   			 {b15t0, b15t1, b15t2, b15t3, b15t4, b15t5, b15t6, b15t7, b15t8, b15t9, b15t10, b15t11, b15t12, b15t13, b15t14, b15t15 }};
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
	                if(HiddenGrid[i][j]==0)
	                {
	                    System.out.print(" ");
	                    board[i][j].setDisable(true);
	                    board[i][j].setText("");
	                    board[i][j].setStyle("-fx-opacity: 1;"+
	    	                	"-fx-text-fill: #ff0000;"+
	    	                	"-fx-background-color: #ffffff;");
	                }
	                else if(HiddenGrid[i][j]==100)
	                {
	                    System.out.print("X");
	                    board[i][j].setDisable(true);
	                    board[i][j].setText("X");
	                    board[i][j].setStyle("-fx-opacity: 1;"+
	    	                	"-fx-text-fill: #ff0000;"+
	    	                	"-fx-background-color: #ffffff;");
	                }
	                else if(HiddenGrid[i][j]==200)
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
	                    System.out.print(HiddenGrid[i][j]);
	                    board[i][j].setDisable(true);
	                    board[i][j].setText(""+HiddenGrid[i][j]);
	                    board[i][j].setStyle("-fx-opacity: 1;"+
	    	                	"-fx-text-fill: #ff0000;"+
	    	                	"-fx-background-color: #ffffff;");
	                }
	                System.out.print(" | ");
	            }
	            System.out.print("\n");
	        }
	    }

	    public void NeighbourBlank(int i, int j)
	    {   if (VisibleGrid[i][j] == 0 || VisibleGrid[i][j]==20) {
	        VisibleGrid[i][j] = 50;
	        if(i!=0)
	        {   
	        	if (VisibleGrid[i-1][j] == 0 || VisibleGrid[i-1][j] == 20) {
	            VisibleGrid[i-1][j] = HiddenGrid[i-1][j];
	            if(VisibleGrid[i-1][j]==0 || VisibleGrid[i-1][j] == 20) NeighbourBlank(i-1,j);
	        	}
	            if(j!=0)
	            {
	            	if (VisibleGrid[i-1][j-1] == 0 || VisibleGrid[i-1][j-1] == 20) {
	                VisibleGrid[i-1][j-1] = HiddenGrid[i-1][j-1];
	                if(VisibleGrid[i-1][j-1]==0 || VisibleGrid[i-1][j-1] == 20) NeighbourBlank(i-1,j-1);
	            	}
	            }
	        }
	        if(i!=(arraydimension-1))
	        {
	        	if (VisibleGrid[i+1][j] == 0 || VisibleGrid[i+1][j] == 20) {
	            VisibleGrid[i+1][j]=HiddenGrid[i+1][j];
	            if(VisibleGrid[i+1][j]==0 || VisibleGrid[i+1][j]==20) NeighbourBlank(i+1,j); 
	        	}
	            if(j!=(arraydimension-1))
	            {
	            	if (VisibleGrid[i+1][j+1] == 0 || VisibleGrid[i+1][j+1] == 20) {
	                VisibleGrid[i+1][j+1]= HiddenGrid[i+1][j+1];
	                if(VisibleGrid[i+1][j+1]==0 || VisibleGrid[i+1][j+1] == 20) NeighbourBlank(i+1,j+1);
	            	}
	            }
	        }
	        if(j!=0)
	        {   
	        	if (VisibleGrid[i][j-1] == 0 || VisibleGrid[i][j-1] == 20) {
	            VisibleGrid[i][j-1]=HiddenGrid[i][j-1];
	            if(VisibleGrid[i][j-1]==0 || VisibleGrid[i][j-1] == 20) NeighbourBlank(i,j-1);
	        	}
	            if(i!=(arraydimension-1))
	            {
	            	if (VisibleGrid[i+1][j-1]==0 || VisibleGrid[i+1][j-1] == 20) {
	                VisibleGrid[i+1][j-1]=HiddenGrid[i+1][j-1];
	                if(VisibleGrid[i+1][j-1]==0 || VisibleGrid[i+1][j-1] == 20) NeighbourBlank(i+1,j-1);
	            	}
	            }
	        }
	        if(j!=(arraydimension-1))
	        {
	        	if (VisibleGrid[i][j+1] == 0 || VisibleGrid[i][j+1] == 20) {
	            VisibleGrid[i][j+1]=HiddenGrid[i][j+1];
	            if(VisibleGrid[i][j+1]==0 || VisibleGrid[i][j+1] == 20) NeighbourBlank(i, j+1);
	        	}
	            if(i!=0)
	            {
	            	if (VisibleGrid[i-1][j+1] == 0 || VisibleGrid[i-1][j+1] == 20) {
	                VisibleGrid[i-1][j+1]=HiddenGrid[i-1][j+1];
	                if(VisibleGrid[i-1][j+1]==0 || VisibleGrid[i-1][j+1] == 20) NeighbourBlank(i-1,j+1);
	            	}
	            }
	        }
	    }
	    }

	    public void NeighbourBombs(int i, int j)
	    {
	        VisibleGrid[i][j] = HiddenGrid[i][j];
	    }

	    public boolean playMove()
	    {

	        if(i<0 || i>(arraydimension-1) || j<0 || j>(arraydimension-1) || (VisibleGrid[i][j]!=0 && VisibleGrid[i][j]!=20) ||( m!=0 && m!=1))
	        {
	            System.out.print("\nIncorrect Input!!");
	            return true;
	        }
	        
	        if (m==0) {
	        if(HiddenGrid[i][j]==100 || HiddenGrid[i][j]==200)
	        {
	            displayHidden();
	            winner = 1;
	            System.out.print("Oops! You stepped on a mine!\n============GAME OVER============");
	            writestatistics();
	            textfield.setText("You stepped on a mine!");
	            sched = false;
	            return false;
	        }
	        else if(HiddenGrid[i][j]==0)
	        {
	            NeighbourBlank(i, j);
	        }
	        else
	        {
	            NeighbourBombs(i, j);
	        }
	        }
	        else {
	        	if (VisibleGrid[i][j]==0) {
	        		flagcnt++;
	        		activeflagcnt++;
	        		flagsfield.setText(activeflagcnt+"");
	        		System.out.println(activeflagcnt+"hello");
	        	    VisibleGrid[i][j] = 20;
	        	    if (HiddenGrid[i][j] == 200 && attempts <= 4) {
	        	    	for (int k=0; k<arraydimension; k++) {
	        	    		VisibleGrid[i][k] = HiddenGrid[i][k];
	        	    				if (VisibleGrid[i][k]==0) VisibleGrid[i][k]=50;
	        	    	}
	        	    	for (int u=0; u<arraydimension; u++) {
	        	    		VisibleGrid[u][j] = HiddenGrid[u][j];
	        	    		if (VisibleGrid[u][j]==0) VisibleGrid[u][j]=50;
	        	    	}
	        	    }
	        	}  	
	        	else if (VisibleGrid[i][j]==20) {
	        		VisibleGrid[i][j] = 0;
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
	                if(HiddenGrid[i][j]!=100 && HiddenGrid[i][j]!=200)
	                {

	                    if(i!=0)
	                    {
	                        if(HiddenGrid[i-1][j]==100 || HiddenGrid[i-1][j]==200) cnt++;
	                        if(j!=0)
	                        {
	                            if(HiddenGrid[i-1][j-1]==100 || HiddenGrid[i-1][j-1]==200) cnt++;
	                        }

	                    }
	                    if(i!=(arraydimension-1))
	                    {
	                        if(HiddenGrid[i+1][j]==100 || HiddenGrid[i+1][j]==200) cnt++;
	                        if(j!=(arraydimension-1))
	                        {
	                            if(HiddenGrid[i+1][j+1]==100 || HiddenGrid[i+1][j+1]==200) cnt++;
	                        }
	                    }
	                    if(j!=0)
	                    {
	                        if(HiddenGrid[i][j-1]==100 || HiddenGrid[i][j-1]==200) cnt++;
	                        if(i!=(arraydimension-1))
	                        {
	                            if(HiddenGrid[i+1][j-1]==100 || HiddenGrid[i+1][j-1]==200) cnt++;
	                        }
	                    }
	                    if(j!=(arraydimension-1))
	                    {
	                        if(HiddenGrid[i][j+1]==100 || HiddenGrid[i][j+1]==200) cnt++;
	                        if(i!=0)
	                        {
	                            if(HiddenGrid[i-1][j+1]==100 || HiddenGrid[i-1][j+1]==200) cnt++;
	                        }
	                    }

	                    HiddenGrid[i][j] = cnt;
	                }
	            }
	        }

	        //displayHidden();
	    }

	    public void setupField(int diff)
	    {
	        int var=0;
	        int i,j;
	        String data="";
	        Set<Pair> hash_Set = new HashSet<Pair>();
	        Pair <Integer, Integer> pair;
	        while(var!=bombcount)
	        {
	        	do {
	            Random random = new Random();
	            i = random.nextInt(arraydimension);
	            j = random.nextInt(arraydimension);
	            pair = new Pair<>(Integer.valueOf(i),Integer.valueOf(j));
	        	}
	        	while (hash_Set.contains(pair));
	        	hash_Set.add(pair);
	            //System.out.println("i: " + i + " j: " + j);
	            if (var==(bombcount-1) && hyperbomb) {
	            	HiddenGrid[i][j] = 200;
	            	data = data + i+","+j+","+1+"\n";
	            }
	            else {
	            HiddenGrid[i][j] = 100;
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
					//System.out.print(data + (char) i);
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
	                if(VisibleGrid[i][j]==0)
	                {
	                    if(HiddenGrid[i][j]!=100 && HiddenGrid[i][j]!=200)
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
	        		VisibleGrid[i][j]=0;
	        		HiddenGrid[i][j]=0;
	        	}
	        }
	        setupField(1);
	        }
	    
	    public void starttimer(){
	        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
	        sched = true;
	        final Runnable runnable = new Runnable() {
	            public void run() {
	    		    if (c==0) sched = true;
	    		    c = c+1;
	            	if (!sched) scheduler.shutdown();
	            	timefield.setText(timerseconds+"");
	                System.out.println(timerseconds);
	                timerseconds--;
                	

	                if (timerseconds < 0) {
	                	timerseconds = 0;
	                	textfield.setText("Time out!");
	                	winner = 1;
	                    displayHidden();
	                    writestatistics();
	                    System.out.println("Timer Over!");
	                    scheduler.shutdown();
	                    System.out.println("Time out!You lost");
	                }
	                
	          
	            }
	        };
	        scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);
	    }
	   // }
}
