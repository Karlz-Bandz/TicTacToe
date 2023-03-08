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
                if(HelloApplication.whichPlayer%2 == 0){
                    System.out.println("Player o won");
                    return true;
                }else{
                    System.out.println("Player x won");
                    return true;
                }
            }
        }
        //Check columns
        for(int i = 0; i < 3; i++){
            if(gameArray[0][i] == gameArray[1][i] && gameArray[0][i] == gameArray[2][i] && gameArray[0][i] != 0){
                if(HelloApplication.whichPlayer%2 == 0){
                    System.out.println("Player o won");
                    return true;
                }else{
                    System.out.println("Player x won");
                    return true;
                }

            }
        }
        //Check cross

        return false;
    }

    public int[][] getGameArray(){
        return this.gameArray;
    }


}
