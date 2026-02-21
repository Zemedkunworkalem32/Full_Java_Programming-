
import java.util.Scanner;

public class FibonacciSeries {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of terms for Fibonacci series: ");
      int n = sc.nextInt();
      int a = 0, b = 1, c;
      System.out.println("Fibonacci Series:");
      System.out.print(a + ", "+b + ", ");
      for (int i = 1; i <= n; i++) {
          c = a + b; // c = a + b
           System.out.print(c+ ", ");
          a = b; // a = b
          b = c; // b = c
      }
  }
  
}
