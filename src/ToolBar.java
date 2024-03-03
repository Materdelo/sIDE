import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

public class ToolBar extends JToolBar {
    JToolBar toolBar = this;
    JButton visible, floatable, browse, open, save, copy, paste, search;
    ToolBar(JMenuBar jMenuBar, FsUtils fsUtils, ResourceBundle resourceBundle){;
        floatable = new JButton("\u2756");
        visible = new JButton("\u2630");
        browse = new JButton(resourceBundle.getString("ToolBar-Browse"));
        open = new JButton(resourceBundle.getString("ToolBar-Open"));
        save = new JButton(resourceBundle.getString("ToolBar-Save"));
        copy = new JButton(resourceBundle.getString("ToolBar-Copy"));
        paste = new JButton(resourceBundle.getString("ToolBar-Paste"));
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
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {fsUtils.saveFile(fsUtils.actualFile, ContentBox.getContent());}
        });
    }
}
