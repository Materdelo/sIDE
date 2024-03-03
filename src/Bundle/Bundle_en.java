package Bundle;

import java.util.ListResourceBundle;

public class Bundle_en extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return contents;
    }
    private Object[][] contents = {
        // MainMenu
        {"MainMenu-File", "File"},
        {"MainMenu-New", "New"},
        {"MainMenu-Open", "Open"},
        {"MainMenu-Save", "Save"},
        {"MainMenu-Setting", "Setting"},
        {"MainMenu-Exit", "Exit"},
        {"MainMenu-Submenu", "Submenu"},
        {"MainMenu-Option4", "Option 4"},
        {"MainMenu-Option5", "Option 5"},
        // ToolBar
        {"ToolBar-Browse", "Browse"},
        {"ToolBar-Open", "Open"},
        {"ToolBar-Save", "Save"},
        {"ToolBar-Copy", "Copy"},
        {"ToolBar-Paste", "Paste"},
        // Setting
        {"Setting-Title", "Settings"},
        {"Setting-AvailbleSetting", "Available Settings"},
        {"Setting-Discard", "Discard"},
        {"Setting-Save", "Save"},
        // Setting Window Panel
        {"SettingWindowPanel-Name", "Window"},
        {"SettingWindowPanel-RunInCenter", "Run in Center"},
        {"SettingWindowPanel-RunMaximize", "Run Maximized"},
        {"SettingWindowPanel-RememberPosition", "Remember Position"},
        {"SettingWindowPanel-RememberSize", "Remember Size"},
        // Setting IDE Panel
        {"SettingIDEPanel-LanguageInteface", "Interface Languages"},
        {"SettingIDEPanel-LanguagePolish", "Polish"},
        {"SettingIDEPanel-LanguageEnglish", "English"},
        {"SettingIDEPanel-LanguageGerman", "German"},
        {"SettingIDEPanel-RememberBrowserDirectory", "Remember Browser Directory"},
        {"SettingIDEPanel-RememberOpenFile", "Remember Open File"},
        // Setting GUI Panel
        {"SettingGUIPanel-HideMainMenu", "Hide Main Menu"},
        {"SettingGUIPanel-UnfastenedToolBar", "Unfasten Toolbar"},
        {"SettingGUIPanel-BlockToolBar", "Block Toolbar"},
        {"SettingGUIPanel-DarkMode", "Dark Mode"},
    };

}
