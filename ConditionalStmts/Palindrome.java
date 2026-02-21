import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: "); 
      int num = sc.nextInt();
      int reversedNum = 0;
      int originalNum = num; // Store the original number for comparison
      while (num > 0) {
          int digit = num % 10; // Get the last digit
          reversedNum = reversedNum * 10 + digit; // Append the digit to the reversed number
          num /= 10; // Remove the last digit
      }
      if (reversedNum == originalNum) {
          System.out.println("The number is a palindrome.");
      } else {
          System.out.println("The number is not a palindrome.");
      }
      sc.close();
  }

  
}
