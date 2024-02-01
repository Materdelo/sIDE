package Panels;

import javax.swing.*;

public class GUIPanel extends JPanel {
    private JCheckBox  hideMainMenu, unfastenedToolsBar, blockToolBar, darkMode;

    public GUIPanel() {
        hideMainMenu = new JCheckBox("Ukryj menu główne");
        unfastenedToolsBar = new JCheckBox("Odepnij pasek narzędziowy");
        blockToolBar = new JCheckBox("Zablokuj pasek narzędziowy");
        darkMode = new JCheckBox("Tryb ciemny");

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createTitledBorder("GUI"));

        add(hideMainMenu);
        add(unfastenedToolsBar);
        add(blockToolBar);
        add(darkMode);
    }

}
