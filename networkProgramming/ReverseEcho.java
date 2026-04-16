
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseEcho {
  public static void main(String[] args) throws Exception {
      try (ServerSocket ss = new ServerSocket(2000)) {
        try (Socket stk = ss.accept();
             BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
             PrintStream ps = new PrintStream(stk.getOutputStream())) {
        
          String msg;
          StringBuilder sb;

          do {
            msg = br.readLine();
            sb = new StringBuilder(msg);
            sb.reverse();
            msg = sb.toString();
            ps.println(msg);
          } while (!msg.equals("dne"));
        }
      }
  }
  
}

  class Client {
  public static void main(String[] args) throws Exception {
      Socket stk = new Socket("localhost", 2000);
        
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
        stk.close();
  }
  
}
