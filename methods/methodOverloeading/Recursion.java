
import java.util.Scanner;

public class Recursion {
    // Recursive method to calculate the factorial of a number
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return n * factorial(n - 1); // Recursive case: n! = n * (n-1)!
    }

    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)){
        System.out.print("Enter a positive integer: "); 
        int number = scanner.nextInt();
        System.out.println("Factorial of " + number + " is: " + factorial(number));
       }
    }
  
}
