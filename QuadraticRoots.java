import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter value of a: ");
            double a = input.nextDouble();

            // Check if a is zero
            if (a == 0) {
                System.out.println("Invalid input! 'a' must be different from zero.");
                return;
            }

            System.out.print("Enter value of b: ");
            double b = input.nextDouble();

            System.out.print("Enter value of c: ");
            double c = input.nextDouble();

            double discriminant = (b * b) - (4 * a * c);

            if (discriminant > 0) {
                    double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                    double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

                    System.out.println("Two real roots:");
                    System.out.println("Root 1 = " + root1);
                    System.out.println("Root 2 = " + root2);

            } else if (discriminant == 0) {
                    double root = (-b) / (2 * a);

                    System.out.println("One real root:");
                    System.out.println("Root = " + root);

            } else {
                    double realPart = (-b) / (2 * a);
                    double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);

                    System.out.println("Two complex roots:");
                    System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
                    System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
            }
        }
    }
}
