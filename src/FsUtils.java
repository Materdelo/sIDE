import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FsUtils {
    private String actualDirectory = System.getProperty("user.dir") + "/src/";
    public boolean openDirectory(){
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setCurrentDirectory(new java.io.File("."));
        jFileChooser.setDialogTitle("Choose directory");
        jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        if(jFileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            actualDirectory = String.valueOf(jFileChooser.getSelectedFile().toPath()) + '/';
            readDirectory();
        } else {
            System.out.println("Error");
        }
        return true;
    }
    public void readDirectory(){
        SideBar.defaultListModel.clear();
        try(DirectoryStream <Path> stream = Files.newDirectoryStream(Path.of(actualDirectory))){
            for(Path file : stream){
                SideBar.defaultListModel.addElement(file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException e){
            e.getStackTrace();
        }
    }
    public void saveFile(String name, String content){
        try{
            String pathFile = actualDirectory + name;
            FileWriter fw = new FileWriter(pathFile);
            fw.write(content);
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occured");
            e.getStackTrace();
        }
    }
    public String readFile(String name){
        String out = "";
        String pathFile = actualDirectory + name;
        try{
            File file = new File(pathFile);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                out += scanner.nextLine() + "\n";
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Missing file " + pathFile);
        }
        return out;
    }
}
