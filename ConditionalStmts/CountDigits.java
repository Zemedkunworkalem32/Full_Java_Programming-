
import java.util.Scanner;

public class CountDigits {
  public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;

     while (num > 0) {
            num /= 10; // Remove the last digit
            count++; // Increment the count of digits
        }
      System.out.println("Number of digits in " + num + " is: " + count);
      sc.close();
    }
  
}
