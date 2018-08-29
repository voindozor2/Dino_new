import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

public class Playing_field extends JPanel implements KeyListener{
    Dino dino ;
    Timer time;
    boolean game_is_start;
    Playing_field(){
    this.addKeyListener(this);
    this.setFocusable(true);
    this.requestFocusInWindow();
    dino = new Dino();
    time =  new Timer();
    game_is_start=false;
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            if(game_is_start==true) {
                System.out.println("Отпустило вверх");
                dino.setY(dino.getY() + 100);
                repaint();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if(game_is_start==true) {
                System.out.println("Отпустило вниз");
                dino.setY(dino.getY() - 100);
                repaint();
            }
        } else if (e.getKeyCode()== KeyEvent.VK_SPACE){
            time.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Hello!");
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
        Image dinosaur = new ImageIcon(dino.getSprite()).getImage();
        g.drawImage(dinosaur,dino.getX(),dino.getY(),null);
    }

    @Override
    public void repaint() {
        super.repaint();
    }
}
