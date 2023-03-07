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




        ImageView imageView = new ImageView(iconToPlay);
        imageView.setFitHeight(411);
        imageView.setFitWidth(411);

        Button button = new MyButton("", 12, 12);
        Button button2 = new MyButton("", 146, 12);
        Button button3 = new MyButton("", 280,12);

        Button button4 = new MyButton("", 12, 146);
        Button button5 = new MyButton("", 146, 146);
        Button button6 = new MyButton("", 280,146);

        Button button7 = new MyButton("", 12, 280);
        Button button8 = new MyButton("", 146, 280);
        Button button9 = new MyButton("", 280,280);

//        button.setLayoutX(12);
//        button.setLayoutY(12);
//
//        button2.setLayoutX(56);
//        button2.setLayoutY(12);


//        VBox buttBox = new VBox();
//        buttBox.getChildren().addAll(button, button2);
        Group root = new Group(imageView,
                button, button2, button3,
                button4, button5, button6,
                button7, button8, button9);
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