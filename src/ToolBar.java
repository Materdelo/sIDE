import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ToolBar extends JToolBar {
    JToolBar toolBar = this;
    JButton visible, floatable, browse, open, save, copy, paste, search;
    ToolBar(JMenuBar jMenuBar, FsUtils fsUtils){;
        floatable = new JButton("\u2756");
        visible = new JButton("\u2630");
        browse = new JButton("Przeglądaj");
        open = new JButton("Otwórz");
        save = new JButton("Zapisz");
        copy = new JButton("Kopiuj");
        paste = new JButton("Wklej");
        search = new JButton();
        search.setIcon(new ImageIcon("Icon-Search.png"));

        this.setFloatable(false);
        this.setRollover(true);

        this.add(visible);
        this.addSeparator();
        this.add(floatable);
        this.addSeparator();
        this.add(browse);
        this.addSeparator();
        this.add(open);
        this.addSeparator();
        this.add(save);
        this.addSeparator();
        this.add(copy);
        this.addSeparator();
        this.add(paste);
        this.addSeparator();
        this.add(search);

        visible.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jMenuBar.setVisible(!jMenuBar.isVisible());
            }
        });
        floatable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toolBar.setFloatable(!toolBar.isFloatable());
            }
        });
        browse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fsUtils.openDirectory();
            }
        });
    }
}
