package Panels;

import javax.swing.*;

public class WindowPanel extends JPanel {
    private JCheckBox runInCenter, runMaximize, rememberPosition, rememberSize;
    public WindowPanel() {
        runInCenter = new JCheckBox("Uruchom wyśrodkowane");
        runMaximize = new JCheckBox("Uruchom zmaksymalizowane");
        rememberPosition = new JCheckBox("Zapamiętaj pozycję");
        rememberSize = new JCheckBox("Zapamiętaj rozmiar");

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createTitledBorder("Okno"));

        add(runInCenter);
        add(runMaximize);
        add(rememberPosition);
        add(rememberSize);
    }
}
