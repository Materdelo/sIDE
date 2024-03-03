import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

public class MainMenu extends JMenuBar implements ActionListener {
    JFrame win;
    JPanel panel;
    JMenu File, SubMenu;
    JMenuItem New, Open, Save, Setting, Exit, Option4, Option5;
    ResourceBundle resourceBundle;

    MainMenu(JFrame win, JPanel panel, ResourceBundle resourceBundle){
        this.resourceBundle = resourceBundle;
        this.panel = panel;
        this.win = win;

        File = new JMenu(resourceBundle.getString("MainMenu-File"));
        SubMenu = new JMenu(resourceBundle.getString("MainMenu-Submenu"));
        New = new JMenuItem(resourceBundle.getString("MainMenu-New"));
        Open = new JMenuItem(resourceBundle.getString("MainMenu-Open"));
        Save = new JMenuItem(resourceBundle.getString("MainMenu-Save"));
        Setting = new JMenuItem(resourceBundle.getString("MainMenu-Setting"));
        Exit = new JMenuItem(resourceBundle.getString("MainMenu-Exit"));
        Option4 = new JMenuItem(resourceBundle.getString("MainMenu-Option4"));
        Option5 = new JMenuItem(resourceBundle.getString("MainMenu-Option5"));

        New.addActionListener(this);
        Open.addActionListener(this);
        Save.addActionListener(this);
        Setting.addActionListener(this);
        Option4.addActionListener(this);
        Option5.addActionListener(this);
        Exit.addActionListener(this);

        SubMenu.add(Option4);
        SubMenu.add(Option5);

        File.add(New);
        File.add(Open);
        File.add(Save);
        File.add(Setting);
        File.add(SubMenu);
        File.add(Exit);

        this.add(File);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if(src == Exit){
            win.dispose();
        }
        if(src == Setting){
            new AppSettings(true, win, resourceBundle);
        }
    }
}
