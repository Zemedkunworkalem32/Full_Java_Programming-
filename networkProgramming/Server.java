
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

class ReverseEchoThread extends Thread {
    Socket stk;

    // Constructor to receive socket
    ReverseEchoThread(Socket s) {
        stk = s;
    }
    @Override
    public void run() {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps = new PrintStream(stk.getOutputStream())
        ) {
            String msg;

            do {
                msg = br.readLine();
                if (msg == null) break;

                StringBuilder sb = new StringBuilder(msg);
                sb.reverse();
                String reversed = sb.toString();

                ps.println(reversed);

            } while (!msg.equals("end"));
            stk.close();

        } catch (Exception e) {
            System.err.println("Exception in ReverseEchoThread: " + e.getMessage());
        }
    }
}

public class Server {
    public static void main(String[] args) throws Exception {
        try (ServerSocket ss = new ServerSocket(2000)) {
            System.out.println("Server started...");

            int count = 1;

            while (true) {
                Socket stk = ss.accept();
                System.out.println("Client connected " + count++);

                ReverseEchoThread t = new ReverseEchoThread(stk);
                t.start(); // start thread
            }
        }
    }
}
  class Clients {
  public static void main(String[] args) throws Exception {
      try (Socket stk = new Socket("localhost", 2000)) {
        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());
        
        String msg;

        do{
          msg = keyb.readLine();
          ps.println(msg);
          msg = br.readLine();
          System.out.println("Received from server: " + msg);
        }while(!msg.equals("dne"));
      }
  }
  
}
