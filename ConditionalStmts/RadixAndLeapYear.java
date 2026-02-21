import java.util.Scanner;
public class RadixAndLeapYear { public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== 1. Find Radix =====
        System.out.print("Enter a number: ");
        String num = sc.nextLine();

        if (num.matches("[01]+")) {
            System.out.println("Radix = 2 (Binary)");
        } 
        else if (num.matches("[0-7]+")) {
            System.out.println("Radix = 8 (Octal)");
        } 
        else if (num.matches("[0-9]+")) {
            System.out.println("Radix = 10 (Decimal)");
        } 
        else if (num.matches("[0-9A-Fa-f]+")) {
            System.out.println("Radix = 16 (Hexadecimal)");
        } 
        else {
            System.out.println("Invalid number format.");
        }

        // ===== 2. Leap Year =====
        System.out.print("\nEnter a year: ");
        int year = sc.nextInt();

        if (year % 4 == 0){
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is NOT a Leap Year.");
                }
            } else {
                System.out.println(year + " is a Leap Year.");
            }
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        sc.close();
    }
  
  
}
