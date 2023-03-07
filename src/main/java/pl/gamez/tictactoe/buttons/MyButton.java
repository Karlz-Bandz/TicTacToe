package pl.gamez.tictactoe.buttons;

import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class MyButton extends Button {

    public MyButton(String name, int x, int y) {
        super(name);
        this.setLayoutX(x);
        this.setLayoutY(y);
        this.setPrefHeight(121);
        this.setPrefWidth(121);
        this.setOpacity(0.5);
        this.setCursor(Cursor.CLOSED_HAND);
    }
    public void clickToPlay(){
        this.setOnAction(event -> {
            Parent parent = this.getParent();

            if(parent instanceof Group){
                ((Group) parent).getChildren().remove(this);
            }
        });
    }
}
