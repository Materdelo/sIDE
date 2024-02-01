package Panels;

import javax.swing.*;

public class IDEPanel extends JPanel{
    private JCheckBox rememberBrowserDirectory, rememberOpenFile;
    private JComboBox language;
    private JLabel languageLabel;
    public IDEPanel() {

        rememberBrowserDirectory = new JCheckBox("Zapamiętaj katalog przeglądania");
        rememberOpenFile = new JCheckBox("Zapamiętaj otwarty plik");

        language = new JComboBox(new String[]{"Polski", "English", "Deutsch"});
        languageLabel = new JLabel("Język interfejsu");

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        setBorder(BorderFactory.createTitledBorder("IDE"));
        add(languageLabel);
        add(language);
        add(rememberBrowserDirectory);
        add(rememberOpenFile);
    }
}
