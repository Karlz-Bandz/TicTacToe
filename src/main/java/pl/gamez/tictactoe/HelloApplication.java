package pl.gamez.tictactoe;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import pl.gamez.tictactoe.buttons.MyButton;


public class HelloApplication extends Application {





    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Image icon = new Image("img/tic-tac-toe-icon.png");
        Image iconToPlay = new Image("img/square.png");


        primaryStage.getIcons().add(icon);

        ImageView imageView = new ImageView(iconToPlay);
        imageView.setFitHeight(411);
        imageView.setFitWidth(411);

        Button button = new MyButton("Button");
        Button button2 = new MyButton("Button2");

        button.setLayoutX(12);
        button.setLayoutY(12);

        button2.setLayoutX(56);
        button2.setLayoutY(12);


        VBox buttBox = new VBox();
        buttBox.getChildren().addAll(button, button2);
        Group root = new Group(imageView, buttBox);
        Scene scene = new Scene(root, Color.GRAY);




        primaryStage.setTitle("Tic Tac Toe GAME");
        primaryStage.setResizable(false);
        primaryStage.setWidth(600);
        primaryStage.setHeight(450);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}