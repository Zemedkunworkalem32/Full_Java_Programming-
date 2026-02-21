
import java.util.Scanner;

public class DisplayDigits {
  /**
   * @param args
   */
  public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Digits in the number:");
        while (num > 0) {
            int digit = num % 10; // Get the last digit
            System.out.println(digit);
            num /= 10; // Remove the last digit
        }
        sc.close();
    }
  
}
