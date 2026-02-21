import java.util.Scanner;

public class NumberInWords {
  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = sc.nextLine();   // Read as String

        for (int i = 0; i < number.length(); i++) {

            char digit = number.charAt(i);

            switch (digit) {
                case '0' -> System.out.print("Zero ");
                case '1' -> System.out.print("One ");
                case '2' -> System.out.print("Two ");
                case '3' -> System.out.print("Three ");
                case '4' -> System.out.print("Four ");
                case '5' -> System.out.print("Five ");
                case '6' -> System.out.print("Six ");
                case '7' -> System.out.print("Seven ");
                case '8' -> System.out.print("Eight ");
                case '9' -> System.out.print("Nine ");
                default -> System.out.print("Invalid Input ");
            }
        }

        sc.close();
    }
  
}
