import java.io.FileReader;
import java.io.IOException;

public class Filereader {
  public static void main(String[] args) {
    try {
      try(FileReader fr = new FileReader("file.txt")) {
      int i;
    
          while ((i = fr.read()) != -1) {
              System.out.print((char) i);
          }
          fr.close();
      }
     }
      catch (IOException e) {
          System.out.println("An error occurred: " + e.getMessage());
      }
  }
  
}
