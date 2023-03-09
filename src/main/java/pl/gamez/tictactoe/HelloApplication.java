package pl.gamez.tictactoe;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import pl.gamez.tictactoe.buttons.MyButton;
import pl.gamez.tictactoe.images.ImageController;

/*
* TicTacToe 1.2 Standard
* This simple tic-tac-toe game is creating just for practice.
* Below we can see main class and here the program is started.
* Here are assigned all coordinates and sizes of the images.
 */


public class HelloApplication extends Application
{

    /*
    * The global variables section
     */
    public static Image circle = new Image("img/circle.png");
    public static Image cross = new Image("img/cross.png");
    public static int whichPlayer = 1;
    public static int player1Points = 0;
    public static int player2Points = 0;
    public static GameSetting gameSettings = new GameSetting();
    public static Text player1 = new Text("Player 1: " + player1Points);
    public static Text player2 = new Text("Player 2: " + player2Points);
    public static MyButton[] buttons = new MyButton[9];

    //-----------------------------------------------------------------------------------------

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {

        player1.setX(434);
        player1.setY(150);
        player1.setStyle("-fx-font-size: 20pt");

        player2.setX(434);
        player2.setY(276);
        player2.setStyle("-fx-font-size: 20pt");

        Image icon = new Image("img/tic-tac-toe-icon.png");
        Image iconToPlay = new Image("img/square.png");


        ImageController imageView1 = new ImageController(iconToPlay, 411, 411);



        MyButton button = new MyButton("",12,12,6,6,0,0);
        MyButton button2 = new MyButton("",146,12,140,6,0,1);
        MyButton button3 = new MyButton("",280,12,274,6,0,2);

        MyButton button4 = new MyButton("", 12, 146, 6, 140,1,0);
        MyButton button5 = new MyButton("", 146, 146, 140,140,1,1);
        MyButton button6 = new MyButton("", 280,146, 274,140,1,2);

        MyButton button7 = new MyButton("", 12, 280, 6, 274,2,0);
        MyButton button8 = new MyButton("", 146, 280, 140, 274,2,1);
        MyButton button9 = new MyButton("", 280,280, 274,274,2,2);

        buttons[0] = button;
        buttons[1] = button2;
        buttons[2] = button3;
        buttons[3] = button4;
        buttons[4] = button5;
        buttons[5] = button6;
        buttons[6] = button7;
        buttons[7] = button8;
        buttons[8] = button9;



        Text pointText = new Text("Points");
        pointText.setX(454);
        pointText.setY(60);
        pointText.setStyle("-fx-font-size: 20pt");



        Group root = new Group(imageView1,
                button, button2, button3,
                button4, button5, button6,
                button7, button8, button9,
                pointText,
                player1, player2
        );

                button.clickToPlay();
                button2.clickToPlay();
                button3.clickToPlay();
                button4.clickToPlay();
                button5.clickToPlay();
                button6.clickToPlay();
                button7.clickToPlay();
                button8.clickToPlay();
                button9.clickToPlay();

        Scene scene = new Scene(root, Color.GRAY);

        primaryStage.getIcons().add(icon);
        primaryStage.setTitle("Tic Tac Toe GAME");
        primaryStage.setResizable(false);
        primaryStage.setWidth(600);
        primaryStage.setHeight(450);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}