import java.io.*;

public class Challenge {
    public static void main(String[] args) {

        float list[] = {6.4f, 12.3f, 45.7f, 78.8f, 89.07f};

        // Writing
        try (FileOutputStream fos = new FileOutputStream("list.txt");
             DataOutputStream dos = new DataOutputStream(fos)) {

            dos.writeInt(list.length);

            for (float f : list) {
                dos.writeFloat(f);
            }

        } catch (IOException e) {   // ✅ single parent exception
            System.out.println("Write Error: " + e.getMessage());
        }

        // Reading
        try (FileInputStream fis = new FileInputStream("list.txt");
             DataInputStream dis = new DataInputStream(fis)) {

            int length = dis.readInt();

            for (int i = 0; i < length; i++) {
                float data = dis.readFloat();
                System.out.println(data);
            }

        } catch (IOException e) {   // ✅ covers all IO exceptions
            System.out.println("Read Error: " + e.getMessage());
        }
    }
}