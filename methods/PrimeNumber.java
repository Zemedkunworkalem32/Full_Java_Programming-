
import java.util.Scanner;

public class PrimeNumber {
  static boolean isPrime(int n){
    if(n <= 1) {
      return false; // 0 and 1 are not prime numbers
    }
    for(int i = 2; i <= Math.sqrt(n); i++) {
      if(n % i == 0) {
        return false; // n is divisible by a number other than 1 and itself
      }
    }
    return true; // n is a prime number
  }
  public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
          System.out.print("Enter a number: ");
          int number = scanner.nextInt();
          if(isPrime(number)) {
            System.out.println(number + " is a prime number.");
          } else {
            System.out.println(number + " is not a prime number.");
          }
      }
  }

  
}
