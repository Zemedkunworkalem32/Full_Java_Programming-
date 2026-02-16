
import java.util.Scanner;

public class ReadKeyboard {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        String name;
          System.out.print("Enter your name: ");
           name = scanner.nextLine();
          System.out.println("Hello, " + name + "!");

      scanner.useRadix(2);
      int x = scanner.nextInt();
      System.out.println(x);

      scanner.close();
  }
  
}
