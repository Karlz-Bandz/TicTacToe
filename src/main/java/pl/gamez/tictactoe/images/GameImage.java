package pl.gamez.tictactoe.images;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GameImage extends ImageView
{
    public GameImage(Image img, int x, int y){
        super(img);
        this.setLayoutX(x);
        this.setLayoutY(y);
        this.setFitHeight(133);
        this.setFitWidth(133);
    }
}
