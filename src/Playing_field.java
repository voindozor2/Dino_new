import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class Playing_field extends JPanel implements KeyListener{
    Dino dino ;
    Timer time;
    Game_road road;
    boolean game_is_start;
    BufferedImage dinoImage;
    BufferedImage roadImage;
    Playing_field(){
    this.addKeyListener(this);
    this.setFocusable(true);
    this.requestFocusInWindow();
    dino = new Dino();
    time =  new Timer();
    game_is_start=false;
    road = new Game_road();

        try {
            dinoImage = ImageIO.read(new File(this.dino.getSprite()));
            roadImage = ImageIO.read(new File(this.road.getSprite()));
        }catch (IOException e) {

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            if(game_is_start==true) {
                System.out.println("Отпустило вверх");
                dino.setY(dino.getY() - 100);
                repaint();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if(game_is_start==true) {
                System.out.println("Отпустило вниз");
                dino.setY(dino.getY() + 100);
                repaint();
            }
        } else if (e.getKeyCode()== KeyEvent.VK_SPACE){
            time.schedule(new TimerTask() {
                @Override
                public void run() {
                    road.setX(road.getX()-road.getSpeed());
                    repaint();
                    return;
                }
            },100,100);
            game_is_start=true;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(roadImage,road.getX(),road.getY(),null);
        g.drawImage(dinoImage,100,250+dino.getY(),null);

    }

    @Override
    public void repaint() {
        super.repaint();
    }
}
