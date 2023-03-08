package pl.gamez.tictactoe.interfaces;

public interface Settingz {

    void setValue(int i, int j, int v);

    boolean checkWhoWin(int[][] gameArray);

    int[][] getGameArray();
}
