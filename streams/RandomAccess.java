import java.io.*;

public class RandomAccess {
    public static void main(String[] args) {

        try {
            try(RandomAccessFile rf = new RandomAccessFile("file.txt", "rw")){

            System.out.println((char) rf.read());
            System.out.println((char) rf.read());
            System.out.println((char) rf.read());
            rf.write('h');
            System.out.println((char)rf.read());
            rf.skipBytes(3);
            System.out.println((char)rf.read());
            rf.seek(2);
            System.out.println((char)rf.read());
            rf.close();
        }

        } catch (IOException e) {
           System.out.println("Serialization Error: " + e.getMessage());
        }

    }
}
