package Bundle;

import java.util.ListResourceBundle;

public class Bundle_pl extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return contents;
    }
    private Object[][] contents = {
        // MainMenu
        {"MainMenu-File", "Plik"},
        {"MainMenu-New", "Nowy"},
        {"MainMenu-Open", "Otwórz"},
        {"MainMenu-Save", "Zapisz"},
        {"MainMenu-Setting", "Ustawienia"},
        {"MainMenu-Exit", "Zamknij"},
        {"MainMenu-Submenu", "Podmennu"},
        {"MainMenu-Option4", "Opcja 4"},
        {"MainMenu-Option5", "Opcja 5"},
        // ToolBar
        {"ToolBar-Browse", "Przeglądaj"},
        {"ToolBar-Open", "Otwórz"},
        {"ToolBar-Save", "Zapisz"},
        {"ToolBar-Copy", "Kopiuj"},
        {"ToolBar-Paste", "Wklej"},
        // Setting
        {"Setting-Title", "Ustawienia"},
        {"Setting-AvailbleSetting", "Dostępne Ustawienia"},
        {"Setting-Discard", "Odrzuć"},
        {"Setting-Save", "Zapisz"},
        // Setting Window Panel
        {"SettingWindowPanel-Name", "Okno"},
        {"SettingWindowPanel-RunInCenter", "Uruchom wyśrodkowane"},
        {"SettingWindowPanel-RunMaximize", "Uruchom zmaksymalizowane"},
        {"SettingWindowPanel-RememberPosition", "Zapamiętaj pozycję"},
        {"SettingWindowPanel-RememberSize", "Zapamiętaj rozmiar"},
        // Setting IDE Panel
        {"SettingIDEPanel-LanguageInteface", "Języki Interfejsu"},
        {"SettingIDEPanel-LanguagePolish", "Polski"},
        {"SettingIDEPanel-LanguageEnglish", "Angielski"},
        {"SettingIDEPanel-LanguageGerman", "Niemiecki"},
        {"SettingIDEPanel-RememberBrowserDirectory", "Zapamiętaj katalog przeglądania"},
        {"SettingIDEPanel-RememberOpenFile", "Zapamiętaj otwarty plik"},
        // Setting GUI Panel
        {"SettingGUIPanel-HideMainMenu", "Ukryj menu główne"},
        {"SettingGUIPanel-UnfastenedToolBar", "Odepnij pasek narzędziowy"},
        {"SettingGUIPanel-BlockToolBar", "Zablokuj pasek narzędziowy"},
        {"SettingGUIPanel-DarkMode", "Tryb ciemny"},
    };
}
