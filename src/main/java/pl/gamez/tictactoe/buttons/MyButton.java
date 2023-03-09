package pl.gamez.tictactoe.buttons;

import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import pl.gamez.tictactoe.HelloApplication;
import pl.gamez.tictactoe.images.GameImage;

import static pl.gamez.tictactoe.HelloApplication.gameSettings;

public class MyButton extends Button
{
    private final int x;
    private final int y;
    private final int k;
    private final int g;
    private final int coordinateA;
    private final int coordinateB;

    public MyButton(String name, int x, int y, int k, int g, int coordinateA, int coordinateB)
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
        this.coordinateA = coordinateA;
        this.coordinateB = coordinateB;
    }
    public void clickToPlay()
    {
        this.setOnAction(event -> {

            Parent parent = this.getParent();

            if(parent instanceof Group){

                this.setVisible(false);

                if(HelloApplication.whichPlayer%2 == 0) {

                    GameImage imageViewCross = new GameImage(HelloApplication.circle, this.k, this.g);
                    gameSettings.setValue(coordinateA, coordinateB, 1);
                    ((Group) parent).getChildren().add(imageViewCross);
                    gameSettings.checkWhoWin();

                }else{

                    GameImage imageViewCircle = new GameImage(HelloApplication.cross, this.k, this.g);
                    gameSettings.setValue(coordinateA, coordinateB, 2);
                    ((Group) parent).getChildren().add(imageViewCircle);
                    gameSettings.checkWhoWin();

                }

                HelloApplication.whichPlayer++;

            }

        });
    }
}
