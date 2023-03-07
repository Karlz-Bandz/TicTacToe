package pl.gamez.tictactoe.images;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageController extends ImageView {

    public ImageController(Image img, int x, int y){
        super(img);
        this.setFitHeight(x);
        this.setFitWidth(y);
    }

}
