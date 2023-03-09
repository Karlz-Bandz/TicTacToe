package pl.gamez.tictactoe.buttons;

import javafx.application.Platform;
import javafx.scene.control.Button;

public class ExitButton extends Button {

    public ExitButton(String name){
        super(name);
        this.setLayoutX(422);
        this.setLayoutY(300);
        this.setPrefHeight(80);
        this.setPrefWidth(150);
    }

    public void exitGame(){
        this.setOnAction(event -> {
            Platform.exit();
            System.exit(0);
        });
    }
}
