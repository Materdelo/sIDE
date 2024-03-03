package Panels;

import javax.swing.*;
import java.util.ResourceBundle;

public class GUIPanel extends JPanel {
    private JCheckBox  hideMainMenu, unfastenedToolsBar, blockToolBar, darkMode;
    private static final String HIDE_MAIN_MENU = "Ukryj menu główne";
    private static final String UNFASTENED_TOOL_BAR = "Odepnij pasek narzędziowy";
    private static final String BLOCK_TOOL_BAR = "Zablokuj pasek narzędziowy";
    private static final String DARK_MODE = "Tryb ciemny";

    public GUIPanel(ResourceBundle resourceBundle) {
        hideMainMenu = new JCheckBox(resourceBundle.getString("SettingGUIPanel-HideMainMenu"));
        hideMainMenu.setActionCommand(HIDE_MAIN_MENU);
        unfastenedToolsBar = new JCheckBox(resourceBundle.getString("SettingGUIPanel-UnfastenedToolBar"));
        unfastenedToolsBar.setActionCommand(UNFASTENED_TOOL_BAR);
        blockToolBar = new JCheckBox(resourceBundle.getString("SettingGUIPanel-BlockToolBar"));
        blockToolBar.setActionCommand(BLOCK_TOOL_BAR);
        darkMode = new JCheckBox(resourceBundle.getString("SettingGUIPanel-DarkMode"));
        darkMode.setActionCommand(DARK_MODE);

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createTitledBorder("GUI"));

        add(hideMainMenu);
        add(unfastenedToolsBar);
        add(blockToolBar);
        add(darkMode);
    }

}
