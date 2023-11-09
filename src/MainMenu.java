import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JMenuBar implements ActionListener {
    JFrame box;
    JPanel pnl;
    JMenu Files = new JMenu("Files");
    JMenuItem New = new JMenuItem("New");
    JMenuItem Open = new JMenuItem("Open");
    JMenuItem Save = new JMenuItem("Save");
    JMenu SubMenu = new JMenu("SubMenu");
    JMenuItem Exit = new JMenuItem("Exit");
    JMenuItem Option4 = new JMenuItem("Option4");
    JMenuItem Option5 = new JMenuItem("Option5");

    MainMenu(JFrame box, JPanel pnl){
        this.pnl = pnl;
        this.box = box;
        New.addActionListener(this);
        Open.addActionListener(this);
        Save.addActionListener(this);
        Option4.addActionListener(this);
        Option5.addActionListener(this);
        Exit.addActionListener(this);
        SubMenu.add(Option4);
        SubMenu.add(Option5);
        Files.add(New);
        Files.add(Open);
        Files.add(Save);
        Files.add(SubMenu);
        Files.add(Exit);
        this.add(Files);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if(src == New){
            pnl.setBackground(Color.RED);
        }if(src == Open){
            pnl.setBackground(Color.BLUE);
        }if(src == Save){
            pnl.setBackground(Color.GREEN);
        }if(src == Option4){
            pnl.setBackground(Color.YELLOW);
        }if(src == Option5){
            pnl.setBackground(Color.GRAY);
        }if(src == Exit){
            box.dispose();
        }
    }
}
