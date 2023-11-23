import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JToolBar {
    JToolBar toolBar = this;
    JButton visible, floatable, Open, Save, Copy, Paste, search;
    ToolBar(JMenuBar mb){;
        floatable = new JButton("\u2756");
        visible = new JButton("\u2630");
        Open = new JButton("Otwórz");
        Save = new JButton("Zapisz");
        Copy = new JButton("Kopiuj");
        Paste = new JButton("Wklej");
        search = new JButton();
        search.setIcon(new ImageIcon("Icon-Search.png"));

        this.setFloatable(false);
        this.setRollover(true);

        this.add(visible);
        this.addSeparator();
        this.add(floatable);
        this.addSeparator();
        this.add(Open);
        this.addSeparator();
        this.add(Save);
        this.addSeparator();
        this.add(Copy);
        this.addSeparator();
        this.add(Paste);
        this.addSeparator();
        this.add(search);

        visible.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mb.setVisible(!mb.isVisible());
            }
        });
        floatable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toolBar.setFloatable(!toolBar.isFloatable());
            }
        });
    }
}
