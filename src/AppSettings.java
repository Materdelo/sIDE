import Panels.GUIPanel;
import Panels.IDEPanel;
import Panels.WindowPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.prefs.Preferences;

public class AppSettings extends JDialog{
    private final String PREFS_FILE = "appIDE.conf.xml";
    private final String NDDE = "appIDE";
    private final HashMap<String, Boolean> hashMap = new HashMap<String, Boolean>();
    private Preferences prefs;
    private Preferences prefLd;
    private JPanel mainPanel, savePanel;
    private JButton saveButton, cancelButton;
    private JLabel availableSettingLabel;

    public AppSettings(){
        // Odczyt okienka
    }
    public AppSettings(Boolean showGui){
        saveButton = new JButton("Zapisz");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                collectSettings();
            }
        });
        cancelButton = new JButton("Odrzuć");
        availableSettingLabel = new JLabel("Dostępne ustawienia");

        savePanel = new JPanel();
        mainPanel = new JPanel();
        savePanel.setLayout(new BoxLayout(savePanel, BoxLayout.X_AXIS));
        mainPanel.setLayout(new GridLayout(0, 1));
        mainPanel.setSize(300, 500);

        savePanel.add(availableSettingLabel);
        savePanel.add(saveButton);
        savePanel.add(cancelButton);

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
    private void closeWindow(Boolean store){
        if(store){
            // store preferences
        }
        dispose();
    }

    private void collectSettings() {
        Component[] components = mainPanel.getComponents();
        for (Component component : components) {
            if (component instanceof JPanel) {
                JPanel subPanel = (JPanel) component;
                Component[] subComponents = subPanel.getComponents();
                for (Component subComponent : subComponents) {
                    if (subComponent instanceof JCheckBox) {
                        JCheckBox checkBox = (JCheckBox) subComponent;
                        hashMap.put(checkBox.getText(), checkBox.isSelected());
                    }
                }
            }
        }
        System.out.println(hashMap);
    }

}