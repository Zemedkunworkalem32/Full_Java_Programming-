import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Account implements Serializable {
    // It's good practice to include a serialVersionUID for Serializable classes
    private static final long serialVersionUID = 1L;
    
    String account;
    String name;
    double balance;

    public Account() {}

    public Account(String a, String n, double b) {
        account = a;
        name = n;
        balance = b;
    }

    @Override
    public String toString() {
        return "\nAccount no. " + account + "\nName: " + name + "\nBalance: " + balance;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Account ac;
            HashMap<String, Account> hm = new HashMap<>();

            // 🔹 Load data
            try {
                try (FileInputStream fis = new FileInputStream("account.txt");
                     ObjectInputStream ois = new ObjectInputStream(fis)) {

                        
                    int count = ois.readInt();
                    for (int i = 0; i < count; i++) {
                        // Fixed: Added ClassNotFoundException to the catch block below
                        ac = (Account) ois.readObject();
                        hm.put(ac.account, ac);
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("No previous data found or file is empty.");
            }

            int choice;
            String accountNo, name;
            double balance;

            do {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Create account");
                System.out.println("2. Delete account");
                System.out.println("3. View account");
                System.out.println("4. View all accounts");
                System.out.println("5. Save accounts");
                System.out.println("6. Exit");
                System.out.print("Enter choice: ");

                choice = sc.nextInt();
                sc.nextLine(); // clear buffer

                // Fixed: Converted to Rule Switch to resolve IDE warnings
                switch (choice) {
                    case 1 -> {
                        System.out.println("Enter account no:");
                        accountNo = sc.nextLine();
                        System.out.println("Enter name:");
                        name = sc.nextLine();
                        System.out.println("Enter balance:");
                        balance = sc.nextDouble();
                        sc.nextLine();

                        ac = new Account(accountNo, name, balance);
                        hm.put(accountNo, ac);
                        System.out.println("Account created successfully for " + name);
                    }
                    case 2 -> {
                        System.out.println("Enter account number to delete:");
                        accountNo = sc.nextLine();
                        if (hm.remove(accountNo) != null) {
                            System.out.println("Account deleted.");
                        } else {
                            System.out.println("Account not found.");
                        }
                    }
                    case 3 -> {
                        System.out.println("Enter account number:");
                        accountNo = sc.nextLine();
                        ac = hm.get(accountNo);
                        if (ac != null) {
                            System.out.println(ac);
                        } else {
                            System.out.println("Account not found.");
                        }
                    }
                    case 4 -> {
                        if (hm.isEmpty()) {
                            System.out.println("No accounts to display.");
                        } else {
                            for (Account act : hm.values()) {
                                System.out.println(act);
                            }
                        }
                    }
                    case 5 -> {
                        try (FileOutputStream fos = new FileOutputStream("account.txt");
                             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                            oos.writeInt(hm.size());
                            for (Account act : hm.values()) {
                                oos.writeObject(act);
                            }
                            System.out.println("Accounts saved successfully!");
                        } catch (IOException e) {
                            System.out.println("Error saving file: " + e.getMessage());
                        }
                    }
                    case 6 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choice. Please try again.");
                }

            } while (choice != 6);

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}