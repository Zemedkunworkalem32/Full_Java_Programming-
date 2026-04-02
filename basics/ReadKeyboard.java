
import java.util.*;

public class ReadKeyboard {
  public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
        String name;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    
        scanner.useRadix(2);
        int x = scanner.nextInt();
        System.out.println(x);
      }
  }
  
}
