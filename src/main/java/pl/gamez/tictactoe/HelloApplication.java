package pl.gamez.tictactoe;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import pl.gamez.tictactoe.buttons.MyButton;
import pl.gamez.tictactoe.images.GameImage;
import pl.gamez.tictactoe.images.ImageController;


public class HelloApplication extends Application {





    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Image icon = new Image("img/tic-tac-toe-icon.png");
        Image iconToPlay = new Image("img/square.png");
        Image circle = new Image("img/circle.png");
        Image cross = new Image("img/cross.png");

        ImageController imageView1 = new ImageController(iconToPlay, 411, 411);

        GameImage circleImage = new GameImage(circle, 5,5);
        GameImage crossImage = new GameImage(cross, 139, 5);



        Button button = new MyButton("", 12, 12);
        Button button2 = new MyButton("", 146, 12);
        Button button3 = new MyButton("", 280,12);

        Button button4 = new MyButton("", 12, 146);
        Button button5 = new MyButton("", 146, 146);
        Button button6 = new MyButton("", 280,146);

        Button button7 = new MyButton("", 12, 280);
        Button button8 = new MyButton("", 146, 280);
        Button button9 = new MyButton("", 280,280);

        ((MyButton) button).clickToPlay();



        Group root = new Group(imageView1,
                button, button2, button3,
                button4, button5, button6,
                button7, button8, button9,circleImage, crossImage);
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