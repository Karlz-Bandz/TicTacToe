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
    public boolean checkWhoWin(int[][] gameArray) {

        //Check rows
        for(int i = 0; i < 3; i++){
            if(gameArray[i][0] == gameArray[i][1] && gameArray[i][0] == gameArray[i][2] && gameArray[i][0] != 0){
               setWin();
               return true;
            }
        }
        //Check columns
        for(int i = 0; i < 3; i++){
            if(gameArray[0][i] == gameArray[1][i] && gameArray[0][i] == gameArray[2][i] && gameArray[0][i] != 0){
               setWin();
               return true;
            }
        }
        //Check cross
        if(gameArray[0][0] == gameArray[1][1] && gameArray[0][0] == gameArray[2][2] && gameArray[0][0] != 0){
           setWin();
           return true;
        }else if(gameArray[0][2] == gameArray[1][1] && gameArray[0][2] == gameArray[2][0] && gameArray[0][2] != 0){
          setWin();
          return true;
        }
        return false;
    }


    private void setWin() {
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

    public int[][] getGameArray(){
        return this.gameArray;
    }


}
