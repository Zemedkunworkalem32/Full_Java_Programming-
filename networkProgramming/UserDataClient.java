import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UserDataClient {
    public static void main(String[] args) throws Exception {

        try (DatagramSocket ds = new DatagramSocket()) { // no fixed port
            System.out.println("UDP Client started...");

            String msg = "Hello, this is a UDP message!";

            DatagramPacket dp = new DatagramPacket(
                    msg.getBytes(),
                    msg.length(),
                    InetAddress.getLocalHost(),
                    2000
            );

            ds.send(dp);

            byte[] b = new byte[1024];
            dp = new DatagramPacket(b, b.length);

            ds.receive(dp);

            msg = new String(dp.getData(), 0, dp.getLength());
            System.out.println("Received from server: " + msg);
        }
    }
}