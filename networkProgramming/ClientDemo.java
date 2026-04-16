import java.io.*;
import java.net.*;

public class ClientDemo {
    public static void main(String[] args) {
        try {
            String host = "localhost";
            int port = 8000;

            try(Socket socket = new Socket(host, port)) {
            System.out.println("Connected to server!");

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            String name = "Hello Server";

            // Send name to server
            out.writeUTF(name);

            // Receive response
            String result = in.readUTF();
            System.out.println("Server response: " + result);

            socket.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}