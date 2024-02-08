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

public class AppSettings extends JDialog{
    private final String PREFS_FILE = "appIDE.conf.xml";
    private final String NDDE = "appIDE";
    private Preferences prefs;
    private HashMap<String, String> hashMap;
    private Preferences prefLd;
    private JPanel mainPanel, savePanel;
    private JButton saveButton, cancelButton;
    private JLabel availableSettingLabel;

    public AppSettings(){

    }
    public AppSettings(Boolean showGui){
        readPreferences();
        System.out.println(hashMap);
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

        setTitle("Settings");
        setSize(300, 500);
        setLocation(50, 25);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setModal(true);
        setVisible(true);
    }
    private void closeWindow(){
        dispose();
    }
    private void savePreferences(){
        prefs = Preferences.userRoot().node(NDDE);
        try {
            collectSettings(prefs);
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
            for(String key : prefLd.keys()){
                hashMap.put(key, prefLd.get(key, null));
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
}