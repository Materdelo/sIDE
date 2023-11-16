import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class SideBar extends JPanel implements ListSelectionListener {
    DefaultListModel data;
    JList lst ;
    SideBar(/*FileHandler fh, ContentBox cont */){
        data = new DefaultListModel();
        data.addElement("Plik1.txt");
        data.addElement("Plik2.txt");
        data.addElement("Plik3.txt");
        data.addElement("Dokumentacja.txt");
        lst = new JList(data);
        lst.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        lst.setLayoutOrientation(JList.VERTICAL);
        lst.setSelectedIndex(2);
        lst.setVisibleRowCount(3);
        lst.addListSelectionListener(this);
        JScrollPane scrpnl = new JScrollPane(lst);

        this.add(scrpnl);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {

    }
}
