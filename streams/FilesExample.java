
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesExample {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("file.txt");

            String str ="This is a simple demonstration of using FileOutputStream in Java.";

            byte[] b = str.getBytes();

            fos.write(b);

            System.out.println("Successfully written to the file.");

            fos.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}