
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputExample {
  
  public static void main(String[] args) {

    try {  
    try(FileInputStream fis = new FileInputStream("file.txt")) {
    byte[] b = new byte[fis.available()];
    fis.read(b);
    String str = new String(b);
    System.out.println("Content of the file: " + str);
    fis.close();
  }
}
catch (FileNotFoundException e) {
    System.out.println("An error occurred: " + e.getMessage());
  } catch (IOException e) {
    System.out.println("An error occurred: " + e.getMessage());
  }

}
}
