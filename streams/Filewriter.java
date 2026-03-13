import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
  public static void main(String[] args) {
    try {
      try(FileWriter fw = new FileWriter("file.txt")) {
          String str = "Hello, this is the content of the file from Filewriter!.";
          fw.write(str);
          System.out.println("Successfully written to the file.");
          fw.close();
  }
}
  catch (IOException e) {
    System.out.println("An error occurred: " + e.getMessage());
  }
  }
  
}
