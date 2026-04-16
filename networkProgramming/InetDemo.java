import java.net.*;

public class InetDemo {
    public static void main(String[] args) {
        try {
            // Local machine
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("Local: " + local);

            // Single address
            InetAddress google = InetAddress.getByName("google.com");
            System.out.println("Google: " + google);

            // Multiple addresses
            InetAddress[] all = InetAddress.getAllByName("google.com");
            for(InetAddress ip : all) {
                System.out.println("Google IP: " + ip);
            }

        } catch (UnknownHostException e) {
            System.out.println("Host not found");
        }
    }
}