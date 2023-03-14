package pl.gamez.tictactoe;

import pl.gamez.tictactoe.interfaces.Settingz;

public class GameSetting implements Settingz
{

    private int[][] gameArray;



    public GameSetting()
    {
        gameArray = new int[3][3];
    }

    @Override
    public int[][] getGameArray()
    {
        return this.gameArray;
    }

    @Override
    public void setValue(int i, int j, int value)
    {
        this.gameArray[i][j] = value;
    }



    @Override
    public boolean checkWhoWin()
    {
        //Check rows
        for(int i = 0; i < 3; i++)
        {
            if(this.gameArray[i][0] == this.gameArray[i][1] && this.gameArray[i][0] == this.gameArray[i][2] && this.gameArray[i][0] != 0)
               return true;
        }
        //Check columns
        for(int i = 0; i < 3; i++)
        {
            if(this.gameArray[0][i] == this.gameArray[1][i] && this.gameArray[0][i] == this.gameArray[2][i] && this.gameArray[0][i] != 0)
                return true;
        }
        //Check cross
        if(this.gameArray[0][0] == this.gameArray[1][1] && this.gameArray[0][0] == this.gameArray[2][2] && this.gameArray[0][0] != 0)
            return true;
        else if(this.gameArray[0][2] == this.gameArray[1][1] && this.gameArray[0][2] == this.gameArray[2][0] && this.gameArray[0][2] != 0)
            return true;
        //Game not finish
        if(HelloApplication.whichPlayer >= 10)
        {

            return true;
        }
        return false;
    }

    @Override
    public void restartState()
    {

        for(int i = 0; i < 9; i++)
        {
            if(!HelloApplication.buttons[i].isVisible())
                HelloApplication.buttons[i].setVisible(true);

            if(HelloApplication.circleImages[i].isVisible())
                HelloApplication.circleImages[i].setVisible(false);

            if(HelloApplication.crossImages[i].isVisible())
                HelloApplication.crossImages[i].setVisible(false);
        }

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(this.gameArray[i][j] != 0)
                {
                    gameArray[i][j] = 0;
                }
            }
        }

        if(HelloApplication.whichPlayer%2 != 0)
            HelloApplication.whichPlayer = 1;
        else
            HelloApplication.whichPlayer = 0;

    }


    @Override
    public void setWinO()
    {

            System.out.println("Player o won");
            HelloApplication.player2.setText("Player O: " + ++HelloApplication.player2Points);
            buttonsHide();

    }

    @Override
    public void buttonsHide()
    {
        for(int i = 0; i < 9; i++)
        {
            if(HelloApplication.buttons[i].isVisible())
                HelloApplication.buttons[i].setVisible(false);
        }
    }

    @Override
    public void setWinX()
    {

            System.out.println("Player x won");
            HelloApplication.player1.setText("Player X: " + ++HelloApplication.player1Points);
            buttonsHide();

    }




}
