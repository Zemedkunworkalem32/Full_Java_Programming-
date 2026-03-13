
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingFromFileToFile {
  public static void main(String[] args) {
      try {
        try(FileInputStream fis = new FileInputStream("file.txt");
           FileOutputStream fos = new FileOutputStream("file1.txt")){
            int b;
            while((b = fis.read()) !=-1) fos.write(b);
           }
      }
      catch(FileNotFoundException e){
        System.out.println(e);
      }
      catch(IOException e){
        System.out.println(e);
      }
  }
  
}
