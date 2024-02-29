import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class App {
    JFrame win = new JFrame();
    JPanel panel, topPanel;
    ToolBar toolBar;
    MainMenu menu;
    SideBar sideBar;
    ContentBox contentBox;
    FsUtils fsUtils;
    Container container;
    App() {
        fsUtils = new FsUtils();
        contentBox = new ContentBox();
        topPanel = new JPanel();
        panel = new JPanel(new BorderLayout());
        sideBar = new SideBar(fsUtils, contentBox);
        menu = new MainMenu(win, panel);
        toolBar = new ToolBar(menu, fsUtils);

        menu.setAlignmentX(Component.LEFT_ALIGNMENT);
        toolBar.setAlignmentX(Component.LEFT_ALIGNMENT);

        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
        topPanel.add(menu);
        topPanel.add(toolBar);

        container = contentBox.get();

        panel.add(sideBar);
        panel.add(container);

        win.add(topPanel, BorderLayout.PAGE_START);
        win.add(panel, BorderLayout.CENTER);
        win.add(sideBar, BorderLayout.LINE_START);
        win.setSize(650, 550);
        new AppSettings(win, menu, toolBar);
        win.setVisible(true);
        win.setTitle("sIDE");
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new App();
    }
}