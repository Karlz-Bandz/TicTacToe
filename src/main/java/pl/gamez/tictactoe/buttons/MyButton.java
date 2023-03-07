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
    private int k;
    private int g;

    public MyButton(String name, int x, int y, int k, int g)
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
        this.k = k;
        this.g = g;
    }
    public void clickToPlay()
    {
        this.setOnAction(event -> {
            Parent parent = this.getParent();

            if(parent instanceof Group){
                ((Group) parent).getChildren().remove(this);
                if(HelloApplication.whichPlayer%2 == 0) {
                    GameImage imageViewCross = new GameImage(HelloApplication.circle, this.k, this.g);
                    ((Group) parent).getChildren().add(imageViewCross);
                }else{
                    GameImage imageViewCircle = new GameImage(HelloApplication.cross, this.k, this.g);
                    ((Group) parent).getChildren().add(imageViewCircle);
                }
                HelloApplication.whichPlayer++;
            }

        });
    }
}
