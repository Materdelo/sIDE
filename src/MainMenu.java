import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JMenuBar implements ActionListener {
    JFrame win;
    JPanel panel;
    JMenu Files, SubMenu;
    JMenuItem New, Open, Save, Setting, Exit, Option4, Option5;

    MainMenu(JFrame win, JPanel panel){
        this.panel = panel;
        this.win = win;

        Files = new JMenu("Files");
        SubMenu = new JMenu("SubMenu");
        New = new JMenuItem("New");
        Open = new JMenuItem("Open");
        Save = new JMenuItem("Save");
        Setting = new JMenuItem("Setting");
        Exit = new JMenuItem("Exit");
        Option4 = new JMenuItem("Option4");
        Option5 = new JMenuItem("Option5");

        New.addActionListener(this);
        Open.addActionListener(this);
        Save.addActionListener(this);
        Setting.addActionListener(this);
        Option4.addActionListener(this);
        Option5.addActionListener(this);
        Exit.addActionListener(this);

        SubMenu.add(Option4);
        SubMenu.add(Option5);

        Files.add(New);
        Files.add(Open);
        Files.add(Save);
        Files.add(Setting);
        Files.add(SubMenu);
        Files.add(Exit);

        this.add(Files);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if(src == Exit){
            win.dispose();
        }
        if(src == Setting){
            new AppSettings(true, win);
        }
    }
}
