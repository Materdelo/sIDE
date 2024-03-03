package Bundle;

import java.util.ListResourceBundle;

public class Bundle_de extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return contents;
    }
    private Object[][] contents = {
        // MainMenu
        {"MainMenu-File", "Datei"},
        {"MainMenu-New", "Neu"},
        {"MainMenu-Open", "Öffnen"},
        {"MainMenu-Save", "Speichern"},
        {"MainMenu-Setting", "Einstellung"},
        {"MainMenu-Exit", "Beenden"},
        {"MainMenu-Submenu", "Untermenü"},
        {"MainMenu-Option4", "Option 4"},
        {"MainMenu-Option5", "Option 5"},
        // ToolBar
        {"ToolBar-Browse", "Durchsuchen"},
        {"ToolBar-Open", "Öffnen"},
        {"ToolBar-Save", "Speichern"},
        {"ToolBar-Copy", "Kopieren"},
        {"ToolBar-Paste", "Einfügen"},
        // Setting
        {"Setting-Title", "Einstellungen"},
        {"Setting-AvailbleSetting", "Verfügbare Einstellungen"},
        {"Setting-Discard", "Verwerfen"},
        {"Setting-Save", "Speichern"},
        // Setting Window Panel
        {"SettingWindowPanel-Name", "Fenster"},
        {"SettingWindowPanel-RunInCenter", "In der Mitte ausführen"},
        {"SettingWindowPanel-RunMaximize", "Maximiert ausführen"},
        {"SettingWindowPanel-RememberPosition", "Position merken"},
        {"SettingWindowPanel-RememberSize", "Größe merken"},
        // Setting IDE Panel
        {"SettingIDEPanel-LanguageInteface", "Sprachinterface"},
        {"SettingIDEPanel-LanguagePolish", "Polnisch"},
        {"SettingIDEPanel-LanguageEnglish", "Englisch"},
        {"SettingIDEPanel-LanguageGerman", "Deutsch"},
        {"SettingIDEPanel-RememberBrowserDirectory", "Browserverzeichnis merken"},
        {"SettingIDEPanel-RememberOpenFile", "Geöffnete Datei merken"},
        // Setting GUI Panel
        {"SettingGUIPanel-HideMainMenu", "Hauptmenü ausblenden"},
        {"SettingGUIPanel-UnfastenedToolBar", "Werkzeugleiste lösen"},
        {"SettingGUIPanel-BlockToolBar", "Werkzeugleiste sperren"},
        {"SettingGUIPanel-DarkMode", "Dunkler Modus"},
    };
}
