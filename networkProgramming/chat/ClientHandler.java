import java.io.*;
import java.net.Socket;
import java.util.concurrent.CopyOnWriteArrayList;

public class ClientHandler implements Runnable {

    public static CopyOnWriteArrayList<ClientHandler> clientHandlers =
            new CopyOnWriteArrayList<>();

    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String clientUsername;

    public ClientHandler(Socket socket) {
        try {
            this.socket = socket;

            this.bufferedWriter = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream())
            );

            this.bufferedReader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            this.clientUsername = bufferedReader.readLine();

            clientHandlers.add(this);

            broadcastMessage("SERVER: " + clientUsername + " joined the chat!");

        } catch (IOException e) {
            closeEverything();
        }
    }

    @Override
    public void run() {
        String messageFromClient;

        while (socket.isConnected()) {
            try {
                messageFromClient = bufferedReader.readLine();

                if (messageFromClient == null) {
                    break;
                }

                broadcastMessage(messageFromClient);

            } catch (IOException e) {
                break;
            }
        }

        closeEverything();
    }

    public void broadcastMessage(String messageToSend) {
        for (ClientHandler clientHandler : clientHandlers) {
            try {
                if (!clientHandler.clientUsername.equals(this.clientUsername)) {
                    clientHandler.bufferedWriter.write(messageToSend);
                    clientHandler.bufferedWriter.newLine();
                    clientHandler.bufferedWriter.flush();
                }
            } catch (IOException e) {
                closeEverything();
            }
        }
    }

    public void removeClient() {
        clientHandlers.remove(this);
        broadcastMessage("SERVER: " + clientUsername + " left the chat!");
    }

    private void closeEverything() {
        removeClient();

        try {
            if (bufferedReader != null) bufferedReader.close();
            if (bufferedWriter != null) bufferedWriter.close();
            if (socket != null) socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}