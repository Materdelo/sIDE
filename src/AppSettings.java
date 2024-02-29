import Panels.GUIPanel;
import Panels.IDEPanel;
import Panels.WindowPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

public class AppSettings extends JDialog {
    private final String PREFS_FILE = "appIDE.conf.xml";
    private final String NDDE = "appIDE";
    private Preferences prefs;
    private HashMap<String, Boolean> hashMap;
    private Preferences prefLd;
    private JPanel mainPanel, savePanel;
    private JButton saveButton, cancelButton;
    private JLabel availableSettingLabel;
    private JFrame win;

    public AppSettings(JFrame win, JMenuBar jMenuBar, JToolBar jToolBar) {
        this.win = win;
        readPreferences();
        if(hashMap.get("Zapamiętaj rozmiar")){
            prefLd = Preferences.userRoot().node(NDDE);
            win.setSize(Integer.parseInt(prefLd.get("width", null)), Integer.parseInt(prefLd.get("height", null)));
        }
        if(hashMap.get("Uruchom wyśrodkowane")) {
            win.setLocationRelativeTo(null);
        }
        if(hashMap.get("Uruchom zmaksymalizowane")) {
            win.setExtendedState(JFrame.MAXIMIZED_BOTH);
        }
        if(hashMap.get("Ukryj menu główne")){
            jMenuBar.setVisible(false);
        }
        if(hashMap.get("Odepnij pasek narzędziowy")){
            jToolBar.setFloatable(true);
        }

    }

    public AppSettings(Boolean showGui, JFrame win) {
        this.win = win;
        readPreferences();
        saveButton = new JButton("Zapisz");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                savePreferences();
            }
        });
        cancelButton = new JButton("Odrzuć");
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeWindow();
            }
        });
        availableSettingLabel = new JLabel("Dostępne ustawienia");

        savePanel = new JPanel();
        mainPanel = new JPanel();
        savePanel.setLayout(new BoxLayout(savePanel, BoxLayout.X_AXIS));
        mainPanel.setLayout(new GridLayout(0, 1));
        mainPanel.setSize(300, 500);

        savePanel.add(availableSettingLabel);
        savePanel.add(cancelButton);
        savePanel.add(saveButton);

        mainPanel.add(savePanel);
        mainPanel.add(new WindowPanel());
        mainPanel.add(new IDEPanel());
        mainPanel.add(new GUIPanel());
        add(mainPanel);

        setCheckbox(hashMap);
        setTitle("Settings");
        setSize(300, 500);
        setLocation(50, 25);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setModal(true);
        setVisible(true);
    }

    private void closeWindow() {
        dispose();
    }

    public void savePreferences() {
        prefs = Preferences.userRoot().node(NDDE);
        try {
            collectSettings(prefs);
            prefs.put("width", String.valueOf(win.getWidth()));
            prefs.put("height", String.valueOf(win.getHeight()));
            OutputStream stream = new FileOutputStream(PREFS_FILE);
            prefs.exportNode(stream);
            stream.close();
        } catch (IOException | BackingStoreException ex) {
            throw new RuntimeException(ex);
        }
        dispose();
    }

    private void readPreferences() {
        hashMap = new HashMap<>();
        try {
            prefLd = Preferences.userRoot().node(NDDE);
            for (String key : prefLd.keys()) {
                hashMap.put(key, Boolean.valueOf(prefLd.get(key, null)));
            }
        } catch (BackingStoreException e) {
            throw new RuntimeException(e);
        }
    }

    private void collectSettings(Preferences prefs) {
        Component[] components = mainPanel.getComponents();
        for (Component component : components) {
            if (component instanceof JPanel) {
                JPanel subPanel = (JPanel) component;
                Component[] subComponents = subPanel.getComponents();
                for (Component subComponent : subComponents) {
                    if (subComponent instanceof JCheckBox) {
                        JCheckBox checkBox = (JCheckBox) subComponent;
                        prefs.put(checkBox.getText(), String.valueOf(checkBox.isSelected()));
                    }
                }
            }
        }
    }

    private void setCheckbox(HashMap<String, Boolean> hashMap) {
        Component[] components = mainPanel.getComponents();
        for (Component component : components) {
            if (component instanceof JPanel subPanel) {
                Component[] subComponents = subPanel.getComponents();
                for (Component subComponent : subComponents) {
                    if (subComponent instanceof JCheckBox checkBox) {
                        checkBox.setSelected(hashMap.get(checkBox.getText()));
                    }
                }
            }
        }
    }
}