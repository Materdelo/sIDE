import javax.swing.*;
import java.awt.*;

public class App {
    JFrame box = new JFrame();
    JPanel pnl = new JPanel();
    JPanel Toppnl = new JPanel();
    App() {
        Toppnl.setLayout(new BoxLayout(Toppnl, BoxLayout.Y_AXIS));
        MainMenu menu = new MainMenu(box, pnl);
        menu.setAlignmentX(Component.LEFT_ALIGNMENT);
        Toppnl.add(menu);
        box.add(Toppnl, BorderLayout.PAGE_START);
        box.add(pnl);
        box.setVisible(true);
        box.setSize(640, 480);
        box.setTitle("sIDE");
        box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new App();
    }
}

