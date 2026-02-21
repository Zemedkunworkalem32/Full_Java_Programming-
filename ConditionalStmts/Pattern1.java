
import java.util.Scanner;

public class Pattern1 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of rows: "); 
      int rows = sc.nextInt();
      int counter = 0;
      for (int i = rows; i >= 1; i--) {
          for (int j = 1; j <= rows; j++) {
            if (i +j > rows) {
              counter++;
              System.out.format("%02d ", counter);
          }
          else {
              System.out.print("   "); // Print spaces for alignment
          } 
        }
          System.out.println(); // Move to the next line after each row
      }
  }
  
}
