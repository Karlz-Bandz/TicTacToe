package pl.gamez.tictactoe.buttons;

import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import pl.gamez.tictactoe.HelloApplication;
import pl.gamez.tictactoe.images.GameImage;

public class MyButton extends Button
{

    private int x;
    private int y;

    public MyButton(String name, int x, int y)
    {
        super(name);
        this.setLayoutX(x);
        this.setLayoutY(y);
        this.setPrefHeight(121);
        this.setPrefWidth(121);
        this.setOpacity(0.5);
        this.setCursor(Cursor.CLOSED_HAND);
        this.x = x;
        this.y = y;
    }
    public void clickToPlay()
    {
        this.setOnAction(event -> {
            Parent parent = this.getParent();

            if(parent instanceof Group){
                ((Group) parent).getChildren().remove(this);
                GameImage imageViewCross = new GameImage(HelloApplication.cross, this.x, this.y);
                ((Group)parent).getChildren().add(imageViewCross);
            }

        });
    }
}
