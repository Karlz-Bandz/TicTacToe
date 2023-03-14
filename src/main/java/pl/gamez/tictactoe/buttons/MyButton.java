package pl.gamez.tictactoe.buttons;

import javafx.scene.Cursor;
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

    private Random rand = new Random();

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

            this.setVisible(false);

                if(HelloApplication.whichPlayer%2 == 0)
                {
                    HelloApplication.circleImages[this.id].setVisible(true);
                    gameSettings.setValue(coordinateA, coordinateB, 1);

                    if(gameSettings.checkWhoWin())
                        gameSettings.setWinO();

                }else{
                    HelloApplication.crossImages[this.id].setVisible(true);
                    gameSettings.setValue(coordinateA, coordinateB, 2);

                    if(gameSettings.checkWhoWin())
                        gameSettings.setWinX();

                }
                HelloApplication.whichPlayer++;
        });
    }

    public void clickToPlayWithPC()
    {
        this.setOnAction(event ->
        {
                           HelloApplication.crossImages[this.id].setVisible(true);
                           this.setVisible(false);

                           gameSettings.setValue(coordinateA, coordinateB, 2);

                           if(gameSettings.checkWhoWin())
                           gameSettings.setWinX();

                           HelloApplication.whichPlayer++;

                           boolean state = true;
                           int[][] controllArray = gameSettings.getGameArray();

                           //This help to prevent the while loop from never end looping
                           int secure = -1;

                           while(state)
                            {
                                 int randA = rand.nextInt(3);
                                 int randB = rand.nextInt(3);

                                 secure++;


                              if (controllArray[randA][randB] == 0)
                              {

                                int buttonValueForPC = 0;

                                gameSettings.setValue(randA, randB, 1);
                                if (randA == 0 && randB == 0)
                                    buttonValueForPC = 0;
                                else if (randA == 0 && randB == 1)
                                    buttonValueForPC = 1;
                                else if (randA == 0 && randB == 2)
                                    buttonValueForPC = 2;
                                else if (randA == 1 && randB == 0)
                                    buttonValueForPC = 3;
                                else if (randA == 1 && randB == 1)
                                    buttonValueForPC = 4;
                                else if (randA == 1 && randB == 2)
                                    buttonValueForPC = 5;
                                else if (randA == 2 && randB == 0)
                                    buttonValueForPC = 6;
                                else if (randA == 2 && randB == 1)
                                    buttonValueForPC = 7;
                                else if (randA == 2 && randB == 2)
                                    buttonValueForPC = 8;

                                HelloApplication.circleImages[buttonValueForPC].setVisible(true);

                                      if(gameSettings.checkWhoWin())
                                      gameSettings.setWinO();

                                  HelloApplication.whichPlayer++;

                                state = false;

                            }
                                        if (secure > 9)
                                        state = false;
                        }

        });
    }
}
