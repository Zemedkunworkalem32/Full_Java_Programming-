import java.util.Scanner;

public class ConditionalStmt {
  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== 1. Display Day Name =====
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day number");
        }

        sc.nextLine(); // clear buffer

        // ===== 2. Website Type & Protocol =====
        System.out.print("\nEnter website URL: ");
        String url = sc.nextLine();

        // Protocol
        String protocol = url.substring(0, url.indexOf(":"));
        System.out.println("Protocol: " + protocol);

        if (protocol.equals("http")) {
            System.out.println("Hyper Text Transfer Protocol");
        } 
        else if (protocol.equals("https")) {
            System.out.println("Secure Hyper Text Transfer Protocol");
        } 
        else if (protocol.equals("ftp")) {
            System.out.println("File Transfer Protocol");
        }

        // Website type (domain)
        String domain = url.substring(url.lastIndexOf(".") + 1);

        if (domain.equals("com")) {
            System.out.println("Commercial Website");
        } 
        else if (domain.equals("org")) {
            System.out.println("Organization Website");
        } 
        else if (domain.equals("net")) {
            System.out.println("Network Website");
        } 
        else if (domain.equals("edu")) {
            System.out.println("Educational Website");
        } 
        else {
            System.out.println("Unknown Website Type");
        }

        sc.close();
    }
  
}
