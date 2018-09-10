import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Controller {
    Dino dino ;
    Game_road road;
    BufferedImage dinoImage;
    BufferedImage roadImage;
    Controller (){
        dino = new Dino();
        road = new Game_road();
        try {
            dinoImage = ImageIO.read(new File(this.dino.getSprite()));
            roadImage = ImageIO.read(new File(this.road.getSprite()));
        }catch (IOException e) {

        }
    }
    public void repaint (){

    }

    public void keyUp() {

    }

    public void keyDown(){

    }
}
