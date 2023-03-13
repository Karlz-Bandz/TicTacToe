package pl.gamez.tictactoe.interfaces;

//import pl.gamez.tictactoe.ChangeStatusClass;
import pl.gamez.tictactoe.GameSetting;

public interface Settingz {

    void setValue(int i, int j, int v);

    void restartState();

    void setWinX();

    void setWinO();

    //void notifyGameStatus();

    boolean checkWhoWin() throws InterruptedException;

    int[][] getGameArray();


}
