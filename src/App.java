import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;

public class App {
    JFrame win = new JFrame();
    JPanel panel, topPanel;
    ToolBar toolBar;
    MainMenu menu;
    SideBar sideBar;
    ContentBox contentBox;
    FsUtils fsUtils;
    Container container;
    AppSettings appSettings;
    Locale currentLocale;
    ResourceBundle resourceBundle;
    HashMap<Integer, Locale> localeHashMap;
    App() {
        localeHashMap = new HashMap<>();
        localeHashMap.put(0, new Locale("pl", "PL"));
        localeHashMap.put(1, new Locale("en", "EN"));
        localeHashMap.put(2, new Locale("de", "DE"));

        appSettings = new AppSettings();
        currentLocale = localeHashMap.get(appSettings.getIndexLanguage());
        resourceBundle = ResourceBundle.getBundle("Bundle.Bundle", currentLocale);
        fsUtils = new FsUtils();
        contentBox = new ContentBox();
        topPanel = new JPanel();
        panel = new JPanel(new BorderLayout());
        sideBar = new SideBar(fsUtils, contentBox);
        menu = new MainMenu(win, panel, resourceBundle);
        toolBar = new ToolBar(menu, fsUtils, resourceBundle);

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
        appSettings.setSettings(win, menu, toolBar);

        win.setVisible(true);
        win.setTitle("sIDE");
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new App();
    }
}