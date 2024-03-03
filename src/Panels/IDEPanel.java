package Panels;

import javax.swing.*;
import java.util.ResourceBundle;

public class IDEPanel extends JPanel{
    private JCheckBox rememberBrowserDirectory, rememberOpenFile;
    private static final String REMEMBER_BROWSER_DIRECTORY = "Zapamiętaj katalog przeglądania";
    private static final String REMEMBER_OPEN_FILE = "Zapamiętaj otwarty plik";
    private JComboBox language;
    private JLabel languageLabel;
    public IDEPanel(ResourceBundle resourceBundle) {
        rememberBrowserDirectory = new JCheckBox(resourceBundle.getString("SettingIDEPanel-RememberBrowserDirectory"));
        rememberBrowserDirectory.setActionCommand(REMEMBER_BROWSER_DIRECTORY);
        rememberOpenFile = new JCheckBox(resourceBundle.getString("SettingIDEPanel-RememberOpenFile"));
        rememberOpenFile.setActionCommand(REMEMBER_OPEN_FILE);

        language = new JComboBox(new String[]{resourceBundle.getString("SettingIDEPanel-LanguagePolish"), resourceBundle.getString("SettingIDEPanel-LanguageEnglish"), resourceBundle.getString("SettingIDEPanel-LanguageGerman")});
        languageLabel = new JLabel(resourceBundle.getString("SettingIDEPanel-LanguageInteface"));

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        setBorder(BorderFactory.createTitledBorder("IDE"));
        add(languageLabel);
        add(language);
        add(rememberBrowserDirectory);
        add(rememberOpenFile);
    }
}
