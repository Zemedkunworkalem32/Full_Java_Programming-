import java.io.*;
import java.net.*;

public class ServerDemo {
    public static void main(String[] args) {
        try {
            int port = 8000;

            try (ServerSocket server = new ServerSocket(port)) {
            System.out.println("Server is waiting...");

            Socket socket = server.accept();
            System.out.println("Client connected!");

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            // Receive name from client
            String clientName = in.readUTF();
            System.out.println("Received from client: " + clientName);

            // Send response back
            String greeting = "Hello " + clientName;
            out.writeUTF(greeting);

            socket.close();
            server.close();
            }

        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
} 