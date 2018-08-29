import javax.swing.*;
import java.awt.*;

public class Playing_field extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Dino dino = new Dino();
        Image dinosaur = new ImageIcon(dino.getSprite()).getImage();
        g.drawImage(dinosaur,0,0,null);
    }
}
