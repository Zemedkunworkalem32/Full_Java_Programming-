
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class CopyingFromTwoFileToFile {
  public static void main(String[] args) {
      try {
        try(FileInputStream fis1 = new FileInputStream("file.txt");
          FileInputStream fis2 = new FileInputStream("source2.txt");
           FileOutputStream fos = new FileOutputStream("file2.txt")){
            SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
            int b;
             while((b = sis.read()) !=-1) fos.write(b);
            fis1.close();
            fis2.close();
            fos.close();
            System.out.println("successfully written to the file!");
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
