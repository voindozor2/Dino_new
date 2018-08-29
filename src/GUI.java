import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GUI extends JFrame {

    Insets scnMax = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
    int taskBarSize = scnMax.bottom;

    // Берем размер всего экрана
    public static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public static void main(String[] args) {
        setUp_GUI();
    }
    public static void setUp_GUI() {
        JFrame frame = new JFrame("Dino analogue google chrome");
        frame.setSize(screenSize.width,screenSize.height);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Playing_field playing_field = new Playing_field(); // Создаем поле для игры
        playing_field.setBackground(Color.GREEN);

        frame.add(playing_field); // Добавляем поле для игры
        frame.setVisible(true);
    }
}
