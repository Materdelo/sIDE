import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FsUtils {
    private String actualDirectory = System.getProperty("user.dir") + "/src/";
    private String actualFile;
    public boolean openDirectory(){
        return true;
    }
    public void readDirectory(){

    }
    public void saveFile(String name, String content){
        try{
            String pathFile = actualDirectory + name;
            FileWriter fw = new FileWriter(pathFile);
            fw.write(content);
            fw.close();
        } catch (IOException e) {
            System.out.println("Wystąpił błąd");
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
            System.out.println("Brak pliku " + pathFile);
            System.out.println(e.getStackTrace().toString());
        }
        return out;
    }
}
