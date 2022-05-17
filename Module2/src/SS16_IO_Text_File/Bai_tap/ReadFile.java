package SS16_IO_Text_File.Bai_tap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
    private static final String path = "src/SS16_IO_Text_File/Data/";
    private static ArrayList<String> arrayLists = new ArrayList<>();
    public static void main(String[] args) {
        readerFile(path,"File");
    }
    public static void readerFile(String path, String source){
        try {
            FileReader fileReader = new FileReader(path + source);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                arrayLists.add(line);
            }
            for (String arraylist : arrayLists) {
                String[] arr = arraylist.split(",");
                System.out.println("ID:" +  arr[0]);
                System.out.println("Code:" +  arr[1]);
                System.out.println("name:" +  arr[2]);
                System.out.println();
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
