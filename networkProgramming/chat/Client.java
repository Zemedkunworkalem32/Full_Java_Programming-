import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String username;

    public Client(Socket socket, String username) {
        try {
            this.socket = socket;
            this.bufferedWriter = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream())
            );
            this.bufferedReader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            this.username = username;

            // send username ONCE
            bufferedWriter.write(username);
            bufferedWriter.newLine();
            bufferedWriter.flush();

        } catch (IOException e) {
            closeEverything();
        }
    }

    public void sendMessage() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (socket.isConnected()) {
                String messageToSend = scanner.nextLine();

                bufferedWriter.write(username + ": " + messageToSend);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            closeEverything();
        }
    }

    public void listenForMessage() {
        new Thread(() -> {
            String msgFromGroupChat;

            while (socket.isConnected()) {
                try {
                    msgFromGroupChat = bufferedReader.readLine();

                    if (msgFromGroupChat == null) {
                        closeEverything();
                        break;
                    }

                    System.out.println(msgFromGroupChat);

                } catch (IOException e) {
                    closeEverything();
                    break;
                }
            }
        }).start();
    }

    private void closeEverything() {
        try {
            if (bufferedReader != null) bufferedReader.close();
            if (bufferedWriter != null) bufferedWriter.close();
            if (socket != null) socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        try {
            Socket socket = new Socket("localhost", 1234);
            Client client = new Client(socket, username);

            client.listenForMessage();
            client.sendMessage();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}