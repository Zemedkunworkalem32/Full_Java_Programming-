import java.util.Scanner;

public class LogicalOperation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // AND (&&)
        if (a > 0 && b > 0) {
            System.out.println("Both numbers are positive.");
        } else {
            System.out.println("Both numbers are NOT positive.");
        }

        // OR (||)
        if (a > 0 || b > 0) {
            System.out.println("At least one number is positive.");
        } else {
            System.out.println("Neither number is positive.");
        }

        // NOT (!)
        if (!(a > b)) {
            System.out.println("a is NOT greater than b.");
        } else {
            System.out.println("a is greater than b.");
        }

        sc.close();
    }
  
}
