
import java.util.Scanner;

public class ArithmeticSeries {
  public static void main(String[] args) {
      try(Scanner sc = new Scanner(System.in)){
      System.out.print("Enter the first term (a): ");
      int a = sc.nextInt();
      System.out.print("Enter the common difference (d): ");
      int d = sc.nextInt();
      System.out.print("Enter the number of terms (n): ");
      int n = sc.nextInt();

      int term = a;
      int sum = 0;  
      System.out.println("Arithmetic Series:");
      for (int i = 1; i <= n; i++) {
          System.out.print(term + " ");
          sum += term; // sum = sum + term
          term += d; // term = term + d
      }
      System.out.println("\nSum of the series: " + sum);
      sc.close();
    }
  }
  
}
