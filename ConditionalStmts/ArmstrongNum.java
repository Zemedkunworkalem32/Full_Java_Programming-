
import java.util.Scanner;

public class ArmstrongNum {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num = sc.nextInt();
      int originalNum = num;

      int sum = 0;
      while (num > 0) {
          int d = num % 10; // Get the last digit
          sum += (d*d*d); // Add the cube of the digit to the sum
          num /= 10; // Remove the last digit
      }
      if (sum == originalNum) {
          System.out.println(originalNum + " is an Armstrong number.");
      } else {
          System.out.println(originalNum + " is not an Armstrong number.");
      }
  }
  
}
