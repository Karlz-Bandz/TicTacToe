package pl.gamez.tictactoe.buttons;

import javafx.scene.Cursor;
import javafx.scene.control.Button;

public class MyButton extends Button {

    public MyButton(String name) {
        super(name);
        this.setPrefHeight(121);
        this.setPrefWidth(121);
        this.setOpacity(0.5);
        this.setCursor(Cursor.CLOSED_HAND);
    }
}
