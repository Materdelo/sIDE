import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JToolBar {
    JToolBar tbl = this;
    JButton btnM0, btnM1, btn1, btn2, btn3, btn4, btn5;
    ToolBar(JMenuBar mb){
        btnM0 = new JButton("\u2630");
        btnM0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mb.setVisible(!mb.isVisible());
            }
        });
        btnM1 = new JButton("\u2756");
        btnM1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbl.setFloatable(!tbl.isFloatable());
            }
        });
        btn1 = new JButton("OtwAórz");
        btn2 = new JButton("Zapisz");
        btn3 = new JButton("Kopiuj");
        btn4 = new JButton("Wklej");
        btn5 = new JButton();
        btn5.setIcon(new ImageIcon("Icon-Search.png"));

        this.setFloatable(false);
        this.setRollover(true);
        this.add(btnM0);
        this.addSeparator();
        this.add(btnM1);
        this.addSeparator();
        this.add(btn1);
        this.addSeparator();
        this.add(btn2);
        this.addSeparator();
        this.add(btn3);
        this.addSeparator();
        this.add(btn4);
        this.addSeparator();
        this.add(btn5);
    }
}
