package pl.gamez.tictactoe;

import pl.gamez.tictactoe.interfaces.Settingz;



public class GameSetting implements Settingz {

    private int[][] gameArray;

    public GameSetting(){
        gameArray = new int[3][3];
    }

    public void setValue(int i, int j, int value){
        this.gameArray[i][j] = value;
    }

    @Override
    public boolean checkWhoWin()
    {
        //Check rows
        for(int i = 0; i < 3; i++){
            if(this.gameArray[i][0] == this.gameArray[i][1] && this.gameArray[i][0] == this.gameArray[i][2] && this.gameArray[i][0] != 0){
               setWin();
               restarState();
               return true;
            }
        }
        //Check columns
        for(int i = 0; i < 3; i++){
            if(this.gameArray[0][i] == this.gameArray[1][i] && this.gameArray[0][i] == this.gameArray[2][i] && this.gameArray[0][i] != 0){
               setWin();
               restarState();
               return true;
            }
        }
        //Check cross
        if(this.gameArray[0][0] == this.gameArray[1][1] && this.gameArray[0][0] == this.gameArray[2][2] && this.gameArray[0][0] != 0){
           setWin();
           restarState();
           return true;
        }else if(this.gameArray[0][2] == this.gameArray[1][1] && this.gameArray[0][2] == this.gameArray[2][0] && this.gameArray[0][2] != 0){
          setWin();
          restarState();
          return true;
        }
        //Game not finish
        if(HelloApplication.whichPlayer >= 9){
            restarState();
            return true;
        }
        return false;
    }

    private void restarState()
    {
        int buttonCounter = 0;

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {

                if(this.gameArray[i][j] != 0)
                {
                    HelloApplication.buttons[buttonCounter].setVisible(true);
                    gameArray[i][j] = 0;
                    if(HelloApplication.crossImages[buttonCounter].isVisible() == true){
                           HelloApplication.crossImages[buttonCounter].setVisible(false);
                    }else if(HelloApplication.circleImages[buttonCounter].isVisible() == true){
                        HelloApplication.circleImages[buttonCounter].setVisible(false);
                    }
                }
                buttonCounter++;
            }
        }
        HelloApplication.whichPlayer = 0;
    }


    private void setWin()
    {
        if(HelloApplication.whichPlayer%2 == 0){
            System.out.println("Player o won");
            HelloApplication.player2Points++;
            HelloApplication.player2.setText("Player 2: " + HelloApplication.player2Points);
        }else{
            System.out.println("Player x won");
            HelloApplication.player1Points++;
            HelloApplication.player1.setText("Player 1: " + HelloApplication.player1Points);
        }
    }

    public int[][] getGameArray()
    {
        return this.gameArray;
    }
}
