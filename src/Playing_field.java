import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Playing_field extends JPanel implements KeyListener {
    Dino dino ;
    Playing_field(){
    this.addKeyListener(this);
    this.setFocusable(true);
    this.requestFocusInWindow();
    dino = new Dino();
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_UP){
            System.out.println("Отпустило вверх");
            dino.setY(dino.getY()+100);
            repaint();
        }
        else if(e.getKeyCode()==KeyEvent.VK_DOWN){
            System.out.println("Отпустило вниз");
            dino.setY(dino.getY()-100);
            repaint();
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
