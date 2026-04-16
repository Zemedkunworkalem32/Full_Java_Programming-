import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UserDataServer {
    public static void main(String[] args) throws Exception {

        try(DatagramSocket ds = new DatagramSocket(2000)) {
        System.out.println("UDP Server started...");

        byte[] b = new byte[1024];
        DatagramPacket dp = new DatagramPacket(b, b.length);

        // receive message
        ds.receive(dp);

        String msg = new String(dp.getData(), 0, dp.getLength());
        System.out.println("Received from client: " + msg);

        // reverse message
        StringBuilder sb = new StringBuilder(msg);
        msg = sb.reverse().toString();

        // send back to SAME client
        DatagramPacket dpSend = new DatagramPacket(
                msg.getBytes(),
                msg.length(),
                dp.getAddress(), // correct client IP
                dp.getPort()     // correct client port
        );

        ds.send(dpSend);

        ds.close();
    }
  }
}