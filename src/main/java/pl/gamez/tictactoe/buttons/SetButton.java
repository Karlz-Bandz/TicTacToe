package pl.gamez.tictactoe.buttons;

import javafx.application.Platform;
import javafx.scene.control.Button;

import static pl.gamez.tictactoe.HelloApplication.buttons;

public class SetButton extends Button {
    public SetButton(String name, int coordinateX, int coordinateY)
    {
        super(name);
        this.setPrefHeight(40);
        this.setPrefWidth(150);
        this.setLayoutX(coordinateX);
        this.setLayoutY(coordinateY);
    }

    public void setWithPC(){

        this.setOnAction(event -> {
            buttons[0].clickToPlayWithPC();
            buttons[1].clickToPlayWithPC();
            buttons[2].clickToPlayWithPC();
            buttons[3].clickToPlayWithPC();
            buttons[4].clickToPlayWithPC();
            buttons[5].clickToPlayWithPC();
            buttons[6].clickToPlayWithPC();
            buttons[7].clickToPlayWithPC();
            buttons[8].clickToPlayWithPC();
        });

    }

    public void setWithPerson(){

        this.setOnAction(event -> {
            buttons[0].clickToPlay();
            buttons[1].clickToPlay();
            buttons[2].clickToPlay();
            buttons[3].clickToPlay();
            buttons[4].clickToPlay();
            buttons[5].clickToPlay();
            buttons[6].clickToPlay();
            buttons[7].clickToPlay();
            buttons[8].clickToPlay();
        });
    }
}
