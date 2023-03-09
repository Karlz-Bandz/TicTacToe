package pl.gamez.tictactoe;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import pl.gamez.tictactoe.buttons.ExitButton;
import pl.gamez.tictactoe.buttons.MyButton;
import pl.gamez.tictactoe.images.GameImage;
import pl.gamez.tictactoe.images.ImageController;

/*
* TicTacToe 1.3 Standard
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
    public static GameImage[] circleImages = new GameImage[9];
    public static GameImage[] crossImages = new GameImage[9];

    //-----------------------------------------------------------------------------------------

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Text pointText = new Text("Points");
        pointText.setX(454);
        pointText.setY(60);
        pointText.setStyle("-fx-font-size: 20pt");
        pointText.setFont(Font.font("Impact"));

        player1.setX(436);
        player1.setY(120);
        player1.setStyle("-fx-font-size: 20pt");
        player1.setFont(Font.font("Impact"));

        player2.setX(436);
        player2.setY(170);
        player2.setStyle("-fx-font-size: 20pt");
        player2.setFont(Font.font("Impact"));

        Image icon = new Image("img/tic-tac-toe-icon.png");
        Image iconToPlay = new Image("img/square.png");


        ImageController imageView1 = new ImageController(iconToPlay, 411, 411);

        GameImage circleImage1 = new GameImage(circle, 6,6);
        GameImage circleImage2 = new GameImage(circle, 140,6);
        GameImage circleImage3 = new GameImage(circle, 274,6);
        GameImage circleImage4 = new GameImage(circle, 6,140);
        GameImage circleImage5 = new GameImage(circle, 140,140);
        GameImage circleImage6 = new GameImage(circle, 274,140);
        GameImage circleImage7 = new GameImage(circle, 6,274);
        GameImage circleImage8 = new GameImage(circle, 140,274);
        GameImage circleImage9 = new GameImage(circle, 274,274);

        circleImage1.setVisible(false);
        circleImage2.setVisible(false);
        circleImage3.setVisible(false);
        circleImage4.setVisible(false);
        circleImage5.setVisible(false);
        circleImage6.setVisible(false);
        circleImage7.setVisible(false);
        circleImage8.setVisible(false);
        circleImage9.setVisible(false);

        GameImage crossImage1 = new GameImage(cross, 6,6);
        GameImage crossImage2 = new GameImage(cross, 140,6);
        GameImage crossImage3 = new GameImage(cross, 274,6);
        GameImage crossImage4 = new GameImage(cross, 6,140);
        GameImage crossImage5 = new GameImage(cross, 140,140);
        GameImage crossImage6 = new GameImage(cross, 274,140);
        GameImage crossImage7 = new GameImage(cross, 6,274);
        GameImage crossImage8 = new GameImage(cross, 140,274);
        GameImage crossImage9 = new GameImage(cross, 274,274);

        crossImage1.setVisible(false);
        crossImage2.setVisible(false);
        crossImage3.setVisible(false);
        crossImage4.setVisible(false);
        crossImage5.setVisible(false);
        crossImage6.setVisible(false);
        crossImage7.setVisible(false);
        crossImage8.setVisible(false);
        crossImage9.setVisible(false);

        crossImages[0] = crossImage1;
        crossImages[1] = crossImage2;
        crossImages[2] = crossImage3;
        crossImages[3] = crossImage4;
        crossImages[4] = crossImage5;
        crossImages[5] = crossImage6;
        crossImages[6] = crossImage7;
        crossImages[7] = crossImage8;
        crossImages[8] = crossImage9;

        circleImages[0] = circleImage1;
        circleImages[1] = circleImage2;
        circleImages[2] = circleImage3;
        circleImages[3] = circleImage4;
        circleImages[4] = circleImage5;
        circleImages[5] = circleImage6;
        circleImages[6] = circleImage7;
        circleImages[7] = circleImage8;
        circleImages[8] = circleImage9;



        MyButton button = new MyButton("",12,12,0,0,0);
        MyButton button2 = new MyButton("",146,12,1,0,1);
        MyButton button3 = new MyButton("",280,12,2,0,2);

        MyButton button4 = new MyButton("", 12, 146, 3,1,0);
        MyButton button5 = new MyButton("", 146, 146, 4,1,1);
        MyButton button6 = new MyButton("", 280,146, 5,1,2);

        MyButton button7 = new MyButton("", 12, 280, 6,2,0);
        MyButton button8 = new MyButton("", 146, 280, 7,2,1);
        MyButton button9 = new MyButton("", 280,280, 8,2,2);

        ExitButton exitButton = new ExitButton("EXIT");

        exitButton.exitGame();



        buttons[0] = button;
        buttons[1] = button2;
        buttons[2] = button3;
        buttons[3] = button4;
        buttons[4] = button5;
        buttons[5] = button6;
        buttons[6] = button7;
        buttons[7] = button8;
        buttons[8] = button9;

        Group groupImg = new Group(circleImage1,circleImage2,circleImage3,
                circleImage4,circleImage5,circleImage6,circleImage7,circleImage8,
                circleImage9, crossImage1,crossImage2,crossImage3,crossImage4,
                crossImage5,crossImage6,crossImage7,crossImage8,crossImage9);

        //groupImg.setVisible(false);


        Group root = new Group(imageView1,
                button, button2, button3,
                button4, button5, button6,
                button7, button8, button9,
                exitButton,
                pointText,
                player1, player2,
                groupImg
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