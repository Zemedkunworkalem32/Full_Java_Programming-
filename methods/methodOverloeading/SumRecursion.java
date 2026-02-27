
import java.util.Scanner;

public class SumRecursion {
    // Recursive method to calculate the sum of first n natural numbers
    static int sum(int n) {
        if (n == 0) {
            return 0; // Base case: sum of first 0 natural numbers is 0
        }
        return n + sum(n - 1); // Recursive case: sum(n) = n + sum(n-1)
    }

    public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        System.out.println("Sum of first " + number + " natural numbers is: " + sum(number));
    }
    }
  
}
