module pl.gamez.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter.api;


    opens pl.gamez.tictactoe to javafx.fxml;
    exports pl.gamez.tictactoe;
    exports pl.gamez.tictactoe.images;
    opens pl.gamez.tictactoe.images to javafx.fxml;
}