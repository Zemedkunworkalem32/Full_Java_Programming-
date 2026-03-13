
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesExample {
    public static void main(String[] args) {

        try {
            try(FileOutputStream fos = new FileOutputStream("file.txt")) {

                    String str ="Hello, this is the content of the file!.";

                    byte[] b = str.getBytes();

                    fos.write(b);

                    System.out.println("Successfully written to the file.");

                    fos.close();
          }

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}