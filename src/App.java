import javax.swing.*;
import java.awt.*;

public class App {
    JFrame box = new JFrame();
    JPanel pnl = new JPanel();
    JPanel Toppnl = new JPanel();
    App() {
        MainMenu menu = new MainMenu(box, pnl);
        menu.setAlignmentX(Component.LEFT_ALIGNMENT);

        ToolBar toolBar = new ToolBar(menu);
        toolBar.setAlignmentX(Component.LEFT_ALIGNMENT);

        SideBar sideBar = new SideBar();
        pnl.add(sideBar);

        Toppnl.setLayout(new BoxLayout(Toppnl, BoxLayout.Y_AXIS));
        Toppnl.add(menu);
        Toppnl.add(toolBar);

        box.add(Toppnl, BorderLayout.PAGE_START);
        box.add(pnl, BorderLayout.LINE_START);
        box.setVisible(true);
        box.setSize(640, 480);
        box.setTitle("sIDE");
        box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new App();
    }
}