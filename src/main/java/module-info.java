module pl.gamez.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.gamez.tictactoe to javafx.fxml;
    exports pl.gamez.tictactoe;
}