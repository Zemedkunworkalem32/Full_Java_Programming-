import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
  public static void main(String[] args) {
    try {
      try(FileInputStream fis = new FileInputStream("source1.txt");
            FileOutputStream fos = new FileOutputStream("source2.txt")) {
            int x;
            while((x=fis.read())!=-1){
            if(x>=65 && x<=90) fos.write(x+32);
            else fos.write(x);
          }
      }
  }
  catch (FileNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } 
  catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
      
  }

}
