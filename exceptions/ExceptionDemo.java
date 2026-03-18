
import java.util.Scanner;

public class ExceptionDemo {
  public static void main(String[] args) {
    try {
      try(Scanner scanner = new Scanner(System.in)){
      System.out.print("Enter the numerator: ");
      int numerator = scanner.nextInt();
      System.out.print("Enter the denominator: ");
      int denominator = scanner.nextInt();
      int result = divide(numerator, denominator);
      System.out.println("Result: " + result); 
      scanner.close(); 
      }
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    }

  }

  public static int divide(int a, int b) {
    return a / b; // This will throw ArithmeticException if b is 0
  }
  
}
