public class Account {
    String accountHolderName;
    String accountNumber;
    String bankName;
    String branchName;
    double balance;
    String accountType;
    String dateOfOpening;
    String dateOfClosing;
    String nomineeName;
    String nomineeRelation;
    String contactNumber;
    String emailAddress;
    String address;

    // Constructor to initialize account details
    Account(String accountHolderName, String accountNumber, String bankName, String branchName, String ifscCode,
            double balance, String accountType, String dateOfOpening, String dateOfClosing, String nomineeName,
            String nomineeRelation, String contactNumber, String emailAddress, String address) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.branchName = branchName;
        this.balance = balance;
        this.accountType = accountType;
        this.dateOfOpening = dateOfOpening;
        this.dateOfClosing = dateOfClosing;
        this.nomineeName = nomineeName;
        this.nomineeRelation = nomineeRelation;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.address = address; 
    }
    // Method to display account details
    void displayAccountDetails() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Branch Name: " + branchName);
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: " + accountType);
        System.out.println("Date of Opening: " + dateOfOpening);
        System.out.println("Date of Closing: " + dateOfClosing);
        System.out.println("Nominee Name: " + nomineeName);
        System.out.println("Nominee Relation: " + nomineeRelation);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Address: " + address);
    }

    // Method to deposit money into the account
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to transfer money to another account
    void transfer(Account recipient, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            recipient.deposit(amount);
            System.out.println("Transferred: " + amount + " to " + recipient.accountHolderName);
        } else {
            System.out.println("Invalid transfer amount or insufficient balance.");
        }
    }

    // Method to check the account balance
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
    
    // Main method to demonstrate account operations
    public static void main(String[] args) {
        Account account1 = new Account("Alice", "1234567890", "Bank A", "Branch X", "IFSC001", 1000.0, "Savings",
                "01-01-2020", "", "Bob", "Brother", "1234567890", "alice@example.com", "123 Main St");
        account1.displayAccountDetails();
        account1.checkBalance();
        Account account2 = new Account("Bob", "0987654321", "Bank B", "Branch Y", "IFSC002", 500.0, "Current",
                "01-01-2021", "", "Alice", "Sister", "0987654321", "bob@example.com", "456 Oak St");
        account2.displayAccountDetails();
        account1.transfer(account2, 200.0);
        account1.checkBalance();
        account2.checkBalance();
        account1.withdraw(100.0);
        account1.checkBalance();
        
  
}
}
