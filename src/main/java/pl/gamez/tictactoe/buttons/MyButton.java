package pl.gamez.tictactoe.buttons;

import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import pl.gamez.tictactoe.HelloApplication;


import java.util.Random;

import static pl.gamez.tictactoe.HelloApplication.gameSettings;

public class MyButton extends Button
{
    private final int x;
    private final int y;
    private final int id;
    private final int coordinateA;
    private final int coordinateB;

    Random rand = new Random();

    public MyButton(String name, int x, int y, int id, int coordinateA, int coordinateB)
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
        this.id = id;
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

                    gameSettings.setValue(coordinateA, coordinateB, 1);
                    HelloApplication.circleImages[this.id].setVisible(true);
                    gameSettings.checkWhoWin();

                }else{

                    gameSettings.setValue(coordinateA, coordinateB, 2);
                    HelloApplication.crossImages[this.id].setVisible(true);
                    gameSettings.checkWhoWin();

                }

                HelloApplication.whichPlayer++;

            }

        });
    }

    public void clickToPlayWithPC()
    {
        this.setOnAction(event ->
        {

                 Parent parent = this.getParent();



                if(HelloApplication.whichPlayer%2 != 0)
                {

                    if(parent instanceof Group)
                    {
                           this.setVisible(false);

                           gameSettings.setValue(coordinateA, coordinateB, 2);
                           HelloApplication.crossImages[this.id].setVisible(true);
                           gameSettings.checkWhoWin();
                    }

                }


                HelloApplication.whichPlayer++;
        });


    }
}
