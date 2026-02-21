import java.util.Scanner;

public class NumberAndDateCheck {
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        String number = sc.nextLine();

        // 1. Check Binary
        if (number.matches("[01]+")) {
            System.out.println("It is a Binary number.");
        } else {
            System.out.println("It is NOT a Binary number.");
        }

        // 2. Check Hexadecimal
        if (number.matches("[0-9A-Fa-f]+")) {
            System.out.println("It is a Hexadecimal number.");
        } else {
            System.out.println("It is NOT a Hexadecimal number.");
        }

        // Input date
        System.out.print("\nEnter a date (dd/mm/yyyy): ");
        String date = sc.nextLine();

        // 3. Check Date format (basic format check)
        if (date.matches("\\d{2}/\\d{2}/\\d{4}")) {
            System.out.println("Date is in correct format (dd/mm/yyyy).");
        } else {
            System.out.println("Date is NOT in correct format.");
        }

        sc.close();
    }

  
}
