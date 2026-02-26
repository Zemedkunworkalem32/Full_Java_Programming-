import java.util.Scanner;
public class FindGcdOfNum {
  static int gcd(int a, int b) {
  while(a != b) {
    if(a > b) {
      a = a - b; // Subtract the smaller number from the larger number
    } else {
      b = b - a; // Subtract the smaller number from the larger number
    }
  }
  return a; // Return the GCD
  }

  public static void main(String[] args) {
   try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter the first number: ");
      int num1 = scanner.nextInt();
      System.out.print("Enter the second number: ");
      int num2 = scanner.nextInt();
      int result = gcd(num1, num2);
    System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);
  }
}
}
