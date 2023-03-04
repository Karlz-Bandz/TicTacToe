package pl.gamez.tictactoe;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class HelloApplication extends Application {


    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, Color.DEEPPINK);

        Image icon = new Image("img/tic-tac-toe-icon.png");


        primaryStage.getIcons().add(icon);
        primaryStage.setTitle("Tic Tac Toe GAME");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}