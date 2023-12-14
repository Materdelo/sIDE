import javax.swing.*;
import java.awt.*;

public class ContentBox {
    static JTextArea textArea;
    JScrollPane scrollPane;
    ContentBox(){
        this.textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    }
    public void append (String text){
        textArea.append(text);
    }
    public void overWrite(String text){
        textArea.setText(text);
    }
    public static String getContent(){
        return textArea.getText();
    }
    public Container get(){
        return scrollPane;
    }
}
