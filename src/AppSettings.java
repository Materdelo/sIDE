import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.prefs.Preferences;

public class AppSettings extends JDialog{
    private final String PREFS_FILE = "appIDE.conf.xml";
    private final String NDDE = "appIDE";
    private final HashMap<String, JComponent> hashMap = new HashMap<>();
    private Preferences prefs;
    private Preferences prefLd;
    private JCheckBox runInCenter, runMaximize, rememberPosition, rememberSize, rememberBrowserDirectory, rememberOpenFile, hideMainMenu, unfastenedToolsBar, blockToolBar, darkMode;
    private JComboBox language;
    private JLabel availableSettingLabel, runInCenterLabel, runMaximizeLabel, rememberPositionLabel, rememberSizeLabel, rememberBrowserDirectoryLabel, rememberOpenFileLabel, hideMainMenuLabel, unfastenedToolsBarLabel, blockToolBarLabel, darkModeLabel, languageLabel;
    private JButton saveButton, cancelButton;
    private JPanel mainPanel, savePanel, windowPanel, idePanel, guiPanel;

    public AppSettings(){
        // Odczyt okienka
    }
    public AppSettings(Boolean showGui){
        saveButton = new JButton("Zapisz");
        cancelButton = new JButton("Odrzuć");

        mainPanel = new JPanel();
        savePanel = new JPanel();
        windowPanel = new JPanel();
        idePanel = new JPanel();
        guiPanel = new JPanel();

        runInCenter = new JCheckBox();
        runMaximize = new JCheckBox();
        rememberPosition = new JCheckBox();
        rememberSize = new JCheckBox();
        rememberBrowserDirectory = new JCheckBox();
        rememberOpenFile = new JCheckBox();
        hideMainMenu = new JCheckBox();
        unfastenedToolsBar = new JCheckBox();
        blockToolBar = new JCheckBox();
        darkMode = new JCheckBox();

        language = new JComboBox(new String[]{"Polski", "English", "Deutsch"});

        availableSettingLabel = new JLabel("Dostępne ustawienia");
        runInCenterLabel = new JLabel("Uruchom wyśrodkowane");
        runMaximizeLabel = new JLabel("Uruchom zmaksymalizowane");
        rememberPositionLabel = new JLabel("Zapamiętaj pozycję");
        rememberSizeLabel = new JLabel("Zapamiętaj rozmiar");
        rememberBrowserDirectoryLabel = new JLabel("Zapamiętaj katalog przeglądania");
        rememberOpenFileLabel = new JLabel("Zapamiętaj otwarty plik");
        hideMainMenuLabel = new JLabel("Ukryj menu główne");
        unfastenedToolsBarLabel = new JLabel("Odepnij pasek narzędziowy");
        blockToolBarLabel = new JLabel("Zablokuj pasek narzędziowy");
        darkModeLabel = new JLabel("Tryb ciemny");
        languageLabel = new JLabel("Język interfejsu");

        setTitle("Settings");
        setSize(360, 480);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setModal(true);
        setLocation(50, 50);
        mainPanel.setLayout(new GridLayout(0, 1));

        mainPanel.setSize(360, 480);
        savePanel.setLayout(new BoxLayout(savePanel, BoxLayout.X_AXIS));
        windowPanel.setLayout(new BoxLayout(windowPanel, BoxLayout.Y_AXIS));
        idePanel.setLayout(new BoxLayout(idePanel, BoxLayout.Y_AXIS));
        guiPanel.setLayout(new BoxLayout(guiPanel, BoxLayout.Y_AXIS));

        savePanel.add(availableSettingLabel);
        savePanel.add(saveButton);
        savePanel.add(cancelButton);

        windowPanel.add(runInCenter);
        windowPanel.add(runInCenterLabel);
        windowPanel.add(runMaximize);
        windowPanel.add(runMaximizeLabel);
        windowPanel.add(rememberPosition);
        windowPanel.add(rememberPositionLabel);
        windowPanel.add(rememberSize);
        windowPanel.add(rememberSizeLabel);

        idePanel.add(languageLabel);
        idePanel.add(language);
        idePanel.add(rememberBrowserDirectory);
        idePanel.add(rememberBrowserDirectoryLabel);
        idePanel.add(rememberOpenFile);
        idePanel.add(rememberOpenFileLabel);

        guiPanel.add(hideMainMenu);
        guiPanel.add(hideMainMenuLabel);
        guiPanel.add(unfastenedToolsBar);
        guiPanel.add(unfastenedToolsBarLabel);
        guiPanel.add(blockToolBar);
        guiPanel.add(blockToolBarLabel);
        guiPanel.add(darkMode);
        guiPanel.add(darkModeLabel);

        mainPanel.add(savePanel);
        mainPanel.add(windowPanel);
        mainPanel.add(idePanel);
        mainPanel.add(guiPanel);
        add(mainPanel);
        setVisible(true);
    }
    private void closeWindow(){
        dispose();
    }
    private void closeWindow(Boolean store){
        if(store){
            // store preferences
        }
        dispose();
    }
}