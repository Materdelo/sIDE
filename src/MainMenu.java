import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JMenuBar implements ActionListener {
    JFrame win;
    JPanel panel;
    JMenu File, SubMenu;
    JMenuItem New, Open, Save, Setting, Exit, Option4, Option5;

    MainMenu(JFrame win, JPanel panel){
        this.panel = panel;
        this.win = win;

        File = new JMenu("File");
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
            new AppSettings(true, win);
        }
    }
}
