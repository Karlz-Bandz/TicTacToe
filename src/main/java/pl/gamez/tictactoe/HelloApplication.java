package pl.gamez.tictactoe;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import pl.gamez.tictactoe.buttons.MyButton;
import pl.gamez.tictactoe.images.ImageController;

/*
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
    public static GameSetting gameSettings = new GameSetting();
    //-----------------------------------------------------------------------------------------

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {

        Image icon = new Image("img/tic-tac-toe-icon.png");
        Image iconToPlay = new Image("img/square.png");


        ImageController imageView1 = new ImageController(iconToPlay, 411, 411);



        Button button = new MyButton("",12,12,6,6,0,0);
        Button button2 = new MyButton("",146,12,140,6,0,1);
        Button button3 = new MyButton("",280,12,274,6,0,2);

        Button button4 = new MyButton("", 12, 146, 6, 140,1,0);
        Button button5 = new MyButton("", 146, 146, 140,140,1,1);
        Button button6 = new MyButton("", 280,146, 274,140,1,2);

        Button button7 = new MyButton("", 12, 280, 6, 274,2,0);
        Button button8 = new MyButton("", 146, 280, 140, 274,2,1);
        Button button9 = new MyButton("", 280,280, 274,274,2,2);

        ((MyButton) button).clickToPlay();
        ((MyButton) button2).clickToPlay();
        ((MyButton) button3).clickToPlay();
        ((MyButton) button4).clickToPlay();
        ((MyButton) button5).clickToPlay();
        ((MyButton) button6).clickToPlay();
        ((MyButton) button7).clickToPlay();
        ((MyButton) button8).clickToPlay();
        ((MyButton) button9).clickToPlay();

        Group root = new Group(imageView1,
                button, button2, button3,
                button4, button5, button6,
                button7, button8, button9
        );
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