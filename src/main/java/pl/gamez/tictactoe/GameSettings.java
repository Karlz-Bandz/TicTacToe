package pl.gamez.tictactoe;

public class GameSettings {

    private int[][] gameArray;

    public GameSettings(){
        gameArray = new int[3][3];
    }

    public void setValue(int i, int j, int value){
        this.gameArray[i][j] = value;
    }

    public int[][] getGameArray(){
        return this.gameArray;
    }


}
