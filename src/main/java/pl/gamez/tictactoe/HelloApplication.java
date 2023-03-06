package pl.gamez.tictactoe;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;




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


        Group root = new Group(imageView);
        Scene scene = new Scene(root, Color.GRAY);




        primaryStage.setTitle("Tic Tac Toe GAME");
        primaryStage.setResizable(false);
        primaryStage.setWidth(600);
        primaryStage.setHeight(450);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}