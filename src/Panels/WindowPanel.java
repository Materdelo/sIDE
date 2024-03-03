package Panels;

import javax.swing.*;
import java.util.ResourceBundle;

public class WindowPanel extends JPanel {
    private JCheckBox runInCenter, runMaximize, rememberPosition, rememberSize;
    private static final String RUN_IN_CENTER = "Uruchom wyśrodkowane";
    private static final String RUN_MAXIMIZE = "Uruchom zmaksymalizowane";
    private static final String REMEMBER_POSITION = "Zapamiętaj pozycję";
    private static final String REMEMBER_SIZE = "Zapamiętaj rozmiar";
    public WindowPanel(ResourceBundle resourceBundle) {
        runInCenter = new JCheckBox(resourceBundle.getString("SettingWindowPanel-RunInCenter"));
        runInCenter.setActionCommand(RUN_IN_CENTER);
        runMaximize = new JCheckBox(resourceBundle.getString("SettingWindowPanel-RunMaximize"));
        runMaximize.setActionCommand(RUN_MAXIMIZE);
        rememberPosition = new JCheckBox(resourceBundle.getString("SettingWindowPanel-RememberPosition"));
        rememberPosition.setActionCommand(REMEMBER_POSITION);
        rememberSize = new JCheckBox(resourceBundle.getString("SettingWindowPanel-RememberSize"));
        rememberSize.setActionCommand(REMEMBER_SIZE);

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createTitledBorder("Okno"));

        add(runInCenter);
        add(runMaximize);
        add(rememberPosition);
        add(rememberSize);
    }
}
