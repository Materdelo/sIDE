import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class SideBar extends JPanel implements ListSelectionListener {
    static DefaultListModel defaultListModel;
    JList list ;
    FsUtils fsUtils;
    ContentBox contentBox;
    JScrollPane scrollPane;

    SideBar(FsUtils fsUtils, ContentBox contentBox){
        this.contentBox = contentBox;
        this.fsUtils = fsUtils;

        defaultListModel =  new DefaultListModel();
        list = new JList(defaultListModel);

        defaultListModel.addElement("App.java");
        defaultListModel.addElement("ContentBox.java");
        defaultListModel.addElement("Plik3.txt");
        defaultListModel.addElement("Dokumentacja.txt");

        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list.setLayoutOrientation(JList.VERTICAL);
        list.setSelectedIndex(2);
        list.setVisibleRowCount(10);
        list.addListSelectionListener(this);
        scrollPane = new JScrollPane(list);

        this.add(scrollPane);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();
        if (src == list) {
            if (!e.getValueIsAdjusting()) {
                if (list.getSelectedIndex() != -1){
                    String fileName = defaultListModel.getElementAt(list.getSelectedIndex()).toString();
                    String content = fsUtils.readFile(fileName);
                    this.contentBox.overWrite(content);
                }
            }
        }
    }
}
