package pl.gamez.tictactoe.interfaces;

public interface Settingz {

    void setValue(int i, int j, int v);

    void restartState();

    void setWinX();

    void setWinO();

    boolean checkWhoWin() throws InterruptedException;

    int[][] getGameArray();
}
