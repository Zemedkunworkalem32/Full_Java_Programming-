
import java.util.Scanner;

public class MaxMethodOverloading {
    static int max(int a, int b) {
        return (a > b) ? a : b; // Return the maximum of two integers
    }

    static double max(double a, double b) {
        return (a > b) ? a : b; // Return the maximum of two doubles
    }
    static int max(int a, int b, int c) {
        return a > b && a > c ? a : (b > c ? b : c); // Return the maximum of three integers
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();
            System.out.print("Enter the third integer: ");
            int num3 = scanner.nextInt();
            int maxInt = max(num1, num2, num3);
            System.out.println("The maximum of the three integers is: " + maxInt);

            // Use max(int, int) method
            int maxOfTwo = max(num1, num2);
            System.out.println("The maximum of the first two integers is: " + maxOfTwo);

            System.out.print("Enter the first double: ");
            double double1 = scanner.nextDouble();
            System.out.print("Enter the second double: ");
            double double2 = scanner.nextDouble();
            double maxDouble = max(double1, double2);
            System.out.println("The maximum of the two doubles is: " + maxDouble);
        }
    }
  
}
